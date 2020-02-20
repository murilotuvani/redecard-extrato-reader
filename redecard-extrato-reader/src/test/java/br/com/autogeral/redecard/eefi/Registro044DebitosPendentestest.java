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

import br.com.autogeral.redecar.eefi.Registro044DebitosPendentes;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 19/02/2020 08:13:30
 *
 * @author kaique.mota
 */
public class Registro044DebitosPendentestest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 44;
    Integer numeroPVajustado = 999999999;
    Long numeroOrdemDebito = 14079010509l;
    Date dataOD = java.sql.Date.valueOf(LocalDate.parse("20032014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorOD = 541.46;
    Integer motivoAjuste = 23;
    String motivoAjusteText = "CONTESTACAO VDA";
    String numeroCartao = "1234******222222";
    Long numeroNSU = 999999999999l;
    Date dataCVoriginaltransação= java.sql.Date.valueOf(LocalDate.parse("13022014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    String numeroAutorizacao = "777777";
    Double valorOriginal = 1656.68;
    Integer numeroRVoriginal = 999999999;
    Date dataRVoriginal = java.sql.Date.valueOf(LocalDate.parse("13022014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer numeroPVoriginal = 999999999;
    String numeroReferenciaCarta = "006407200630997";
    Date dataCarta = java.sql.Date.valueOf(LocalDate.parse("13022014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Long numeroProcessoChargeback = 888888888888888l;
    Integer mesReferencia = 22014;
    Double valorCompensado = 0.0;
    Date dataPagamento= java.sql.Date.valueOf(LocalDate.parse("13022014", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorPendenteDebito = 541.46;
    Integer numeroProcessoRetencao = 0;
    Integer meioCompensacao = 0;
    String identificaBandeira = "1";

    @Test
    public void testParse() {

        String expResult = "044999999999140790105092003201400000000005414623CONTESTACAO VDA             1234******22222299999999999913022014777777000000000165668999999999130220149999999990064072006309971302201488888888888888802201400000000000000000000000000000000054146               00                            1";
        Registro044DebitosPendentes pendentes = fixedFormatManager.load(Registro044DebitosPendentes.class, expResult);
        System.out.println(pendentes.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "044999999999140790105092003201400000000005414623CONTESTACAO VDA             1234******22222299999999999913022014777777000000000165668999999999130220149999999990064072006309971302201488888888888888802201400000000000000000000000000000000054146               00                            1";
        Registro044DebitosPendentes pendentes = fixedFormatManager.load(Registro044DebitosPendentes.class, expResult);

        assertEquals(pendentes.getTipoRegistro(), tipoRegistro);
        assertEquals(pendentes.getNumeroPVajustado(), numeroPVajustado);
        assertEquals(pendentes.getNumeroOrdemDebito(), numeroOrdemDebito);
        assertEquals(pendentes.getDataOD(), dataOD);
        assertEquals(pendentes.getMotivoAjuste(), motivoAjuste);
        assertEquals(pendentes.getMotivoAjusteText(), motivoAjusteText);
        assertEquals(pendentes.getNumeroCartao(), numeroCartao);
        assertEquals(pendentes.getNumeroNSU(), numeroNSU);
        assertEquals(pendentes.getDataCVoriginaltransação(), dataCVoriginaltransação);
        assertEquals(pendentes.getNumeroAutorizacao(), numeroAutorizacao);
        assertEquals(pendentes.getValorOriginal(), valorOriginal);
        assertEquals(pendentes.getNumeroRVoriginal(), numeroRVoriginal);
        assertEquals(pendentes.getDataRVoriginal(), dataRVoriginal);
        assertEquals(pendentes.getNumeroPVoriginal(), numeroPVoriginal);
        assertEquals(pendentes.getNumeroReferenciaCarta(), numeroReferenciaCarta);
        assertEquals(pendentes.getDataCarta(), dataCarta);
        assertEquals(pendentes.getNumeroProcessoChargeback(), numeroProcessoChargeback);
        assertEquals(pendentes.getMesReferencia(), mesReferencia);
        assertEquals(pendentes.getValorCompensado(), valorCompensado);
        //assertEquals(pendentes.getDataPagamento(), dataPagamento);
        assertEquals(pendentes.getValorPendenteDebito(), valorPendenteDebito);
        assertEquals(pendentes.getNumeroProcessoRetencao(), numeroProcessoRetencao);
        assertEquals(pendentes.getMeioCompensacao(), meioCompensacao);
        assertEquals(pendentes.getIdentificaBandeira(), identificaBandeira);

    }

}
