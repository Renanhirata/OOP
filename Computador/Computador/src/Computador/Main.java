package Computador;

public class Main {
    public static void main(String[]args){
        InterfaceComputador gamer = new Gamer();
        InterfaceComputador home = new Home();

        System.out.println("----COMPUTADOR GAMER----");
        gamer.ligar();
        gamer.desligar();
        gamer.reniciar();
        gamer.carregandoSistemas();

        System.out.println("----COMPUTADOR HOME----");
        home.ligar();
        home.desligar();
        home.reniciar();
        home.carregandoSistemas();
    }
}
