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
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;
import java.util.Date;

/**
 * 11/02/2020 12:57:12
 *
 * @author kaique.mota
 */
@Record
public class Registro005Request implements RegistroRedecard {

    private Integer tipoRegistro;
    private Integer numeroPV;
    private Integer numeroRV;
    private String numeroCartao;
    private Double valorTransacao;
    private Date dataTranslacao;
    private Long numeroReferencia;
    private Long numeroProcesso;
    private Integer numeroCVNSU;
    private String numeroAutorizacao;
    private String codigoRequest;
    private Integer limiteEnvioDocumentos;
    private String bandeira;
    private String livre;

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

    @Field(offset = 22, length = 16)
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Field(offset = 38, length = 15)
    public Double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(Double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    @Field(offset = 53, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataTranslacao() {
        return dataTranslacao;
    }

    public void setDataTranslacao(Date dataTranslacao) {
        this.dataTranslacao = dataTranslacao;
    }

    @Field(offset = 61, length = 15)
    public Long getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(Long numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    @Field(offset = 76, length = 15)
    public Long getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(Long numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    @Field(offset = 91, length = 12)
    public Integer getNumeroCVNSU() {
        return numeroCVNSU;
    }

    public void setNumeroCVNSU(Integer numeroCVNSU) {
        this.numeroCVNSU = numeroCVNSU;
    }

    @Field(offset = 103, length = 6)
    public String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    public void setNumeroAutorizacao(String numeroAutorizacao) {
        this.numeroAutorizacao = numeroAutorizacao;
    }

    @Field(offset = 109, length = 4)
    public String getCodigoRequest() {
        return codigoRequest;
    }

    public void setCodigoRequest(String codigoRequest) {
        this.codigoRequest = codigoRequest;
    }

    @Field(offset = 113, length = 8)
    public Integer getLimiteEnvioDocumentos() {
        return limiteEnvioDocumentos;
    }

    public void setLimiteEnvioDocumentos(Integer limiteEnvioDocumentos) {
        this.limiteEnvioDocumentos = limiteEnvioDocumentos;
    }

    @Field(offset = 121, length = 1)
    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    @Field(offset = 122, length = 903)
    public String getLivre() {
        return livre;
    }

    public void setLivre(String livre) {
        this.livre = livre;
    }

    @Override
    public String toString() {
        return "Registro005Request{" + "tipoRegistro=" + tipoRegistro + ", numeroPV=" + numeroPV + ", numeroRV=" + numeroRV + ", numeroCartao=" + numeroCartao + ", valorTransacao=" + valorTransacao + ", dataTranslacao=" + dataTranslacao + ", numeroReferencia=" + numeroReferencia + ", numeroProcesso=" + numeroProcesso + ", numeroCVNSU=" + numeroCVNSU + ", numeroAutorizacao=" + numeroAutorizacao + ", codigoRequest=" + codigoRequest + ", limiteEnvioDocumentos=" + limiteEnvioDocumentos + ", bandeira=" + bandeira + ", livre=" + livre + '}';
    }

    
}
