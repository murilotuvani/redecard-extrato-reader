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
package br.com.autogeral.redecard.eesa;

import br.com.autogeral.redecard.ArquivoEESA;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * 17/02/2020 17:55:14
 *
 * @author kaique.mota
 * @see https://www.userede.com.br/novo/documentos
 */
@Record
public class Registro066TotalizadorMatriz implements ArquivoEESA {

    private Integer tipoRegistro;
    private Integer numeroPVmatriz;
    private Integer quantidadeTotalResumos;
    private Double valotTotalLiquido;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 9)
    public Integer getNumeroPVmatriz() {
        return numeroPVmatriz;
    }

    public void setNumeroPVmatriz(Integer numeroPVmatriz) {
        this.numeroPVmatriz = numeroPVmatriz;
    }

    @Field(offset = 13, length = 5)
    public Integer getQuantidadeTotalResumos() {
        return quantidadeTotalResumos;
    }

    public void setQuantidadeTotalResumos(Integer quantidadeTotalResumos) {
        this.quantidadeTotalResumos = quantidadeTotalResumos;
    }

    @Field(offset = 63, length = 15)
    public Double getValotTotalLiquido() {
        return valotTotalLiquido;
    }

    public void setValotTotalLiquido(Double valotTotalLiquido) {
        this.valotTotalLiquido = valotTotalLiquido;
    }

}
