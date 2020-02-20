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
 * 19/02/2020 09:27:09
 *
 * @author kaique.mota
 * @ see https://www.userede.com.br/novo/documentos
 */
@Record
public class Registro043AjustesCredito implements RegistroRedecard {

    private Integer tipoRegistro;
    private Integer numeroPVcreditado;
    private Integer numeroResumoCredito;
    private Long nummeroDocumento;
    private Date dataEmissao;
    private Date dataCredito;
    private Double valorCredito;
    private String Ccredito;
    private Integer banco;
    private Integer agencia;
    private String contaCorrente;
    private Integer motivoCredito;
    private String motivoCreditoText;
    private String bandeira;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 9)
    public Integer getNumeroPVcreditado() {
        return numeroPVcreditado;
    }

    public void setNumeroPVcreditado(Integer numeroPVcreditado) {
        this.numeroPVcreditado = numeroPVcreditado;
    }

    @Field(offset = 13, length = 9)
    public Integer getNumeroResumoCredito() {
        return numeroResumoCredito;
    }

    public void setNumeroResumoCredito(Integer numeroResumoCredito) {
        this.numeroResumoCredito = numeroResumoCredito;
    }

    @Field(offset = 22, length = 11)
    public Long getNummeroDocumento() {
        return nummeroDocumento;
    }

    public void setNummeroDocumento(Long nummeroDocumento) {
        this.nummeroDocumento = nummeroDocumento;
    }

    @Field(offset = 33, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Field(offset = 41, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
    }

    @Field(offset = 49, length = 15)
    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    @Field(offset = 64, length = 1)
    public String getCcredito() {
        return Ccredito;
    }

    public void setCcredito(String Ccredito) {
        this.Ccredito = Ccredito;
    }

    @Field(offset = 65, length = 3)
    public Integer getBanco() {
        return banco;
    }

    public void setBanco(Integer banco) {
        this.banco = banco;
    }

    @Field(offset = 68, length = 6)
    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 74, length = 11)
    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    @Field(offset = 85, length = 2)
    public Integer getMotivoCredito() {
        return motivoCredito;
    }

    public void setMotivoCredito(Integer motivoCredito) {
        this.motivoCredito = motivoCredito;
    }

    @Field(offset = 87, length = 28)
    public String getMotivoCreditoText() {
        return motivoCreditoText;
    }

    public void setMotivoCreditoText(String motivoCreditoText) {
        this.motivoCreditoText = motivoCreditoText;
    }

    @Field(offset = 115, length = 15)
    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    @Override
    public String toString() {
        return "Registro043AjustesCredito{" + "tipoRegistro=" + tipoRegistro + ", numeroPVcreditado=" + numeroPVcreditado + ", numeroResumoCredito=" + numeroResumoCredito + ", nummeroDocumento=" + nummeroDocumento + ", dataEmissao=" + dataEmissao + ", dataCredito=" + dataCredito + ", valorCredito=" + valorCredito + ", Ccredito=" + Ccredito + ", banco=" + banco + ", agencia=" + agencia + ", contaCorrente=" + contaCorrente + ", motivoCredito=" + motivoCredito + ", motivoCreditoText=" + motivoCreditoText + ", bandeira=" + bandeira + '}';
    }
    
    

}
