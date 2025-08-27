package tiaLuDev;

public class cliente {
    private int idCliente;
    private String nome;
    private String telefone;


    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    private static int proximoId = 0;
    
    public cliente(String nome, String telefone){
        this.telefone = telefone;
        this.nome = nome;
        this.idCliente = proximoId++;
    }
}
