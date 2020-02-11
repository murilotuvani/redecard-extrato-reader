
import br.com.autogeral.redecard.eevc.Registro002HeaderArquivo;
import br.com.autogeral.redecard.eevc.Registro004HeaderMatriz;
import br.com.autogeral.redecard.eevc.Registro004HeaderMatrizTeste;
import br.com.autogeral.redecard.eevc.Registro005Request;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;

/*
 * The MIT License
 *
 * Copyright 2020 kaique.mota.
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
/**
 * 11/02/2020 11:41:57
 *
 * @author kaique.mota
 */
public class TestLeitor {

    private static FixedFormatManager manager = new FixedFormatManagerImpl();

    public static void main(String[] args) {

        String teste = "00229122011REDECARDEXTRATO DE MOVIMENTO DE VENDASGRUPO OTICA OTICA     000106999999999DIARIO         V2.01 - 09/06 - EEVC";

        Registro002HeaderArquivo recordHeaderArquivo = manager.load(Registro002HeaderArquivo.class, teste);

        System.out.println("The parsed registro:" + recordHeaderArquivo.getTipoRegistro());
        System.out.println("The parsed Data emissao:" + recordHeaderArquivo.getDataEmissao());
        System.out.println("The parsed adquirente:" + recordHeaderArquivo.getAdquirente());
        System.out.println("The parsed extrato eletronico:" + recordHeaderArquivo.getExtratoEletronicoVendas());
        System.out.println("The parsed nome comercial:" + recordHeaderArquivo.getNomeComercial());
        System.out.println("The parsed sequencia movimento: " + recordHeaderArquivo.getSequenciaMovimento());
        System.out.println("The parsed numer grupo matriz: " + recordHeaderArquivo.getnPVgrupoMatriz());
        System.out.println("The parsed tipo movimento:" + recordHeaderArquivo.getTipoMovimento());
        System.out.println("The parsed versao arquivo: " + recordHeaderArquivo.getVersaoArquivo());
        System.out.println("\n\n");

        System.out.println("TESTE HEADER MATRIZ");
        String teste2 = "004099999999OTICA OTICA";
        Registro004HeaderMatriz recordHeaderMatriz = manager.load(Registro004HeaderMatriz.class, teste2);
        System.out.println("The parsed Registro: " + recordHeaderMatriz.getTipoRegistro());
        System.out.println("The parsed N°Pv Matriz: " + recordHeaderMatriz.getnPVMatriz());
        System.out.println("The parsed Nome Comercial:" + recordHeaderMatriz.getNomeComercialMatriz());
        
        
        
         String expResult = "0100999999990205492003410036100000384977281220110000100000000001300000000000000000000000000000000000000000000058500000000";
        Registro005Request recordRequest = manager.load(Registro005Request.class, expResult);
        System.out.println(recordRequest.getTipoRegistro());

    }

}
