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
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 11/02/2020 17:12:19
 *
 * @author kaique.mota
 */
public class Registro12CVnsuparceladosemJurosTest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 12;
    Integer numeroPV = 99999999;
    Integer numeroRV = 20549200;
    Double valorCVnsu = 130.0;
    Double valorGorjeta = 0.0;
    String numeroCartao = "422100******9168";
    String statusCVnsu = "000";
    Integer numeroParcelas = 2;
    Integer numeroCVnsu = 749080923;
    Integer numeroReferencia = 0;
    Double valorDesconto = 5.85;
    String numeroAutorizacao = "070093";
    Integer horaTransacao = 141536;
    String tipoCaptura = "2";
    Double valorLiquido = 124.15;
    Double valorLiquido1parcela = 62.07;
    Double valorLiquidoDemaisParcelas = 62.08;
    String numeroTerminal = "WE007234";

    @Test
    public void testParse() {

        String expResult = "0120147974700099496833105201900000000000000000016509000000000000000524820XXXXXX789900003000002866720             000000000000721029968100804                                                                2000000000015788000000000005262000000000005263WW249331BR 1";
        Registro12CVnsuparceladosemJuros recordParceladosemJuros = fixedFormatManager.load(Registro12CVnsuparceladosemJuros.class, expResult);
        System.out.println(recordParceladosemJuros);
    }

    @Test
    public void testEquals() {

        String expResult = "0120999999990205492002812201100000000000000000013000000000000000000422100******916800002000749080923             000000000000585070093141536                                                                2000000000012415000000000006207000000000006208WE007234        ";
        Registro12CVnsuparceladosemJuros recordParceladosemJuros = fixedFormatManager.load(Registro12CVnsuparceladosemJuros.class, expResult);
        assertEquals(recordParceladosemJuros.getTipoRegistro(), tipoRegistro);
        assertEquals(recordParceladosemJuros.getNumeroPV(), numeroPV);
        assertEquals(recordParceladosemJuros.getNumeroRV(), numeroRV);
        assertEquals(recordParceladosemJuros.getValorCVnsu(), valorCVnsu);
        assertEquals(recordParceladosemJuros.getValorGorjeta(), valorGorjeta);
        assertEquals(recordParceladosemJuros.getNumeroCartao(), numeroCartao);
        assertEquals(recordParceladosemJuros.getStatusCVnsu(), statusCVnsu);
        assertEquals(recordParceladosemJuros.getNumeroParcelas(), numeroParcelas);
        assertEquals(recordParceladosemJuros.getNumeroCVnsu(), numeroCVnsu);
        assertEquals(recordParceladosemJuros.getNumeroReferencia(), numeroReferencia);
        assertEquals(recordParceladosemJuros.getValorDesconto(), valorDesconto);
        assertEquals(recordParceladosemJuros.getNumeroAutorizacao(), numeroAutorizacao);
        assertEquals(recordParceladosemJuros.getHoraTransacao(), horaTransacao);
        assertEquals(recordParceladosemJuros.getTipoCaptura(), tipoCaptura);
        assertEquals(recordParceladosemJuros.getValorLiquido(), valorLiquido);
        assertEquals(recordParceladosemJuros.getValorLiquido1parcela(), valorLiquido1parcela);
        assertEquals(recordParceladosemJuros.getValorLiquidoDemaisParcelas(), valorLiquidoDemaisParcelas);
        assertEquals(recordParceladosemJuros.getNumeroTerminal(), numeroTerminal);

    }
}
