import java.util.Scanner;
public class ObjetoComputador {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        Computador Computador1 = new Computador();
        Computador Computador2 = new Computador();
        Computador Computador3 = new Computador();

        String cpu1, cpu2 ,cpu3;
        String gpu1, gpu2, gpu3;
        String placaMae1, placaMae2, placaMae3;
        String ram1, ram2, ram3;
        String gabinete1, gabinete2, gabinete3;
        String fonte1,fonte2 ,fonte3;
        int armazenamento1, armazenamento2, armazenamento3;
        double preco1, preco2, preco3;

        System.out.println("Insira a CPU do 1° Computador: ");
        cpu1 = ler.nextLine();
        System.out.println("Insira a GPU do 1° Computador: ");
        gpu1 = ler.nextLine();
        System.out.println("Insira a Placa Mãe do 1° Computador: ");
        placaMae1 = ler.nextLine();
        System.out.println("Insira a RAM do 1° Computador: ");
        ram1 = ler.nextLine();
        System.out.println("Insira o gabinete do 1° Computador: ");
        gabinete1 = ler.nextLine();
        System.out.println("Insira a fonte do 1° Computador: ");
        fonte1 = ler.nextLine();
        System.out.println("Insira o armazenamento do 1° Computador: ");
        armazenamento1 = ler.nextInt();
        System.out.println("Insira o preço do 1° Computador: ");
        preco1 = ler.nextDouble();
        ler.nextLine();

        System.out.println("Insira a CPU do 2° Computador: ");
        cpu2 = ler.nextLine();
        System.out.println("Insira a GPU do 2° Computador: ");
        gpu2 = ler.nextLine();
        System.out.println("Insira a Placa Mãe do 2° Computador: ");
        placaMae2 = ler.nextLine();
        System.out.println("Insira a RAM do 2° Computador: ");
        ram2 = ler.nextLine();
        System.out.println("Insira o gabinete do 2° Computador: ");
        gabinete2 = ler.nextLine();
        System.out.println("Insira a fonte do 2° Computador: ");
        fonte2 = ler.nextLine();
        System.out.println("Insira o armazenamento do 2° Computador: ");
        armazenamento2 = ler.nextInt();
        System.out.println("Insira o preço do 2° Computador: ");
        preco2 = ler.nextDouble();
        ler.nextLine();

        System.out.println("Insira a CPU do 3° Computador: ");
        cpu3 = ler.nextLine();
        System.out.println("Insira a GPU do 3° Computador: ");
        gpu3 = ler.nextLine();
        System.out.println("Insira a Placa Mãe do 3° Computador: ");
        placaMae3 = ler.nextLine();
        System.out.println("Insira a RAM do 3° Computador: ");
        ram3 = ler.nextLine();
        System.out.println("Insira o gabinete do 3° Computador: ");
        gabinete3 = ler.nextLine();
        System.out.println("Insira a fonte do 3° Computador: ");
        fonte3 = ler.nextLine();
        System.out.println("Insira o armazenamento do 3° Computador: ");
        armazenamento3 = ler.nextInt();
        System.out.println("Insira o preço do 3° Computador: ");
        preco3 = ler.nextDouble();

        Computador1.setCpu(cpu1);
        Computador1.setGpu(gpu1);
        Computador1.setPlacaMae(placaMae1);
        Computador1.setRam(ram1);
        Computador1.setGabinete(gabinete1);
        Computador1.setFonte(fonte1);
        Computador1.setArmazenamento(armazenamento1);
        Computador1.setPreco(preco1);

        Computador2.setCpu(cpu2);
        Computador2.setGpu(gpu2);
        Computador2.setPlacaMae(placaMae2);
        Computador2.setRam(ram2);
        Computador2.setGabinete(gabinete2);
        Computador2.setFonte(fonte2);
        Computador2.setArmazenamento(armazenamento2);
        Computador2.setPreco(preco2);

        Computador3.setCpu(cpu3);
        Computador3.setGpu(gpu3);
        Computador3.setPlacaMae(placaMae3);
        Computador3.setRam(ram3);
        Computador3.setGabinete(gabinete3);
        Computador3.setFonte(fonte3);
        Computador3.setArmazenamento(armazenamento3);
        Computador3.setPreco(preco3);

        System.out.println("-----COMPUTADOR 1°-----");
        System.out.println("CPU do 1° Computador: "+Computador1.getCpu());
        System.out.println("GPU do 1° Computador: "+Computador1.getGpu());
        System.out.println("Placa mãe do 1° Computador: "+Computador1.getPlacaMae());
        System.out.println("Ram do 1° Computador: "+Computador1.getRam());
        System.out.println("Gabinete do 1° Computador: "+Computador1.getGabinete());
        System.out.println("Fonte do 1° Computador"+Computador1.getFonte());
        System.out.println("Armazenamento do 1° Computador: "+Computador1.getArmazenamento());
        System.out.println("Preço do 1° Computador: "+Computador1.getPreco());

        System.out.println("-----COMPUTADOR 2°-----");
        System.out.println("CPU do 2° Computador: "+Computador2.getCpu());
        System.out.println("GPU do 2° Computador: "+Computador2.getGpu());
        System.out.println("Placa mãe do 2° Computador: "+Computador2.getPlacaMae());
        System.out.println("Ram do 2° Computador: "+Computador2.getRam());
        System.out.println("Gabinete do 2° Computador: "+Computador2.getGabinete());
        System.out.println("Fonte do 2° Computador"+Computador2.getFonte());
        System.out.println("Armazenamento do 2° Computador: "+Computador2.getArmazenamento());
        System.out.println("Preço do 2° Computador: "+Computador2.getPreco());

        System.out.println("-----COMPUTADOR 3°-----");
        System.out.println("CPU do 3° Computador: "+Computador3.getCpu());
        System.out.println("GPU do 3° Computador: "+Computador3.getGpu());
        System.out.println("Placa mãe do 3° Computador: "+Computador3.getPlacaMae());
        System.out.println("Ram do 3° Computador: "+Computador3.getRam());
        System.out.println("Gabinete do 3° Computador: "+Computador3.getGabinete());
        System.out.println("Fonte do 3° Computador"+Computador3.getFonte());
        System.out.println("Armazenamento do 3° Computador: "+Computador3.getArmazenamento());
        System.out.println("Preço do 3° Computador: "+Computador3.getPreco());
    }
}
