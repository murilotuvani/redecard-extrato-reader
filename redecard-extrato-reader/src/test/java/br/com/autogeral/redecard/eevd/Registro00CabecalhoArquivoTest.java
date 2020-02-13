/*
 * The MIT License
 *
 * Copyright 2020 murilotuvani.
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

import br.com.autogeral.redecard.eevc.Registro002HeaderArquivo;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author murilotuvani
 */
public class Registro00CabecalhoArquivoTest {

    private static FixedFormatManager manager = new FixedFormatManagerImpl();

    /**
     * Test of getTipoRegistro method, of class Registro00CabecalhoArquivo.
     */
 
       @Test
    public void testParse() {
        String expResult = "00,014797470,04062019,03062019,Movimentacao diaria - Cartoes de Debito,Redecard,AUTO GERAL                ,000081,DIARIO         ,V1.04 - 07/10 - EEVD";
        expResult =  expResult.replace(",", " ");
        Registro00CabecalhoArquivo recordHeader = manager.load(Registro00CabecalhoArquivo.class, expResult);
        System.out.println(recordHeader.toString());
    }
    

}
