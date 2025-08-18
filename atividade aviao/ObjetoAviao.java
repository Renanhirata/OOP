import java.util.Scanner;
public class ObjetoAviao {
 public static void main(String[]args){
     Scanner ler = new Scanner(System.in);

     Aviao Aviao1 = new Aviao();
     Aviao Aviao2 = new Aviao();
     Aviao Aviao3 = new Aviao();

     String cor1, cor2, cor3;
     String tipo1, tipo2, tipo3;
     int qntdAssento1, qntdAssento2, qntdAssento3;
     int velocidade1, velocidade2,velocidade3;

     System.out.println("Insira o tipo do 1° Avião");
     tipo1 = ler.nextLine();
     System.out.println("Insira a cor do 1° Avião");
     cor1 = ler.nextLine();
     System.out.println("Insira a velocidade do 1° Avião");
     velocidade1 = ler.nextInt();
     System.out.println("Insira a Quantidade de assentos do 1° Avião");
     qntdAssento1 = ler.nextInt();
     ler.nextLine();
     System.out.println("Insira o tipo do 2° Avião");
     tipo2 = ler.nextLine();
     System.out.println("Insira a cor do 2° Avião");
     cor2 = ler.nextLine();
     System.out.println("Insira a velocidade do 2° Avião");
     velocidade2 = ler.nextInt();
     System.out.println("Insira a Quantidade de assentos do 2° Avião");
     qntdAssento2 = ler.nextInt();
     ler.nextLine();
     System.out.println("Insira o tipo do 3° Avião");
     tipo3 = ler.nextLine();
     System.out.println("Insira a cor do 3° Avião");
     cor3 = ler.nextLine();
     System.out.println("Insira a velocidade do 3° Avião");
     velocidade3 = ler.nextInt();
     System.out.println("Insira a Quantidade de assentos do 3° Avião");
     qntdAssento3 = ler.nextInt();

     Aviao1.setTipo(tipo1);
     Aviao1.setCor(cor1);
     Aviao1.setVelocidade(velocidade1);
     Aviao1.setQntdAssento(qntdAssento1);

     Aviao2.setTipo(tipo2);
     Aviao2.setCor(cor2);
     Aviao2.setVelocidade(velocidade2);
     Aviao2.setQntdAssento(qntdAssento2);

     Aviao3.setTipo(tipo3);
     Aviao3.setCor(cor3);
     Aviao3.setVelocidade(velocidade3);
     Aviao3.setQntdAssento(qntdAssento3);

     System.out.println("----AVIAO N°1----");
     System.out.println("Tipo do Avião N°1: "+ Aviao1.getTipo());
     System.out.println("Cor do Avião N°1: "+ Aviao1.getCor());
     System.out.println("Velocidade do Avião N°1: "+ Aviao1.getVelocidade());
     System.out.println("Quantidade de Assentos do Avião N°1: "+ Aviao1.getQntdAssento());

     System.out.println("----AVIAO N°2----");
     System.out.println("Tipo do Avião N°2: "+ Aviao2.getTipo());
     System.out.println("Cor do Avião N°2: "+ Aviao2.getCor());
     System.out.println("Velocidade do Avião N°2: "+ Aviao2.getVelocidade());
     System.out.println("Quantidade de Assentos do Avião N°2: "+ Aviao2.getQntdAssento());

     System.out.println("----AVIAO N°3----");
     System.out.println("Tipo do Avião N°3: "+ Aviao3.getTipo());
     System.out.println("Cor do Avião N°3: "+ Aviao3.getCor());
     System.out.println("Velocidade do Avião N°3: "+ Aviao3.getVelocidade());
     System.out.println("Quantidade de Assentos do Avião N°3: "+ Aviao3.getQntdAssento());
 }
}
