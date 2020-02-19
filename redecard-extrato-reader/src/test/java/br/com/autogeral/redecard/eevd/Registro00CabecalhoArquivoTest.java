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

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author murilotuvani
 */
public class Registro00CabecalhoArquivoTest {

    private static FixedFormatManager manager = new FixedFormatManagerImpl();

    /**
     * Test of getTipoRegistro method, of class Registro00CabecalhoArquivo.
     */
    Integer tipoRegistro = 00;
    Integer numeroFiliacao = 14797470;
    Date dataEmissao = java.sql.Date.valueOf(LocalDate.parse("04062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Date dataMovimento = java.sql.Date.valueOf(LocalDate.parse("03062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    String movimentacaoDiaria = "Movimentacao diaria - Cartoes de Debito";
    String adquirente = "Redecard";
    String nomeEstabelecimento = "AUTO GERAL";
    Integer sequencia = 81;
    String tipoProcessamento = "DIARIO";
    String versaoArquivo = "V1.04 - 07/10 - EEVD";

    @Test
    public void testParse() {
        String expResult = "00,014797470,01062019,31052019,Movimentacao diaria - Cartoes de Debito,Redecard,AUTO GERAL                ,000078,DIARIO         ,V1.04 - 07/10 - EEVD";
        expResult = expResult.replace(",", "");
        Registro00CabecalhoArquivo recordHeader = manager.load(Registro00CabecalhoArquivo.class, expResult);
        System.out.println(recordHeader.toString());
    }

    @Test
    public void testEquals() {
        String expResult = "00,014797470,04062019,03062019,Movimentacao diaria - Cartoes de Debito,Redecard,AUTO GERAL                ,000081,DIARIO         ,V1.04 - 07/10 - EEVD";
        expResult = expResult.replace(",", "");
        
        Registro00CabecalhoArquivo recordHeader = manager.load(Registro00CabecalhoArquivo.class, expResult);
        assertEquals(recordHeader.getTipoRegistro(), tipoRegistro);
        assertEquals(recordHeader.getNumeroFiliacao(), numeroFiliacao);
        assertEquals(recordHeader.getDataEmissao(), dataEmissao);
        assertEquals(recordHeader.getDataMovimento(), dataMovimento);
        assertEquals(recordHeader.getMovimentacaoDiaria(), movimentacaoDiaria);
        assertEquals(recordHeader.getAdquirente(), adquirente);
        assertEquals(recordHeader.getNomeEstabelecimento(), nomeEstabelecimento);
        assertEquals(recordHeader.getSequencia(), sequencia);
        assertEquals(recordHeader.getTipoProcessamento(), tipoProcessamento);
        assertEquals(recordHeader.getVersaoArquivo(), versaoArquivo);
    }
}
