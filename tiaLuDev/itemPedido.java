package tiaLuDev;

public class itemPedido {
    private String idItem;
    private int quantidade;
    private float precoUnidade;

    public String getItem() {
        return idItem;
    }
    public void setItem(String item) {
        idItem = item;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getPrecoUnidade() {
        return precoUnidade;
    }
    public void setPrecoUnidade(float precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public itemPedido(itemCardapio item, int quantidade){
        this.idItem = item.getNome();
        this.quantidade = quantidade;
        this.precoUnidade = item.getPreco();
    }
    
}
