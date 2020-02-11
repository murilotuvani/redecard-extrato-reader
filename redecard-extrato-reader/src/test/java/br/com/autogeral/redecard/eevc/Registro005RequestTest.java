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
import junit.framework.TestCase;
import org.junit.Test;

/**
 * 11/02/2020 13:13:28
 *
 * @author kaique.mota
 */
public class Registro005RequestTest extends TestCase {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    @Test
    public void testParse() {

        String expResult = "010099999999020549200341003610000038497728122011000010000000000130000000000000000000000000000000000000000000005850000000000124152701201230120999999990205492002812201100000000000000000013000000000000000000422100******9168000020007490809230000000000005850700931415362000000000012415000000000006207000000000006208WE0072340140999999990205492002812201100000000010000000000065000000000000002930000000000062072701201201409999999902054920028122011000000000200000000000650000000000000029200000000000620827022012026099999999000000000013000000000000000000000000000000000000000000000000013000000000000000000000000000000000000000000000585000000000012415000000000000000000000000000000000001";
        Registro005Request recordRequest = fixedFormatManager.load(Registro005Request.class, expResult);
    }
}
