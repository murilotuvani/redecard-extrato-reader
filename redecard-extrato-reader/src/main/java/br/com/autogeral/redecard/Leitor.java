/*
 * The MIT License
 *
 * Copyright 2020 murilotuvani.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.com.autogeral.redecard;

import br.com.autogeral.redecar.eefi.Registro030HeaderArquivo;
import br.com.autogeral.redecar.eefi.Registro032HeaderMatriz;
import br.com.autogeral.redecar.eefi.Registro034Creditos;
import br.com.autogeral.redecar.eefi.Registro037TotalizadorCreditos;
import br.com.autogeral.redecar.eefi.Registro040Serasa;
import br.com.autogeral.redecar.eefi.Registro049DesagendamentodeParcelas;
import br.com.autogeral.redecar.eefi.Registro050TotalizadorMatriz;
import br.com.autogeral.redecar.eefi.Registro052TrailerArquivo;
import br.com.autogeral.redecard.eevc.Registro002HeaderArquivo;
import br.com.autogeral.redecard.eevc.Registro006RVrotativo;
import br.com.autogeral.redecard.eevc.Registro008CVnsuRotativo;
import br.com.autogeral.redecard.eevc.Registro010RVparceladosemJuros;
import br.com.autogeral.redecard.eevc.Registro014ParcelosemJuros;
import br.com.autogeral.redecard.eevc.Registro026TotalizadorMatriz;
import br.com.autogeral.redecard.eevc.Registro028TrailerArquivo;
import br.com.autogeral.redecard.eevc.Registro040CVnsuRecarga;
import br.com.autogeral.redecard.eevc.Registro12CVnsuparceladosemJuros;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 06/02/2020 21:44:28
 *
 * @author murilotuvani
 */
public class Leitor {

    private static final FixedFormatManager FFM = new FixedFormatManagerImpl();
    private List<RegistroRedecard> registros = new ArrayList<>();

    public static void main(String args[]) {
        File diretorio = new File("C:\\Users\\Kaique\\Documents\\Tivit_05022020_211913");
        defineLeituraArquivo(diretorio);
    }

    private static void defineLeituraArquivo(File diretorio) {
        Leitor l = new Leitor();
        File arquivos[];
        arquivos = diretorio.listFiles();
        for (File i : arquivos) {
            if (i.getName().toLowerCase().contains("eevc")
                    || i.getName().toLowerCase().contains("eefi")) {
                l.lerEevc(i);
            }
        }
    }

    private void lerEevc(File file) {

        System.out.println("Lendo : " + file.getAbsolutePath());
        if (file.exists()) {
            try (InputStream is = new FileInputStream(file);
                    InputStreamReader isr = new InputStreamReader(is, Charset.forName("ISO-8859-1"));
                    BufferedReader br = new BufferedReader(isr)) {
                String l;
                while ((l = br.readLine()) != null) {
                    trataRegistro(l);
                }
            } catch (IOException ex) {
                System.err.println(ex);
                System.err.println("Erro ao tentar ler o arquivo");
            }
        } else {
            System.out.println("Arquivo não encontrado!!");
        }
    }

    private void trataRegistro(String l) {
        System.out.println("Linha :" + l);
        String tipoRegistro = l.substring(0, 3);
        switch (tipoRegistro) {
            case "002": {
                Registro002HeaderArquivo recordHeader = FFM.load(Registro002HeaderArquivo.class, l);
                System.out.println(recordHeader.toString());
                registros.add(recordHeader);
            }
            break;

            case "006": {
                Registro006RVrotativo registro006Rotativo = FFM.load(Registro006RVrotativo.class, l);
                System.out.println(registro006Rotativo.toString());
                registros.add(registro006Rotativo);

            }
            break;
            case "008": {
                Registro008CVnsuRotativo registroRotativo = FFM.load(Registro008CVnsuRotativo.class, l);
                System.out.println(registroRotativo);
                registros.add(registroRotativo);

            }
            break;

            case "010": {
                Registro010RVparceladosemJuros recordParceladosemJuros = FFM.load(Registro010RVparceladosemJuros.class, l);
                System.out.println(recordParceladosemJuros.toString());
                registros.add(recordParceladosemJuros);

            }
            break;

            case "012": {
                Registro12CVnsuparceladosemJuros registro12ParceladosemJuros = FFM.load(Registro12CVnsuparceladosemJuros.class, l);
                System.out.println(registro12ParceladosemJuros.toString());
                registros.add(registro12ParceladosemJuros);

            }
            break;

            case "014": {
                Registro014ParcelosemJuros registro014ParceladosemJuros = FFM.load(Registro014ParcelosemJuros.class, l);
                System.out.println(registro014ParceladosemJuros.toString());
                registros.add(registro014ParceladosemJuros);

            }
            break;

            case "026": {
                Registro026TotalizadorMatriz registro026Matriz = FFM.load(Registro026TotalizadorMatriz.class, l);
                System.out.println(registro026Matriz.toString());
                registros.add(registro026Matriz);

            }
            break;

            case "028": {
                Registro028TrailerArquivo trailerArquivo = FFM.load(Registro028TrailerArquivo.class, l);
                System.out.println(trailerArquivo.toString());
                registros.add(trailerArquivo);

            }
            break;

            case "030": {
                Registro030HeaderArquivo registroHeader = FFM.load(Registro030HeaderArquivo.class, l);
                System.out.println(registroHeader);
                registros.add(registroHeader);

            }
            break;

            case "032": {
                Registro032HeaderMatriz headerMatriz = FFM.load(Registro032HeaderMatriz.class, l);
                registros.add(headerMatriz);

            }
            break;
          
            case "037": {
                Registro037TotalizadorCreditos totalizador = FFM.load(Registro037TotalizadorCreditos.class, l);
                registros.add(totalizador);

            }
            break;
            case "040": {
                Registro040Serasa cvNSURecarga = FFM.load(Registro040Serasa.class, l);
                registros.add(cvNSURecarga);

            }
            break;
        
            case "050": {
                Registro050TotalizadorMatriz totalizadorMatriz = FFM.load(Registro050TotalizadorMatriz.class, l);
                registros.add(totalizadorMatriz);

            }
            break;
            case "052": {
                Registro052TrailerArquivo trailerMatriz = FFM.load(Registro052TrailerArquivo.class, l);
                registros.add(trailerMatriz);

            }
            break;

        }
      
    }

}
