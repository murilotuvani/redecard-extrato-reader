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
package br.com.autogeral.redecar.eefi;

import br.com.autogeral.redecard.RegistroRedecard;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;
import java.util.Date;

/**
 * 18/02/2020 15:54:05
 *
 * @author kaique.mota
 * @see https://www.userede.com.br/novo/documentos
 */
@Record
public class Registro035AjustesNetDesagendamentos implements RegistroRedecard {

    private Integer tipoRegistro;
    private Integer numeroPVajustado;
    private Integer numeroRVajustado;
    private Date dataAjuste;
    private Double valorAjuste;
    private String dDebito;
    private Integer motivoAjuste;
    private String motivoAjusteText;
    private String numeroCartao;
    private Date dataTransacao;
    private Integer numeroRVoriginal;
    private String numeroReferenciaCarta;
    private Date dataCarta;
    private Integer mesReferencia;
    private Integer numeroPVoriginal;
    private Date dataRVoriginal;
    private Double valorTransacao;
    private String DdesagendamentoNnet;
    private Date dataCredito;
    private Double novoValorParcela;
    private Double valorOriginalParcela;
    private Double valorBrutoresumoVendas;
    private Double valorCancelamentoSolicitado;
    private Integer numeroNSU;
    private String numeroAutorizacao;
    private String tipoDebito;
    private Long numeroOrdemDebito;
    private Double valorDebitoTotal;
    private Double valorPendente;
    private String bandeiraRVorigem;
    private String bandeiraRVajustado;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 9)
    public Integer getNumeroPVajustado() {
        return numeroPVajustado;
    }

    public void setNumeroPVajustado(Integer numeroPVajustado) {
        this.numeroPVajustado = numeroPVajustado;
    }

    @Field(offset = 13, length = 9)
    public Integer getNumeroRVajustado() {
        return numeroRVajustado;
    }

    public void setNumeroRVajustado(Integer numeroRVajustado) {
        this.numeroRVajustado = numeroRVajustado;
    }
    @Field(offset = 22, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataAjuste() {
        return dataAjuste;
    }

    public void setDataAjuste(Date dataAjuste) {
        this.dataAjuste = dataAjuste;
    }

    @Field(offset = 30, length = 15)
    public Double getValorAjuste() {
        return valorAjuste;
    }

    public void setValorAjuste(Double valorAjuste) {
        this.valorAjuste = valorAjuste;
    }

    @Field(offset = 45, length = 1)
    public String getdDebito() {
        return dDebito;
    }

    public void setdDebito(String dDebito) {
        this.dDebito = dDebito;
    }

    @Field(offset = 46, length = 2)
    public Integer getMotivoAjuste() {
        return motivoAjuste;
    }

    public void setMotivoAjuste(Integer motivoAjuste) {
        this.motivoAjuste = motivoAjuste;
    }

    @Field(offset = 48, length = 28)
    public String getMotivoAjusteText() {
        return motivoAjusteText;
    }

    public void setMotivoAjusteText(String motivoAjusteText) {
        this.motivoAjusteText = motivoAjusteText;
    }

    @Field(offset = 76, length = 16)
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Field(offset = 92, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(Date dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    @Field(offset = 100, length = 9)
    public Integer getNumeroRVoriginal() {
        return numeroRVoriginal;
    }

    public void setNumeroRVoriginal(Integer numeroRVoriginal) {
        this.numeroRVoriginal = numeroRVoriginal;
    }

    @Field(offset = 109, length = 15)
    public String getNumeroReferenciaCarta() {
        return numeroReferenciaCarta;
    }

    public void setNumeroReferenciaCarta(String numeroReferenciaCarta) {
        this.numeroReferenciaCarta = numeroReferenciaCarta;
    }

    @Field(offset = 124, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCarta() {
        return dataCarta;
    }

    public void setDataCarta(Date dataCarta) {
        this.dataCarta = dataCarta;
    }

    @Field(offset = 132, length = 6)
    public Integer getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(Integer mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    @Field(offset = 138, length = 9)
    public Integer getNumeroPVoriginal() {
        return numeroPVoriginal;
    }

    public void setNumeroPVoriginal(Integer numeroPVoriginal) {
        this.numeroPVoriginal = numeroPVoriginal;
    }

    @Field(offset = 147, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataRVoriginal() {
        return dataRVoriginal;
    }

    public void setDataRVoriginal(Date dataRVoriginal) {
        this.dataRVoriginal = dataRVoriginal;
    }

    @Field(offset = 155, length = 15)
    public Double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(Double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    @Field(offset = 170, length = 1)
    public String getDdesagendamentoNnet() {
        return DdesagendamentoNnet;
    }

    public void setDdesagendamentoNnet(String DdesagendamentoNnet) {
        this.DdesagendamentoNnet = DdesagendamentoNnet;
    }

    @Field(offset = 171, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
    }

    @Field(offset = 179, length = 15)
    public Double getNovoValorParcela() {
        return novoValorParcela;
    }

    public void setNovoValorParcela(Double novoValorParcela) {
        this.novoValorParcela = novoValorParcela;
    }

    @Field(offset = 194, length = 15)
    public Double getValorOriginalParcela() {
        return valorOriginalParcela;
    }

    public void setValorOriginalParcela(Double valorOriginalParcela) {
        this.valorOriginalParcela = valorOriginalParcela;
    }

    @Field(offset = 209, length = 15)
    public Double getValorBrutoresumoVendas() {
        return valorBrutoresumoVendas;
    }

    public void setValorBrutoresumoVendas(Double valorBrutoresumoVendas) {
        this.valorBrutoresumoVendas = valorBrutoresumoVendas;
    }

    @Field(offset = 224, length = 15)
    public Double getValorCancelamentoSolicitado() {
        return valorCancelamentoSolicitado;
    }

    public void setValorCancelamentoSolicitado(Double valorCancelamentoSolicitado) {
        this.valorCancelamentoSolicitado = valorCancelamentoSolicitado;
    }

    @Field(offset = 239, length = 12)
    public Integer getNumeroNSU() {
        return numeroNSU;
    }

    public void setNumeroNSU(Integer numeroNSU) {
        this.numeroNSU = numeroNSU;
    }

    @Field(offset = 251, length = 6)
    public String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    public void setNumeroAutorizacao(String numeroAutorizacao) {
        this.numeroAutorizacao = numeroAutorizacao;
    }

    @Field(offset = 257, length = 1)
    public String getTipoDebito() {
        return tipoDebito;
    }

    public void setTipoDebito(String tipoDebito) {
        this.tipoDebito = tipoDebito;
    }

    @Field(offset = 258, length = 11)
    public Long getNumeroOrdemDebito() {
        return numeroOrdemDebito;
    }

    public void setNumeroOrdemDebito(Long numeroOrdemDebito) {
        this.numeroOrdemDebito = numeroOrdemDebito;
    }

    @Field(offset = 269, length = 15)
    public Double getValorDebitoTotal() {
        return valorDebitoTotal;
    }

    public void setValorDebitoTotal(Double valorDebitoTotal) {
        this.valorDebitoTotal = valorDebitoTotal;
    }

    @Field(offset = 284, length = 15)
    public Double getValorPendente() {
        return valorPendente;
    }

    public void setValorPendente(Double valorPendente) {
        this.valorPendente = valorPendente;
    }

    @Field(offset = 299, length = 1)
    public String getBandeiraRVorigem() {
        return bandeiraRVorigem;
    }

    public void setBandeiraRVorigem(String bandeiraRVorigem) {
        this.bandeiraRVorigem = bandeiraRVorigem;
    }

    @Field(offset = 300, length = 1)
    public String getBandeiraRVajustado() {
        return bandeiraRVajustado;
    }

    public void setBandeiraRVajustado(String bandeiraRVajustado) {
        this.bandeiraRVajustado = bandeiraRVajustado;
    }

    @Override
    public String toString() {
        return "Registro035AjustesNetDesagendamentos{" + "tipoRegistro=" + tipoRegistro + ", numeroPVajustado=" + numeroPVajustado + ", numeroRVajustado=" + numeroRVajustado + ", dataAjuste=" + dataAjuste + ", valorAjuste=" + valorAjuste + ", dDebito=" + dDebito + ", motivoAjuste=" + motivoAjuste + ", motivoAjusteText=" + motivoAjusteText + ", numeroCartao=" + numeroCartao + ", dataTransacao=" + dataTransacao + ", numeroRVoriginal=" + numeroRVoriginal + ", numeroReferenciaCarta=" + numeroReferenciaCarta + ", dataCarta=" + dataCarta + ", mesReferencia=" + mesReferencia + ", numeroPVoriginal=" + numeroPVoriginal + ", dataRVoriginal=" + dataRVoriginal + ", valorTransacao=" + valorTransacao + ", DdesagendamentoNnet=" + DdesagendamentoNnet + ", dataCredito=" + dataCredito + ", novoValorParcela=" + novoValorParcela + ", valorOriginalParcela=" + valorOriginalParcela + ", valorBrutoresumoVendas=" + valorBrutoresumoVendas + ", valorCancelamentoSolicitado=" + valorCancelamentoSolicitado + ", numeroNSU=" + numeroNSU + ", numeroAutorizacao=" + numeroAutorizacao + ", tipoDebito=" + tipoDebito + ", numeroOrdemDebito=" + numeroOrdemDebito + ", valorDebitoTotal=" + valorDebitoTotal + ", valorPendente=" + valorPendente + ", bandeiraRVorigem=" + bandeiraRVorigem + ", bandeiraRVajustado=" + bandeiraRVajustado + '}';
    }

}
