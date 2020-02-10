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
package br.com.autogeral.redecard.eevc;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;
import java.time.LocalDate;

/**
 * @see
 * https://www.userede.com.br/content/dam/userede/website/documents/desenvolvedores/extrato-eletr%C3%B4nico/Instru%C3%A7%C3%B5es%20B%C3%A1sicas%20-%20Vendas%20cr%C3%A9dito%20(EEVC)%20-%20Portugu%C3%AAs%20(2).pdf
 * 06/02/2020 21:54:14
 * @author murilotuvani
 */
@Record
public class Registro0002HeaderArquivo {

    private Integer tipoRegistro;
    private Integer dataEmissao;
    private String rede;
    private String extratoEletronicoVendas;
    private String nomeComercial;
    private Integer sequenciaMovimento;
    private Integer nPVgrupoMatriz;
    private String tipoMovimento;
    private String versaoArquivo;
    private String livre;

    @Field(offset = 1, length = 3)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }
  
    @Field(offset = 4, length = 8)
    public Integer getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Integer dataEmissai) {
        this.dataEmissao = dataEmissai;
    }

    @Field(offset = 12, length = 8)
    public String getRede() {
        return rede;
    }

    public void setRede(String rede) {
        this.rede = rede;
    }

    @Field(offset = 20, length = 30)
    public String getExtratoEletronicoVendas() {
        return extratoEletronicoVendas;
    }

    public void setExtratoEletronicoVendas(String extratoEletronicoVendas) {
        this.extratoEletronicoVendas = extratoEletronicoVendas;
    }

    @Field(offset = 050, length = 22)
    public String getNomeComercial() {
        return nomeComercial;
    }

    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }

    @Field(offset = 72, length = 6)
    public Integer getSequenciaMovimento() {
        return sequenciaMovimento;
    }

    public void setSequenciaMovimento(Integer sequenciaMovimento) {
        this.sequenciaMovimento = sequenciaMovimento;
    }

    @Field(offset = 78, length = 9)
    public Integer getnPVgrupoMatriz() {
        return nPVgrupoMatriz;
    }

    public void setnPVgrupoMatriz(Integer nPVgrupoMatriz) {
        this.nPVgrupoMatriz = nPVgrupoMatriz;
    }

    @Field(offset = 87, length = 15)
    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    @Field(offset = 102, length = 20)
    public String getVersaoArquivo() {
        return versaoArquivo;
    }

    public void setVersaoArquivo(String versaoArquivo) {
        this.versaoArquivo = versaoArquivo;
    }

    @Field(offset = 122, length = 903)
    public String getLivre() {
        return livre;
    }

    public void setLivre(String livre) {
        this.livre = livre;
    }

    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "tipoRegistro=" + tipoRegistro + ", dataEmissao=" + dataEmissao + ", rede=" + rede + ", extratoEletronicoVendas=" + extratoEletronicoVendas + ", nomeComercial=" + nomeComercial + ", sequenciaMovimento=" + sequenciaMovimento + ", nPVgrupoMatriz=" + nPVgrupoMatriz + ", tipoMovimento=" + tipoMovimento + ", versaoArquivo=" + versaoArquivo + ", livre=" + livre + '}';
    }
    

}
