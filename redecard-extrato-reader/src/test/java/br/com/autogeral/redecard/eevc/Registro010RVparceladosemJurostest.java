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
 * 12/02/2020 14:12:38
 *
 * @author kaique.mota
 */
public class Registro010RVparceladosemJurostest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 10;
    Integer numeroPV = 15244946;
    Integer numeroRV = 849655;
    Integer numeroBanco = 341;
    Integer numeroAgencia = 278;
    Integer numeroContaCorrente = 177381;
    Date dataRV = java.sql.Date.valueOf(LocalDate.parse("31012020", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer quantiadeCVnsu = 5;
    Double valorBruto = 8105.9;
    Double valorGorjeta = valorGorjeta = 0.0;
    Double valorRejeitado = 0.0;
    Double valorDesconto = 475.03;
    Double valorLiquido = 7630.87;
    Date dataCredido1parcelaCredito = java.sql.Date.valueOf(LocalDate.parse("04022020", DateTimeFormatter.ofPattern("ddMMyyyy")));
    String bandeira = "3";

    @Test
    public void testParse() {

        String expResult = "01001524494600084965534100278000001773813101202000005000000000810590000000000000000000000000000000000000000047503000000000763087040220203";
        Registro010RVparceladosemJuros recordCVrotativo = fixedFormatManager.load(Registro010RVparceladosemJuros.class, expResult);
        System.out.println(recordCVrotativo.toString());
    }

    @Test
    public void testEquals() {
        String expResult = "01001524494600084965534100278000001773813101202000005000000000810590000000000000000000000000000000000000000047503000000000763087040220203";
        Registro010RVparceladosemJuros recordCVrotativo = fixedFormatManager.load(Registro010RVparceladosemJuros.class, expResult);
        assertEquals(recordCVrotativo.getTipoRegistro(), tipoRegistro);
        assertEquals(recordCVrotativo.getNumeroPV(), numeroPV);
        assertEquals(recordCVrotativo.getNumeroRV(), numeroRV);
        assertEquals(recordCVrotativo.getNumeroBanco(), numeroBanco);
        assertEquals(recordCVrotativo.getNumeroAgencia(), numeroAgencia);
        assertEquals(recordCVrotativo.getNumeroContaCorrente(), numeroContaCorrente);
        assertEquals(recordCVrotativo.getDataRV(), dataRV);
        assertEquals(recordCVrotativo.getQuantiadeCVnsu(), quantiadeCVnsu);
        assertEquals(recordCVrotativo.getValorBruto(), valorBruto);
        assertEquals(recordCVrotativo.getValorGorjeta(), valorGorjeta);
        assertEquals(recordCVrotativo.getValorRejeitado(), valorRejeitado);
        assertEquals(recordCVrotativo.getValorDesconto(), valorDesconto);
        assertEquals(recordCVrotativo.getValorLiquido(), valorLiquido);
        assertEquals(recordCVrotativo.getDataCredido1parcelaCredito(), dataCredido1parcelaCredito);
        assertEquals(recordCVrotativo.getBandeira(), bandeira);
    }
}
