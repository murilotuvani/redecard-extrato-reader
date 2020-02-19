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

import br.com.autogeral.redecard.RegistroRedecard;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * 18/02/2020 08:01:15
 *
 * @author kaique.mota
 */
@Record
public class RegistroTipo03TotalMatriz implements RegistroRedecard {

    private Integer tipoRegistro;
    private Integer numeroFiliacaoMatriz;
    private Integer quantidadeResumosVendasAcatados;
    private Integer quantidadeComprovantesVendas;
    private Double totalBruto;
    private Double totalDeconto;
    private Double totalLiquido;
    private Double valorBrutoPredatado;
    private Double descontoPredatado;
    private Double liquidoPredatado;

    @Field(offset = 1, length = 2)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 3, length = 9)
    public Integer getNumeroFiliacaoMatriz() {
        return numeroFiliacaoMatriz;
    }

    public void setNumeroFiliacaoMatriz(Integer numeroFiliacaoMatriz) {
        this.numeroFiliacaoMatriz = numeroFiliacaoMatriz;
    }

    @Field(offset = 12, length = 3)
    public Integer getQuantidadeResumosVendasAcatados() {
        return quantidadeResumosVendasAcatados;
    }

    public void setQuantidadeResumosVendasAcatados(Integer quantidadeResumosVendasAcatados) {
        this.quantidadeResumosVendasAcatados = quantidadeResumosVendasAcatados;
    }

    @Field(offset = 15, length = 6)
    public Integer getQuantidadeComprovantesVendas() {
        return quantidadeComprovantesVendas;
    }

    public void setQuantidadeComprovantesVendas(Integer quantidadeComprovantesVendas) {
        this.quantidadeComprovantesVendas = quantidadeComprovantesVendas;
    }

    @Field(offset = 31, length = 15)
    public Double getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(Double totalBruto) {
        this.totalBruto = totalBruto;
    }

    @Field(offset = 51, length = 15)
    public Double getTotalDeconto() {
        return totalDeconto;
    }

    public void setTotalDeconto(Double totalDeconto) {
        this.totalDeconto = totalDeconto;
    }

    @Field(offset = 66, length = 15)
    public Double getTotalLiquido() {
        return totalLiquido;
    }

    public void setTotalLiquido(Double totalLiquido) {
        this.totalLiquido = totalLiquido;
    }

    @Field(offset = 81, length = 15)
    public Double getValorBrutoPredatado() {
        return valorBrutoPredatado;
    }

    public void setValorBrutoPredatado(Double valorBrutoPredatado) {
        this.valorBrutoPredatado = valorBrutoPredatado;
    }

    @Field(offset = 96, length = 15)
    public Double getDescontoPredatado() {
        return descontoPredatado;
    }

    public void setDescontoPredatado(Double descontoPredatado) {
        this.descontoPredatado = descontoPredatado;
    }

    @Field(offset = 111, length = 15)
    public Double getLiquidoPredatado() {
        return liquidoPredatado;
    }

    public void setLiquidoPredatado(Double liquidoPredatado) {
        this.liquidoPredatado = liquidoPredatado;
    }

    @Override
    public String toString() {
        return "RegistroTipo03TotalMatriz{" + "tipoRegistro=" + tipoRegistro + ", numeroFiliacaoMatriz=" + numeroFiliacaoMatriz + ", quantidadeResumosVendasAcatados=" + quantidadeResumosVendasAcatados + ", quantidadeComprovantesVendas=" + quantidadeComprovantesVendas + ", totalBruto=" + totalBruto + ", totalDeconto=" + totalDeconto + ", totalLiquido=" + totalLiquido + ", valorBrutoPredatado=" + valorBrutoPredatado + ", descontoPredatado=" + descontoPredatado + ", liquidoPredatado=" + liquidoPredatado + '}';
    }
    

}
