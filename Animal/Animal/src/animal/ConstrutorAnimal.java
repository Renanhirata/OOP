package animal;

import java.util.Scanner;
public class ConstrutorAnimal {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        float tamanho;
        String cor;

        System.out.println("Insira a cor do Animal: ");
        cor = ler.nextLine();
        System.out.println("Insira o tamanho do Animal: ");
        tamanho = ler.nextFloat();

        Animal animal = new Animal(tamanho, cor);
        System.out.println(animal.getCor());
        System.out.println(animal.getTamanho());

    }
}
