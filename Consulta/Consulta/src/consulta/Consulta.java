package consulta;

public class Consulta {
    private String data;
    private String nomePaciente;
    private String nomeDentista;

    public Consulta(String data, String nomePaciente, String nomeDentista) {
        this.data = data;
        this.nomePaciente = nomePaciente;
        this.nomeDentista = nomeDentista;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeDentista() {
        return nomeDentista;
    }

    public void setNomeDentista(String nomeDentista) {
        this.nomeDentista = nomeDentista;
    }
}
