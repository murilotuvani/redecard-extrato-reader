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
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 19/02/2020 17:39:30
 *
 * @author kaique.mota
 */
public class Registro032HeaderMatriztest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 32;
    String numeroMatriz = "999999999";
    String nomeComercial = "OTICA OTICA";

    @Test
    public void testParse() {

        String expResult = "032999999999OTICA OTICA           ";
        Registro032HeaderMatriz header = fixedFormatManager.load(Registro032HeaderMatriz.class, expResult);
        System.out.println(header.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "032999999999OTICA OTICA           ";
        Registro032HeaderMatriz header = fixedFormatManager.load(Registro032HeaderMatriz.class, expResult);
        assertEquals(header.getTipoRegistro(), tipoRegistro);
        assertEquals(header.getNumeroMatriz(), numeroMatriz);
        assertEquals(header.getNomeComercial(), nomeComercial);

    }
}
