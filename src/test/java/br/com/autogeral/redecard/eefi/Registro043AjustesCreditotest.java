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
 * 19/02/2020 09:36:40
 *
 * @author kaique.mota
 */
public class Registro043AjustesCreditotest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();
    Integer tipoRegistro = 43;
    Integer numeroPVcreditado = 999999999;
    Integer numeroResumoCredito = 999999999;
    Long nummeroDocumento = 4140944451L;
    Date dataEmissao = java.sql.Date.valueOf(LocalDate.parse("20052014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Date dataCredito = java.sql.Date.valueOf(LocalDate.parse("22052014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorCredito = 25.0;
    String Ccredito = "C";
    Integer banco = 999;
    Integer agencia = 111111;
    String contaCorrente = "88888888888";
    Integer motivoCredito = 61;
    String motivoCreditoText = "DEV CRED PGTO MAIOR";
    String bandeira = "1";

    @Test
    public void testParse() {

        String expResult = "043999999999999999999041409444512005201422052014000000000002500C9991111118888888888861DEV CRED PGTO MAIOR         1";
        Registro043AjustesCredito ajustescredito = fixedFormatManager.load(Registro043AjustesCredito.class, expResult);
        System.out.println(ajustescredito.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "043999999999999999999041409444512005201422052014000000000002500C9991111118888888888861DEV CRED PGTO MAIOR         1";
        Registro043AjustesCredito ajustescredito = fixedFormatManager.load(Registro043AjustesCredito.class, expResult);

        assertEquals(ajustescredito.getTipoRegistro(), tipoRegistro);
        assertEquals(ajustescredito.getNumeroPVcreditado(), numeroPVcreditado);
        assertEquals(ajustescredito.getNumeroResumoCredito(), numeroResumoCredito);
        assertEquals(ajustescredito.getNummeroDocumento(), nummeroDocumento);
        assertEquals(ajustescredito.getDataEmissao(), dataEmissao);
        assertEquals(ajustescredito.getDataCredito(), dataCredito);
        assertEquals(ajustescredito.getValorCredito(), valorCredito);
        assertEquals(ajustescredito.getCcredito(), Ccredito);
        assertEquals(ajustescredito.getBanco(), banco);
        assertEquals(ajustescredito.getAgencia(), agencia);
        assertEquals(ajustescredito.getContaCorrente(), contaCorrente);
        assertEquals(ajustescredito.getMotivoCredito(), motivoCredito);
        assertEquals(ajustescredito.getMotivoCreditoText(), motivoCreditoText);
        assertEquals(ajustescredito.getBandeira(), bandeira);
    }
}
