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

import br.com.autogeral.redecard.ArquivoEEVC;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * 11/02/2020 18:23:12
 *
 * @author kaique.mota
 */
@Record
public class Registro018CVnsuparceladoIATA implements ArquivoEEVC {

    private Integer tipoRegistro;
    private Integer numeroPV;
    private Integer numeroRV;
    private Integer dataCVnsu;
    private Integer zeros;
    private Double valorCVnsu;
    private Double valorTaxaEmbarque;
    private String numeroCartao;
    private String statusCVnsu;
    private Integer numeroParcelas;
    private Integer numeroCVnsu;
    private String numeroReferencia;
    private Double valorDesconto;
    private String numAutorizacao;
    private Integer horaTransacao;
    private String numBilhete;
    private String numBilhete2;
    private String numBilhete3;
    private String numBilhete4;
    private String tipoCaptura;
    private Double valorLiquido;
    private Double valorLiquidoPrimeiraParcela;
    private Double valorLiquidoDemaisParcelas;
    private String numeroTerminal;
    private String siglaPais;
    private String bandeira;

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

    @Field(offset = 22, length = 8)
    public Integer getDataCVnsu() {
        return dataCVnsu;
    }

    public void setDataCVnsu(Integer dataCVnsu) {
        this.dataCVnsu = dataCVnsu;
    }

    @Field(offset = 30, length = 8)
    public Integer getZeros() {
        return zeros;
    }

    public void setZeros(Integer zeros) {
        this.zeros = zeros;
    }

    @Field(offset = 38, length = 15)
    public Double getValorCVnsu() {
        return valorCVnsu;
    }

    public void setValorCVnsu(Double valorCVnsu) {
        this.valorCVnsu = valorCVnsu;
    }

    @Field(offset = 53, length = 15)
    public Double getValorTaxaEmbarque() {
        return valorTaxaEmbarque;
    }

    public void setValorTaxaEmbarque(Double valorTaxaEmbarque) {
        this.valorTaxaEmbarque = valorTaxaEmbarque;
    }

    @Field(offset = 68, length = 16)
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Field(offset = 84, length = 3)
    public String getStatusCVnsu() {
        return statusCVnsu;
    }

    public void setStatusCVnsu(String statusCVnsu) {
        this.statusCVnsu = statusCVnsu;
    }

    @Field(offset = 87, length = 2)
    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    @Field(offset = 89, length = 12)
    public Integer getNumeroCVnsu() {
        return numeroCVnsu;
    }

    public void setNumeroCVnsu(Integer numeroCVnsu) {
        this.numeroCVnsu = numeroCVnsu;
    }

    @Field(offset = 101, length = 13)
    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    @Field(offset = 114, length = 15)
    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Field(offset = 129, length = 6)
    public String getNumAutorizacao() {
        return numAutorizacao;
    }

    public void setNumAutorizacao(String numAutorizacao) {
        this.numAutorizacao = numAutorizacao;
    }

    @Field(offset = 135, length = 6)
    public Integer getHoraTransacao() {
        return horaTransacao;
    }

    public void setHoraTransacao(Integer horaTransacao) {
        this.horaTransacao = horaTransacao;
    }

    @Field(offset = 141, length = 16)
    public String getNumBilhete() {
        return numBilhete;
    }

    public void setNumBilhete(String numBilhete) {
        this.numBilhete = numBilhete;
    }

    @Field(offset = 157, length = 16)
    public String getNumBilhete2() {
        return numBilhete2;
    }

    public void setNumBilhete2(String numBilhete2) {
        this.numBilhete2 = numBilhete2;
    }

    @Field(offset = 173, length = 16)
    public String getNumBilhete3() {
        return numBilhete3;
    }

    public void setNumBilhete3(String numBilhete3) {
        this.numBilhete3 = numBilhete3;
    }

    @Field(offset = 189, length = 16)
    public String getNumBilhete4() {
        return numBilhete4;
    }

    public void setNumBilhete4(String numBilhete4) {
        this.numBilhete4 = numBilhete4;
    }

    @Field(offset = 205, length = 1)
    public String getTipoCaptura() {
        return tipoCaptura;
    }

    public void setTipoCaptura(String tipoCaptura) {
        this.tipoCaptura = tipoCaptura;
    }

    @Field(offset = 206, length = 15)
    public Double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(Double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    @Field(offset = 221, length = 15)
    public Double getValorLiquidoPrimeiraParcela() {
        return valorLiquidoPrimeiraParcela;
    }

    public void setValorLiquidoPrimeiraParcela(Double valorLiquidoPrimeiraParcela) {
        this.valorLiquidoPrimeiraParcela = valorLiquidoPrimeiraParcela;
    }

    @Field(offset = 236, length = 15)
    public Double getValorLiquidoDemaisParcelas() {
        return valorLiquidoDemaisParcelas;
    }

    public void setValorLiquidoDemaisParcelas(Double valorLiquidoDemaisParcelas) {
        this.valorLiquidoDemaisParcelas = valorLiquidoDemaisParcelas;
    }

    @Field(offset = 251, length = 8)
    public String getNumeroTerminal() {
        return numeroTerminal;
    }

    public void setNumeroTerminal(String numeroTerminal) {
        this.numeroTerminal = numeroTerminal;
    }

    @Field(offset = 259, length = 3)
    public String getSiglaPais() {
        return siglaPais;
    }

    public void setSiglaPais(String siglaPais) {
        this.siglaPais = siglaPais;
    }

    @Field(offset = 262, length = 1)
    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

}
