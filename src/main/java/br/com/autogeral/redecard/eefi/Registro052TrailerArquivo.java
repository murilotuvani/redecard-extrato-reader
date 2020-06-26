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
package br.com.autogeral.redecard.eefi;

import br.com.autogeral.redecard.ArquivoEEFI;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * @author Kaique
 * @see https://www.userede.com.br/pt-BR/produtosservicos/Documents/Extrato_Eletronico/0208_EEFI_Rede_0263_ExtratosOnlineFinanciamento(portugues).pdf
 */
@Record
public class Registro052TrailerArquivo implements ArquivoEEFI {

    private Integer tipoRegistro;
    private Integer quantidadeMatrizesArquivo;
    private Integer quantidadeRegistrosArquivo;
    private Integer numeroPVgrupo;
    private Integer quantidadeTotalResumosGrupo;
    private Double valorTotalDosCreditosNormais;
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

    @Field(offset = 4, length = 4)
    public Integer getQuantidadeMatrizesArquivo() {
        return quantidadeMatrizesArquivo;
    }

    public void setQuantidadeMatrizesArquivo(Integer quantidadeMatrizesArquivo) {
        this.quantidadeMatrizesArquivo = quantidadeMatrizesArquivo;
    }

    @Field(offset = 8, length = 6)
    public Integer getQuantidadeRegistrosArquivo() {
        return quantidadeRegistrosArquivo;
    }

    public void setQuantidadeRegistrosArquivo(Integer quantidadeRegistrosArquivo) {
        this.quantidadeRegistrosArquivo = quantidadeRegistrosArquivo;
    }

    @Field(offset = 14, length = 9)
    public Integer getNumeroPVgrupo() {
        return numeroPVgrupo;
    }

    public void setNumeroPVgrupo(Integer numeroPVgrupo) {
        this.numeroPVgrupo = numeroPVgrupo;
    }

    @Field(offset = 23, length = 4)
    public Integer getQuantidadeTotalResumosGrupo() {
        return quantidadeTotalResumosGrupo;
    }

    public void setQuantidadeTotalResumosGrupo(Integer quantidadeTotalResumosGrupo) {
        this.quantidadeTotalResumosGrupo = quantidadeTotalResumosGrupo;
    }

    @Field(offset = 27, length = 15)
    public Double getValorTotalDosCreditosNormais() {
        return valorTotalDosCreditosNormais;
    }

    public void setValorTotalDosCreditosNormais(Double valorTotalDosCreditosNormais) {
        this.valorTotalDosCreditosNormais = valorTotalDosCreditosNormais;
    }

    @Field(offset = 42, length = 6)
    public Integer getQuantidadeCreditosAntecipados() {
        return quantidadeCreditosAntecipados;
    }

    public void setQuantidadeCreditosAntecipados(Integer quantidadeCreditosAntecipados) {
        this.quantidadeCreditosAntecipados = quantidadeCreditosAntecipados;
    }

    @Field(offset = 48, length = 15)
    public Double getValorTotalAntecipado() {
        return valorTotalAntecipado;
    }

    public void setValorTotalAntecipado(Double valorTotalAntecipado) {
        this.valorTotalAntecipado = valorTotalAntecipado;
    }

    @Field(offset = 63, length = 4)
    public Integer getQuantidadeAjustesCredito() {
        return quantidadeAjustesCredito;
    }

    public void setQuantidadeAjustesCredito(Integer quantidadeAjustesCredito) {
        this.quantidadeAjustesCredito = quantidadeAjustesCredito;
    }

    @Field(offset = 67, length = 15)
    public Double getValorTotalAjustesCredto() {
        return valorTotalAjustesCredito;
    }

    public void setValorTotalAjustesCredto(Double valorTotalAjustesCredto) {
        this.valorTotalAjustesCredito = valorTotalAjustesCredto;
    }

    @Field(offset = 82, length = 4)
    public Integer getQuantidadeAjustesDebito() {
        return quantidadeAjustesDebito;
    }

    public void setQuantidadeAjustesDebito(Integer quantidadeAjustesDebito) {
        this.quantidadeAjustesDebito = quantidadeAjustesDebito;
    }

    @Field(offset = 86, length = 15)
    public Double getValorTotalAjustesDebito() {
        return valorTotalAjustesDebito;
    }

    public void setValorTotalAjustesDebito(Double valorTotalAjustesDebito) {
        this.valorTotalAjustesDebito = valorTotalAjustesDebito;
    }

    @Override
    public String toString() {
        return "Registro052TrailerArquivo{" + "tipoRegistro=" + tipoRegistro + ", quantidadeMatrizesArquivo=" + quantidadeMatrizesArquivo + ", quantidadeRegistrosArquivo=" + quantidadeRegistrosArquivo + ", numeroPVgrupo=" + numeroPVgrupo + ", quantidadeTotalResumosGrupo=" + quantidadeTotalResumosGrupo + ", valorTotalDosCreditosNormais=" + valorTotalDosCreditosNormais + ", quantidadeCreditosAntecipados=" + quantidadeCreditosAntecipados + ", valorTotalAntecipado=" + valorTotalAntecipado + ", quantidadeAjustesCredito=" + quantidadeAjustesCredito + ", valorTotalAjustesCredto=" + valorTotalAjustesCredito + ", quantidadeAjustesDebito=" + quantidadeAjustesDebito + ", valorTotalAjustesDebito=" + valorTotalAjustesDebito + '}';
    }

}
