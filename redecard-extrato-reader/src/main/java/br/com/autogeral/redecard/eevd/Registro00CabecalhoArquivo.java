/*
 * The MIT License
 *
 * Copyright 2020 murilotuvani.
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

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;
import java.util.Date;

/**
 * 06/02/2020 21:54:57
 *
 * @author murilotuvani
 */
@Record
public class Registro00CabecalhoArquivo {

    private Integer tipoRegistro;
    private Integer numeroFiliacao;
    private Date dataEmissao;
    private Date dataMovimento;
    private String movimentacaoDiaria;
    private String adquirente;
    private String nomeEstabelecimento;
    private Integer sequencia;
    private String tipoProcessamento;
    private String versaoArquivo;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 9)
    public Integer getNumeroFiliacao() {
        return numeroFiliacao;
    }

    public void setNumeroFiliacao(Integer numeroFiliacao) {
        this.numeroFiliacao = numeroFiliacao;
    }

    @Field(offset = 13, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Field(offset = 21, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    @Field(offset = 29, length = 39)
    public String getMovimentacaoDiaria() {
        return movimentacaoDiaria;
    }

    public void setMovimentacaoDiaria(String movimentacaoDiaria) {
        this.movimentacaoDiaria = movimentacaoDiaria;
    }

    @Field(offset = 68, length = 8)
    public String getAdquirente() {
        return adquirente;
    }

    public void setAdquirente(String adquirente) {
        this.adquirente = adquirente;
    }

    @Field(offset = 76, length = 26)
    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    public void setNomeEstabelecimento(String nomeEstabelecimento) {
        this.nomeEstabelecimento = nomeEstabelecimento;
    }

    @Field(offset = 102, length = 6)
    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    @Field(offset = 108, length = 15)
    public String getTipoProcessamento() {
        return tipoProcessamento;
    }

    public void setTipoProcessamento(String tipoProcessamento) {
        this.tipoProcessamento = tipoProcessamento;
    }

    @Field(offset = 123, length = 20)
    public String getVersaoArquivo() {
        return versaoArquivo;
    }

    public void setVersaoArquivo(String versaoArquivo) {
        this.versaoArquivo = versaoArquivo;
    }

    @Override
    public String toString() {
        return "Registro00CabecalhoArquivo{" + "tipoRegistro=" + tipoRegistro + ", numeroFiliacao=" + numeroFiliacao + ", dataEmissao=" + dataEmissao + ", dataMovimento=" + dataMovimento + ", movimentacaoDiaria=" + movimentacaoDiaria + ", adquirente=" + adquirente + ", nomeEstabelecimento=" + nomeEstabelecimento + ", sequencia=" + sequencia + ", tipoProcessamento=" + tipoProcessamento + ", versaoArquivo=" + versaoArquivo + '}';
    }

}
