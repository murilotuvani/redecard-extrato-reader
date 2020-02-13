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
 * 12/02/2020 09:19:23
 *
 * @author kaique.mota
 */
@Record
public class Registro024CVnsuDolar implements RegistroRedecard {

    private Integer tipoRegistro;
    private Integer numeroPV;
    private Integer numeroRV;
    private Integer dataCVnsu;
    private Integer zeros;
    private Double valorCVnsu;
    private Double valorGorjeta;
    private String numeroCartao;
    private String statusCVnsu;
    private Double cotacaoDolar;
    private Integer dataCotacao;
    private Integer numeroCVnsu;
    private String numeroReferencia;
    private Double valorDesconto;
    private String numeroAutorizacao;
    private Integer horaTransacao;
    private String numeroTerminal;
    private Integer tipoCaptura;
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
    public Double getValorGorjeta() {
        return valorGorjeta;
    }

    public void setValorGorjeta(Double valorGorjeta) {
        this.valorGorjeta = valorGorjeta;
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

    @Field(offset = 87, length = 9)
    public Double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public void setCotacaoDolar(Double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    @Field(offset = 96, length = 8)
    public Integer getDataCotacao() {
        return dataCotacao;
    }

    public void setDataCotacao(Integer dataCotacao) {
        this.dataCotacao = dataCotacao;
    }

    @Field(offset = 104, length = 12)
    public Integer getNumeroCVnsu() {
        return numeroCVnsu;
    }

    public void setNumeroCVnsu(Integer numeroCVnsu) {
        this.numeroCVnsu = numeroCVnsu;
    }

    @Field(offset = 116, length = 13)
    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    @Field(offset = 129, length = 15)
    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Field(offset = 144, length = 6)
    public String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    public void setNumeroAutorizacao(String numeroAutorizacao) {
        this.numeroAutorizacao = numeroAutorizacao;
    }

    @Field(offset = 150, length = 6)
    public Integer getHoraTransacao() {
        return horaTransacao;
    }

    public void setHoraTransacao(Integer horaTransacao) {
        this.horaTransacao = horaTransacao;
    }

    @Field(offset = 156, length = 8)
    public String getNumeroTerminal() {
        return numeroTerminal;
    }

    public void setNumeroTerminal(String numeroTerminal) {
        this.numeroTerminal = numeroTerminal;
    }

    @Field(offset = 164, length = 2)
    public Integer getTipoCaptura() {
        return tipoCaptura;
    }

    public void setTipoCaptura(Integer tipoCaptura) {
        this.tipoCaptura = tipoCaptura;
    }

    @Field(offset = 166, length = 3)
    public String getSiglaPais() {
        return siglaPais;
    }

    public void setSiglaPais(String siglaPais) {
        this.siglaPais = siglaPais;
    }

    @Field(offset = 169, length = 1)
    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

}
