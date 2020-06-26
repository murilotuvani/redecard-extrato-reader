package br.com.autogeral.redecard.eevc;

import br.com.autogeral.redecard.ArquivoEEVC;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * 12/02/2020 09:05:20
 *
 * @author kaique.mota
 */
@Record
public class Registro021SecureCode implements ArquivoEEVC {

    private Integer tipoRegistro;
    private Integer numeroPV;
    private Integer quantidadeConsultasRealizadas;
    private Integer dataConsulta;
    private String bandeira;

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
    public Integer getQuantidadeConsultasRealizadas() {
        return quantidadeConsultasRealizadas;
    }

    public void setQuantidadeConsultasRealizadas(Integer quantidadeConsultasRealizadas) {
        this.quantidadeConsultasRealizadas = quantidadeConsultasRealizadas;
    }

    @Field(offset = 18, length = 8)
    public Integer getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Integer dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    @Field(offset = 26, length = 1)
    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

}
