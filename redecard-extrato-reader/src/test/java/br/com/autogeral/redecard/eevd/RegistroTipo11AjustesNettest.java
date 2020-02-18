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
package br.com.autogeral.redecard.eevd;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 18/02/2020 12:02:16
 *
 * @author kaique.mota
 */
public class RegistroTipo11AjustesNettest {

    private static FixedFormatManager manager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 11;
    Integer numeroPVajustado = 15254640;
    Integer mumeroRVajustado = 157051398;
    Date dataAjuste = java.sql.Date.valueOf(LocalDate.parse("06062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorAjuste = 132.55D;
    String dDebito = "D";
    Integer motivoDoajuste = 18;
    String motivo = "CANCEL.DE VENDAS";
    Long numeroCartao = 5414650785798050L;
    Date dataTransacaoCV = java.sql.Date.valueOf(LocalDate.parse("13042019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer numeroRVoriginal = 49449440;
    String numeroReferenciaCarta = "319157163020021";
    Date dataCarta = java.sql.Date.valueOf(LocalDate.parse("06062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer mesReferencia = 190620;
    Integer numeroPVoriginal = 15254640;
    String dataRVoriginal = "13042019";
    Double valorTransacao = 275.22D;
    String nNet = "N";
    Date dataCtedito = java.sql.Date.valueOf(LocalDate.parse("07062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorBrutoresumoVendasOriginal = 1408.68D;
    Double valorCancelamentoSolicitado = 275.22D;
    Long numeroNSU = 998466334L;
    String numeroAutorizacao = "021704";
    String tipodeDebito = "T";
    Long numeroOrdemDebito = 19157001054L;
    Double valordebitoTotal = 132.55D;
    Double valorPendente = 0.0D;
    String bandeiraRVorigem = "1";
    String bandeiraRVajustado = "1";

    @Test
    public void testParse() {
        String expResult = "011,015254640,157051398,06062019,000000000013255,D,18,CANCEL.DE VENDAS            ,5414650785798050,13042019,049449440,319157163020021,06062019,190620,015254640,13042019,000000000027522,N,07062019,000000000140868,000000000027522,000998466334,021704,T,19157001054,000000000013255,000000000000000,1,1";
        expResult = expResult.replace(",", "");
        RegistroTipo11AjustesNet ajusteNet = manager.load(RegistroTipo11AjustesNet.class, expResult);
        System.out.println(ajusteNet.toString());
    }

    @Test
    public void testEquals() {
        String expResult = "011,015254640,157051398,06062019,000000000013255,D,18,CANCEL.DE VENDAS            ,5414650785798050,13042019,049449440,319157163020021,06062019,190620,015254640,13042019,000000000027522,N,07062019,000000000140868,000000000027522,000998466334,021704,T,19157001054,000000000013255,000000000000000,1,1";
        expResult = expResult.replace(",", "");
        RegistroTipo11AjustesNet ajusteNet = manager.load(RegistroTipo11AjustesNet.class, expResult);

        assertEquals(ajusteNet.getTipoRegistro(), tipoRegistro);
        assertEquals(ajusteNet.getNumeroPVajustado(), numeroPVajustado);
        assertEquals(ajusteNet.getDataAjuste(), dataAjuste);
        assertEquals(ajusteNet.getValorAjuste(), valorAjuste);
        assertEquals(ajusteNet.getdDebito(), dDebito);
        assertEquals(ajusteNet.getMotivoAjuste(), motivo);
         assertEquals(ajusteNet.getMotivoDoajuste(), motivoDoajuste);
        assertEquals(ajusteNet.getNumeroCartao(), numeroCartao);
        assertEquals(ajusteNet.getDataTransacaoCV(), dataTransacaoCV);
        assertEquals(ajusteNet.getNumeroRVoriginal(), numeroRVoriginal);
        assertEquals(ajusteNet.getNumeroReferenciaCarta(), numeroReferenciaCarta);
        assertEquals(ajusteNet.getDataCarta(), dataCarta);
        assertEquals(ajusteNet.getMesReferencia(), mesReferencia);
        assertEquals(ajusteNet.getNumeroPVoriginal(), numeroPVoriginal);
        assertEquals(ajusteNet.getDataRVoriginal(), dataRVoriginal);
        assertEquals(ajusteNet.getValorTransacao(), valorTransacao);
        assertEquals(ajusteNet.getnNet(), nNet);
        assertEquals(ajusteNet.getDataCtedito(), dataCtedito);
        assertEquals(ajusteNet.getValorBrutoresumoVendasOriginal(), valorBrutoresumoVendasOriginal);
        assertEquals(ajusteNet.getValorCancelamentoSolicitado(), valorCancelamentoSolicitado);
        assertEquals(ajusteNet.getNumeroNSU(), numeroNSU);
        assertEquals(ajusteNet.getNumeroAutorizacao(), numeroAutorizacao);
        assertEquals(ajusteNet.getTipodeDebito(), tipodeDebito);
        assertEquals(ajusteNet.getNumeroOrdemDebito(), numeroOrdemDebito);
        assertEquals(ajusteNet.getValordebitoTotal(), valordebitoTotal);
        assertEquals(ajusteNet.getValorPendente(), valorPendente);
        assertEquals(ajusteNet.getBandeiraRVorigem(), bandeiraRVorigem);
        assertEquals(ajusteNet.getBandeiraRVajustado(), bandeiraRVajustado);
    }

}
