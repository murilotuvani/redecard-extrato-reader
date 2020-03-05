
package br.com.autogeral.redecard;

import br.com.autogeral.redecar.eefi.Registro030HeaderArquivo;
import br.com.autogeral.redecar.eefi.Registro032HeaderMatriz;
import br.com.autogeral.redecar.eefi.Registro034Creditos;
import br.com.autogeral.redecar.eefi.Registro035AjustesNetDesagendamentos;
import br.com.autogeral.redecar.eefi.Registro037TotalizadorCreditos;
import br.com.autogeral.redecar.eefi.Registro040Serasa;
import br.com.autogeral.redecar.eefi.Registro043AjustesCredito;
import br.com.autogeral.redecar.eefi.Registro044DebitosPendentes;
import br.com.autogeral.redecar.eefi.Registro045DebitosLiquidados;
import br.com.autogeral.redecar.eefi.Registro049DesagendamentodeParcelas;
import br.com.autogeral.redecar.eefi.Registro050TotalizadorMatriz;
import br.com.autogeral.redecar.eefi.Registro052TrailerArquivo;
import br.com.autogeral.redecard.eevc.Registro002HeaderArquivo;
import br.com.autogeral.redecard.eevc.Registro004HeaderMatriz;
import br.com.autogeral.redecard.eevc.Registro005Request;
import br.com.autogeral.redecard.eevc.Registro006RVrotativo;
import br.com.autogeral.redecard.eevc.Registro008CVnsuRotativo;
import br.com.autogeral.redecard.eevc.Registro010RVparceladosemJuros;
import br.com.autogeral.redecard.eevc.Registro011ExtratoEletronicoVendas;
import br.com.autogeral.redecard.eevc.Registro014ParcelosemJuros;
import br.com.autogeral.redecard.eevc.Registro026TotalizadorMatriz;
import br.com.autogeral.redecard.eevc.Registro028TrailerArquivo;
import br.com.autogeral.redecard.eevc.Registro12CVnsuparceladosemJuros;
import br.com.autogeral.redecard.eevd.Registro00CabecalhoArquivo;
import br.com.autogeral.redecard.eevd.RegistroTipo01ResumoVendas;
import br.com.autogeral.redecard.eevd.RegistroTipo02TotalpontoVenda;
import br.com.autogeral.redecard.eevd.RegistroTipo03TotalMatriz;
import br.com.autogeral.redecard.eevd.RegistroTipo04TotalArquivo;
import br.com.autogeral.redecard.eevd.RegistroTipo05DetalhamentoComprovantes;
import br.com.autogeral.redecard.eevd.RegistroTipo11AjustesNet;
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

    public FixedFormatManager FFM = new FixedFormatManagerImpl();
    public static List<RegistroRedecard> registros = new ArrayList<RegistroRedecard>();
    public static List<String> registrosNaoLidos = new ArrayList<>();
    //	File diretorio = new File("C:\\Users\\kaique.mota\\Documents\\Tivit_05022020_211715");

    public List<RegistroRedecard> defineLeituraArquivo(File diretorio) {
        Leitor l = new Leitor();
        File arquivos[];
        arquivos = diretorio.listFiles();
        for (File i : arquivos) {
            if (i.getName().toLowerCase().contains("eevc")
                    || i.getName().toLowerCase().contains("eefi")
                    || i.getName().toLowerCase().contains("eevd")
                    || i.getName().toLowerCase().contains("eesa")) {
                l.lerArquivo(i);
            }
        }
        return registros;
    }

    public void lerArquivo(File file) {

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

    public List<RegistroRedecard> trataRegistro(String l) {
        System.out.println("Linha :" + l);
        String tipoRegistro = l.substring(0, 3);
        switch (tipoRegistro) {
            case "00,": {
                l = l.replace(",", "");
                Registro00CabecalhoArquivo cabecalho = FFM.load(Registro00CabecalhoArquivo.class, l);
                System.out.println(cabecalho.toString());
                registros.add(cabecalho);
            }
            break;
            case "01,": {
                l = l.replace(",", "");
                RegistroTipo01ResumoVendas resumoVendas = FFM.load(RegistroTipo01ResumoVendas.class, l);
                System.out.println(resumoVendas.toString());
                registros.add(resumoVendas);
            }
            break;
            case "02,": {
                l = l.replace(",", "");
                RegistroTipo02TotalpontoVenda totalPontoVenda = FFM.load(RegistroTipo02TotalpontoVenda.class, l);
                System.out.println(totalPontoVenda.toString());
                registros.add(totalPontoVenda);
            }
            break;
            case "03,": {
                l = l.replace(",", "");
                RegistroTipo03TotalMatriz totalMatriz = FFM.load(RegistroTipo03TotalMatriz.class, l);
                System.out.println(totalMatriz.toString());
                registros.add(totalMatriz);
            }
            break;
            case "002": {
                Registro002HeaderArquivo recordHeader = FFM.load(Registro002HeaderArquivo.class, l);
                System.out.println(recordHeader.toString());
                registros.add(recordHeader);
            }
            break;
            case "04,": {
                l = l.replace(",", "");
                RegistroTipo04TotalArquivo totalArquivo = FFM.load(RegistroTipo04TotalArquivo.class, l);
                System.out.println(totalArquivo.toString());
                registros.add(totalArquivo);
            }
            break;
            case "004": {
                Registro004HeaderMatriz headerMatriz = FFM.load(Registro004HeaderMatriz.class, l);
                System.out.println(headerMatriz.toString());
                registros.add(headerMatriz);
            }
            break;
            case "005": {
                Registro005Request request = FFM.load(Registro005Request.class, l);
                System.out.println(request.toString());
                registros.add(request);
            }
            break;
            case "05,": {
                l = l.replace(",", "");
                RegistroTipo05DetalhamentoComprovantes detalhamento = FFM.load(RegistroTipo05DetalhamentoComprovantes.class, l);
                System.out.println(detalhamento.toString());
                registros.add(detalhamento);
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
            case "011": {
                String tipoRegistros = tipoRegistro = l.substring(0, 4);
                if (l.toLowerCase().contains("011,")) {
                    l = l.replace(",", "");
                    RegistroTipo11AjustesNet ajusteNet = FFM.load(RegistroTipo11AjustesNet.class, l);
                    System.out.println(ajusteNet.toString());
                    registros.add(ajusteNet);
                } else {
                    Registro011ExtratoEletronicoVendas extratoEletronico = FFM.load(Registro011ExtratoEletronicoVendas.class, l);
                    System.out.println(extratoEletronico.toString());
                    registros.add(extratoEletronico);
                }
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
                System.out.println(headerMatriz.toString());
                registros.add(headerMatriz);

            }
            break;
            case "034": {
                Registro034Creditos registroCreditos = FFM.load(Registro034Creditos.class, l);
                System.out.println(registroCreditos.toString());
                registros.add(registroCreditos);
            }
            break;
            case "035": {
                Registro035AjustesNetDesagendamentos ajustes = FFM.load(Registro035AjustesNetDesagendamentos.class, l);
                System.out.println(ajustes.toString());
                registros.add(ajustes);
            }
            break;
            case "037": {
                Registro037TotalizadorCreditos totalizador = FFM.load(Registro037TotalizadorCreditos.class, l);
                System.out.println(totalizador.toString());
                registros.add(totalizador);

            }
            break;
            case "040": {
                Registro040Serasa cvNSURecarga = FFM.load(Registro040Serasa.class, l);
                registros.add(cvNSURecarga);

            }
            break;
            case "043": {
                Registro043AjustesCredito ajustesCredito = FFM.load(Registro043AjustesCredito.class, l);
                registros.add(ajustesCredito);
                System.out.println(ajustesCredito.toString());

            }
            break;
            case "044": {
                Registro044DebitosPendentes debitosPendentes = FFM.load(Registro044DebitosPendentes.class, l);
                registros.add(debitosPendentes);
                System.out.println(debitosPendentes.toString());

            }

            case "045": {
                Registro045DebitosLiquidados debitosPendentes = FFM.load(Registro045DebitosLiquidados.class, l);
                registros.add(debitosPendentes);
                System.out.println(debitosPendentes.toString());

            }
            break;
            case "049": {
                Registro049DesagendamentodeParcelas cvNSURecarga = FFM.load(Registro049DesagendamentodeParcelas.class, l);
                registros.add(cvNSURecarga);

            }
            break;

            case "050": {
                Registro050TotalizadorMatriz totalizadorMatriz = FFM.load(Registro050TotalizadorMatriz.class, l);
                System.out.println(totalizadorMatriz.toString());
                registros.add(totalizadorMatriz);

            }
            break;
            case "052": {
                Registro052TrailerArquivo trailerMatriz = FFM.load(Registro052TrailerArquivo.class, l);
                System.out.println(trailerMatriz.toString());
                registros.add(trailerMatriz);
            }
            break;

            default:
                registrosNaoLidos.add(l);
        }
        return registros;
    }
}
