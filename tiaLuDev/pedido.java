package tiaLuDev;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class pedido {
    private cliente cliente;
    private int idPedido;
    private LocalDateTime data;
    private String status;
    private List<itemPedido> itens; 
    
    public cliente getCliente() {
        return cliente;
    }
    public List<itemPedido> getItens() {
        return itens;
    }
    public void setItens(List<itemPedido> itens) {
        this.itens = itens;
    }
    public int getIdPedido() {
        return idPedido;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void addItem(itemPedido i){
        this.itens.add(i);
    }

    public void descPedido(List<itemPedido> lista){
        for(itemPedido i: lista){
            System.out.println("item: " + i.getItem() + " | " + "Quantidade: " + i.getQuantidade());
        }
    }

    private static int proximoId = 1;
    
    public pedido(cliente c){
        this.cliente = c;
        this.data = LocalDateTime.now();
        this.status = "Aceito";
        this.idPedido = proximoId++;
        this.itens = new ArrayList<>();
    }
    
}
