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

import static junit.framework.TestCase.assertEquals;

/**
 * 20/02/2020 11:10:28
 *
 * @author kaique.mota
 */
public class Registro052TrailerArquivotest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 52;
    Integer quantidadeMatrizesArquivo = 6;
    Integer quantidadeRegistrosArquivo = 58;
    Integer numeroPVgrupo = 999999999;
    Integer quantidadeTotalResumosGrupo = 30;
    Double valorTotalDosCreditosNormais = 2471.51;
    Integer quantidadeCreditosAntecipados = 0;
    Double valorTotalAntecipado = 0.0;
    Integer quantidadeAjustesCredito = 0;
    Double valorTotalAjustesCredito = 0.0;
    Integer quantidadeAjustesDebito = 0;
    Double valorTotalAjustesDebito = 0.0;

    @Test
    public void testParse() {

        String expResult = "0520006000058999999999003000000000024715100000000000000000000000000000000000000000000000000000000000";
        Registro052TrailerArquivo trailer = fixedFormatManager.load(Registro052TrailerArquivo.class, expResult);
        System.out.println(trailer.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "0520006000058999999999003000000000024715100000000000000000000000000000000000000000000000000000000000";
        Registro052TrailerArquivo trailer = fixedFormatManager.load(Registro052TrailerArquivo.class, expResult);
        assertEquals(trailer.getTipoRegistro(), tipoRegistro);
        assertEquals(trailer.getQuantidadeMatrizesArquivo(), quantidadeMatrizesArquivo);
        assertEquals(trailer.getQuantidadeRegistrosArquivo(), quantidadeRegistrosArquivo);
        assertEquals(trailer.getNumeroPVgrupo(), numeroPVgrupo);
        assertEquals(trailer.getQuantidadeTotalResumosGrupo(), quantidadeTotalResumosGrupo);
        assertEquals(trailer.getValorTotalDosCreditosNormais(), valorTotalDosCreditosNormais);
        assertEquals(trailer.getQuantidadeCreditosAntecipados(), quantidadeCreditosAntecipados);
        assertEquals(trailer.getQuantidadeAjustesCredito(), quantidadeAjustesCredito);
        assertEquals(trailer.getQuantidadeAjustesDebito(), quantidadeAjustesDebito);
        assertEquals(trailer.getValorTotalAjustesDebito(), valorTotalAjustesDebito);
    }

}
