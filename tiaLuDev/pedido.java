package tiaLuDev;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class pedido {
    private int idPedido;
    private LocalDateTime data;
    private String status;
    private List<itemPedido> itens; 
    
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
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

    private static int proximoId = 1;
    
    public pedido(){
        this.data = LocalDateTime.now();
        this.status = "Pendente";
        this.idPedido = proximoId++;
        this.itens = new ArrayList<>();
        
    }

    

}
