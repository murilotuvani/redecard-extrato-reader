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

import br.com.autogeral.redecar.eefi.Registro040Serasa;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 20/02/2020 09:32:36
 *
 * @author kaique.mota
 */
public class Registro040Serasatest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 40;
    Integer numeroPV = 999999999;
    Integer quantidadeConsultasRealizadasPeriodo = 0;
    Double valorTotalConsultasPeriodo = 0.0;
    Date inicioPeriodoConsulta = java.sql.Date.valueOf(LocalDate.parse("01112011", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Date fimPeriodoConsulta = java.sql.Date.valueOf(LocalDate.parse("30112011", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorConsultaPeriodo = 0.0;

    @Test
    public void testParse() {

        String expResult = "040999999999000000000000000000000111201130112011000000000000000";
        Registro040Serasa serasa = fixedFormatManager.load(Registro040Serasa.class, expResult);
        System.out.println(serasa.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "040999999999000000000000000000000111201130112011000000000000000";
        
        Registro040Serasa serasa = fixedFormatManager.load(Registro040Serasa.class, expResult);
        assertEquals(serasa.getTipoRegistro(), tipoRegistro);
        assertEquals(serasa.getNumeroPV(), numeroPV);
        assertEquals(serasa.getQuantidadeConsultasRealizadasPeriodo(), quantidadeConsultasRealizadasPeriodo);
        assertEquals(serasa.getValorTotalConsultasPeriodo(), valorTotalConsultasPeriodo);
        assertEquals(serasa.getInicioPeriodoConsulta(), inicioPeriodoConsulta);
        assertEquals(serasa.getFimPeriodoConsulta(), fimPeriodoConsulta);
        assertEquals(serasa.getValorConsultaPeriodo(), valorConsultaPeriodo);

    }
}
