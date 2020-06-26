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
 * 20/02/2020 09:15:51
 *
 * @author kaique.mota
 */
public class Registro037TotalizadorCreditostest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 37;
    Integer numeroPV = 14797470;
    Date dataCredito = java.sql.Date.valueOf(LocalDate.parse("03022020", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorTotalCredito = 12222.74;
    Integer numeroBanco = 341;
    Integer numeroAgencia = 278;
    Integer numeroContaCorrente = 177381;
    Date dataGeracaoArquivo = java.sql.Date.valueOf(LocalDate.parse("01022020", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorTotalCreditos = 0.0;
    String dataCreditoAntecipado = "00000000";

    @Test
    public void testParse() {

        String expResult = "037014797470       03022020000000001222274 341000278000001773810102202000000000000000000000000";
        Registro037TotalizadorCreditos credito = fixedFormatManager.load(Registro037TotalizadorCreditos.class, expResult);
        System.out.println(credito.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "037014797470       03022020000000001222274 341000278000001773810102202000000000000000000000000";
        Registro037TotalizadorCreditos credito = fixedFormatManager.load(Registro037TotalizadorCreditos.class, expResult);

        assertEquals(credito.getTipoRegistro(), tipoRegistro);
        assertEquals(credito.getNumeroPV(), numeroPV);
        assertEquals(credito.getDataCredito(), dataCredito);
        assertEquals(credito.getValorTotalCredito(), valorTotalCredito);
        assertEquals(credito.getNumeroBanco(), numeroBanco);
        assertEquals(credito.getNumeroAgencia(), numeroAgencia);
        assertEquals(credito.getNumeroContaCorrente(), numeroContaCorrente);
        assertEquals(credito.getDataGeracaoArquivo(), dataGeracaoArquivo);
        assertEquals(credito.getDataCreditoAntecipado(), dataCreditoAntecipado);
        assertEquals(credito.getValorTotalCreditos(), valorTotalCreditos);
    }
}
