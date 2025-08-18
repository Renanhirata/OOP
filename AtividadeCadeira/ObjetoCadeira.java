import java.util.Scanner;
public class ObjetoCadeira {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        Cadeira Cadeira1 = new Cadeira();
        Cadeira Cadeira2 = new Cadeira();
        Cadeira Cadeira3 = new Cadeira();

        String material1, material2, material3;
        String cor1, cor2, cor3;
        String tipo1, tipo2, tipo3;
        int durabilidade1, durabilidade2, durabilidade3;
        double preco1, preco2, preco3;

        System.out.println("Insira o material da 1° Cadeira: ");
        material1 = ler.nextLine();
        System.out.println("Insira a cor da 1° Cadeira: ");
        cor1 = ler.nextLine();
        System.out.println("Insira o tipo da 1° Cadeira: ");
        tipo1 = ler.nextLine();
        System.out.println("Insira a durbailidade da 1° Cadeira: ");
        durabilidade1 = ler.nextInt();
        System.out.println("Insira o preco da 1° Cadeira: ");
        preco1 = ler.nextDouble();


        System.out.println("Insira o material da 2° Cadeira: ");
        material2 = ler.nextLine();
        ler.nextLine();
        System.out.println("Insira a cor da 2° Cadeira: ");
        cor2 = ler.nextLine();
        System.out.println("Insira o tipo da 2° Cadeira: ");
        tipo2 = ler.nextLine();
        System.out.println("Insira a durbailidade da 2° Cadeira: ");
        durabilidade2 = ler.nextInt();
        System.out.println("Insira o preco da 2° Cadeira: ");
        preco2 = ler.nextDouble();

        System.out.println("Insira o material da 3° Cadeira: ");
        material3 = ler.nextLine();
        ler.nextLine();
        System.out.println("Insira a cor da 3° Cadeira: ");
        cor3 = ler.nextLine();
        System.out.println("Insira o tipo da 3° Cadeira: ");
        tipo3 = ler.nextLine();
        System.out.println("Insira a durbailidade da 3° Cadeira: ");
        durabilidade3 = ler.nextInt();
        System.out.println("Insira o preco da 3° Cadeira: ");
        preco3 = ler.nextDouble();

        Cadeira1.setMaterial(material1);
        Cadeira1.setCor(cor1);
        Cadeira1.setTipo(tipo1);
        Cadeira1.setDurabilidade(durabilidade1);
        Cadeira1.setPreco(preco1);

        Cadeira2.setMaterial(material2);
        Cadeira2.setCor(cor2);
        Cadeira2.setTipo(tipo2);
        Cadeira2.setDurabilidade(durabilidade2);
        Cadeira2.setPreco(preco2);

        Cadeira3.setMaterial(material3);
        Cadeira3.setCor(cor3);
        Cadeira3.setTipo(tipo3);
        Cadeira3.setDurabilidade(durabilidade3);
        Cadeira3.setPreco(preco3);

        System.out.println("----CADEIRA N°1----");
        System.out.println("Material da 1° Cadeira: " +Cadeira1.getMaterial());
        System.out.println("Cor da 1° Cadeira: " +Cadeira1.getCor());
        System.out.println("Tipo da 1° Cadeira: " +Cadeira1.getTipo());
        System.out.println("Durabilidade da 1° Cadeira: " +Cadeira1.getDurabilidade());
        System.out.println("Preço da 1° Cadeira: " +Cadeira1.getPreco());

        System.out.println("----CADEIRA N°2----");
        System.out.println("Material da 2° Cadeira: " +Cadeira2.getMaterial());
        System.out.println("Cor da 2° Cadeira: " +Cadeira2.getCor());
        System.out.println("Tipo da 2° Cadeira: " +Cadeira2.getTipo());
        System.out.println("Durabilidade da 2° Cadeira: " +Cadeira2.getDurabilidade());
        System.out.println("Preço da 2° Cadeira: " +Cadeira2.getPreco());

        System.out.println("----CADEIRA N°3----");
        System.out.println("Material da 3° Cadeira: " +Cadeira3.getMaterial());
        System.out.println("Cor da 3° Cadeira: " +Cadeira3.getCor());
        System.out.println("Tipo da 3° Cadeira: " +Cadeira3.getTipo());
        System.out.println("Durabilidade da 3° Cadeira: " +Cadeira3.getDurabilidade());
        System.out.println("Preço da 3° Cadeira: " +Cadeira3.getPreco());

    }
}
