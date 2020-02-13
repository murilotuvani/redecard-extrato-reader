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
 * 11/02/2020 16:15:27
 *
 * @author kaique.mota
 */
@Record
public class Registro034CVnsuRotativo implements RegistroRedecard {

    private Integer tipoRegistro;
    private Integer numeroPV;
    private Integer numeroRV;
    private Date dataCVnsu;
    private Double valorCVnsu;
    private String numeroCartao;
    private Long numeroCVnsu;
    private String numAutorizacao;
    private String TID;
    private String numeroPedido;

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
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCVnsu() {
        return dataCVnsu;
    }

    public void setDataCVnsu(Date dataCVnsu) {
        this.dataCVnsu = dataCVnsu;
    }

    @Field(offset = 30, length = 15)
    public Double getValorCVnsu() {
        return valorCVnsu;
    }

    public void setValorCVnsu(Double valorCVnsu) {
        this.valorCVnsu = valorCVnsu;
    }

    @Field(offset = 45, length = 16)
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Field(offset = 61, length = 12)
    public Long getNumeroCVnsu() {
        return numeroCVnsu;
    }

    public void setNumeroCVnsu(Long numeroCVnsu) {
        this.numeroCVnsu = numeroCVnsu;
    }

    @Field(offset = 73, length = 6)
    public String getNumAutorizacao() {
        return numAutorizacao;
    }

    public void setNumAutorizacao(String numAutorizacao) {
        this.numAutorizacao = numAutorizacao;
    }

    @Field(offset = 79, length = 20)
    public String getTID() {
        return TID;
    }

    public void setTID(String TID) {
        this.TID = TID;
    }

    @Field(offset = 99, length = 30)
    public String getNumetoPedido() {
        return numeroPedido;
    }

    public void setNumetoPedido(String numetoPedido) {
        this.numeroPedido = numetoPedido;
    }

    @Override
    public String toString() {
        return "Registro034CVnsuRotativo{" + "tipoRegistro=" + tipoRegistro + ", numeroPV=" + numeroPV + ", numeroRV=" + numeroRV + ", dataCVnsu=" + dataCVnsu + ", valorCVnsu=" + valorCVnsu + ", numeroCartao=" + numeroCartao + ", numeroCVnsu=" + numeroCVnsu + ", numAutorizacao=" + numAutorizacao + ", TID=" + TID + ", numetoPedido=" + numeroPedido + '}';
    }

}
