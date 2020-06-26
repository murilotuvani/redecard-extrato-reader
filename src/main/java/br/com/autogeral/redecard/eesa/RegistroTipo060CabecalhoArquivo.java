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
package br.com.autogeral.redecard.eesa;

import br.com.autogeral.redecard.ArquivoEESA;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

import java.util.Date;

/**
 * 17/02/2020 17:35:33
 *
 * @author kaique.mota
 * @see https://www.userede.com.br/novo/documentos
 */
@Record
public class RegistroTipo060CabecalhoArquivo implements ArquivoEESA {

    private Integer tipoRegistro;
    private Date dataEmissao;
    private String adquirente;
    private String extratoEletronicoSaldosAberto;
    private String nomeComercial;
    private Integer sequenciaMovimento;
    private Integer numeroPVgrupoOUmatriz;
    private String diatioOUreprocessamento;
    private String versaoArquivo;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 8)
    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Field(offset = 12, length = 8)
    public String getAdquirente() {
        return adquirente;
    }

    public void setAdquirente(String adquirente) {
        this.adquirente = adquirente;
    }

    @Field(offset = 20, length = 34)
    public String getExtratoEletronicoSaldosAberto() {
        return extratoEletronicoSaldosAberto;
    }

    public void setExtratoEletronicoSaldosAberto(String extratoEletronicoSaldosAberto) {
        this.extratoEletronicoSaldosAberto = extratoEletronicoSaldosAberto;
    }

    @Field(offset = 60, length = 22)
    public String getNomeComercial() {
        return nomeComercial;
    }

    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }

    @Field(offset = 82, length = 6)
    public Integer getSequenciaMovimento() {
        return sequenciaMovimento;
    }

    public void setSequenciaMovimento(Integer sequenciaMovimento) {
        this.sequenciaMovimento = sequenciaMovimento;
    }

    @Field(offset = 88, length = 9)
    public Integer getNumeroPVgrupoOUmatriz() {
        return numeroPVgrupoOUmatriz;
    }

    public void setNumeroPVgrupoOUmatriz(Integer numeroPVgrupoOUmatriz) {
        this.numeroPVgrupoOUmatriz = numeroPVgrupoOUmatriz;
    }

    @Field(offset = 97, length = 15)
    public String getDiatioOUreprocessamento() {
        return diatioOUreprocessamento;
    }

    public void setDiatioOUreprocessamento(String diatioOUreprocessamento) {
        this.diatioOUreprocessamento = diatioOUreprocessamento;
    }

    @Field(offset = 112, length = 20)
    public String getVersaoArquivo() {
        return versaoArquivo;
    }

    public void setVersaoArquivo(String versaoArquivo) {
        this.versaoArquivo = versaoArquivo;
    }

}
