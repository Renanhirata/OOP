package Computador;

public class Home implements InterfaceComputador{

    @Override
    public void ligar() {
        System.out.println("O Computador home está ligando.");
    }
    @Override
    public void reniciar() {
        System.out.println("O Computador home está reniciando.");
    }
    @Override
    public void desligar() {
        System.out.println("O Computador home está desligando.");
    }
    @Override
    public void carregandoSistemas() {
        System.out.println("O Computador home está Carregando Sistemas.");
    }
}

