package tiaLuDev;

public class itemCardapio {
    private int idItem;
    private String nome;
    private float preco;

    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getIdItem() {
        return idItem;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    private static int proximoId = 1;

    public itemCardapio(String nome, float preco){
        this.preco = preco;
        this.nome = nome;
        this.idItem = proximoId++;
    }

}
