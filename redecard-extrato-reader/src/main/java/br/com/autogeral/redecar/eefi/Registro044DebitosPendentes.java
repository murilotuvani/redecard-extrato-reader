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
import static java.lang.Character.UnicodeBlock.of;
import java.util.Date;

/**
 * 18/02/2020 16:39:00
 *
 * @author kaique.mota
 * @see https://www.userede.com.br/novo/documentos
 */
@Record
public class Registro044DebitosPendentes implements RegistroRedecard {

    private Integer tipoRegistro;
    private Integer numeroPVajustado;
    private Integer numeroOrdemDebito;
    private Date dataOD;
    private Double valorOD;
    private Integer motivoAjuste;
    private String motivoAjusteText;
    private String numeroCartao;
    private Integer numeroNSU;
    private Date dataCVoriginaltransação;
    private String numeroAutorizacao;
    private Double valorOriginal;
    private Integer numeroRVoriginal;
    private Date dataRVoriginal;
    private Integer numeroPVoriginal;
    private String numeroReferenciaCarta;
    private Date dataCarta;
    private Integer numeroProcessoChargeback;
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
    public Integer getNumeroOrdemDebito() {
        return numeroOrdemDebito;
    }

    public void setNumeroOrdemDebito(Integer numeroOrdemDebito) {
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

    public Double getValorOD() {
        return valorOD;
    }

    public void setValorOD(Double valorOD) {
        this.valorOD = valorOD;
    }

    @Field(offset = 32, length = 15)
    public Integer getMotivoAjuste() {
        return motivoAjuste;
    }

    public void setMotivoAjuste(Integer motivoAjuste) {
        this.motivoAjuste = motivoAjuste;
    }

    @Field(offset = 47, length = 2)
    public String getMotivoAjusteText() {
        return motivoAjusteText;
    }

    public void setMotivoAjusteText(String motivoAjusteText) {
        this.motivoAjusteText = motivoAjusteText;
    }

    @Field(offset = 49, length = 28)
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Field(offset = 77, length = 16)
    public Integer getNumeroNSU() {
        return numeroNSU;
    }

    public void setNumeroNSU(Integer numeroNSU) {
        this.numeroNSU = numeroNSU;
    }

    @Field(offset = 93, length = 12)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCVoriginaltransação() {
        return dataCVoriginaltransação;
    }

    public void setDataCVoriginaltransação(Date dataCVoriginaltransação) {
        this.dataCVoriginaltransação = dataCVoriginaltransação;
    }

    @Field(offset = 105, length = 8)
    public String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    public void setNumeroAutorizacao(String numeroAutorizacao) {
        this.numeroAutorizacao = numeroAutorizacao;
    }

    @Field(offset = 113, length = 6)
    public Double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(Double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    @Field(offset = 93, length = 12)
    public Integer getNumeroRVoriginal() {
        return numeroRVoriginal;
    }

    public void setNumeroRVoriginal(Integer numeroRVoriginal) {
        this.numeroRVoriginal = numeroRVoriginal;
    }

    public Date getDataRVoriginal() {
        return dataRVoriginal;
    }

    public void setDataRVoriginal(Date dataRVoriginal) {
        this.dataRVoriginal = dataRVoriginal;
    }

    public Integer getNumeroPVoriginal() {
        return numeroPVoriginal;
    }

    public void setNumeroPVoriginal(Integer numeroPVoriginal) {
        this.numeroPVoriginal = numeroPVoriginal;
    }

    public String getNumeroReferenciaCarta() {
        return numeroReferenciaCarta;
    }

    public void setNumeroReferenciaCarta(String numeroReferenciaCarta) {
        this.numeroReferenciaCarta = numeroReferenciaCarta;
    }

    public Date getDataCarta() {
        return dataCarta;
    }

    public void setDataCarta(Date dataCarta) {
        this.dataCarta = dataCarta;
    }

    public Integer getNumeroProcessoChargeback() {
        return numeroProcessoChargeback;
    }

    public void setNumeroProcessoChargeback(Integer numeroProcessoChargeback) {
        this.numeroProcessoChargeback = numeroProcessoChargeback;
    }

    public Integer getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(Integer mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public Double getValorCompensado() {
        return valorCompensado;
    }

    public void setValorCompensado(Double valorCompensado) {
        this.valorCompensado = valorCompensado;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getValorPendenteDebito() {
        return valorPendenteDebito;
    }

    public void setValorPendenteDebito(Double valorPendenteDebito) {
        this.valorPendenteDebito = valorPendenteDebito;
    }

    public Integer getNumeroProcessoRetencao() {
        return numeroProcessoRetencao;
    }

    public void setNumeroProcessoRetencao(Integer numeroProcessoRetencao) {
        this.numeroProcessoRetencao = numeroProcessoRetencao;
    }

    public Integer getMeioCompensacao() {
        return meioCompensacao;
    }

    public void setMeioCompensacao(Integer meioCompensacao) {
        this.meioCompensacao = meioCompensacao;
    }

    public String getMeioCompensacaoText() {
        return meioCompensacaoText;
    }

    public void setMeioCompensacaoText(String meioCompensacaoText) {
        this.meioCompensacaoText = meioCompensacaoText;
    }

    public String getIdentificaBandeira() {
        return identificaBandeira;
    }

    public void setIdentificaBandeira(String identificaBandeira) {
        this.identificaBandeira = identificaBandeira;
    }

}
