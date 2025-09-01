package ItensDecorativos;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Renan Hiramatsu", "99861-9562", "412.295.532-13", "15.213.642-1");
        Endereco endereco = new Endereco(1, "Rua Ramon Haro Martini", 1473, "M17", "Vila Haro", "São Paulo", "12345-780", "SP");
        Tema tema = new Tema(1, "Dia dos Pais", 400.00, "Azul");
        ItemTema item = new ItemTema(1, "Bandeirinhas de gravatas", "Decoração colorida");

        cliente.exibirInformacoes();
        endereco.exibirInformacoes();
        tema.exibirInformacoes();
        item.exibirInformacoes();
    }
}