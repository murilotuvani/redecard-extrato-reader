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
package br.com.autogeral.redecard.eevc;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 11/02/2020 15:48:25
 *
 * @author kaique.mota
 */
public class Registro006RVrotativoTest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 6;
    Integer numeroPV = 99999999;
    Integer numeroRV = 99131701;
    Integer numeroBanco = 341;
    Integer numeroAgencia = 361;
    Integer numContaCorrente = 580970;
    Date dataRV = java.sql.Date.valueOf(LocalDate.parse("28122011", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer quantidadeCVeNUSacatados = 1;
    Double valorBruto = 70.0;
    Double valorGorgeta = 0.0;
    Double valorRejeitado = 0.0;
    Double valorDesconto = 2.8;
    Double valorLiquido = 67.2;
    Date dataCredito = java.sql.Date.valueOf(LocalDate.parse("27012012", DateTimeFormatter.ofPattern("ddMMyyyy")));
    String bandeira = "3";

    @Test
    public void testParse() {

        String expResult = "00609999999909913170134100361000005809702812201100001000000000007000000000000000000000000000000000000000000000280000000000006720270120123";
        Registro006RVrotativo recordRVrotativo = fixedFormatManager.load(Registro006RVrotativo.class, expResult);
        System.out.println(recordRVrotativo.toString());
    }

    @Test
    public void testEquals() {
        String expResult = "00609999999909913170134100361000005809702812201100001000000000007000000000000000000000000000000000000000000000280000000000006720270120123";
        Registro006RVrotativo recordRVrotativo = fixedFormatManager.load(Registro006RVrotativo.class, expResult);

        assertEquals(recordRVrotativo.getTipoRegistro(), tipoRegistro);
        assertEquals(recordRVrotativo.getNumeroPv(), numeroPV);
        assertEquals(recordRVrotativo.getNumeroRV(), numeroRV);
        assertEquals(recordRVrotativo.getNumeroBanco(), numeroBanco);
        assertEquals(recordRVrotativo.getNumeroAgencia(), numeroAgencia);
        assertEquals(recordRVrotativo.getNumContaCorrente(), numContaCorrente);
        assertEquals(recordRVrotativo.getDataRV(), dataRV);
        assertEquals(recordRVrotativo.getQuantidadeCVeNUSacatados(), quantidadeCVeNUSacatados);
        assertEquals(recordRVrotativo.getValorBruto(), valorBruto);
        assertEquals(recordRVrotativo.getValorGorgeta(), valorGorgeta);
        assertEquals(recordRVrotativo.getValorRejeitado(), valorRejeitado);
        assertEquals(recordRVrotativo.getValorDesconto(), valorDesconto);
        assertEquals(recordRVrotativo.getValorLiquido(), valorLiquido);
        assertEquals(recordRVrotativo.getDataCredito(), dataCredito);
        assertEquals(recordRVrotativo.getBandeira(), bandeira);
    }
}
