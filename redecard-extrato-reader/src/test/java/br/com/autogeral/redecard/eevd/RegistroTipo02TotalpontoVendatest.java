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
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 18/02/2020 10:32:25
 *
 * @author kaique.mota
 */
public class RegistroTipo02TotalpontoVendatest {

    Integer tipoRegistro = 02;
    Integer numeroFiliacaoMatriz = 15244946;
    Integer quantidadeResumovendasAcatados = 003;
    Integer quantidadeComprovantesVendas = 12;
    Double totalBruto = 2500.51;
    Double totalDesconto = 29.65;
    Double totalLiquido = 2470.86;
    Double valorBrutopreDatado = 0.0;
    Double descontoPreDatado = 0.0;
    Double liquidoPreDatado = 0.0;

    private static FixedFormatManager manager = new FixedFormatManagerImpl();

    @Test
    public void testParse() {
        String expResult = "02,039188892,003,000009,000000000138541,000000000001510,000000000137031,000000000000000,000000000000000,000000000000000";
        expResult = expResult.replace(",", "");
        RegistroTipo02TotalpontoVenda totalPontoVenda = manager.load(RegistroTipo02TotalpontoVenda.class, expResult);
        System.out.println(totalPontoVenda.toString());
    }

    @Test
    public void testEquals() {
        String expResult = "02,015244946,003,000012,000000000250051,000000000002965,000000000247086,000000000000000,000000000000000,000000000000000";
        expResult = expResult.replace(",", "");

        RegistroTipo02TotalpontoVenda totalPontoVenda = manager.load(RegistroTipo02TotalpontoVenda.class, expResult);
        assertEquals(totalPontoVenda.getTipoRegistro(), tipoRegistro);
        assertEquals(totalPontoVenda.getNumeroFiliacaoMatriz(), numeroFiliacaoMatriz);
        assertEquals(totalPontoVenda.getQuantidadeResumovendasAcatados(), quantidadeResumovendasAcatados);
        assertEquals(totalPontoVenda.getQuantidadeComprovantesVendas(), quantidadeComprovantesVendas);
        assertEquals(totalPontoVenda.getTotalBruto(), totalBruto);
        assertEquals(totalPontoVenda.getTotalDesconto(), totalDesconto);
        assertEquals(totalPontoVenda.getTotalLiquido(), totalLiquido);
        assertEquals(totalPontoVenda.getValorBrutopreDatado(), valorBrutopreDatado);
        assertEquals(totalPontoVenda.getDescontoPreDatado(), descontoPreDatado);
        assertEquals(totalPontoVenda.getLiquidoPreDatado(), liquidoPreDatado);
    }
}
