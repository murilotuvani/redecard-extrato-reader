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
 * 11/02/2020 17:59:08
 *
 * @author kaique.mota
 */
@Record
public class Registro014ParcelosemJuros implements RegistroRedecard {

    private Integer tipoRegistro;
    private Integer numeroPV;
    private Integer numeroRV;
    private Date dataRV;
    private Integer brancos;
    private Integer numParcela;
    private Double valorParcelaBruto;
    private Double valorDescontoParcela;
    private Double valorParcelaLiquida;
    private Date dataCredito;
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

    @Field(offset = 22, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataRV() {
        return dataRV;
    }

    public void setDataRV(Date dataRV) {
        this.dataRV = dataRV;
    }

    @Field(offset = 30, length = 8)
    public Integer getBrancos() {
        return brancos;
    }

    public void setBrancos(Integer brancos) {
        this.brancos = brancos;
    }

    @Field(offset = 38, length = 2)
    public Integer getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(Integer numParcela) {
        this.numParcela = numParcela;
    }

    @Field(offset = 40, length = 15)
    public Double getValorParcelaBruto() {
        return valorParcelaBruto;
    }

    public void setValorParcelaBruto(Double valorParcelaBruto) {
        this.valorParcelaBruto = valorParcelaBruto;
    }

    @Field(offset = 55, length = 15)
    public Double getValorDescontoParcela() {
        return valorDescontoParcela;
    }

    public void setValorDescontoParcela(Double valorDescontoParcela) {
        this.valorDescontoParcela = valorDescontoParcela;
    }

    @Field(offset = 70, length = 15)
    public Double getValorParcelaLiquida() {
        return valorParcelaLiquida;
    }

    public void setValorParcelaLiquida(Double valorParcelaLiquida) {
        this.valorParcelaLiquida = valorParcelaLiquida;
    }

    @Field(offset = 85, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
    }

    // @Field(offset = 93, length = 932)
    public String getLivre() {
        return livre;
    }

    public void setLivre(String livre) {
        this.livre = livre;
    }

    @Override
    public String toString() {
        return "Registro014ParcelosemJuros{" + "tipoRegistro=" + tipoRegistro + ", numeroPV=" + numeroPV + ", numeroRV=" + numeroRV + ", dataRV=" + dataRV + ", brancos=" + brancos + ", numParcela=" + numParcela + ", valorParcelaBruto=" + valorParcelaBruto + ", valorDescontoParcela=" + valorDescontoParcela + ", valorParcelaLiquida=" + valorParcelaLiquida + ", dataCredito=" + dataCredito + ", livre=" + livre + '}';
    }

}
