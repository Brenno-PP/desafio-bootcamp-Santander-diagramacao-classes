package dispositivos;

public class Iphone {
    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        ReprodutorMusical mp3Player = new ReprodutorMusical();
        mp3Player.tocarMusica();
        mp3Player.pausarMusica();
        mp3Player.selecionarMusica();

        NavegadorNaInternet navegador = new NavegadorNaInternet();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
