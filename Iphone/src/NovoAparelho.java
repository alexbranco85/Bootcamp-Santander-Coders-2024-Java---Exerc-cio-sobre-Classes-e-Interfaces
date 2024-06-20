import aparelhotelefonico.AparelhoTelefonico;
import iphone.Iphone;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.Ipod;
import reprodutorMusical.ReprodutorMusical;

public class NovoAparelho {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        NavegadorInternet navegador = iphone;
        ReprodutorMusical reprodutormusical = iphone;
        AparelhoTelefonico telefone = iphone;

        // ** Funções do telefone
        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorreioVoz();

        // ** Funções do ipod
        reprodutormusical.tocarMusica();
        reprodutormusical.pausarMusica();
        reprodutormusical.selecionarMusica();

        // ** Funções de Internet
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        // ** ou posso chamar diretamente utilizando o iphone sem instanciar cada interface
        // ** Funções do telefone
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        // ** Funções do ipod
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        // ** Funções de Internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // ** Caso não fosse um iphone e fosse apenas um ipod
        Ipod ipod = new Ipod();

        ipod.tocarMusica();
        ipod.pausarMusica();
        ipod.selecionarMusica();

    }
}
