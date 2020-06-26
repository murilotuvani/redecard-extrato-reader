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
package br.com.autogeral.redecard.eefi;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;

/**
 * 19/02/2020 17:28:27
 *
 * @author kaique.mota
 */
public class Registro030HeaderArquivotest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();
    Integer tipoRegistro = 30;
    Date dataEmissao = java.sql.Date.valueOf(LocalDate.parse("03072019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    String adquirente = "Redecard";
    String extratoMovimentacaoFinanceira = "Extrato de Movimentacao Financeira";
    String nomeComercial = "AUTO GERAL";
    Integer sequenciaMovimento = 110;
    Integer numGrupoOuMatriz = 14797470;
    String tipoProcessamento = "DIARIO";
    String versaoArquivo = "V3.01 - 09/06 - EEFI";

    @Test
    public void testParse() {

        String expResult = "03028122011RedecardExtrato de Movimentacao FinanceiraGRUPO OTICA OTICA     000105999999999DIARIO         V3.01 - 09/06 - EEFIS";
        Registro030HeaderArquivo credito = fixedFormatManager.load(Registro030HeaderArquivo.class, expResult);
        System.out.println(credito.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "03003072019RedecardExtrato de Movimentacao FinanceiraAUTO GERAL            000110014797470DIARIO         V3.01 - 09/06 - EEFI";
        Registro030HeaderArquivo credito = fixedFormatManager.load(Registro030HeaderArquivo.class, expResult);

        assertEquals(credito.getTipoRegistro(), tipoRegistro);
        assertEquals(credito.getDataEmissao(), dataEmissao);
        assertEquals(credito.getAdquirente(), adquirente);
        assertEquals(credito.getExtratoMovimentacaoFinanceira(), extratoMovimentacaoFinanceira);
        assertEquals(credito.getNomeComercial(), nomeComercial);
        assertEquals(credito.getSequenciaMovimento(), sequenciaMovimento);
        assertEquals(credito.getNumGrupoOuMatriz(), numGrupoOuMatriz);
        assertEquals(credito.getTipoProcessamento(), tipoProcessamento);
        assertEquals(credito.getVersaoArquivo(), versaoArquivo);
    }
}
