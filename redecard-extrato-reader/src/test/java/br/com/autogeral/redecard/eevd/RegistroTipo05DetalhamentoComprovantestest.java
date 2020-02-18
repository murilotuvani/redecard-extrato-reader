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
package br.com.autogeral.redecard.eevd;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 18/02/2020 11:08:49
 *
 * @author kaique.mota
 */
public class RegistroTipo05DetalhamentoComprovantestest {

    private static FixedFormatManager manager = new FixedFormatManagerImpl();

    Integer tipoRegistro = 05;
    Integer numeroFiliacaoPontovenda = 39188892;
    Integer numeroResumoVendas = 154140306;
    Date dataCV = java.sql.Date.valueOf(LocalDate.parse("03062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorBruto = 105.1;
    Double valorDesconto = 1.1;
    Double valorLiquido = 104.0;
    String numeroCartao = "603689*********7267";
    String tipoTransacao = "V";
    Integer numeroCV = 249073694;
    Date dataCredito = java.sql.Date.valueOf(LocalDate.parse("04062019", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer statusTransacao = 1;
    Integer horaTransacao = 102751;
    String numeroTerminal = "WW296838";
    Integer tipoCaptura = 2;
    Integer reservado = 0;
    Double valorCompra = 105.1;
    Double valorSaque = 0.0;
    String bandeira = "1";

    @Test
    public void testParse() {
        String expResult = "05,039188892,154140306,03062019,000000000010510,000000000000110,000000000010400,603689*********7267,V,000249073694,04062019,01,102751,WW296838,2 ,00000,000000000010510,000000000000000,1";
        expResult = expResult.replace(",", "");
        RegistroTipo05DetalhamentoComprovantes detalhamentoComprovante = manager.load(RegistroTipo05DetalhamentoComprovantes.class, expResult);
        System.out.println(detalhamentoComprovante.toString());
    }

    @Test
    public void testEquals() {
        String expResult = "05,039188892,154140306,03062019,000000000010510,000000000000110,000000000010400,603689*********7267,V,000249073694,04062019,01,102751,WW296838,2 ,00000,000000000010510,000000000000000,1";
        expResult = expResult.replace(",", "");
        RegistroTipo05DetalhamentoComprovantes detalhamentoComprovante = manager.load(RegistroTipo05DetalhamentoComprovantes.class, expResult);

        assertEquals(detalhamentoComprovante.getTipoRegistro(), tipoRegistro);
        assertEquals(detalhamentoComprovante.getNumeroFiliacaoPontovenda(), numeroFiliacaoPontovenda);
        assertEquals(detalhamentoComprovante.getNumeroResumoVendas(), numeroResumoVendas);
        assertEquals(detalhamentoComprovante.getDataCV(), dataCV);
        assertEquals(detalhamentoComprovante.getValorBruto(), valorBruto);
        assertEquals(detalhamentoComprovante.getValorDesconto(), valorDesconto);
        assertEquals(detalhamentoComprovante.getValorLiquido(), valorLiquido);
        assertEquals(detalhamentoComprovante.getNumeroCartao(), numeroCartao);
        assertEquals(detalhamentoComprovante.getTipoTransacao(), tipoTransacao);
        assertEquals(detalhamentoComprovante.getNumeroCV(), numeroCV);
        assertEquals(detalhamentoComprovante.getDataCredito(), dataCredito);
        assertEquals(detalhamentoComprovante.getStatusTransacao(), statusTransacao);
        assertEquals(detalhamentoComprovante.getHoraTransacao(), horaTransacao);
        assertEquals(detalhamentoComprovante.getNumeroTerminal(), numeroTerminal);
        assertEquals(detalhamentoComprovante.getTipoCaptura(), tipoCaptura);
        assertEquals(detalhamentoComprovante.getReservado(), reservado);
        assertEquals(detalhamentoComprovante.getValorCompra(), valorCompra);
        assertEquals(detalhamentoComprovante.getValorSaque(), valorSaque);
        assertEquals(detalhamentoComprovante.getBandeira(), bandeira);
    }

}
