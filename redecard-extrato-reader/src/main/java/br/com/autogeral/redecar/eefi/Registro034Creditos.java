/*
 * The MIT License
 *
 * Copyright 2020 Kaique.
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
package br.com.autogeral.redecar.eefi;

import br.com.autogeral.redecard.RegistroRedecard;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;
import java.util.Date;

/**
 *
 * @author Kaique
 * @see
 * https://www.userede.com.br/pt-BR/produtosservicos/Documents/Extrato_Eletronico/0208_EEFI_Rede_0263_ExtratosOnlineFinanciamento(portugues).pdf
 */
@Record
public class Registro034Creditos implements RegistroRedecard {

    private Integer tipoRegistro;
    private Integer numeroPVcentralizador;
    private Long numeroDocumento;
    private Date dataLancamento;
    private Double valorLancamento;
    private String creditoC;
    private Integer banco;
    private Integer agencia;
    private Integer contaCorrente;
    private Date dataMovimento;
    private Integer numeroRV;
    private Date dataRV;
    private String bandeira;
    private Integer tipoTransacao;
    private Double valorBrutoRV;
    private Double valorTaxaDesconto;
    private String numeroParcelaTotal;
    private String statusCredito;
    private Integer numeroPVoriginal;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 9)
    public Integer getNumeroPVcentralizador() {
        return numeroPVcentralizador;
    }

    public void setNumeroPVcentralizador(Integer numeroPVcentralizador) {
        this.numeroPVcentralizador = numeroPVcentralizador;
    }

    @Field(offset = 13, length = 11)
    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Field(offset = 24, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Field(offset = 32, length = 15)
    public Double getValorLancamento() {
        return valorLancamento;
    }

    public void setValorLancamento(Double valorLancamento) {
        this.valorLancamento = valorLancamento;
    }

    @Field(offset = 47, length = 1)
    public String getCreditoC() {
        return creditoC;
    }

    public void setCreditoC(String creditoC) {
        this.creditoC = creditoC;
    }

    @Field(offset = 48, length = 3)
    public Integer getBanco() {
        return banco;
    }

    public void setBanco(Integer banco) {
        this.banco = banco;
    }

    @Field(offset = 51, length = 6)
    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 57, length = 11)
    public Integer getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Integer contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    @Field(offset = 68, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    @Field(offset = 76, length = 9)
    public Integer getNumeroRV() {
        return numeroRV;
    }

    public void setNumeroRV(Integer numeroRV) {
        this.numeroRV = numeroRV;
    }

    @Field(offset = 85, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataRV() {
        return dataRV;
    }

    public void setDataRV(Date dataRV) {
        this.dataRV = dataRV;
    }

    @Field(offset = 93, length = 1)
    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    @Field(offset = 94, length = 1)
    public Integer getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(Integer tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    @Field(offset = 95, length = 15)
    public Double getValorBrutoRV() {
        return valorBrutoRV;
    }

    public void setValorBrutoRV(Double valorBrutoRV) {
        this.valorBrutoRV = valorBrutoRV;
    }

    @Field(offset = 110, length = 15)
    public Double getValorTaxaDesconto() {
        return valorTaxaDesconto;
    }

    public void setValorTaxaDesconto(Double valorTaxaDesconto) {
        this.valorTaxaDesconto = valorTaxaDesconto;
    }

    @Field(offset = 125, length = 5)
    public String getNumeroParcelaTotal() {
        return numeroParcelaTotal;
    }

    public void setNumeroParcelaTotal(String numeroParcelaTotal) {
        this.numeroParcelaTotal = numeroParcelaTotal;
    }

    @Field(offset = 130, length = 2)
    public String getStatusCredito() {
        return statusCredito;
    }

    public void setStatusCredito(String statusCredito) {
        this.statusCredito = statusCredito;
    }

    @Field(offset = 132, length = 9)
    public Integer getNumeroPVoriginal() {
        return numeroPVoriginal;
    }

    public void setNumeroPVoriginal(Integer numeroPVoriginal) {
        this.numeroPVoriginal = numeroPVoriginal;
    }

    @Override
    public String toString() {
        return "Registro034Creditos{" + "tipoRegistro=" + tipoRegistro + ", numeroPVcentralizador=" + numeroPVcentralizador + ", numeroDocumento=" + numeroDocumento + ", dataLancamento=" + dataLancamento + ", valorLancamento=" + valorLancamento + ", creditoC=" + creditoC + ", banco=" + banco + ", agencia=" + agencia + ", contaCorrente=" + contaCorrente + ", dataMovimento=" + dataMovimento + ", numeroRV=" + numeroRV + ", dataRV=" + dataRV + ", bandeira=" + bandeira + ", tipoTransacao=" + tipoTransacao + ", valorBrutoRV=" + valorBrutoRV + ", valorTaxaDesconto=" + valorTaxaDesconto + ", numeroParcelaTotal=" + numeroParcelaTotal + ", statusCredito=" + statusCredito + ", numeroPVoriginal=" + numeroPVoriginal + '}';
    }

}
