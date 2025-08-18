import java.util.Scanner;

public class ObjetoPessoa {
    public static void  main(String[] args){
        Scanner ler = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        int idade, idade1;
        String nome, idd, cdd, prof, nome1, idd1, cdd1, prof1;

        System.out.println("Digite o nome do 1° Objeto: ");
        nome = ler.nextLine();
        System.out.println("Digite a idade do 1° Objeto: ");
        idade = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite o endereço do 1° Objeto: ");
        cdd = ler.nextLine();
        System.out.println("Digite o profissão do 1° Objeto: ");
        prof = ler.nextLine();


        System.out.println("Digite o nome do 2° Objeto: ");
        nome1 = ler.nextLine();
        System.out.println("Digite a idade do 2° Objeto: ");
        idade1 = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite o endereço do 2° Objeto: ");
        cdd1 = ler.nextLine();
        System.out.println("Digite o profissão do 2° Objeto: ");
        prof1 = ler.nextLine();

        pessoa1.setNome(nome);
        pessoa1.setIdade(idade);
        pessoa1.setEndereco(cdd);
        pessoa1.setProfissao(prof);

        pessoa2.setNome(nome1);
        pessoa2.setIdade(idade1);
        pessoa2.setEndereco(cdd1);
        pessoa2.setProfissao(prof1);

        System.out.println("---- OBJETO 1 -----");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa1.getProfissao());

        System.out.println("---- OBJETO 2 -----");
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getEndereco());
        System.out.println(pessoa2.getProfissao());


    }
}