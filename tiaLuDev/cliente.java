package tiaLuDev;

public class cliente {
    private int idCliente;
    private String nome;
    private String telefone;


    public int getIdCliente() {
        return idCliente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private static int proximoId = 1;
    
    public cliente(String nome, String telefone){
        this.telefone = telefone;
        this.nome = nome;
        this.idCliente = proximoId++;
    }
}
