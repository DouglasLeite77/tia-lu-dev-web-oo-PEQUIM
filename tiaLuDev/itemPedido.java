package tiaLuDev;

public class itemPedido {
    private int quantidade;
    private float precoUnidade;
    
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

    public itemPedido(int quantidade, float precoUnidade){
        this.precoUnidade = precoUnidade;
        this.quantidade = quantidade;
    }


    
}
