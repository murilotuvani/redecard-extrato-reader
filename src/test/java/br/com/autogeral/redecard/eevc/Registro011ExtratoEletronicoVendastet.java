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
 * 19/02/2020 09:47:34
 *
 * @author kaique.mota
 */
public class Registro011ExtratoEletronicoVendastet {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 11;
    Integer numeroPVcreditado = 14797470;
    Integer numeroResumoCredito = 15201941;
    Date dataAjuste = java.sql.Date.valueOf(LocalDate.parse("01052019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorAjuste = 3.15;
    Date dataCredit = java.sql.Date.valueOf(LocalDate.parse("10062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorCredito = 3.15;
    String cCredito = "C";
    Integer banco = 341;
    Integer agencia = 278;
    Long contaCorrente = 177381L;
    Integer motivoAjuste = 67;
    String descricaoAjuste = "COMISSO DE RECARGA";
    String bandeira = "1";

    @Test
    public void testParse() {

        String expResult = "0110147974700152019410105201900000000000031510062019000000000000315C3410002780000017738167COMISSO DE RECARGA         1";
        Registro011ExtratoEletronicoVendas recordHeader = fixedFormatManager.load(Registro011ExtratoEletronicoVendas.class, expResult);
        System.out.println(recordHeader.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "0110147974700152019410105201900000000000031510062019000000000000315C3410002780000017738167COMISSO DE RECARGA         1";
        Registro011ExtratoEletronicoVendas recordHeader = fixedFormatManager.load(Registro011ExtratoEletronicoVendas.class, expResult);

        assertEquals(recordHeader.getTipoRegistro(), tipoRegistro);
        assertEquals(recordHeader.getNumeroPVcreditado(), numeroPVcreditado);
        assertEquals(recordHeader.getNumeroResumoCredito(), numeroResumoCredito);
        assertEquals(recordHeader.getDataAjuste(), dataAjuste);
        assertEquals(recordHeader.getValorAjuste(), valorAjuste);
        assertEquals(recordHeader.getDataCredito(), dataCredit);
        assertEquals(recordHeader.getValorCredito(), valorCredito);
        assertEquals(recordHeader.getcCredito(), cCredito);
        assertEquals(recordHeader.getBanco(), banco);
        assertEquals(recordHeader.getAgencia(), agencia);
        assertEquals(recordHeader.getContaCorrente(), contaCorrente);
        assertEquals(recordHeader.getMotivoAjuste(), motivoAjuste);
        assertEquals(recordHeader.getDescricaoAjuste(), descricaoAjuste);
        assertEquals(recordHeader.getBandeira(), bandeira);
    }

}
