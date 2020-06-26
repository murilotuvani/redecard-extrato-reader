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
 * 20/02/2020 10:41:21
 *
 * @author kaique.mota
 */
public class Registro049DesagendamentodeParcelastest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();
    Integer tipoRegistro = 49;
    Long numerpoPVoriginal = 999999999l;
    Long numeroRVoriginal = 999999999l;
    String numeroReferencia = "003403000145997";
    Date dataCredito = java.sql.Date.valueOf(LocalDate.parse("17022014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double novoValorParcela = 633.35;
    Double valorOriginalParcelaAlterada = 760.02;
    Double valorAjuste = 126.67;
    Date dataCancelamento = java.sql.Date.valueOf(LocalDate.parse("12022014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorRVoriginal = 779.4;
    Double valorCancelamentoSolicitado = 129.9;
    String numeroCartao = "1234******222222";
    Date dataTransacao = java.sql.Date.valueOf(LocalDate.parse("17012014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Long NSU = 999999999999l;
    Integer tipoDebito = 2;
    Integer numeroParcela = 1;
    String bandeiraRVorigem = "3";

    Date dataEmissao = java.sql.Date.valueOf(LocalDate.parse("28122011", DateTimeFormatter.ofPattern("ddMMyyyy")));

    @Test
    public void testParse() {

        String expResult = "04999999999999999999900340300014599717022014000000000063335000000000076002000000000012667120220140000000000779400000000000129901234******222222170120149999999999992013";
        Registro049DesagendamentodeParcelas desagendamento = fixedFormatManager.load(Registro049DesagendamentodeParcelas.class, expResult);
        System.out.println(desagendamento.toString());

    }

    @Test
    public void testEquals() {

        String expResult = "04999999999999999999900340300014599717022014000000000063335000000000076002000000000012667120220140000000000779400000000000129901234******222222170120149999999999992013";
        Registro049DesagendamentodeParcelas desagendamento = fixedFormatManager.load(Registro049DesagendamentodeParcelas.class, expResult);

        assertEquals(desagendamento.getTipoRegistro(), tipoRegistro);
        assertEquals(desagendamento.getNumeroRVoriginal(), numeroRVoriginal);
        assertEquals(desagendamento.getNumerpoPVoriginal(), numerpoPVoriginal);
        assertEquals(desagendamento.getNumeroReferencia(), numeroReferencia);
        assertEquals(desagendamento.getDataCredito(), dataCredito);
        assertEquals(desagendamento.getNovoValorParcela(), novoValorParcela);
        assertEquals(desagendamento.getValorOriginalParcelaAlterada(), valorOriginalParcelaAlterada);
        assertEquals(desagendamento.getValorAjuste(), valorAjuste);
        assertEquals(desagendamento.getDataCancelamento(), dataCancelamento);
        assertEquals(desagendamento.getValorRVoriginal(), valorRVoriginal);
        assertEquals(desagendamento.getValorCancelamentoSolicitado(), valorCancelamentoSolicitado);
        assertEquals(desagendamento.getNumeroCartao(), numeroCartao);
        assertEquals(desagendamento.getDataTransacao(), dataTransacao);
        assertEquals(desagendamento.getTipoDebito(), tipoDebito);
        assertEquals(desagendamento.getNumeroParcela(), numeroParcela);
        assertEquals(desagendamento.getBandeiraRVorigem(), bandeiraRVorigem);
    }
}
