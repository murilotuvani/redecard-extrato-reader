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
 * @see https://www.userede.com.br/pt-BR/produtosservicos/Documents/Extrato_Eletronico/0208_EEFI_Rede_0263_ExtratosOnlineFinanciamento(portugues).pdf
 * @author Kaique
 */
@Record
public class Registro037TotalizadorCreditos implements RegistroRedecard {

    private Integer tipoRegistro;
    private Integer numeroPV;
    private String brancos;
    private Date dataCredito;
    private Double valorTotalCredito;
    private String brancos2;
    private Integer numeroBanco;
    private Integer numeroAgencia;
    private Integer numeroContaCorrente;
    private Date dataGeracaoArquivo;
    private Date dataCreditoAntecipado;
    private Double valorTotalCreditos;

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

    @Field(offset = 13, length = 7)
    public String getBrancos() {
        return brancos;
    }

    public void setBrancos(String brancos) {
        this.brancos = brancos;
    }

    @Field(offset = 20, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
    }

    @Field(offset = 28, length = 15)
    public Double getValorTotalCredito() {
        return valorTotalCredito;
    }

    public void setValorTotalCredito(Double valorTotalCredito) {
        this.valorTotalCredito = valorTotalCredito;
    }

    @Field(offset = 43, length = 1)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Field(offset = 44, length = 3)
    public Integer getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(Integer numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    @Field(offset = 47, length = 6)
    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    @Field(offset = 53, length = 11)
    public Integer getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(Integer numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    @Field(offset = 64, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataGeracaoArquivo() {
        return dataGeracaoArquivo;
    }

    public void setDataGeracaoArquivo(Date dataGeracaoArquivo) {
        this.dataGeracaoArquivo = dataGeracaoArquivo;
    }

    @Field(offset = 72, length = 8)
    public Date getDataCreditoAntecipado() {
        return dataCreditoAntecipado;
    }

    public void setDataCreditoAntecipado(Date dataCreditoAntecipado) {
        this.dataCreditoAntecipado = dataCreditoAntecipado;
    }

    @Field(offset = 80, length = 15)
    public Double getValorTotalCreditos() {
        return valorTotalCreditos;
    }

    public void setValorTotalCreditos(Double valorTotalCreditos) {
        this.valorTotalCreditos = valorTotalCreditos;
    }

}
