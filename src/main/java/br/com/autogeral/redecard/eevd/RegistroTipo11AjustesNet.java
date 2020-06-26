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
package br.com.autogeral.redecard.eevd;

import br.com.autogeral.redecard.ArquivoEEVD;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;
import java.util.Date;

/**
 * 18/02/2020 08:04:42
 *
 * @author kaique.mota
 * @see https://www.userede.com.br/novo/documentos
 */
@Record
public class RegistroTipo11AjustesNet implements ArquivoEEVD {

    private Integer tipoRegistro;
    private Integer numeroPVajustado;
    private Integer mumeroRVajustado;
    private Date dataAjuste;
    private Double valorAjuste;
    private String dDebito;
    private Integer motivoDoajuste;
    private String motivo;
    private Long numeroCartao;
    private Date dataTransacaoCV;
    private Integer numeroRVoriginal;
    private String numeroReferenciaCarta;
    private Date dataCarta;
    private Integer mesReferencia;
    private Integer numeroPVoriginal;
    private String dataRVoriginal;
    private Double valorTransacao;
    private String nNet;
    private Date dataCtedito;
    private Double valorBrutoresumoVendasOriginal;
    private Double valorCancelamentoSolicitado;
    private Long numeroNSU;
    private String numeroAutorizacao;
    private String tipodeDebito;
    private Long numeroOrdemDebito;
    private Double valordebitoTotal;
    private Double valorPendente;
    private String bandeiraRVorigem;
    private String bandeiraRVajustado;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer TipoRegistro) {
        this.tipoRegistro = TipoRegistro;
    }

    @Field(offset = 4, length = 9)
    public Integer getNumeroPVajustado() {
        return numeroPVajustado;
    }

    public void setNumeroPVajustado(Integer numeroPVajustado) {
        this.numeroPVajustado = numeroPVajustado;
    }

    @Field(offset = 13, length = 9)
    public Integer getMumeroRVajustado() {
        return mumeroRVajustado;
    }

    public void setMumeroRVajustado(Integer mumeroRVajustado) {
        this.mumeroRVajustado = mumeroRVajustado;
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

    @Field(offset = 46, length = 2, paddingChar = 0)
    public Integer getMotivoDoajuste() {
        return motivoDoajuste;
    }

    public void setMotivoDoajuste(Integer motivoDoajuste) {
        this.motivoDoajuste = motivoDoajuste;
    }

    @Field(offset = 48, length = 28)
    public String getMotivoAjuste() {
        return motivo;
    }

    public void setMotivoAjuste(String motivoAjuste) {
        this.motivo = motivoAjuste;
    }

    @Field(offset = 76, length = 16)
    public Long getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(Long numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Field(offset = 92, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataTransacaoCV() {
        return dataTransacaoCV;
    }

    public void setDataTransacaoCV(Date dataTransacaoCV) {
        this.dataTransacaoCV = dataTransacaoCV;
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
    public String getDataRVoriginal() {
        return dataRVoriginal;
    }

    public void setDataRVoriginal(String dataRVoriginal) {
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
    public String getnNet() {
        return nNet;
    }

    public void setnNet(String nNet) {
        this.nNet = nNet;
    }

    @Field(offset = 171, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCtedito() {
        return dataCtedito;
    }

    public void setDataCtedito(Date dataCtedito) {
        this.dataCtedito = dataCtedito;
    }

    @Field(offset = 179, length = 15)
    public Double getValorBrutoresumoVendasOriginal() {
        return valorBrutoresumoVendasOriginal;
    }

    public void setValorBrutoresumoVendasOriginal(Double valorBrutoresumoVendasOriginal) {
        this.valorBrutoresumoVendasOriginal = valorBrutoresumoVendasOriginal;
    }

    @Field(offset = 194, length = 15)
    public Double getValorCancelamentoSolicitado() {
        return valorCancelamentoSolicitado;
    }

    public void setValorCancelamentoSolicitado(Double valorCancelamentoSolicitado) {
        this.valorCancelamentoSolicitado = valorCancelamentoSolicitado;
    }

    @Field(offset = 209, length = 12)
    public Long getNumeroNSU() {
        return numeroNSU;
    }

    public void setNumeroNSU(Long numeroNSU) {
        this.numeroNSU = numeroNSU;
    }

    @Field(offset = 221, length = 6)
    public String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    public void setNumeroAutorizacao(String numeroAutorizacao) {
        this.numeroAutorizacao = numeroAutorizacao;
    }

    @Field(offset = 227, length = 1)
    public String getTipodeDebito() {
        return tipodeDebito;
    }

    public void setTipodeDebito(String tipodeDebito) {
        this.tipodeDebito = tipodeDebito;
    }

    @Field(offset = 228, length = 11)
    public Long getNumeroOrdemDebito() {
        return numeroOrdemDebito;
    }

    public void setNumeroOrdemDebito(Long numeroOrdemDebito) {
        this.numeroOrdemDebito = numeroOrdemDebito;
    }

    @Field(offset = 239, length = 15)
    public Double getValordebitoTotal() {
        return valordebitoTotal;
    }

    public void setValordebitoTotal(Double valordebitoTotal) {
        this.valordebitoTotal = valordebitoTotal;
    }

    @Field(offset = 254, length = 15)
    public Double getValorPendente() {
        return valorPendente;
    }

    public void setValorPendente(Double valorPendente) {
        this.valorPendente = valorPendente;
    }

    @Field(offset = 269, length = 1)
    public String getBandeiraRVorigem() {
        return bandeiraRVorigem;
    }

    public void setBandeiraRVorigem(String bandeiraRVorigem) {
        this.bandeiraRVorigem = bandeiraRVorigem;
    }

    @Field(offset = 270, length = 1)
    public String getBandeiraRVajustado() {
        return bandeiraRVajustado;
    }

    public void setBandeiraRVajustado(String bandeiraRVajustado) {
        this.bandeiraRVajustado = bandeiraRVajustado;
    }

    @Override
    public String toString() {
        return "RegistroTipo11AjustesNet{" + "TipoRegistro=" + tipoRegistro + ", numeroPVajustado=" + numeroPVajustado + ", mumeroRVajustado=" + mumeroRVajustado + ", dataAjuste=" + dataAjuste + ", valorAjuste=" + valorAjuste + ", dDebito=" + dDebito + ", motivoDoajuste=" + motivoDoajuste + ", motivoAjuste=" + motivo + ", numeroCartao=" + numeroCartao + ", dataTransacaoCV=" + dataTransacaoCV + ", numeroRVoriginal=" + numeroRVoriginal + ", numeroReferenciaCarta=" + numeroReferenciaCarta + ", dataCarta=" + dataCarta + ", mesReferencia=" + mesReferencia + ", numeroPVoriginal=" + numeroPVoriginal + ", dataRVoriginal=" + dataRVoriginal + ", valorTransacao=" + valorTransacao + ", nNet=" + nNet + ", dataCtedito=" + dataCtedito + ", valorBrutoresumoVendasOriginal=" + valorBrutoresumoVendasOriginal + ", valorCancelamentoSolicitado=" + valorCancelamentoSolicitado + ", numeroNSU=" + numeroNSU + ", numeroAutorizacao=" + numeroAutorizacao + ", tipodeDebito=" + tipodeDebito + ", numeroOrdemDebito=" + numeroOrdemDebito + ", valordebitoTotal=" + valordebitoTotal + ", valorPendente=" + valorPendente + ", bandeiraRVorigem=" + bandeiraRVorigem + ", bandeiraRVajustado=" + bandeiraRVajustado + '}';
    }

	@Override
	public Integer getRegistro() {
		return tipoRegistro;
	}

}
