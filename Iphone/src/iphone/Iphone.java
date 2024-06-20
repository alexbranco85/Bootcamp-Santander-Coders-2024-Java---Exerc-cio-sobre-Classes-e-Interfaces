package iphone;
import aparelhotelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void tocarMusica() {
        System.out.println("Tocando música no iPhone");
    }

    public void pausarMusica() {
        System.out.println("Pausando música no iPhone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música no Iphone");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página no Iphone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no Iphone");
    }

    public void ligar() {
        System.out.println("Ligando no Iphone");
    }

    public void atender() {
        System.out.println("Atendendo página no Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz no Iphone");
    }
}