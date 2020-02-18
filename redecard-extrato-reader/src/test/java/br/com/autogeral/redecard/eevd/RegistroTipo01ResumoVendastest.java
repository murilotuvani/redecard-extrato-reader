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
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 18/02/2020 09:55:08
 *
 * @author kaique.mota
 */
public class RegistroTipo01ResumoVendastest {

    private static FixedFormatManager manager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 1;
    Integer numeroFiliacaopontoVenda = 14797470;
    Date dataCredito = java.sql.Date.valueOf(LocalDate.parse("04062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Date dataResumoVendas = java.sql.Date.valueOf(LocalDate.parse("03062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer numeroResumoVendas = 154589975;
    Integer quantidadeComprovantesVendas = 11;
    Double valorBruto = 2011.96;
    Double valorDesconto = 30.19;
    Double valorLiquido = 1981.77;
    String tipoResumo = "D";
    Integer banco = 341;
    Integer agencia = 278;
    Integer contaCorrente = 924;
    String bandeira = "E";

    @Test
    public void testParse() {
        String expResult = "01,014797470,04062019,03062019,154589975,000011,000000000201196,000000000003019,000000000198177,D,341,000278,00000924717,E";
        expResult = expResult.replace(",", "");
        RegistroTipo01ResumoVendas recordHeader = manager.load(RegistroTipo01ResumoVendas.class, expResult);
        System.out.println(recordHeader.toString());
    }

    @Test
    public void testEquals() {
        String expResult = "01,014797470,04062019,03062019,154589975,000011,000000000201196,000000000003019,000000000198177,D,341,000278,00000924717,E";
        expResult = expResult.replace(",", "");
      
        RegistroTipo01ResumoVendas recordHeader = manager.load(RegistroTipo01ResumoVendas.class, expResult);
        assertEquals(recordHeader.getTipoRegistro(), tipoRegistro);
        assertEquals(recordHeader.getNumeroFiliacaopontoVenda(), numeroFiliacaopontoVenda);
        assertEquals(recordHeader.getDataCredito(), dataCredito);
        assertEquals(recordHeader.getDataResumoVendas(), dataResumoVendas);
        assertEquals(recordHeader.getNumeroResumoVendas(), numeroResumoVendas);
        assertEquals(recordHeader.getQuantidadeComprovantesVendas(), quantidadeComprovantesVendas);
        assertEquals(recordHeader.getValorBruto(), valorBruto);
        assertEquals(recordHeader.getValorDesconto(), valorDesconto);
        assertEquals(recordHeader.getValorLiquido(), valorLiquido);
        assertEquals(recordHeader.getTipoResumo(), tipoResumo);
        assertEquals(recordHeader.getBanco(), banco);
        assertEquals(recordHeader.getAgencia(), agencia);
        assertEquals(recordHeader.getBandeira(), bandeira);
    }
}
