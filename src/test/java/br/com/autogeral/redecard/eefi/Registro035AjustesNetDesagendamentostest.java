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
 * 20/02/2020 08:30:26
 *
 * @author kaique.mota
 */
public class Registro035AjustesNetDesagendamentostest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 35;
    Long numeroPVajustado = 999999999L;
    Integer numeroRVajustado = 999999999;
    Date dataAjuste = java.sql.Date.valueOf(LocalDate.parse("28012014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorAjuste = 126.66;
    String dDebito = "D";
    Integer motivoAjuste = 18;
    String motivoAjusteText = "CANCEL.DE VENDAS";
    String numeroCartao = "1234******222222";
    Date dataTransacao = java.sql.Date.valueOf(LocalDate.parse("14012014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer numeroRVoriginal = 999999999;
    String numeroReferenciaCarta = "49361253";
    Date dataCarta = java.sql.Date.valueOf(LocalDate.parse("28012014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer mesReferencia = 0;
    Integer numeroPVoriginal = 999999999;
    Date dataRVoriginal = java.sql.Date.valueOf(LocalDate.parse("14012014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorTransacao = 129.9;
    String DdesagendamentoNnet = "D";
    Date dataCredito= java.sql.Date.valueOf(LocalDate.parse("13022014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double novoValorParcela = 760.03;
    Double valorOriginalParcela = 886.69;
    Double valorBrutoresumoVendas = 909.3;
    Double valorCancelamentoSolicitado = 129.9;
    Long numeroNSU = 999999999999L;
    String numeroAutorizacao = "999999";
    String tipoDebito = "T";
    Long numeroOrdemDebito = 4014169124l;
    Double valorDebitoTotal = 0.0;
    Double valorPendente = 0.0;
    String bandeiraRVorigem = "1";
    String bandeiraRVajustado = "1";

    @Test
    public void testParse() {

        String expResult = "03599999999999999999928012014000000000012666D18CANCEL.DE VENDAS            1234******2222221401201499999999949361253       2801201400000099999999914012014000000000012990D13022014000000000076003000000000088669000000000090930000000000012990999999999999999999T0401416912400000000000000000000000000000011";
        Registro035AjustesNetDesagendamentos credito = fixedFormatManager.load(Registro035AjustesNetDesagendamentos.class, expResult);
        System.out.println(credito.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "03599999999999999999928012014000000000012666D18CANCEL.DE VENDAS            1234******2222221401201499999999949361253       2801201400000099999999914012014000000000012990D13022014000000000076003000000000088669000000000090930000000000012990999999999999999999T0401416912400000000000000000000000000000011";
        Registro035AjustesNetDesagendamentos credito = fixedFormatManager.load(Registro035AjustesNetDesagendamentos.class, expResult);
        assertEquals(credito.getTipoRegistro(), tipoRegistro);
        assertEquals(credito.getNumeroPVajustado(), numeroPVajustado);
        assertEquals(credito.getNumeroRVajustado(), numeroRVajustado);
        assertEquals(credito.getDataAjuste(), dataAjuste);
        assertEquals(credito.getValorAjuste(), valorAjuste);
        assertEquals(credito.getdDebito(), dDebito);
        assertEquals(credito.getMotivoAjuste(), motivoAjuste);
        assertEquals(credito.getMotivoAjusteText(), motivoAjusteText);
        assertEquals(credito.getNumeroCartao(), numeroCartao);
        assertEquals(credito.getDataTransacao(), dataTransacao);
        assertEquals(credito.getNumeroRVoriginal(), numeroRVoriginal);
        assertEquals(credito.getNumeroReferenciaCarta(), numeroReferenciaCarta);
        assertEquals(credito.getDataCarta(), dataCarta);
        assertEquals(credito.getMesReferencia(), mesReferencia);
        assertEquals(credito.getNumeroPVoriginal(), numeroPVoriginal);
        assertEquals(credito.getDataRVoriginal(), dataRVoriginal);
        assertEquals(credito.getValorTransacao(), valorTransacao);
        assertEquals(credito.getDdesagendamentoNnet(), DdesagendamentoNnet);
        assertEquals(credito.getDataCredito(), dataCredito);
        assertEquals(credito.getNovoValorParcela(), novoValorParcela);
        assertEquals(credito.getValorOriginalParcela(), valorOriginalParcela);
        assertEquals(credito.getValorBrutoresumoVendas(), valorBrutoresumoVendas);
        assertEquals(credito.getValorCancelamentoSolicitado(), valorCancelamentoSolicitado);
        assertEquals(credito.getNumeroNSU(), numeroNSU);
        assertEquals(credito.getNumeroAutorizacao(), numeroAutorizacao);
        assertEquals(credito.getTipoDebito(), tipoDebito);
        assertEquals(credito.getNumeroOrdemDebito(), numeroOrdemDebito);
        assertEquals(credito.getValorDebitoTotal(), valorDebitoTotal);
        assertEquals(credito.getValorPendente(), valorPendente);
        assertEquals(credito.getBandeiraRVorigem(), bandeiraRVorigem);
        assertEquals(credito.getBandeiraRVajustado(), bandeiraRVajustado);

    }

}
