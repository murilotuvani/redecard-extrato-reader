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
 * 18/02/2020 10:49:07
 *
 * @author kaique.mota
 */
public class RegistroTipo04TotalArquivotest {

    private static FixedFormatManager manager = new FixedFormatManagerImpl();
    Integer tipoRegistro = 04;
    Integer numeroFiliacaoMatrizouGrupo = 14797470;
    Integer quantidadeResumoVendas = 18;
    Integer quanitidadeComprovantesVendas = 166;
    Double totalBruto = 22528.86;
    Double totalDesconto = 264.77;
    Double totalLiquido = 22264.09;
    Double valorBrutopreDatado = 0.0;
    Double descontoPredatado = 0.0;
    Double liquidoPredatado = 0.0;
    Integer totalRegistro = 195;

    @Test
    public void testParse() {
        String expResult = "04,014797470,000018,000166,000000002252886,000000000026477,000000002226409,000000000000000,000000000000000,000000000000000,000195";
        expResult = expResult.replace(",", "");
        RegistroTipo04TotalArquivo totalArquivo = manager.load(RegistroTipo04TotalArquivo.class, expResult);
        System.out.println(totalArquivo.toString());

    }

    @Test
    public void testEquals() {
        String expResult = "04,014797470,000018,000166,000000002252886,000000000026477,000000002226409,000000000000000,000000000000000,000000000000000,000195";
        expResult = expResult.replace(",", "");

        RegistroTipo04TotalArquivo totalArquivo = manager.load(RegistroTipo04TotalArquivo.class, expResult);
        assertEquals(totalArquivo.getTipoRegistro(), tipoRegistro);
        assertEquals(totalArquivo.getNumeroFiliacaoMatrizouGrupo(), numeroFiliacaoMatrizouGrupo);
        assertEquals(totalArquivo.getQuanitidadeComprovantesVendas(), quanitidadeComprovantesVendas);
        assertEquals(totalArquivo.getQuantidadeResumoVendas(), quantidadeResumoVendas);
        assertEquals(totalArquivo.getTotalBruto(), totalBruto);
        assertEquals(totalArquivo.getTotalDesconto(), totalDesconto);
        assertEquals(totalArquivo.getTotalLiquido(), totalLiquido);
        assertEquals(totalArquivo.getValorBrutopreDatado(), valorBrutopreDatado);
        assertEquals(totalArquivo.getDescontoPredatado(), descontoPredatado);
        assertEquals(totalArquivo.getLiquidoPredatado(), liquidoPredatado);
        assertEquals(totalArquivo.getTotalRegistro(), totalRegistro);
    }
}
