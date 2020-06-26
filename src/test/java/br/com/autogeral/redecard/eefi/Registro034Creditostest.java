/*
 * The MIT License
 *
 * Copyright 2020 Kaique.
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
 *
 * @author Kaique
 */
public class Registro034Creditostest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();
    Integer tipoRegistro = 34;
    Integer numeroPVcentralizador = 14797470;
    Long numeroDocumento = 9002689847L;
    Date dataLancamento = java.sql.Date.valueOf(LocalDate.parse("03062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorLancamento = 100.58;
    String creditoC = "C";
    Integer banco = 341;
    Integer agencia = 278;
    Integer contaCorrente = 177381;
    Date dataMovimento=java.sql.Date.valueOf(LocalDate.parse("30052019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer numeroRV = 32849995;
    Date dataRV = java.sql.Date.valueOf(LocalDate.parse("02012019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    String bandeira = "1";
    Integer tipoTransacao = 2;
    Double valorBrutoRV = 2510.56;
    Double valorTaxaDesconto = 50.21;
    String numeroParcelaTotal = "05/06";
    String statusCredito = "07";
    Integer numeroPVoriginal = 14797470;

    @Test
    public void testParse() {

        String expResult = "0340147974700900268984703062019000000000010058C3410002780000017738130052019032849995020120191200000000025105600000000000502105/0607014797470";
        Registro034Creditos credito = fixedFormatManager.load(Registro034Creditos.class, expResult);
        System.out.println(credito.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "0340147974700900268984703062019000000000010058C3410002780000017738130052019032849995020120191200000000025105600000000000502105/0607014797470";
        Registro034Creditos credito = fixedFormatManager.load(Registro034Creditos.class, expResult);
        assertEquals(credito.getTipoRegistro(), tipoRegistro);
        assertEquals(credito.getNumeroPVcentralizador(), numeroPVcentralizador);
        assertEquals(credito.getNumeroDocumento(), numeroDocumento);
        assertEquals(credito.getDataLancamento(), dataLancamento);
        assertEquals(credito.getValorLancamento(), valorLancamento);
        assertEquals(credito.getCreditoC(), creditoC);
        assertEquals(credito.getBanco(), banco);
        assertEquals(credito.getAgencia(), agencia);
        assertEquals(credito.getContaCorrente(), contaCorrente);
        assertEquals(credito.getDataMovimento(), dataMovimento);
        assertEquals(credito.getNumeroRV(), numeroRV);
        assertEquals(credito.getBandeira(), bandeira);
        assertEquals(credito.getTipoTransacao(), tipoTransacao);
        assertEquals(credito.getValorBrutoRV(), valorBrutoRV);
        assertEquals(credito.getValorTaxaDesconto(), valorTaxaDesconto);
        assertEquals(credito.getNumeroParcelaTotal(), numeroParcelaTotal);
        assertEquals(credito.getStatusCredito(), statusCredito);
        assertEquals(credito.getNumeroPVoriginal(), numeroPVoriginal);
    }

}
