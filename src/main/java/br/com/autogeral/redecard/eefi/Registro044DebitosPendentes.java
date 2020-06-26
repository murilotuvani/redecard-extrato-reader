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
package br.com.autogeral.redecard.eefi;

import br.com.autogeral.redecard.ArquivoEEFI;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;

import java.util.Date;

/**
 * 18/02/2020 16:39:00
 *
 * @author kaique.mota
 * @see https://www.userede.com.br/novo/documentos
 */
@Record
public class Registro044DebitosPendentes implements ArquivoEEFI {

    private Integer tipoRegistro;
    private Integer numeroPVajustado;
    private Long numeroOrdemDebito;
    private Date dataOD;
    private Double valorOD;
    private Integer motivoAjuste;
    private String motivoAjusteText;
    private String numeroCartao;
    private Long numeroNSU;
    private Date dataCVoriginaltransação;
    private String numeroAutorizacao;
    private Double valorOriginal;
    private Integer numeroRVoriginal;
    private Date dataRVoriginal;
    private Integer numeroPVoriginal;
    private String numeroReferenciaCarta;
    private Date dataCarta;
    private Long numeroProcessoChargeback;
    private Integer mesReferencia;
    private Double valorCompensado;
    private Date dataPagamento;
    private Double valorPendenteDebito;
    private Integer numeroProcessoRetencao;
    private Integer meioCompensacao;
    private String meioCompensacaoText;
    private String identificaBandeira;

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

    @Field(offset = 13, length = 11)
    public Long getNumeroOrdemDebito() {
        return numeroOrdemDebito;
    }

    public void setNumeroOrdemDebito(Long numeroOrdemDebito) {
        this.numeroOrdemDebito = numeroOrdemDebito;
    }

    @Field(offset = 24, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataOD() {
        return dataOD;
    }

    public void setDataOD(Date dataOD) {
        this.dataOD = dataOD;
    }

    @Field(offset = 32, length = 15)
    public Double getValorOD() {
        return valorOD;
    }

    public void setValorOD(Double valorOD) {
        this.valorOD = valorOD;
    }

    @Field(offset = 47, length = 2)
    public Integer getMotivoAjuste() {
        return motivoAjuste;
    }

    public void setMotivoAjuste(Integer motivoAjuste) {
        this.motivoAjuste = motivoAjuste;
    }

    @Field(offset = 49, length = 28)
    public String getMotivoAjusteText() {
        return motivoAjusteText;
    }

    public void setMotivoAjusteText(String motivoAjusteText) {
        this.motivoAjusteText = motivoAjusteText;
    }

    @Field(offset = 77, length = 16)
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Field(offset = 93, length = 12)
    public Long getNumeroNSU() {
        return numeroNSU;
    }

    public void setNumeroNSU(Long numeroNSU) {
        this.numeroNSU = numeroNSU;
    }

    @Field(offset = 105, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCVoriginaltransação() {
        return dataCVoriginaltransação;
    }

    public void setDataCVoriginaltransação(Date dataCVoriginaltransação) {
        this.dataCVoriginaltransação = dataCVoriginaltransação;
    }

    @Field(offset = 113, length = 6)
    public String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    public void setNumeroAutorizacao(String numeroAutorizacao) {
        this.numeroAutorizacao = numeroAutorizacao;
    }

    @Field(offset = 119, length = 15)
    public Double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(Double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    @Field(offset = 134, length = 9)
    public Integer getNumeroRVoriginal() {
        return numeroRVoriginal;
    }

    public void setNumeroRVoriginal(Integer numeroRVoriginal) {
        this.numeroRVoriginal = numeroRVoriginal;
    }

    @Field(offset = 143, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataRVoriginal() {
        return dataRVoriginal;
    }

    public void setDataRVoriginal(Date dataRVoriginal) {
        this.dataRVoriginal = dataRVoriginal;
    }

    @Field(offset = 151, length = 9)
    public Integer getNumeroPVoriginal() {
        return numeroPVoriginal;
    }

    public void setNumeroPVoriginal(Integer numeroPVoriginal) {
        this.numeroPVoriginal = numeroPVoriginal;
    }

    @Field(offset = 160, length = 15)
    public String getNumeroReferenciaCarta() {
        return numeroReferenciaCarta;
    }

    public void setNumeroReferenciaCarta(String numeroReferenciaCarta) {
        this.numeroReferenciaCarta = numeroReferenciaCarta;
    }

    @Field(offset = 175, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCarta() {
        return dataCarta;
    }

    public void setDataCarta(Date dataCarta) {
        this.dataCarta = dataCarta;
    }

    @Field(offset = 183, length = 15)
    public Long getNumeroProcessoChargeback() {
        return numeroProcessoChargeback;
    }

    public void setNumeroProcessoChargeback(Long numeroProcessoChargeback) {
        this.numeroProcessoChargeback = numeroProcessoChargeback;
    }

    @Field(offset = 198, length = 6)
    public Integer getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(Integer mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    @Field(offset = 204, length = 15)
    public Double getValorCompensado() {
        return valorCompensado;
    }

    public void setValorCompensado(Double valorCompensado) {
        this.valorCompensado = valorCompensado;
    }

    @Field(offset = 219, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Field(offset = 227, length = 15)
    public Double getValorPendenteDebito() {
        return valorPendenteDebito;
    }

    public void setValorPendenteDebito(Double valorPendenteDebito) {
        this.valorPendenteDebito = valorPendenteDebito;
    }

    @Field(offset = 242, length = 15)
    public Integer getNumeroProcessoRetencao() {
        return numeroProcessoRetencao;
    }

    public void setNumeroProcessoRetencao(Integer numeroProcessoRetencao) {
        this.numeroProcessoRetencao = numeroProcessoRetencao;
    }

    @Field(offset = 257, length = 2)
    public Integer getMeioCompensacao() {
        return meioCompensacao;
    }

    public void setMeioCompensacao(Integer meioCompensacao) {
        this.meioCompensacao = meioCompensacao;
    }

    @Field(offset = 259, length = 28)
    public String getMeioCompensacaoText() {
        return meioCompensacaoText;
    }

    public void setMeioCompensacaoText(String meioCompensacaoText) {
        this.meioCompensacaoText = meioCompensacaoText;
    }

    @Field(offset = 287, length = 1)
    public String getIdentificaBandeira() {
        return identificaBandeira;
    }

    public void setIdentificaBandeira(String identificaBandeira) {
        this.identificaBandeira = identificaBandeira;
    }

    @Override
    public String toString() {
        return "Registro044DebitosPendentes{" + "tipoRegistro=" + tipoRegistro + ", numeroPVajustado=" + numeroPVajustado + ", numeroOrdemDebito=" + numeroOrdemDebito + ", dataOD=" + dataOD + ", valorOD=" + valorOD + ", motivoAjuste=" + motivoAjuste + ", motivoAjusteText=" + motivoAjusteText + ", numeroCartao=" + numeroCartao + ", numeroNSU=" + numeroNSU + ", dataCVoriginaltransa\u00e7\u00e3o=" + dataCVoriginaltransação + ", numeroAutorizacao=" + numeroAutorizacao + ", valorOriginal=" + valorOriginal + ", numeroRVoriginal=" + numeroRVoriginal + ", dataRVoriginal=" + dataRVoriginal + ", numeroPVoriginal=" + numeroPVoriginal + ", numeroReferenciaCarta=" + numeroReferenciaCarta + ", dataCarta=" + dataCarta + ", numeroProcessoChargeback=" + numeroProcessoChargeback + ", mesReferencia=" + mesReferencia + ", valorCompensado=" + valorCompensado + ", dataPagamento=" + dataPagamento + ", valorPendenteDebito=" + valorPendenteDebito + ", numeroProcessoRetencao=" + numeroProcessoRetencao + ", meioCompensacao=" + meioCompensacao + ", meioCompensacaoText=" + meioCompensacaoText + ", identificaBandeira=" + identificaBandeira + '}';
    }

}
