package carro;

import java.util.Scanner;
public class ConstrutorCarro {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        String placa;
        int numChassi;

        System.out.println("Insira a placa do carro: ");
        placa = ler.nextLine();
        System.out.println("Insira O número do chassi do carro: ");
        numChassi = ler.nextInt();
        Carro carro = new Carro(placa, numChassi);
        System.out.println(carro.getPlaca());
        System.out.println(carro.getNumChassi());


    }
}
