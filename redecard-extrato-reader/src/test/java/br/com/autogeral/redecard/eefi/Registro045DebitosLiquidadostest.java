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

import br.com.autogeral.redecar.eefi.Registro045DebitosLiquidados;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 20/02/2020 10:22:38
 *
 * @author kaique.mota
 */
public class Registro045DebitosLiquidadostest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();
    Integer tipoRegistro = 45;
    Integer numeroPV = 999999999;
    Long numeroOrdemDebito = 14043012716l;
    Date dataOD = java.sql.Date.valueOf(LocalDate.parse("12022014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorOD = 126.66;
    Integer motivoAjuste = 18;
    String motivoAjusteText = "CANCEL.DE VENDAS";
    String numeroCartao = "1234******222222";
    Long numeroNsu = 999999999999l;
    Date dataCVoriginal = java.sql.Date.valueOf(LocalDate.parse("14012014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    String numeroAutorizacao = "777777";
    Double valorTransacaoOriginal = 129.9;
    Integer numeroRVoriginal = 999999999;
    Date dataRVoriginal = java.sql.Date.valueOf(LocalDate.parse("14012014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer numeroPVoriginal = 999999999;
    String numeroReferencia = "25361103";
    Date dataCarta = java.sql.Date.valueOf(LocalDate.parse("12022014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Long numeroProcessoChargeback = 888888888888888l;
    Integer mesReferencia = 22014;
    Double valorLiquido = 126.66;
 //   Date dataLiquidacao= java.sql.Date.valueOf(LocalDate.parse("12022014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer meioCompensacao = 40;
    String meioCompensacaoText = "COMPENSADO NO RESUMO";
    String identificaBandeira = "1";

    @Test
    public void testParse() {

        String expResult = "045999999999140430127161202201400000000001266618CANCEL.DE VENDAS            1234******222222999999999999140120147777770000000000129909999999991401201499999999925361103       1202201488888888888888802201400000000001266600000000               40COMPENSADO NO RESUMO        1";
        Registro045DebitosLiquidados debitos = fixedFormatManager.load(Registro045DebitosLiquidados.class, expResult);
        System.out.println(debitos.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "045999999999140430127161202201400000000001266618CANCEL.DE VENDAS            1234******222222999999999999140120147777770000000000129909999999991401201499999999925361103       1202201488888888888888802201400000000001266600000000               40COMPENSADO NO RESUMO        1";
        Registro045DebitosLiquidados debitos = fixedFormatManager.load(Registro045DebitosLiquidados.class, expResult);

        assertEquals(debitos.getTipoRegistro(), tipoRegistro);
        assertEquals(debitos.getNumeroPV(), numeroPV);
        assertEquals(debitos.getNumeroOrdemDebito(), numeroOrdemDebito);
        assertEquals(debitos.getDataOD(), dataOD);
        assertEquals(debitos.getValorOD(), valorOD);
        assertEquals(debitos.getMotivoAjuste(), motivoAjuste);
        assertEquals(debitos.getMotivoAjusteText(), motivoAjusteText);
        assertEquals(debitos.getNumeroCartao(), numeroCartao);
        assertEquals(debitos.getNumeroNsu(), numeroNsu);
        assertEquals(debitos.getDataCVoriginal(), dataCVoriginal);
        assertEquals(debitos.getNumeroAutorizacao(), numeroAutorizacao);
        assertEquals(debitos.getValorTransacaoOriginal(), valorTransacaoOriginal);
        assertEquals(debitos.getNumeroRVoriginal(), numeroRVoriginal);
        assertEquals(debitos.getDataRVoriginal(), dataRVoriginal);
        assertEquals(debitos.getNumeroPVoriginal(), numeroPVoriginal);
        assertEquals(debitos.getNumeroReferencia(), numeroReferencia);
        assertEquals(debitos.getDataCarta(), dataCarta);
        assertEquals(debitos.getNumeroProcessoChargeback(), numeroProcessoChargeback);
        assertEquals(debitos.getMesReferencia(), mesReferencia);
        assertEquals(debitos.getValorLiquido(), valorLiquido);
    //    assertEquals(debitos.getDataLiquidacao(), dataLiquidacao);
        assertEquals(debitos.getMeioCompensacao(), meioCompensacao);
        assertEquals(debitos.getMeioCompensacaoText(), meioCompensacaoText);
        assertEquals(debitos.getIdentificaBandeira(), identificaBandeira);

    }

}
