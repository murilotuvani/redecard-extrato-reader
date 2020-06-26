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
public class Registro040Serasa implements ArquivoEEFI {

    private Integer tipoRegistro;
    private Integer numeroPV;
    private Integer quantidadeConsultasRealizadasPeriodo;
    private Double valorTotalConsultasPeriodo;
    private Date inicioPeriodoConsulta;
    private Date fimPeriodoConsulta;
    private Double valorConsultaPeriodo;

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

    @Field(offset = 13, length = 5)
    public Integer getQuantidadeConsultasRealizadasPeriodo() {
        return quantidadeConsultasRealizadasPeriodo;
    }

    public void setQuantidadeConsultasRealizadasPeriodo(Integer quantidadeConsultasRealizadasPeriodo) {
        this.quantidadeConsultasRealizadasPeriodo = quantidadeConsultasRealizadasPeriodo;
    }

    @Field(offset = 18, length = 15)
    public Double getValorTotalConsultasPeriodo() {
        return valorTotalConsultasPeriodo;
    }

    public void setValorTotalConsultasPeriodo(Double valorTotalConsultasPeriodo) {
        this.valorTotalConsultasPeriodo = valorTotalConsultasPeriodo;
    }

    @Field(offset = 33, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getInicioPeriodoConsulta() {
        return inicioPeriodoConsulta;
    }

    public void setInicioPeriodoConsulta(Date inicioPeriodoConsulta) {
        this.inicioPeriodoConsulta = inicioPeriodoConsulta;
    }

    @Field(offset = 41, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getFimPeriodoConsulta() {
        return fimPeriodoConsulta;
    }

    public void setFimPeriodoConsulta(Date fimPeriodoConsulta) {
        this.fimPeriodoConsulta = fimPeriodoConsulta;
    }

    @Field(offset = 49, length = 15)
    public Double getValorConsultaPeriodo() {
        return valorConsultaPeriodo;
    }

    public void setValorConsultaPeriodo(Double valorConsultaPeriodo) {
        this.valorConsultaPeriodo = valorConsultaPeriodo;
    }

    @Override
    public String toString() {
        return "Registro040Serasa{" + "tipoRegistro=" + tipoRegistro + ", numeroPV=" + numeroPV + ", quantidadeConsultasRealizadasPeriodo=" + quantidadeConsultasRealizadasPeriodo + ", valorTotalConsultasPeriodo=" + valorTotalConsultasPeriodo + ", inicioPeriodoConsulta=" + inicioPeriodoConsulta + ", fimPeriodoConsulta=" + fimPeriodoConsulta + ", valorConsultaPeriodo=" + valorConsultaPeriodo + '}';
    }

}
