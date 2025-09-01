package Heranca;

public class Main {
    public static void main(String[]args) {

        //Criando uma Pessoa
        Pessoa pessoa = new Pessoa("João da Silva", "(11) 9999-9999");
        System.out.println("Pessoa: ");
        System.out.println("Nome: " +pessoa.getNome());
        System.out.println("Telefone: " +pessoa.getTelefone());

        //Criando uma Pessoa fisica
        PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", "(11) 9999-9999", "123.455.789-00","300.456.989-X");
        System.out.println("\nPessoa Fisica: ");
        System.out.println("Nome: " +pessoaFisica.getNome());
        System.out.println("Telefone: " +pessoaFisica.getTelefone());
        System.out.println("CPF: " +pessoaFisica.getCpf());
        System.out.println("RG: " +pessoaFisica.getRg());

        //Criando uma Pessoa juridica
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(11) 9999-9999", "12.345.678/9001-23");
        System.out.println("\nPessoa Jurídica: ");
        System.out.println("Nome: " +pessoaJuridica.getNome());
        System.out.println("Telefone: " +pessoaJuridica.getTelefone());
        System.out.println("CPF: " +pessoaJuridica.getCnpj());
    }
}
