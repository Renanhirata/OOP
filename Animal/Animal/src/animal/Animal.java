package animal;

public class Animal {
    private float tamanho;
    private String cor;

    public Float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Animal(Float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;

    }
}
