package consulta;

import java.util.Scanner;
public class ConstrutorConsulta {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        String data;
        String nomePaciente;
        String nomeDentista;

        System.out.println(" Insira a data da consulta:");
        data = ler.nextLine();
        System.out.println("Insira o nome do Paciente: ");
        nomePaciente = ler.nextLine();
        System.out.println("Insira o/a nome do/da Dentista: ");
        nomeDentista = ler.nextLine();

        Consulta consulta = new Consulta(data, nomePaciente, nomeDentista);
        System.out.println(consulta.getData());
        System.out.println(consulta.getNomePaciente());
        System.out.println(consulta.getNomeDentista());
    }
}