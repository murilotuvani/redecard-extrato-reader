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
 * 11/02/2020 16:44:35
 *
 * @author kaique.mota
 */
@Record
public class Registro011ExtratoEletronicoVendas {

    private Integer tipoRegistro;
    private Integer numeroPVcreditado;
    private Integer numeroResumoCredito;
    private Integer dataAjuste;
    private Double valorAjuste;
    private Integer dataCredito;
    private Double valorCredito;
    private Integer cCredito;
    private Integer banco;
    private Integer agencia;
    private Integer contaCorrente;
    private Integer motivoAjuste;
    private String descricaoAjuste;
    private String bandeira;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 9)
    public Integer getNumeroPVcreditado() {
        return numeroPVcreditado;
    }

    public void setNumeroPVcreditado(Integer numeroPVcreditado) {
        this.numeroPVcreditado = numeroPVcreditado;
    }

    @Field(offset = 13, length = 9)
    public Integer getNumeroResumoCredito() {
        return numeroResumoCredito;
    }

    public void setNumeroResumoCredito(Integer numeroResumoCredito) {
        this.numeroResumoCredito = numeroResumoCredito;
    }

    @Field(offset = 22, length = 8)
    public Integer getDataAjuste() {
        return dataAjuste;
    }

    public void setDataAjuste(Integer dataAjuste) {
        this.dataAjuste = dataAjuste;
    }

    @Field(offset = 30, length = 15)
    public Double getValorAjuste() {
        return valorAjuste;
    }

    public void setValorAjuste(Double valorAjuste) {
        this.valorAjuste = valorAjuste;
    }

    @Field(offset = 45, length = 8)
    public Integer getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Integer dataCredito) {
        this.dataCredito = dataCredito;
    }

    @Field(offset = 53, length = 15)
    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    @Field(offset = 68, length = 1)
    public Integer getcCredito() {
        return cCredito;
    }

    public void setcCredito(Integer cCredito) {
        this.cCredito = cCredito;
    }

    @Field(offset = 69, length = 3)
    public Integer getBanco() {
        return banco;
    }

    public void setBanco(Integer banco) {
        this.banco = banco;
    }

    @Field(offset = 72, length = 6)
    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 78, length = 11)
    public Integer getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Integer contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    @Field(offset = 89, length = 2)
    public Integer getMotivoAjuste() {
        return motivoAjuste;
    }

    public void setMotivoAjuste(Integer motivoAjuste) {
        this.motivoAjuste = motivoAjuste;
    }

    @Field(offset = 91, length = 28)
    public String getDescricaoAjuste() {
        return descricaoAjuste;
    }

    public void setDescricaoAjuste(String descricaoAjuste) {
        this.descricaoAjuste = descricaoAjuste;
    }

    @Field(offset = 119, length = 1)
    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

}
