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

import br.com.autogeral.redecard.RegistroRedecard;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * 12/02/2020 09:33:11
 *
 * @author kaique.mota
 */
@Record
public class Registro026TotalizadorMatriz implements RegistroRedecard {

    private Integer tipoRegistro;
    private String nPVmatriz;
    private Double valorBruto;
    private Integer quantidadeCVnsuRejeitados;
    private Double valorTotalRejeitado;
    private Double valorTotalRotativo;
    private Double valorTotalParceladosemJuros;
    private Double valorTotalParceladoIATA;
    private Double valorTotalDolar;
    private Double valorTotalDesconto;
    private Double valorTotalLiquido;
    private Double valorTotalGorjeta;
    private Double valorTotalTaxaEmbarque;
    private Integer quantidadeCVnsuAcatados;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 9)
    public String getnPVmatriz() {
        return nPVmatriz;
    }

    public void setnPVmatriz(String nPVmatriz) {
        this.nPVmatriz = nPVmatriz;
    }

    @Field(offset = 13, length = 15)
    public Double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(Double valorBruto) {
        this.valorBruto = valorBruto;
    }

    @Field(offset = 28, length = 6)
    public Integer getQuantidadeCVnsuRejeitados() {
        return quantidadeCVnsuRejeitados;
    }

    public void setQuantidadeCVnsuRejeitados(Integer quantidadeCVnsuRejeitados) {
        this.quantidadeCVnsuRejeitados = quantidadeCVnsuRejeitados;
    }

    @Field(offset = 34, length = 15)
    public Double getValorTotalRejeitado() {
        return valorTotalRejeitado;
    }

    public void setValorTotalRejeitado(Double valorTotalRejeitado) {
        this.valorTotalRejeitado = valorTotalRejeitado;
    }

    @Field(offset = 49, length = 15)
    public Double getValorTotalRotativo() {
        return valorTotalRotativo;
    }

    public void setValorTotalRotativo(Double valorTotalRotativo) {
        this.valorTotalRotativo = valorTotalRotativo;
    }

    @Field(offset = 64, length = 15)
    public Double getValorTotalParceladosemJuros() {
        return valorTotalParceladosemJuros;
    }

    public void setValorTotalParceladosemJuros(Double valorTotalParceladosemJuros) {
        this.valorTotalParceladosemJuros = valorTotalParceladosemJuros;
    }

    @Field(offset = 79, length = 15)
    public Double getValorTotalParceladoIATA() {
        return valorTotalParceladoIATA;
    }

    public void setValorTotalParceladoIATA(Double valorTotalParceladoIATA) {
        this.valorTotalParceladoIATA = valorTotalParceladoIATA;
    }

    @Field(offset = 94, length = 15)
    public Double getValorTotalDolar() {
        return valorTotalDolar;
    }

    public void setValorTotalDolar(Double valorTotalDolar) {
        this.valorTotalDolar = valorTotalDolar;
    }

    @Field(offset = 109, length = 15)
    public Double getValorTotalDesconto() {
        return valorTotalDesconto;
    }

    public void setValorTotalDesconto(Double valorTotalDesconto) {
        this.valorTotalDesconto = valorTotalDesconto;
    }

    @Field(offset = 124, length = 15)
    public Double getValorTotalLiquido() {
        return valorTotalLiquido;
    }

    public void setValorTotalLiquido(Double valorTotalLiquido) {
        this.valorTotalLiquido = valorTotalLiquido;
    }

    @Field(offset = 139, length = 3)
    public Double getValorTotalGorjeta() {
        return valorTotalGorjeta;
    }

    public void setValorTotalGorjeta(Double valorTotalGorjeta) {
        this.valorTotalGorjeta = valorTotalGorjeta;
    }

    @Field(offset = 154, length = 15)
    public Double getValorTotalTaxaEmbarque() {
        return valorTotalTaxaEmbarque;
    }

    public void setValorTotalTaxaEmbarque(Double valorTotalTaxaEmbarque) {
        this.valorTotalTaxaEmbarque = valorTotalTaxaEmbarque;
    }

    @Field(offset = 169, length = 6)
    public Integer getQuantidadeCVnsuAcatados() {
        return quantidadeCVnsuAcatados;
    }

    public void setQuantidadeCVnsuAcatados(Integer quantidadeCVnsuAcatados) {
        this.quantidadeCVnsuAcatados = quantidadeCVnsuAcatados;
    }

    @Override
    public String toString() {
        return "Registro026TotalizadorMatriz{" + "tipoRegistro=" + tipoRegistro + ", nPVmatriz=" + nPVmatriz + ", valorBruto=" + valorBruto + ", quantidadeCVnsuRejeitados=" + quantidadeCVnsuRejeitados + ", valorTotalRejeitado=" + valorTotalRejeitado + ", valorTotalRotativo=" + valorTotalRotativo + ", valorTotalParceladosemJuros=" + valorTotalParceladosemJuros + ", valorTotalParceladoIATA=" + valorTotalParceladoIATA + ", valorTotalDolar=" + valorTotalDolar + ", valorTotalDesconto=" + valorTotalDesconto + ", valorTotalLiquido=" + valorTotalLiquido + ", valorTotalGorjeta=" + valorTotalGorjeta + ", valorTotalTaxaEmbarque=" + valorTotalTaxaEmbarque + ", quantidadeCVnsuAcatados=" + quantidadeCVnsuAcatados + '}';
    }

}
