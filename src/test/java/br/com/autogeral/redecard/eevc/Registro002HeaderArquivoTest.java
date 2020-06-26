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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author kaique.mota
 */
public class Registro002HeaderArquivoTest extends TestCase {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();
    Integer tipoRegistro = 2;
    Date dataEmissao = java.sql.Date.valueOf(LocalDate.parse("01062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    String adquirente = "REDECARD";
    String extratoEletronicoVendas = "EXTRATO DE MOVIMENTO DE VENDAS";
    String nomeComercial = "AUTO GERAL";
    Integer sequenciaMovimento = 78;
    Integer nPVgrupoMatriz = 14797470;
    String tipoMovimento = "DIARIO";
    String versaoArquivo = "V2.01 - 09/06 - EEVC";
    String livre;
//private Integer idIdentificaoFile;
//	private Integer tipoRegistro;
//    private Date dataEmissao;
//    private String adquirente;
//    private String extratoMovimentacaoFinanceira;
//    private Integer sequenciaMovimento;
//    private Integer numGrupoOuMatriz;
//    private String tipoProcessamento;
//    private String versaoArquivo;
    
    @Test
    public void testParse() {

        String expResult = "00201062019REDECARDEXTRATO DE MOVIMENTO DE VENDASAUTO GERAL            000078014797470DIARIO         V2.01 - 09/06 - EEVC";
        Registro002HeaderArquivo recordHeader = fixedFormatManager.load(Registro002HeaderArquivo.class, expResult);
        System.out.println(recordHeader.toString());
    }

    @Test
    public void testGet() {
        String expResult = "00201062019REDECARDEXTRATO DE MOVIMENTO DE VENDASAUTO GERAL            000078014797470DIARIO         V2.01 - 09/06 - EEVC";
        Registro002HeaderArquivo recordHeader = fixedFormatManager.load(Registro002HeaderArquivo.class, expResult);
        assertEquals(recordHeader.getTipoRegistro(), tipoRegistro);
        assertEquals(recordHeader.getDataEmissao(), dataEmissao);
        assertEquals(recordHeader.getAdquirente(), adquirente);
        assertEquals(recordHeader.getExtratoEletronicoVendas(), extratoEletronicoVendas);
        assertEquals(recordHeader.getNomeComercial(), nomeComercial);
        assertEquals(recordHeader.getSequenciaMovimento(), sequenciaMovimento);
        assertEquals(recordHeader.getnPVgrupoMatriz(), nPVgrupoMatriz);
        assertEquals(recordHeader.getTipoMovimento(), tipoMovimento);
        assertEquals(recordHeader.getVersaoArquivo(), versaoArquivo);
    }
}
