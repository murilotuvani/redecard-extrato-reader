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
package br.com.autogeral.redecard;

import br.com.autogeral.redecar.eefi.Registro030HeaderArquivo;
import br.com.autogeral.redecar.eefi.Registro032HeaderMatriz;
import br.com.autogeral.redecar.eefi.Registro034Creditos;
import br.com.autogeral.redecar.eefi.Registro035AjustesNetDesagendamentos;
import br.com.autogeral.redecar.eefi.Registro037TotalizadorCreditos;
import br.com.autogeral.redecar.eefi.Registro040Serasa;
import br.com.autogeral.redecar.eefi.Registro043AjustesCredito;
import br.com.autogeral.redecar.eefi.Registro044DebitosPendentes;
import br.com.autogeral.redecar.eefi.Registro045DebitosLiquidados;
import br.com.autogeral.redecar.eefi.Registro049DesagendamentodeParcelas;
import br.com.autogeral.redecar.eefi.Registro050TotalizadorMatriz;
import br.com.autogeral.redecar.eefi.Registro052TrailerArquivo;
import br.com.autogeral.redecard.eevc.Registro002HeaderArquivo;
import br.com.autogeral.redecard.eevc.Registro004HeaderMatriz;
import br.com.autogeral.redecard.eevc.Registro005Request;
import br.com.autogeral.redecard.eevc.Registro006RVrotativo;
import br.com.autogeral.redecard.eevc.Registro008CVnsuRotativo;
import br.com.autogeral.redecard.eevc.Registro010RVparceladosemJuros;
import br.com.autogeral.redecard.eevc.Registro011ExtratoEletronicoVendas;
import br.com.autogeral.redecard.eevc.Registro014ParcelosemJuros;
import br.com.autogeral.redecard.eevc.Registro026TotalizadorMatriz;
import br.com.autogeral.redecard.eevc.Registro028TrailerArquivo;
import br.com.autogeral.redecard.eevc.Registro12CVnsuparceladosemJuros;
import br.com.autogeral.redecard.eevd.Registro00CabecalhoArquivo;
import br.com.autogeral.redecard.eevd.RegistroTipo01ResumoVendas;
import br.com.autogeral.redecard.eevd.RegistroTipo02TotalpontoVenda;
import br.com.autogeral.redecard.eevd.RegistroTipo03TotalMatriz;
import br.com.autogeral.redecard.eevd.RegistroTipo04TotalArquivo;
import br.com.autogeral.redecard.eevd.RegistroTipo05DetalhamentoComprovantes;
import br.com.autogeral.redecard.eevd.RegistroTipo11AjustesNet;

/**
 * 26/02/2020 08:32:10
 *
 * @author kaique.mota
 */
public class Data {

    private Registro00CabecalhoArquivo registro00Cabecalho;
    private RegistroTipo01ResumoVendas registro01esumoVendas;
    private RegistroTipo02TotalpontoVenda registroTipo02TotalpontoVenda;
    private RegistroTipo03TotalMatriz registroTipo03totalMatriz;
    private Registro002HeaderArquivo registro002recordHeader;
    private RegistroTipo04TotalArquivo registroTipo04totalArquivo;
    private Registro004HeaderMatriz Registro004headerMatriz;
    private Registro005Request registro005request;
    private RegistroTipo05DetalhamentoComprovantes registroTipo05DetalhamentoComprovantes;
    private Registro006RVrotativo registro006Rotativo;
    private Registro008CVnsuRotativo registro008Rotativo;
    private Registro010RVparceladosemJuros registro010recordParceladosemJuros;
    private RegistroTipo11AjustesNet registroTipo11ajusteNet;
    private Registro011ExtratoEletronicoVendas registro011extratoEletronico;
    private Registro12CVnsuparceladosemJuros registro12ParceladosemJuros;
    private Registro014ParcelosemJuros registro014ParceladosemJuros;
    private Registro026TotalizadorMatriz registro026Matriz;
    private Registro028TrailerArquivo trailerArquivo;
    private Registro030HeaderArquivo registroHeader;
    private Registro032HeaderMatriz headerMatriz;
    private Registro034Creditos registroCreditos;
    private Registro035AjustesNetDesagendamentos ajustes;
    private Registro037TotalizadorCreditos totalizador;
    private Registro040Serasa cvNSURecarga;
    private Registro043AjustesCredito ajustesCredito;
    private Registro044DebitosPendentes debitosPendentes;
    private Registro045DebitosLiquidados registro045debitosPendentes;
    private Registro049DesagendamentodeParcelas registro049cvNSURecarga;
    private Registro050TotalizadorMatriz totalizadorMatriz;
    private Registro052TrailerArquivo trailerMatriz;

    public Registro00CabecalhoArquivo getRegistro00Cabecalho() {
        return registro00Cabecalho;
    }

    public void setRegistro00Cabecalho(Registro00CabecalhoArquivo registro00Cabecalho) {
        this.registro00Cabecalho = registro00Cabecalho;
    }

    public RegistroTipo01ResumoVendas getRegistro01esumoVendas() {
        return registro01esumoVendas;
    }

    public void setRegistro01esumoVendas(RegistroTipo01ResumoVendas registro01esumoVendas) {
        this.registro01esumoVendas = registro01esumoVendas;
    }

    public RegistroTipo02TotalpontoVenda getRegistroTipo02TotalpontoVenda() {
        return registroTipo02TotalpontoVenda;
    }

    public void setRegistroTipo02TotalpontoVenda(RegistroTipo02TotalpontoVenda registroTipo02TotalpontoVenda) {
        this.registroTipo02TotalpontoVenda = registroTipo02TotalpontoVenda;
    }

    public RegistroTipo03TotalMatriz getRegistroTipo03totalMatriz() {
        return registroTipo03totalMatriz;
    }

    public void setRegistroTipo03totalMatriz(RegistroTipo03TotalMatriz registroTipo03totalMatriz) {
        this.registroTipo03totalMatriz = registroTipo03totalMatriz;
    }

    public Registro002HeaderArquivo getRegistro002recordHeader() {
        return registro002recordHeader;
    }

    public void setRegistro002recordHeader(Registro002HeaderArquivo registro002recordHeader) {
        this.registro002recordHeader = registro002recordHeader;
    }

    public RegistroTipo04TotalArquivo getRegistroTipo04totalArquivo() {
        return registroTipo04totalArquivo;
    }

    public void setRegistroTipo04totalArquivo(RegistroTipo04TotalArquivo registroTipo04totalArquivo) {
        this.registroTipo04totalArquivo = registroTipo04totalArquivo;
    }

    public Registro004HeaderMatriz getRegistro004headerMatriz() {
        return Registro004headerMatriz;
    }

    public void setRegistro004headerMatriz(Registro004HeaderMatriz Registro004headerMatriz) {
        this.Registro004headerMatriz = Registro004headerMatriz;
    }

    public Registro005Request getRegistro005request() {
        return registro005request;
    }

    public void setRegistro005request(Registro005Request registro005request) {
        this.registro005request = registro005request;
    }

    public RegistroTipo05DetalhamentoComprovantes getRegistroTipo05DetalhamentoComprovantes() {
        return registroTipo05DetalhamentoComprovantes;
    }

    public void setRegistroTipo05DetalhamentoComprovantes(RegistroTipo05DetalhamentoComprovantes registroTipo05DetalhamentoComprovantes) {
        this.registroTipo05DetalhamentoComprovantes = registroTipo05DetalhamentoComprovantes;
    }

    public Registro006RVrotativo getRegistro006Rotativo() {
        return registro006Rotativo;
    }

    public void setRegistro006Rotativo(Registro006RVrotativo registro006Rotativo) {
        this.registro006Rotativo = registro006Rotativo;
    }

    public Registro008CVnsuRotativo getRegistro008Rotativo() {
        return registro008Rotativo;
    }

    public void setRegistro008Rotativo(Registro008CVnsuRotativo registro008Rotativo) {
        this.registro008Rotativo = registro008Rotativo;
    }

    public Registro010RVparceladosemJuros getRegistro010recordParceladosemJuros() {
        return registro010recordParceladosemJuros;
    }

    public void setRegistro010recordParceladosemJuros(Registro010RVparceladosemJuros registro010recordParceladosemJuros) {
        this.registro010recordParceladosemJuros = registro010recordParceladosemJuros;
    }

    public RegistroTipo11AjustesNet getRegistroTipo11ajusteNet() {
        return registroTipo11ajusteNet;
    }

    public void setRegistroTipo11ajusteNet(RegistroTipo11AjustesNet registroTipo11ajusteNet) {
        this.registroTipo11ajusteNet = registroTipo11ajusteNet;
    }

    public Registro011ExtratoEletronicoVendas getRegistro011extratoEletronico() {
        return registro011extratoEletronico;
    }

    public void setRegistro011extratoEletronico(Registro011ExtratoEletronicoVendas registro011extratoEletronico) {
        this.registro011extratoEletronico = registro011extratoEletronico;
    }

    public Registro12CVnsuparceladosemJuros getRegistro12ParceladosemJuros() {
        return registro12ParceladosemJuros;
    }

    public void setRegistro12ParceladosemJuros(Registro12CVnsuparceladosemJuros registro12ParceladosemJuros) {
        this.registro12ParceladosemJuros = registro12ParceladosemJuros;
    }

    public Registro014ParcelosemJuros getRegistro014ParceladosemJuros() {
        return registro014ParceladosemJuros;
    }

    public void setRegistro014ParceladosemJuros(Registro014ParcelosemJuros registro014ParceladosemJuros) {
        this.registro014ParceladosemJuros = registro014ParceladosemJuros;
    }

    public Registro026TotalizadorMatriz getRegistro026Matriz() {
        return registro026Matriz;
    }

    public void setRegistro026Matriz(Registro026TotalizadorMatriz registro026Matriz) {
        this.registro026Matriz = registro026Matriz;
    }

    public Registro028TrailerArquivo getTrailerArquivo() {
        return trailerArquivo;
    }

    public void setTrailerArquivo(Registro028TrailerArquivo trailerArquivo) {
        this.trailerArquivo = trailerArquivo;
    }

    public Registro030HeaderArquivo getRegistroHeader() {
        return registroHeader;
    }

    public void setRegistroHeader(Registro030HeaderArquivo registroHeader) {
        this.registroHeader = registroHeader;
    }

    public Registro032HeaderMatriz getHeaderMatriz() {
        return headerMatriz;
    }

    public void setHeaderMatriz(Registro032HeaderMatriz headerMatriz) {
        this.headerMatriz = headerMatriz;
    }

    public Registro034Creditos getRegistroCreditos() {
        return registroCreditos;
    }

    public void setRegistroCreditos(Registro034Creditos registroCreditos) {
        this.registroCreditos = registroCreditos;
    }

    public Registro035AjustesNetDesagendamentos getAjustes() {
        return ajustes;
    }

    public void setAjustes(Registro035AjustesNetDesagendamentos ajustes) {
        this.ajustes = ajustes;
    }

    public Registro037TotalizadorCreditos getTotalizador() {
        return totalizador;
    }

    public void setTotalizador(Registro037TotalizadorCreditos totalizador) {
        this.totalizador = totalizador;
    }

    public Registro040Serasa getCvNSURecarga() {
        return cvNSURecarga;
    }

    public void setCvNSURecarga(Registro040Serasa cvNSURecarga) {
        this.cvNSURecarga = cvNSURecarga;
    }

    public Registro043AjustesCredito getAjustesCredito() {
        return ajustesCredito;
    }

    public void setAjustesCredito(Registro043AjustesCredito ajustesCredito) {
        this.ajustesCredito = ajustesCredito;
    }

    public Registro044DebitosPendentes getDebitosPendentes() {
        return debitosPendentes;
    }

    public void setDebitosPendentes(Registro044DebitosPendentes debitosPendentes) {
        this.debitosPendentes = debitosPendentes;
    }

    public Registro045DebitosLiquidados getRegistro045debitosPendentes() {
        return registro045debitosPendentes;
    }

    public void setRegistro045debitosPendentes(Registro045DebitosLiquidados registro045debitosPendentes) {
        this.registro045debitosPendentes = registro045debitosPendentes;
    }

    public Registro049DesagendamentodeParcelas getRegistro049cvNSURecarga() {
        return registro049cvNSURecarga;
    }

    public void setRegistro049cvNSURecarga(Registro049DesagendamentodeParcelas registro049cvNSURecarga) {
        this.registro049cvNSURecarga = registro049cvNSURecarga;
    }

    public Registro050TotalizadorMatriz getTotalizadorMatriz() {
        return totalizadorMatriz;
    }

    public void setTotalizadorMatriz(Registro050TotalizadorMatriz totalizadorMatriz) {
        this.totalizadorMatriz = totalizadorMatriz;
    }

    public Registro052TrailerArquivo getTrailerMatriz() {
        return trailerMatriz;
    }

    public void setTrailerMatriz(Registro052TrailerArquivo trailerMatriz) {
        this.trailerMatriz = trailerMatriz;
    }
    
    
}
