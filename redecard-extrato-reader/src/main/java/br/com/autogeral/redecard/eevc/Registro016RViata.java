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

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * 11/02/2020 18:06:19
 *
 * @author kaique.mota
 */
@Record
public class Registro016RViata {

    private Integer tipoRegistro;
    private Integer numeroPV;
    private Integer numeroRV;
    private Integer banco;
    private Integer agencia;
    private Integer contaCorrente;
    private Integer dataRVnsu;
    private Integer quantidadeCVnsus;
    private Integer valorBruto;
    private Double valorTaxaEmbarque;
    private Double valorRejeitado;
    private Double valorDesconto;
    private Double valorLiquido;
    private Integer dataCredito;
    private String identificaBandeiraCartao;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 9)
    public Integer getNumeroPV() {
        return numeroPV;
    }

    public void setNumeroPV(Integer numeroPV) {
        this.numeroPV = numeroPV;
    }

    @Field(offset = 13, length = 9)
    public Integer getNumeroRV() {
        return numeroRV;
    }

    public void setNumeroRV(Integer numeroRV) {
        this.numeroRV = numeroRV;
    }

    @Field(offset = 22, length = 3)
    public Integer getBanco() {
        return banco;
    }

    public void setBanco(Integer banco) {
        this.banco = banco;
    }

    @Field(offset = 25, length = 5)
    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 30, length = 11)
    public Integer getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Integer contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    @Field(offset = 41, length = 8)
    public Integer getDataRVnsu() {
        return dataRVnsu;
    }

    public void setDataRVnsu(Integer dataRVnsu) {
        this.dataRVnsu = dataRVnsu;
    }

    @Field(offset = 49, length = 5)
    public Integer getQuantidadeCVnsus() {
        return quantidadeCVnsus;
    }

    public void setQuantidadeCVnsus(Integer quantidadeCVnsus) {
        this.quantidadeCVnsus = quantidadeCVnsus;
    }

    @Field(offset = 54, length = 15)
    public Integer getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(Integer valorBruto) {
        this.valorBruto = valorBruto;
    }

    @Field(offset = 69, length = 15)
    public Double getValorTaxaEmbarque() {
        return valorTaxaEmbarque;
    }

    public void setValorTaxaEmbarque(Double valorTaxaEmbarque) {
        this.valorTaxaEmbarque = valorTaxaEmbarque;
    }

    @Field(offset = 84, length = 15)
    public Double getValorRejeitado() {
        return valorRejeitado;
    }

    public void setValorRejeitado(Double valorRejeitado) {
        this.valorRejeitado = valorRejeitado;
    }

    @Field(offset = 99, length = 15)
    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Field(offset = 114, length = 15)
    public Double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(Double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    @Field(offset = 129, length = 8)
    public Integer getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Integer dataCredito) {
        this.dataCredito = dataCredito;
    }

    @Field(offset = 137, length = 1)
    public String getIdentificaBandeiraCartao() {
        return identificaBandeiraCartao;
    }

    public void setIdentificaBandeiraCartao(String identificaBandeiraCartao) {
        this.identificaBandeiraCartao = identificaBandeiraCartao;
    }

}
