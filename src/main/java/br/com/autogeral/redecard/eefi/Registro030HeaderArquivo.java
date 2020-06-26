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
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;

import java.util.Date;

/**
 * @author Kaique
 * @see https://www.userede.com.br/pt-BR/produtosservicos/Documents/Extrato_Eletronico/0208_EEFI_Rede_0263_ExtratosOnlineFinanciamento(portugues).pdf
 */
@Record
public class Registro030HeaderArquivo implements ArquivoEEFI {

    private Integer tipoRegistro;
    private Date dataEmissao;
    private String adquirente;
    private String extratoMovimentacaoFinanceira;
    private String nomeComercial;
    private Integer sequenciaMovimento;
    private Integer numGrupoOuMatriz;
    private String tipoProcessamento;
    private String versaoArquivo;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 4, length = 8)
    @FixedFormatPattern("ddMMyyyy")
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
    public String getExtratoMovimentacaoFinanceira() {
        return extratoMovimentacaoFinanceira;
    }

    public void setExtratoMovimentacaoFinanceira(String extratoMovimentacaoFinanceira) {
        this.extratoMovimentacaoFinanceira = extratoMovimentacaoFinanceira;
    }

    @Field(offset = 54, length = 22)
    public String getNomeComercial() {
        return nomeComercial;
    }

    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }

    @Field(offset = 76, length = 6)
    public Integer getSequenciaMovimento() {
        return sequenciaMovimento;
    }

    public void setSequenciaMovimento(Integer sequenciaMovimento) {
        this.sequenciaMovimento = sequenciaMovimento;
    }

    @Field(offset = 82, length = 9)
    public Integer getNumGrupoOuMatriz() {
        return numGrupoOuMatriz;
    }

    public void setNumGrupoOuMatriz(Integer numGrupoOuMatriz) {
        this.numGrupoOuMatriz = numGrupoOuMatriz;
    }

    @Field(offset = 91, length = 15)
    public String getTipoProcessamento() {
        return tipoProcessamento;
    }

    public void setTipoProcessamento(String tipoProcessamento) {
        this.tipoProcessamento = tipoProcessamento;
    }

    @Field(offset = 106, length = 20)
    public String getVersaoArquivo() {
        return versaoArquivo;
    }

    public void setVersaoArquivo(String versaoArquivo) {
        this.versaoArquivo = versaoArquivo;
    }

    @Override
    public String toString() {
        return "Registro030HeaderArquivo{" + "tipoRegistro=" + tipoRegistro + ", dataEmissao=" + dataEmissao + ", adquirente=" + adquirente + ", extratoMovimentacaoFinanceira=" + extratoMovimentacaoFinanceira + ", nomeComercial=" + nomeComercial + ", sequenciaMovimento=" + sequenciaMovimento + ", numGrupoOuMatriz=" + numGrupoOuMatriz + ", tipoProcessamento=" + tipoProcessamento + ", versaoArquivo=" + versaoArquivo + '}';
    }

}
