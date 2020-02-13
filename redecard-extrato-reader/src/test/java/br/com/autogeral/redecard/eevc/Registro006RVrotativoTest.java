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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * 11/02/2020 15:48:25
 *
 * @author kaique.mota
 */
public class Registro006RVrotativoTest {

    private static FixedFormatManager fixedFormatManager = new FixedFormatManagerImpl();

    @Test
    public void testParse() {

        String expResult = "00609999999909913170134100361000005809702812201100001000000000007000000000000000000000000000000000000000000000280000000000006720270120123";
        Registro006RVrotativo recordRVrotativo = fixedFormatManager.load(Registro006RVrotativo.class, expResult);
        System.out.println(recordRVrotativo.toString());
    }

//    @Test
//    public void testSerialize() {
//        String expResult = "60699999999909913170134130361000005809702812201100001000000000007000000000000000000000000000000000000000000000280000000000006720270120123";
//        Registro006RVrotativo registro = new Registro006RVrotativo();
//
//        // foi colocado como registro 606 pois o Integer corta os zero a esquerda. O real numero de registro é 006.
//        registro.setTipoRegistro(606);
//        // foi colocado como numeroPV 999999999 pois o Integer corta os zero a esquerda. O real numero de PV é 099999999.
//        registro.setNumeroPv(999999999);
//        // foi colocado numeroRV 999131701 pois o Integer corta os zero a esquerda; o Real numeroRV é 999131701
//        registro.setNumeroRV(999131701);
//        registro.setNumeroBanco(341);
//        // foi colocado numero Agencia 303 pois o Integer corta os zero a esquerda; o Real numeroRV é 003
//        registro.setNumeroAgencia(361);
//        registro.setNumContaCorrente(580970);
//        registro.setDataRV(java.sql.Date.valueOf(LocalDate.parse("28122011", DateTimeFormatter.ofPattern("ddMMyyyy"))));
//        registro.setQuantidadeCVeNUSacatados(1);
//        registro.setValorBruto(70.0);
//        registro.setValorGorgeta(0.0);
//        registro.setValorRejeitado(0.0);
//        registro.setValorDesconto(2.8);
//        registro.setValorLiquido(67.2);
//        registro.setDataRV(java.sql.Date.valueOf(LocalDate.parse("28122011", DateTimeFormatter.ofPattern("ddMMyyyy"))));
//        registro.setBandeira("3");
//        
//        String atual = fixedFormatManager.export(registro);
//        assertEquals(expResult, atual);
//    }
}
