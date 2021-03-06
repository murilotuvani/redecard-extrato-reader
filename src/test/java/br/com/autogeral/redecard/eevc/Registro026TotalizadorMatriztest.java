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
 * 12/02/2020 09:43:48
 *
 * @author kaique.mota
 */
public class Registro026TotalizadorMatriztest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();
    Integer tipoRegistro = 26;
    String nPVmatriz = "014797470";
    Double valorBruto = 25999.2;
    Integer quantidadeCVnsuRejeitados = 0;
    Double valorTotalRejeitado = 0.0;
    Double valorTotalRotativo = 4945.93;
    Double valorTotalParceladosemJuros = 21053.27;
    Double valorTotalParceladoIATA = 0.0;
    Double valorTotalDolar = 0.0;
    Double valorTotalDesconto = 1131.82;
    Double valorTotalLiquido = 24867.38;
    Double valorTotalGorjeta = 0.0;
    Double valorTotalTaxaEmbarque = 0.0;
    Integer quantidadeCVnsuAcatados = 81;

    @Test
    public void testParse() {

        String expResult = "026014797470000000001336058000000000000000000000000000000381300000000000954758000000000000000000000000000000000000000056748000000001279310000000000000000000000000000000000067";
        Registro026TotalizadorMatriz recordTotalizador = fixedFormatManager.load(Registro026TotalizadorMatriz.class, expResult);
        System.out.println(recordTotalizador.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "026014797470000000002599920000000000000000000000000000000494593000000002105327000000000000000000000000000000000000000113182000000002486738000000000000000000000000000000000081";
        Registro026TotalizadorMatriz recordTotalizador = fixedFormatManager.load(Registro026TotalizadorMatriz.class, expResult);

        assertEquals(recordTotalizador.getTipoRegistro(), tipoRegistro);
        assertEquals(recordTotalizador.getnPVmatriz(), nPVmatriz);
        assertEquals(recordTotalizador.getValorBruto(), valorBruto);
        assertEquals(recordTotalizador.getQuantidadeCVnsuRejeitados(), quantidadeCVnsuRejeitados);
        assertEquals(recordTotalizador.getValorTotalRejeitado(), valorTotalRejeitado);
        assertEquals(recordTotalizador.getValorTotalRotativo(), valorTotalRotativo);
        assertEquals(recordTotalizador.getValorTotalParceladosemJuros(), valorTotalParceladosemJuros);
        assertEquals(recordTotalizador.getValorTotalParceladoIATA(), valorTotalParceladoIATA);
        assertEquals(recordTotalizador.getValorTotalDolar(), valorTotalDolar);
        assertEquals(recordTotalizador.getValorTotalDesconto(), valorTotalDesconto);
        assertEquals(recordTotalizador.getValorTotalLiquido(), valorTotalLiquido);
        assertEquals(recordTotalizador.getValorTotalGorjeta(), valorTotalGorjeta);
        assertEquals(recordTotalizador.getValorTotalTaxaEmbarque(), valorTotalTaxaEmbarque);
        assertEquals(recordTotalizador.getQuantidadeCVnsuAcatados(), quantidadeCVnsuAcatados);
    }

}
