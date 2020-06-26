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
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;
import java.util.Date;

/**
 * 18/02/2020 08:01:56
 *
 * @see https://www.userede.com.br/novo/documentos
 * @author kaique.mota
 */
@Record
public class RegistroTipo05DetalhamentoComprovantes implements ArquivoEEVD {

    private Integer tipoRegistro;
    private Integer numeroFiliacaoPontovenda;
    private Integer numeroResumoVendas;
    private Date dataCV;
    private Double valorBruto;
    private Double valorDesconto;
    private Double valorLiquido;
    private String numeroCartao;
    private String tipoTransacao;
    private Integer numeroCV;
    private Date dataCredito;
    private Integer statusTransacao;
    private Integer horaTransacao;
    private String numeroTerminal;
    private Integer tipoCaptura;
    private Integer reservado;
    private Double valorCompra;
    private Double valorSaque;
    private String bandeira;

    @Field(offset = 1, length = 2)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 3, length = 9)
    public Integer getNumeroFiliacaoPontovenda() {
        return numeroFiliacaoPontovenda;
    }

    public void setNumeroFiliacaoPontovenda(Integer numeroFiliacaoPontovenda) {
        this.numeroFiliacaoPontovenda = numeroFiliacaoPontovenda;
    }

    @Field(offset = 12, length = 9)
    public Integer getNumeroResumoVendas() {
        return numeroResumoVendas;
    }

    public void setNumeroResumoVendas(Integer numeroResumoVendas) {
        this.numeroResumoVendas = numeroResumoVendas;
    }

    @Field(offset = 21, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCV() {
        return dataCV;
    }

    public void setDataCV(Date dataCV) {
        this.dataCV = dataCV;
    }

    @Field(offset = 29, length = 15)
    public Double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(Double valorBruto) {
        this.valorBruto = valorBruto;
    }

    @Field(offset = 44, length = 15)
    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Field(offset = 59, length = 15)
    public Double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(Double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    @Field(offset = 74, length = 19)
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Field(offset = 93, length = 1)
    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    @Field(offset = 94, length = 12)
    public Integer getNumeroCV() {
        return numeroCV;
    }

    public void setNumeroCV(Integer numeroCV) {
        this.numeroCV = numeroCV;
    }

    @Field(offset = 106, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
    }

    @Field(offset = 114, length = 2)
    public Integer getStatusTransacao() {
        return statusTransacao;
    }

    public void setStatusTransacao(Integer statusTransacao) {
        this.statusTransacao = statusTransacao;
    }

    @Field(offset = 116, length = 6)
    public Integer getHoraTransacao() {
        return horaTransacao;
    }

    public void setHoraTransacao(Integer horaTransacao) {
        this.horaTransacao = horaTransacao;
    }
    @Field(offset = 122, length = 8)
    public String getNumeroTerminal() {
        return numeroTerminal;
    }

    public void setNumeroTerminal(String numeroTerminal) {
        this.numeroTerminal = numeroTerminal;
    }
    @Field(offset = 130, length = 2)
    public Integer getTipoCaptura() {
        return tipoCaptura;
    }

    public void setTipoCaptura(Integer tipoCaptura) {
        this.tipoCaptura = tipoCaptura;
    }
    @Field(offset = 132, length = 5)
    public Integer getReservado() {
        return reservado;
    }

    public void setReservado(Integer reservado) {
        this.reservado = reservado;
    }
    @Field(offset = 137, length = 15)
    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }
    @Field(offset = 152, length = 15)
    public Double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(Double valorSaque) {
        this.valorSaque = valorSaque;
    }
    @Field(offset = 167, length = 1)
    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    @Override
    public String toString() {
        return "RegistroTipo05DetalhamentoComprovantes{" + "tipoRegistro=" + tipoRegistro + ", numeroFiliacaoPontovenda=" + numeroFiliacaoPontovenda + ", numeroResumoVendas=" + numeroResumoVendas + ", dataCV=" + dataCV + ", valorBruto=" + valorBruto + ", valorDesconto=" + valorDesconto + ", valorLiquido=" + valorLiquido + ", numeroCartao=" + numeroCartao + ", tipoTransacao=" + tipoTransacao + ", numeroCV=" + numeroCV + ", dataCredito=" + dataCredito + ", statusTransacao=" + statusTransacao + ", horaTransacao=" + horaTransacao + ", numeroTerminal=" + numeroTerminal + ", tipoCaptura=" + tipoCaptura + ", reservado=" + reservado + ", valorCompra=" + valorCompra + ", valorSaque=" + valorSaque + ", bandeira=" + bandeira + '}';
    }

	@Override
	public Integer getRegistro() {
		return tipoRegistro;
	}
    

}
