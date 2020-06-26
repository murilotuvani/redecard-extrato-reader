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

/**
 * 18/02/2020 16:25:22
 *
 * @author kaique.mota
 */
public class Registro035AjustesNetDesagendamentotest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    @Test
    public void testParse() {

        String expResult = "03501479747008704967406032019000000000004593D18CANCEL.DE VENDAS            498453XXXXXX3461040320190870496743190651250206800603201900000001479747004032019000000000014058D04062019000000000059572000000000064165000000000280007000000000014058000248144170058291T0906358875400000000000000000000000000000033";
        Registro035AjustesNetDesagendamentos credito = fixedFormatManager.load(Registro035AjustesNetDesagendamentos.class, expResult);

    }

}
