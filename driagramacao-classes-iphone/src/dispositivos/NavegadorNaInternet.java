package dispositivos;

public class NavegadorNaInternet {
    public void exibirPagina() {
        validarConexaoInternet();
        System.out.println("EXIBINDO PAGINA DA INTERNET");
    }
    public void adicionarNovaAba() {
        validarConexaoInternet();
        System.out.println("ADICIONANDO NOVA ABA NO NAVEGADOR");
    }
    public void atualizarPagina() {
        validarConexaoInternet();
        System.out.println("ATUALIZANDO PÁGINA DA INTERNET");
    }
    //encapsulamento do método
    private void validarConexaoInternet() {
        System.out.println("VALIDANDO CONEXÃO COM A INTERNET");
    }
}
