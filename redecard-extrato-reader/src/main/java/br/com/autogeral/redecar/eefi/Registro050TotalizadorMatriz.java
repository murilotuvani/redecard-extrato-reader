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
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *@see https://www.userede.com.br/pt-BR/produtosservicos/Documents/Extrato_Eletronico/0208_EEFI_Rede_0263_ExtratosOnlineFinanciamento(portugues).pdf
 * @author Kaique
 */
@Record
public class Registro050TotalizadorMatriz implements RegistroRedecard{

    private Integer tipoRegistro;
    private Integer numeroPVmatriz;
    private Integer quantidadeTotalResumosMatriz;
    private Double valorTotalCreditosNormais;
    private Integer quantidadeCreditosAntecipados;
    private Double valorTotalAntecipado;
    private Integer quantidadeAjustesCredito;
    private Double valorTotalAjustesCredito;
    private Integer quantidadeAjustesDebito;
    private Double valorTotalAjustesDebito;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 9)
    public Integer getNumeroPVmatriz() {
        return numeroPVmatriz;
    }

    public void setNumeroPVmatriz(Integer numeroPVmatriz) {
        this.numeroPVmatriz = numeroPVmatriz;
    }

    @Field(offset = 13, length = 6)
    public Integer getQuantidadeTotalResumosMatriz() {
        return quantidadeTotalResumosMatriz;
    }

    public void setQuantidadeTotalResumosMatriz(Integer quantidadeTotalResumosMatriz) {
        this.quantidadeTotalResumosMatriz = quantidadeTotalResumosMatriz;
    }

    @Field(offset = 19, length = 15)
    public Double getValorTotalCreditosNormais() {
        return valorTotalCreditosNormais;
    }

    public void setValorTotalCreditosNormais(Double valorTotalCreditosNormais) {
        this.valorTotalCreditosNormais = valorTotalCreditosNormais;
    }

    @Field(offset = 34, length = 6)
    public Integer getQuantidadeCreditosAntecipados() {
        return quantidadeCreditosAntecipados;
    }

    public void setQuantidadeCreditosAntecipados(Integer quantidadeCreditosAntecipados) {
        this.quantidadeCreditosAntecipados = quantidadeCreditosAntecipados;
    }

    @Field(offset = 40, length = 15)
    public Double getValorTotalAntecipado() {
        return valorTotalAntecipado;
    }

    public void setValorTotalAntecipado(Double valorTotalAntecipado) {
        this.valorTotalAntecipado = valorTotalAntecipado;
    }

    @Field(offset = 55, length = 4)
    public Integer getQuantidadeAjustesCredito() {
        return quantidadeAjustesCredito;
    }

    public void setQuantidadeAjustesCredito(Integer quantidadeAjustesCredito) {
        this.quantidadeAjustesCredito = quantidadeAjustesCredito;
    }

    @Field(offset = 59, length = 15)
    public Double getValorTotalAjustesCredito() {
        return valorTotalAjustesCredito;
    }

    public void setValorTotalAjustesCredito(Double valorTotalAjustesCredito) {
        this.valorTotalAjustesCredito = valorTotalAjustesCredito;
    }

    @Field(offset = 74, length = 6)
    public Integer getQuantidadeAjustesDebito() {
        return quantidadeAjustesDebito;
    }

    public void setQuantidadeAjustesDebito(Integer quantidadeAjustesDebito) {
        this.quantidadeAjustesDebito = quantidadeAjustesDebito;
    }

    @Field(offset = 80, length = 15)
    public Double getValorTotalAjustesDebito() {
        return valorTotalAjustesDebito;
    }

    public void setValorTotalAjustesDebito(Double valorTotalAjustesDebito) {
        this.valorTotalAjustesDebito = valorTotalAjustesDebito;
    }

    @Override
    public String toString() {
        return "Registro050TotalizadorMatriz{" + "tipoRegistro=" + tipoRegistro + ", numeroPVmatriz=" + numeroPVmatriz + ", quantidadeTotalResumosMatriz=" + quantidadeTotalResumosMatriz + ", valorTotalCreditosNormais=" + valorTotalCreditosNormais + ", quantidadeCreditosAntecipados=" + quantidadeCreditosAntecipados + ", valorTotalAntecipado=" + valorTotalAntecipado + ", quantidadeAjustesCredito=" + quantidadeAjustesCredito + ", valorTotalAjustesCredito=" + valorTotalAjustesCredito + ", quantidadeAjustesDebito=" + quantidadeAjustesDebito + ", valorTotalAjustesDebito=" + valorTotalAjustesDebito + '}';
    }
    

}
