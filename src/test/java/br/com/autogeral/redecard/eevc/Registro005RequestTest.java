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
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 19/02/2020 09:53:01
 *
 * @author kaique.mota
 */
public class Registro005RequestTest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 5;
    Integer numeroPV = 15254640;
    Integer numeroRV = 49449440;
    String numeroCartao = "541465XXXXXX8050";
    Double valorTransacao = 275.22;
    Date dataTranslacao = java.sql.Date.valueOf(LocalDate.parse("13042019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Long numeroReferencia = 1949449440001L;
    Long numeroProcesso = 1901156005399L;
    Integer numeroCVNSU = 748341222;
    String numeroAutorizacao = "022057";
    String codigoRequest = "3034";
    Integer limiteEnvioDocumentos = 20062019;
    String bandeira = "1";
    String livre;

    @Test
    public void testParse() {

        String expResult = "005015254640049449440541465XXXXXX8050000000000027522130420190019494494400010019011560053990007483412220220573034200620191";
        Registro005Request recordHeader = fixedFormatManager.load(Registro005Request.class, expResult);
        System.out.println(recordHeader.toString());
    }

    @Test
    public void testEquals() {
        String expResult = "005015254640049449440541465XXXXXX8050000000000027522130420190019494494400010019011560053990007483412220220573034200620191";
        Registro005Request recordHeader = fixedFormatManager.load(Registro005Request.class, expResult);
        assertEquals(recordHeader.getTipoRegistro(), tipoRegistro);
        assertEquals(recordHeader.getNumeroPV(), numeroPV);
        assertEquals(recordHeader.getNumeroRV(), numeroRV);
        assertEquals(recordHeader.getNumeroCartao(),numeroCartao);
        assertEquals(recordHeader.getValorTransacao(), valorTransacao);
        assertEquals(recordHeader.getDataTranslacao(), dataTranslacao);
        assertEquals(recordHeader.getNumeroReferencia(),numeroReferencia);
        assertEquals(recordHeader.getNumeroProcesso(), numeroProcesso);
        assertEquals(recordHeader.getNumeroCVNSU(), numeroCVNSU);
        assertEquals(recordHeader.getNumeroAutorizacao(), numeroAutorizacao);
        assertEquals(recordHeader.getCodigoRequest(), codigoRequest);
        assertEquals(recordHeader.getLimiteEnvioDocumentos(), limiteEnvioDocumentos);
        assertEquals(recordHeader.getBandeira(), bandeira);
        assertEquals(recordHeader.getLivre(), livre);
    }
}
