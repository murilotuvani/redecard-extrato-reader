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
import org.junit.Test;

/**
 * 11/02/2020 16:09:05
 *
 * @author kaique.mota
 */
public class Registro008CVnsuRotativoTest extends TestCase {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 8;
    Integer numeroPV = 14797470;
    Integer numeroRV = 64131102;
    Date dataCVnsu = java.sql.Date.valueOf(LocalDate.parse("31012020", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer zeros = 0;
    Double valorCVnsu = 20.98;
    Double valorGorgeta = 0.0;
    String numeroCartao = "544891XXXXXX0003";
    String statusCVnsu = "000";
    Integer numeroCVnsu = 246671956;
    String numeroReferencia;
    Double valorDesconto = 0.33;
    String numAutorizacao = "066848";
    Integer horaTransacao = 171224;
    String numBilhete;
    String numBilhete2;
    String numBilhete3;
    String numBilhete4;
    String tipoCaptura = "2";
    Double valorLiquido = 20.65;
    String numeroTerminal = "WW876746";
    String siglaPais = "BR";
    String bandeira = "1";

    @Test
    public void testParse() {

        String expResult = "0080147974700641311023101202000000000000000000002098000000000000000544891XXXXXX0003000000246671956             000000000000033066848171224                                                                2000000000002065WW876746BR 1";
        Registro008CVnsuRotativo recordRequest = fixedFormatManager.load(Registro008CVnsuRotativo.class, expResult);
        System.out.println(recordRequest.toString());
    }

    @Test
    public void testEquals() {
        String expResult = "0080147974700641311023101202000000000000000000002098000000000000000544891XXXXXX0003000000246671956             000000000000033066848171224                                                                2000000000002065WW876746BR 1";
        Registro008CVnsuRotativo recordRequest = fixedFormatManager.load(Registro008CVnsuRotativo.class, expResult);
        
        assertEquals(recordRequest.getTipoRegistro(), tipoRegistro);
        assertEquals(recordRequest.getNumeroPV(), numeroPV);
        assertEquals(recordRequest.getNumeroRV(), numeroRV);
        assertEquals(recordRequest.getDataCVnsu(), dataCVnsu);
        assertEquals(recordRequest.getZeros(), zeros);
        assertEquals(recordRequest.getValorCVnsu(), valorCVnsu);
        assertEquals(recordRequest.getValorGorgeta(), valorGorgeta);
        assertEquals(recordRequest.getNumeroCartao(), numeroCartao);
        assertEquals(recordRequest.getStatusCVnsu(), statusCVnsu);
        assertEquals(recordRequest.getValorDesconto(), valorDesconto);
        assertEquals(recordRequest.getNumeroCVnsu(), numeroCVnsu);
        assertEquals(recordRequest.getValorDesconto(), valorDesconto);
        assertEquals(recordRequest.getNumAutorizacao(), numAutorizacao);
        assertEquals(recordRequest.getHoraTransacao(), horaTransacao);
        assertEquals(recordRequest.getTipoCaptura(), tipoCaptura);
        assertEquals(recordRequest.getValorLiquido(), valorLiquido);
        assertEquals(recordRequest.getNumeroTerminal(), numeroTerminal);
        assertEquals(recordRequest.getSiglaPais(), siglaPais);
        assertEquals(recordRequest.getBandeira(), bandeira);
    }

}
