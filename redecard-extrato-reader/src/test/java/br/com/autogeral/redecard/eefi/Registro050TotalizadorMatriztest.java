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

import br.com.autogeral.redecar.eefi.Registro050TotalizadorMatriz;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 20/02/2020 11:03:11
 *
 * @author kaique.mota
 */
public class Registro050TotalizadorMatriztest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 50;
    Integer numeroPVmatriz = 999999999;
    Integer quantidadeTotalResumosMatriz = 6;
    Double valorTotalCreditosNormais = 199.44;
    Integer quantidadeCreditosAntecipados = 0;
    Double valorTotalAntecipado = 0.0;
    Integer quantidadeAjustesCredito = 0;
    Double valorTotalAjustesCredito = 0.0;
    Integer quantidadeAjustesDebito = 0;
    Double valorTotalAjustesDebito = 0.0;

    Date dataEmissao = java.sql.Date.valueOf(LocalDate.parse("28122011", DateTimeFormatter.ofPattern("ddMMyyyy")));

    @Test
    public void testParse() {

        String expResult = "0509999999990000060000000000199440000000000000000000000000000000000000000000000000000000000000";
        Registro050TotalizadorMatriz credito = fixedFormatManager.load(Registro050TotalizadorMatriz.class, expResult);
        System.out.println(credito.toString());
    }

    @Test
    public void testEquals() {

        String expResult = "0509999999990000060000000000199440000000000000000000000000000000000000000000000000000000000000";
        Registro050TotalizadorMatriz totalizador = fixedFormatManager.load(Registro050TotalizadorMatriz.class, expResult);

        assertEquals(totalizador.getTipoRegistro(), tipoRegistro);
        assertEquals(totalizador.getNumeroPVmatriz(), numeroPVmatriz);
        assertEquals(totalizador.getQuantidadeTotalResumosMatriz(), quantidadeTotalResumosMatriz);
        assertEquals(totalizador.getValorTotalCreditosNormais(), valorTotalCreditosNormais);
        assertEquals(totalizador.getQuantidadeCreditosAntecipados(), quantidadeCreditosAntecipados);
        assertEquals(totalizador.getValorTotalAntecipado(), valorTotalAntecipado);
        assertEquals(totalizador.getQuantidadeAjustesCredito(), quantidadeAjustesCredito);
        assertEquals(totalizador.getQuantidadeAjustesDebito(), quantidadeAjustesDebito);
        assertEquals(totalizador.getValorTotalAjustesDebito(), valorTotalAjustesDebito);
    }
}
