
package br.com.autogeral.redecard.eefi;

import br.com.autogeral.redecard.ArquivoEEFI;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * @author Kaique
 * @see https://www.userede.com.br/pt-BR/produtosservicos/Documents/Extrato_Eletronico/0208_EEFI_Rede_0263_ExtratosOnlineFinanciamento(portugues).pdf
 */
@Record
public class Registro050TotalizadorMatriz implements ArquivoEEFI {

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
