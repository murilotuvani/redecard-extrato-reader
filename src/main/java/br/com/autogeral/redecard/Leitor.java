
package br.com.autogeral.redecard;


import br.com.autogeral.redecard.eefi.*;
import br.com.autogeral.redecard.eevc.*;
import br.com.autogeral.redecard.eevd.*;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 06/02/2020 21:44:28
 *
 * @author murilotuvani
 */
public class Leitor {

    public FixedFormatManager FFM = new FixedFormatManagerImpl();
    private List<ArquivoEEVD> arquivosEEVD;
    private List<ArquivoEEVC> arquivosEEVC;
    private List<ArquivoEEFI> arquivosEEFI;


    private List<ArquivoEEFI> lerArquivosEEFI(File file) {
        return processaLeituraEEFI(file);
    }

    private List<ArquivoEEVC> lerArquivoEEVC(File file) {
        return processaLeituraEEVC(file);
    }

    private List<ArquivoEEVD> lerArquivoEEVD(File i) {
        return processaLeituraEEVD(i);
    }

    public List<?> defineLeitura(File file) {
        try {
            if (file.getName().toLowerCase().contains("eevc")) {
                arquivosEEVC = new ArrayList<>();
                return arquivosEEVC = lerArquivoEEVC(file);
            } else if (file.getName().toLowerCase().contains("eefi")) {
                arquivosEEFI = new ArrayList<>();
                return arquivosEEFI = lerArquivosEEFI(file);
            } else if (file.getName().toLowerCase().contains("eevd")) {
                arquivosEEVD = new ArrayList<>();
                return arquivosEEVD = lerArquivoEEVD(file);
            }
        } catch (Exception e) {

            System.err.println("Arquivo diferente do layout REDE");
        }
        return null;
    }

    private List<ArquivoEEFI> processaLeituraEEFI(File file) {
        List<ArquivoEEFI> arquivoEEFI = new ArrayList<>();
        System.out.println("Lendo : " + file.getAbsolutePath());
        try (InputStream is = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(is, Charset.forName("ISO-8859-1"));
             BufferedReader br = new BufferedReader(isr)) {
            String l;
            while ((l = br.readLine()) != null) {
                arquivoEEFI.add(trataRegistroEEFI(l));
            }
        } catch (IOException ex) {
            System.err.println("Erro ao tentar ler o arquivo");
        }
        return arquivoEEFI;
    }

    private List<ArquivoEEVC> processaLeituraEEVC(File file) {
        List<ArquivoEEVC> arquivoEEVC = new ArrayList<>();
        System.out.println("Lendo : " + file.getAbsolutePath());
        try (InputStream is = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(is, Charset.forName("ISO-8859-1"));
             BufferedReader br = new BufferedReader(isr)) {
            String l;
            while ((l = br.readLine()) != null) {
                arquivoEEVC.add(trataRegistroEEVC(l));
            }
        } catch (IOException ex) {
            System.err.println("Erro ao tentar ler o arquivo");
        }
        return arquivoEEVC;
    }

    public List<ArquivoEEVD> processaLeituraEEVD(File file) {
        List<ArquivoEEVD> arquivoEEVD = new ArrayList<>();
        System.out.println("Lendo : " + file.getAbsolutePath());
        try (InputStream is = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(is, Charset.forName("ISO-8859-1"));
             BufferedReader br = new BufferedReader(isr)) {
            String l;
            while ((l = br.readLine()) != null) {
                arquivoEEVD.add(trataRegistroEEVD(l));
            }
        } catch (IOException ex) {
            System.err.println("Erro ao tentar ler o arquivo");
        }
        return arquivoEEVD;
    }

    private ArquivoEEVC trataRegistroEEVC(String l) {
        String tipoRegistro = l.substring(0, 3);
        switch (tipoRegistro) {
            case "002": {
                Registro002HeaderArquivo recordHeader = FFM.load(Registro002HeaderArquivo.class, l);
                return recordHeader;
            }
            case "004": {
                Registro004HeaderMatriz headerMatriz = FFM.load(Registro004HeaderMatriz.class, l);
                return headerMatriz;
            }
            case "005": {
                Registro005Request request = FFM.load(Registro005Request.class, l);
                return request;
            }
            case "006": {
                Registro006RVrotativo registro006Rotativo = FFM.load(Registro006RVrotativo.class, l);
                return registro006Rotativo;
            }
            case "008": {
                Registro008CVnsuRotativo registroRotativo = FFM.load(Registro008CVnsuRotativo.class, l);
                return registroRotativo;
            }
            case "010": {
                Registro010RVparceladosemJuros recordParceladosemJuros = FFM.load(Registro010RVparceladosemJuros.class, l);
                return recordParceladosemJuros;
            }
            case "011": {
                Registro011ExtratoEletronicoVendas extratoEletronico = FFM.load(Registro011ExtratoEletronicoVendas.class, l);
                return extratoEletronico;
            }
            case "012": {
                Registro12CVnsuparceladosemJuros registro12ParceladosemJuros = FFM.load(Registro12CVnsuparceladosemJuros.class, l);
                return registro12ParceladosemJuros;
            }
            case "014": {
                Registro014ParcelosemJuros registro014ParceladosemJuros = FFM.load(Registro014ParcelosemJuros.class, l);
                return registro014ParceladosemJuros;
            }
            case "026": {
                Registro026TotalizadorMatriz registro026Matriz = FFM.load(Registro026TotalizadorMatriz.class, l);
                return registro026Matriz;
            }
            case "028": {
                Registro028TrailerArquivo trailerArquivo = FFM.load(Registro028TrailerArquivo.class, l);
                return trailerArquivo;
            }
            default:
                return null;
        }
    }

    public ArquivoEEVD trataRegistroEEVD(String l) {
        String tipoRegistro = l.substring(0, 3);
        switch (tipoRegistro) {
            case "00,": {
                l = l.replace(",", "");
                Registro00CabecalhoArquivo cabecalho = FFM.load(Registro00CabecalhoArquivo.class, l);
                return cabecalho;
            }
            case "01,": {
                l = l.replace(",", "");
                RegistroTipo01ResumoVendas resumoVendas = FFM.load(RegistroTipo01ResumoVendas.class, l);
                return resumoVendas;
            }
            case "02,": {
                l = l.replace(",", "");
                RegistroTipo02TotalpontoVenda totalPontoVenda = FFM.load(RegistroTipo02TotalpontoVenda.class, l);
                return totalPontoVenda;
            }
            case "03,": {
                l = l.replace(",", "");
                RegistroTipo03TotalMatriz totalMatriz = FFM.load(RegistroTipo03TotalMatriz.class, l);
                return totalMatriz;
            }
            case "04,": {
                l = l.replace(",", "");
                RegistroTipo04TotalArquivo totalArquivo = FFM.load(RegistroTipo04TotalArquivo.class, l);
                return totalArquivo;
            }
            case "05,": {
                l = l.replace(",", "");
                RegistroTipo05DetalhamentoComprovantes detalhamento = FFM.load(RegistroTipo05DetalhamentoComprovantes.class, l);
                return detalhamento;
            }
            case "011": {
                RegistroTipo11AjustesNet ajusteNet = FFM.load(RegistroTipo11AjustesNet.class, l);
                return ajusteNet;
            }
            default:
                return null;
        }
    }

    private ArquivoEEFI trataRegistroEEFI(String l) {
        System.out.println("Linha :" + l);
        String tipoRegistro = l.substring(0, 3);
        switch (tipoRegistro) {

            case "030": {
                Registro030HeaderArquivo registroHeader = FFM.load(Registro030HeaderArquivo.class, l);
                return registroHeader;
            }
            case "032": {
                Registro032HeaderMatriz headerMatriz = FFM.load(Registro032HeaderMatriz.class, l);
                return headerMatriz;
            }
            case "034": {
                Registro034Creditos registroCreditos = FFM.load(Registro034Creditos.class, l);
                return registroCreditos;
            }
            case "035": {
                Registro035AjustesNetDesagendamentos ajustes = FFM.load(Registro035AjustesNetDesagendamentos.class, l);
                return ajustes;
            }
            case "037": {
                Registro037TotalizadorCreditos totalizador = FFM.load(Registro037TotalizadorCreditos.class, l);
                return totalizador;
            }
            case "040": {
                Registro040Serasa cvNSURecarga = FFM.load(Registro040Serasa.class, l);
                return cvNSURecarga;
            }
            case "043": {
                Registro043AjustesCredito ajustesCredito = FFM.load(Registro043AjustesCredito.class, l);
                return ajustesCredito;
            }
            case "044": {
                Registro044DebitosPendentes debitosPendentes = FFM.load(Registro044DebitosPendentes.class, l);
                return debitosPendentes;
            }
            case "045": {
                Registro045DebitosLiquidados debitosPendentes = FFM.load(Registro045DebitosLiquidados.class, l);
                return debitosPendentes;
            }
            case "049": {
                Registro049DesagendamentodeParcelas cvNSURecarga = FFM.load(Registro049DesagendamentodeParcelas.class, l);
                return cvNSURecarga;
            }
            case "050": {
                Registro050TotalizadorMatriz totalizadorMatriz = FFM.load(Registro050TotalizadorMatriz.class, l);
                return totalizadorMatriz;
            }
            case "052": {
                Registro052TrailerArquivo trailerMatriz = FFM.load(Registro052TrailerArquivo.class, l);
                return trailerMatriz;
            }
            default:
                return null;
        }
    }
}
