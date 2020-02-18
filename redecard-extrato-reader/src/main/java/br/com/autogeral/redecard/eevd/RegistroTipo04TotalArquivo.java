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
 * 18/02/2020 08:01:35
 *
 * @author kaique.mota
 * @see https://www.userede.com.br/novo/documentos
 */
@Record
public class RegistroTipo04TotalArquivo implements RegistroRedecard {

    private Integer tipoRegistro;
    private Integer numeroFiliacaoMatrizouGrupo;
    private Integer quantidadeResumoVendas;
    private Integer quanitidadeComprovantesVendas;
    private Double totalBruto;
    private Double totalDesconto;
    private Double totalLiquido;
    private Double valorBrutopreDatado;
    private Double descontoPredatado;
    private Double liquidoPredatado;
    private Integer totalRegistro;

    @Field(offset = 1, length = 2)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 3, length = 9)
    public Integer getNumeroFiliacaoMatrizouGrupo() {
        return numeroFiliacaoMatrizouGrupo;
    }

    public void setNumeroFiliacaoMatrizouGrupo(Integer numeroFiliacaoMatrizouGrupo) {
        this.numeroFiliacaoMatrizouGrupo = numeroFiliacaoMatrizouGrupo;
    }

    @Field(offset = 12, length = 6)
    public Integer getQuantidadeResumoVendas() {
        return quantidadeResumoVendas;
    }

    public void setQuantidadeResumoVendas(Integer quantidadeResumoVendas) {
        this.quantidadeResumoVendas = quantidadeResumoVendas;
    }

    @Field(offset = 18, length = 6)
    public Integer getQuanitidadeComprovantesVendas() {
        return quanitidadeComprovantesVendas;
    }

    public void setQuanitidadeComprovantesVendas(Integer quanitidadeComprovantesVendas) {
        this.quanitidadeComprovantesVendas = quanitidadeComprovantesVendas;
    }

    @Field(offset = 24, length = 15)
    public Double getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(Double totalBruto) {
        this.totalBruto = totalBruto;
    }

    @Field(offset = 39, length = 15)
    public Double getTotalDesconto() {
        return totalDesconto;
    }

    public void setTotalDesconto(Double totalDesconto) {
        this.totalDesconto = totalDesconto;
    }

    @Field(offset = 54, length = 15)
    public Double getTotalLiquido() {
        return totalLiquido;
    }

    public void setTotalLiquido(Double totalLiquido) {
        this.totalLiquido = totalLiquido;
    }

    @Field(offset = 69, length = 15)
    public Double getValorBrutopreDatado() {
        return valorBrutopreDatado;
    }

    public void setValorBrutopreDatado(Double valorBrutopreDatado) {
        this.valorBrutopreDatado = valorBrutopreDatado;
    }

    @Field(offset = 84, length = 15)
    public Double getDescontoPredatado() {
        return descontoPredatado;
    }

    public void setDescontoPredatado(Double descontoPredatado) {
        this.descontoPredatado = descontoPredatado;
    }

    @Field(offset = 99, length = 15)
    public Double getLiquidoPredatado() {
        return liquidoPredatado;
    }

    public void setLiquidoPredatado(Double liquidoPredatado) {
        this.liquidoPredatado = liquidoPredatado;
    }

    @Field(offset = 114, length = 6)
    public Integer getTotalRegistro() {
        return totalRegistro;
    }

    public void setTotalRegistro(Integer totalRegistro) {
        this.totalRegistro = totalRegistro;
    }

    @Override
    public String toString() {
        return "RegistroTipo04TotalArquivo{" + "tipoRegistro=" + tipoRegistro + ", numeroFiliacaoMatrizouGrupo=" + numeroFiliacaoMatrizouGrupo + ", quantidadeResumoVendas=" + quantidadeResumoVendas + ", quanitidadeComprovantesVendas=" + quanitidadeComprovantesVendas + ", totalBruto=" + totalBruto + ", totalDesconto=" + totalDesconto + ", totalLiquido=" + totalLiquido + ", valorBrutopreDatado=" + valorBrutopreDatado + ", descontoPredatado=" + descontoPredatado + ", liquidoPredatado=" + liquidoPredatado + ", totalRegistro=" + totalRegistro + '}';
    }
    

}
