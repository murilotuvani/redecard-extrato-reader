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
package br.com.autogeral.redecard.eevd;

import br.com.autogeral.redecard.ArquivoEEVD;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * 18/02/2020 08:00:58
 *
 * @author kaique.mota
 * @see https://www.userede.com.br/novo/documentos
 */
@Record
public class RegistroTipo02TotalpontoVenda implements ArquivoEEVD {

    private Integer tipoRegistro;
    private Integer numeroFiliacaoMatriz;
    private Integer quantidadeResumovendasAcatados;
    private Integer quantidadeComprovantesVendas;
    private Double totalBruto;
    private Double totalDesconto;
    private Double totalLiquido;
    private Double valorBrutopreDatado;
    private Double descontoPreDatado;
    private Double liquidoPreDatado;

    @Field(offset = 1, length = 2)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 3, length = 9)
    public Integer getNumeroFiliacaoMatriz() {
        return numeroFiliacaoMatriz;
    }

    public void setNumeroFiliacaoMatriz(Integer numeroFiliacaoMatriz) {
        this.numeroFiliacaoMatriz = numeroFiliacaoMatriz;
    }

    @Field(offset = 12, length = 3)
    public Integer getQuantidadeResumovendasAcatados() {
        return quantidadeResumovendasAcatados;
    }

    public void setQuantidadeResumovendasAcatados(Integer quantidadeResumovendasAcatados) {
        this.quantidadeResumovendasAcatados = quantidadeResumovendasAcatados;
    }

    @Field(offset = 15, length = 6)
    public Integer getQuantidadeComprovantesVendas() {
        return quantidadeComprovantesVendas;
    }

    public void setQuantidadeComprovantesVendas(Integer quantidadeComprovantesVendas) {
        this.quantidadeComprovantesVendas = quantidadeComprovantesVendas;
    }

    @Field(offset = 21, length = 15)
    public Double getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(Double totalBruto) {
        this.totalBruto = totalBruto;
    }

    @Field(offset = 36, length = 15)
    public Double getTotalDesconto() {
        return totalDesconto;
    }

    public void setTotalDesconto(Double totalDesconto) {
        this.totalDesconto = totalDesconto;
    }

    @Field(offset = 51, length = 15)
    public Double getTotalLiquido() {
        return totalLiquido;
    }

    public void setTotalLiquido(Double totalLiquido) {
        this.totalLiquido = totalLiquido;
    }

    @Field(offset = 66, length = 15)
    public Double getValorBrutopreDatado() {
        return valorBrutopreDatado;
    }

    public void setValorBrutopreDatado(Double valorBrutopreDatado) {
        this.valorBrutopreDatado = valorBrutopreDatado;
    }

    @Field(offset = 71, length = 15)
    public Double getDescontoPreDatado() {
        return descontoPreDatado;
    }

    public void setDescontoPreDatado(Double descontoPreDatado) {
        this.descontoPreDatado = descontoPreDatado;
    }

    @Field(offset = 86, length = 15)
    public Double getLiquidoPreDatado() {
        return liquidoPreDatado;
    }

    public void setLiquidoPreDatado(Double liquidoPreDatado) {
        this.liquidoPreDatado = liquidoPreDatado;
    }

    @Override
    public String toString() {
        return "RegistroTipo02TotalpontoVenda{" + "tipoRegistro=" + tipoRegistro + ", numeroFiliacaoMatriz=" + numeroFiliacaoMatriz + ", quantidadeResumovendasAcatados=" + quantidadeResumovendasAcatados + ", quantidadeComprovantesVendas=" + quantidadeComprovantesVendas + ", totalBruto=" + totalBruto + ", totalDesconto=" + totalDesconto + ", totalLiquido=" + totalLiquido + ", valorBrutopreDatado=" + valorBrutopreDatado + ", descontoPreDatado=" + descontoPreDatado + ", liquidoPreDatado=" + liquidoPreDatado + '}';
    }

	@Override
	public Integer getRegistro() {
		return tipoRegistro;
	}

}
