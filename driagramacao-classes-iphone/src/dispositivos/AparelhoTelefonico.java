package dispositivos;

public class AparelhoTelefonico {
    public void ligar() {
        validarSinalOperadora();
        consultarSaldo();
        System.out.println("LIGANDO");
    }
    public void atender() {
        validarSinalOperadora();
        System.out.println("ATENDENDO CHAMADA");
    }
    public void iniciarCorreioVoz() {
        validarSinalOperadora();
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
    //encapsulamento do método 
    private void validarSinalOperadora() {
        System.out.println("VALIDANDO SINAL DA OPERADORA TELEFÔNICA");
    }
    //encapsulamento do método
    private void consultarSaldo() {
        System.out.println("CONSULTANDO SALDO");
    }
}
