package Computador;

public class Gamer implements InterfaceComputador{

    @Override
    public void ligar() {
        System.out.println("O Computador gamer está ligando.");
    }
    @Override
    public void reniciar() {
        System.out.println("O Computador gamer está reniciando.");
    }
    @Override
    public void desligar() {
        System.out.println("O Computador gamer está desligando.");
    }
    @Override
    public void carregandoSistemas() {
        System.out.println("O Computador gamer está Carregando Sistemas.");
    }
}