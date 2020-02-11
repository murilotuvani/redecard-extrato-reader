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
 * 11/02/2020 16:23:09
 *
 * @author kaique.mota
 */
@Record
public class Registro040CVnsuRecarga {

    private Integer tipoRegistro;
    private Integer numeroPV;
    private Integer numeroResumoVendas;
    private Integer dataCVnsu;
    private Integer numeroCVnsu;
    private Double valorRecarga;
    private Integer numeroAutorizacao;
    private Integer numeroCelular;
    private Integer bandeira;

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
    public Integer getNumeroResumoVendas() {
        return numeroResumoVendas;
    }

    public void setNumeroResumoVendas(Integer numeroResumoVendas) {
        this.numeroResumoVendas = numeroResumoVendas;
    }

    @Field(offset = 22, length = 8)
    public Integer getDataCVnsu() {
        return dataCVnsu;
    }

    public void setDataCVnsu(Integer dataCVnsu) {
        this.dataCVnsu = dataCVnsu;
    }

    @Field(offset = 30, length = 12)
    public Integer getNumeroCVnsu() {
        return numeroCVnsu;
    }

    public void setNumeroCVnsu(Integer numeroCVnsu) {
        this.numeroCVnsu = numeroCVnsu;
    }

    @Field(offset = 42, length = 15)
    public Double getValorRecarga() {
        return valorRecarga;
    }

    public void setValorRecarga(Double valorRecarga) {
        this.valorRecarga = valorRecarga;
    }

    @Field(offset = 57, length = 6)
    public Integer getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    public void setNumeroAutorizacao(Integer numeroAutorizacao) {
        this.numeroAutorizacao = numeroAutorizacao;
    }

    @Field(offset = 63, length = 15)
    public Integer getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Field(offset = 78, length = 1)
    public Integer getBandeira() {
        return bandeira;
    }

    public void setBandeira(Integer bandeira) {
        this.bandeira = bandeira;
    }

}
