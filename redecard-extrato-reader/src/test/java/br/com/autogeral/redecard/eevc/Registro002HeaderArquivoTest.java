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
 *
 * @author kaique.mota
 */
public class Registro002HeaderArquivoTest extends TestCase {
    
    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();
    
    @Test
    public void testExport() {
        String expResult = "20229122011REDECARDEXTRATO DE MOVIMENTO DE VENDASGRUPO OTICA OTICA     111106999999999DIARIO         V2.01 - 09/06 - EEVC";
        
        Registro002HeaderArquivo registro = new Registro002HeaderArquivo();
        registro.setTipoRegistro(202);
        registro.setDataEmissao(29122011);
        registro.setAdquirente("REDECARD");
        registro.setExtratoEletronicoVendas("EXTRATO DE MOVIMENTO DE VENDAS");
        registro.setNomeComercial("GRUPO OTICA OTICA     ");
        registro.setSequenciaMovimento(111106);
        registro.setnPVgrupoMatriz(999999999);
        registro.setTipoMovimento("DIARIO         ");
        registro.setVersaoArquivo("V2.01 - 09/06 - EEVC");
       
        String atual = fixedFormatManager.export(registro);
        assertEquals(expResult, atual);
    }
    
}
