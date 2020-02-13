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
import java.util.Date;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * 11/02/2020 16:09:05
 *
 * @author kaique.mota
 */
public class Registro008CVnsuRotativoTest extends TestCase {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    @Test
    public void testParse() {

        String expResult = "0080147974700641311023101202000000000000000000002098000000000000000544891XXXXXX0003000000246671956             000000000000033066848171224                                                                2000000000002065WW876746BR 1";
        Registro008CVnsuRotativo recordRequest = fixedFormatManager.load(Registro008CVnsuRotativo.class, expResult);
        System.out.println(recordRequest.toString());
    }

//    @Test
//    public void testSerialize() {
//        String expResult = "0080999999990991317012812201100000000000000000007000000000000000000498453******8149000000248983599             000000000000280005568175118                                                                9000000000006720ID011501";
//        Registro008CVnsuRotativo registro = new Registro008CVnsuRotativo();
//        registro.setTipoRegistro(Integer.SIZE);
//        registro.setNumeroPV(Integer.SIZE);
//        registro.setNumeroRV(Integer.SIZE);
//        registro.setDataCVnsu(new Date("1112331"));
//        String atual = fixedFormatManager.export(registro);
//        assertEquals(expResult, atual);
//    }

}
