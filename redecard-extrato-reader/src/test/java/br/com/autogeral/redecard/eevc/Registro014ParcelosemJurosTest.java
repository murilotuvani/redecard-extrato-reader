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
 * 11/02/2020 17:59:21
 *
 * @author kaique.mota
 */
public class Registro014ParcelosemJurosTest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();
    Integer tipoRegistro = 14;
    Integer numeroPV = 14797470;
    Integer numeroRV = 9949683;
    Date dataRV = java.sql.Date.valueOf(LocalDate.parse("31052019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer brancos = 0;
    Integer numParcela = 1;
    Double valorParcelaBruto = 2309.23;
    Double valorDescontoParcela = 109.45;
    Double valorParcelaLiquida = 2199.78;
    Date dataCredito = java.sql.Date.valueOf(LocalDate.parse("04062019", DateTimeFormatter.ofPattern("ddMMyyyy")));

    @Test
    public void testParse() {

        String expResult = "01401479747000994968331052019000000000100000000023092300000000001094500000000021997804062019";
        Registro014ParcelosemJuros recordParcelaSemJuros = fixedFormatManager.load(Registro014ParcelosemJuros.class, expResult);
        System.out.println(recordParcelaSemJuros.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "01401479747000994968331052019000000000100000000023092300000000001094500000000021997804062019";
        Registro014ParcelosemJuros recordParcelaSemJuros = fixedFormatManager.load(Registro014ParcelosemJuros.class, expResult);

        assertEquals(recordParcelaSemJuros.getTipoRegistro(), tipoRegistro);
        assertEquals(recordParcelaSemJuros.getNumeroPV(), numeroPV);
        assertEquals(recordParcelaSemJuros.getNumeroRV(), numeroRV);
        assertEquals(recordParcelaSemJuros.getDataRV(), dataRV);
        assertEquals(recordParcelaSemJuros.getBrancos(), brancos);
        assertEquals(recordParcelaSemJuros.getNumParcela(), numParcela);
        assertEquals(recordParcelaSemJuros.getValorParcelaBruto(), valorParcelaBruto);
        assertEquals(recordParcelaSemJuros.getValorDescontoParcela(), valorDescontoParcela);
        assertEquals(recordParcelaSemJuros.getValorParcelaLiquida(), valorParcelaLiquida);
        assertEquals(recordParcelaSemJuros.getDataCredito(), dataCredito);
        
    }
}
