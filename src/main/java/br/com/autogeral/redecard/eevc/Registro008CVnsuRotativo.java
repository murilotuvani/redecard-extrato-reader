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
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;
import java.util.Date;

/**
 * 11/02/2020 15:51:52
 *
 * @author kaique.mota
 */
@Record
public class Registro008CVnsuRotativo implements ArquivoEEVC {

    private Integer tipoRegistro;
    private Integer numeroPV;
    private Integer numeroRV;
    private Date dataCVnsu;
    private Integer zeros;
    private Double valorCVnsu;
    private Double valorGorgeta;
    private String numeroCartao;
    private String statusCVnsu;
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
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCVnsu() {
        return dataCVnsu;
    }

    public void setDataCVnsu(Date dataCVnsu) {
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
    public Double getValorGorgeta() {
        return valorGorgeta;
    }

    public void setValorGorgeta(Double valorGorgeta) {
        this.valorGorgeta = valorGorgeta;
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

    @Field(offset = 87, length = 12)
    public Integer getNumeroCVnsu() {
        return numeroCVnsu;
    }

    public void setNumeroCVnsu(Integer numeroCVnsu) {
        this.numeroCVnsu = numeroCVnsu;
    }

    @Field(offset = 99, length = 13)
    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    @Field(offset = 112, length = 15)
    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Field(offset = 127, length = 6)
    public String getNumAutorizacao() {
        return numAutorizacao;
    }

    public void setNumAutorizacao(String numAutorizacao) {
        this.numAutorizacao = numAutorizacao;
    }

    @Field(offset = 133, length = 6)
    public Integer getHoraTransacao() {
        return horaTransacao;
    }

    public void setHoraTransacao(Integer horaTransacao) {
        this.horaTransacao = horaTransacao;
    }

    @Field(offset = 139, length = 16)
    public String getNumBilhete() {
        return numBilhete;
    }

    public void setNumBilhete(String numBilhete) {
        this.numBilhete = numBilhete;
    }

    @Field(offset = 155, length = 16)
    public String getNumBilhete2() {
        return numBilhete2;
    }

    public void setNumBilhete2(String numBilhete2) {
        this.numBilhete2 = numBilhete2;
    }

    @Field(offset = 171, length = 16)
    public String getNumBilhete3() {
        return numBilhete3;
    }

    public void setNumBilhete3(String numBilhete3) {
        this.numBilhete3 = numBilhete3;
    }

    @Field(offset = 187, length = 16)
    public String getNumBilhete4() {
        return numBilhete4;
    }

    public void setNumBilhete4(String numBilhete4) {
        this.numBilhete4 = numBilhete4;
    }

    @Field(offset = 203, length = 1)
    public String getTipoCaptura() {
        return tipoCaptura;
    }

    public void setTipoCaptura(String tipoCaptura) {
        this.tipoCaptura = tipoCaptura;
    }

    @Field(offset = 204, length = 15)
    public Double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(Double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    @Field(offset = 219, length = 8)
    public String getNumeroTerminal() {
        return numeroTerminal;
    }

    public void setNumeroTerminal(String numeroTerminal) {
        this.numeroTerminal = numeroTerminal;
    }

    @Field(offset = 227, length = 3)
    public String getSiglaPais() {
        return siglaPais;
    }

    public void setSiglaPais(String siglaPais) {
        this.siglaPais = siglaPais;
    }

    @Field(offset = 230, length = 1)
    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    @Override
    public String toString() {
        return "Registro008CVnsuRotativo{" + "tipoRegistro=" + tipoRegistro + ", numeroPV=" + numeroPV + ", numeroRV=" + numeroRV + ", dataCVnsu=" + dataCVnsu + ", zeros=" + zeros + ", valorCVnsu=" + valorCVnsu + ", valorGorgeta=" + valorGorgeta + ", numeroCartao=" + numeroCartao + ", statusCVnsu=" + statusCVnsu + ", numeroCVnsu=" + numeroCVnsu + ", numeroReferencia=" + numeroReferencia + ", valorDesconto=" + valorDesconto + ", numAutorizacao=" + numAutorizacao + ", horaTransacao=" + horaTransacao + ", numBilhete=" + numBilhete + ", numBilhete2=" + numBilhete2 + ", numBilhete3=" + numBilhete3 + ", numBilhete4=" + numBilhete4 + ", tipoCaptura=" + tipoCaptura + ", valorLiquido=" + valorLiquido + ", numeroTerminal=" + numeroTerminal + ", siglaPais=" + siglaPais + ", bandeira=" + bandeira + '}';
    }
    

}
