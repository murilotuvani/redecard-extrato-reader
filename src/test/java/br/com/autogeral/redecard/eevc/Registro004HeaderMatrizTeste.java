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
 * 11/02/2020 13:13:17
 *
 * @author kaique.mota
 */
public class Registro004HeaderMatrizTeste extends TestCase {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();
    Integer tipoRegistro = 4;
    String nPVMatriz = "099999999";
    String nomeComercialMatriz = "OTICA OTICA";

    @Test
    public void testEEVDRegistro00CabecalhoArquivoSerialize() {
        String expResult = "004099999999OTICA OTICA";
        Registro004HeaderMatriz recordHeaderArquivo = fixedFormatManager.load(Registro004HeaderMatriz.class, expResult);
        System.out.println("REGISTRO: " + recordHeaderArquivo.getTipoRegistro());
        System.out.println("NOME COMERCIAL: " + recordHeaderArquivo.getNomeComercialMatriz());
        System.out.println("MATRIZ: " + recordHeaderArquivo.getnPVMatriz());
    }

    @Test
    public void testSerialize() {
        String expResult = "404099999999OTICA OTICA           ";

        Registro004HeaderMatriz record = new Registro004HeaderMatriz();
        record.setTipoRegistro(404);
        record.setNomeComercialMatriz("OTICA OTICA");
        record.setnPVMatriz("099999999");
        String atual = fixedFormatManager.export(record);
        assertEquals(expResult, atual);
    }

    @Test
    public void testEquals() {
        String expResult = "004099999999OTICA OTICA           ";
        Registro004HeaderMatriz recordHeaderArquivo = fixedFormatManager.load(Registro004HeaderMatriz.class, expResult);
        assertEquals(recordHeaderArquivo.getTipoRegistro(), tipoRegistro);
        assertEquals(recordHeaderArquivo.getnPVMatriz(), nPVMatriz);
        assertEquals(recordHeaderArquivo.getNomeComercialMatriz(), nomeComercialMatriz);
    }
}
