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
package br.com.autogeral.redecard.eesa;

import br.com.autogeral.redecard.ArquivoEESA;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;

import java.util.Date;

/**
 * 17/02/2020 17:43:18
 *
 * @see https://www.userede.com.br/novo/documentos
 * @author kaique.mota
 */
@Record
public class Registro062CabecalhoArquivo  implements ArquivoEESA {

    private Integer tipoRegistro;
    private Integer numeroOrdemCredito;
    private Integer CcreditoDdebito;
    private Integer banco;
    private Integer agencia;
    private Integer contaCorrente;
    private Date dataVencimentoOC;
    private Integer numeroEstabelecimento;
    private Integer microfilmeOrigem;
    private Integer numeroRV;
    private Date dataRV;
    //1 –A emitir 2 – Trânsito em papel 3–Pendente (somente paradébito)7 – Trânsito em fita
    private Integer status;
    private Double valorVenda;
    private Double valorDesconto;
    private Double valorGorgeta;
    private Double ocValorLiquidoParcelaAsetCreditada;
    private Integer numeroPV;
    private Integer numeroParcelaCreditada;
    private String bandeiraRVorigem;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 15)
    public Integer getNumeroOrdemCredito() {
        return numeroOrdemCredito;
    }

    public void setNumeroOrdemCredito(Integer numeroOrdemCredito) {
        this.numeroOrdemCredito = numeroOrdemCredito;
    }

    @Field(offset = 19, length = 1)
    public Integer getCcreditoDdebito() {
        return CcreditoDdebito;
    }

    public void setCcreditoDdebito(Integer CcreditoDdebito) {
        this.CcreditoDdebito = CcreditoDdebito;
    }

    @Field(offset = 20, length = 3)
    public Integer getBanco() {
        return banco;
    }

    public void setBanco(Integer banco) {
        this.banco = banco;
    }

    @Field(offset = 23, length = 9)
    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 32, length = 11)
    public Integer getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Integer contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    @Field(offset = 43, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataVencimentoOC() {
        return dataVencimentoOC;
    }

    public void setDataVencimentoOC(Date dataVencimentoOC) {
        this.dataVencimentoOC = dataVencimentoOC;
    }

    @Field(offset = 51, length = 9)
    public Integer getNumeroEstabelecimento() {
        return numeroEstabelecimento;
    }

    public void setNumeroEstabelecimento(Integer numeroEstabelecimento) {
        this.numeroEstabelecimento = numeroEstabelecimento;
    }

    @Field(offset = 60, length = 13)
    public Integer getMicrofilmeOrigem() {
        return microfilmeOrigem;
    }

    public void setMicrofilmeOrigem(Integer microfilmeOrigem) {
        this.microfilmeOrigem = microfilmeOrigem;
    }

    @Field(offset = 73, length = 9)
    public Integer getNumeroRV() {
        return numeroRV;
    }

    public void setNumeroRV(Integer numeroRV) {
        this.numeroRV = numeroRV;
    }

    @Field(offset = 82, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataRV() {
        return dataRV;
    }

    public void setDataRV(Date dataRV) {
        this.dataRV = dataRV;
    }
    @Field(offset = 90, length = 1)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    @Field(offset = 91, length = 15)
    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
    @Field(offset = 106, length = 15)
    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    @Field(offset = 121, length = 15)
    public Double getValorGorgeta() {
        return valorGorgeta;
    }

    public void setValorGorgeta(Double valorGorgeta) {
        this.valorGorgeta = valorGorgeta;
    }
    @Field(offset = 136, length = 15)
    public Double getOcValorLiquidoParcelaAsetCreditada() {
        return ocValorLiquidoParcelaAsetCreditada;
    }

    public void setOcValorLiquidoParcelaAsetCreditada(Double ocValorLiquidoParcelaAsetCreditada) {
        this.ocValorLiquidoParcelaAsetCreditada = ocValorLiquidoParcelaAsetCreditada;
    }
    @Field(offset = 151, length = 9)
    public Integer getNumeroPV() {
        return numeroPV;
    }

    public void setNumeroPV(Integer numeroPV) {
        this.numeroPV = numeroPV;
    }
    @Field(offset = 160, length = 2)
    public Integer getNumeroParcelaCreditada() {
        return numeroParcelaCreditada;
    }

    public void setNumeroParcelaCreditada(Integer numeroParcelaCreditada) {
        this.numeroParcelaCreditada = numeroParcelaCreditada;
    }
    @Field(offset = 162, length = 1)
    public String getBandeiraRVorigem() {
        return bandeiraRVorigem;
    }

    public void setBandeiraRVorigem(String bandeiraRVorigem) {
        this.bandeiraRVorigem = bandeiraRVorigem;
    }

}
