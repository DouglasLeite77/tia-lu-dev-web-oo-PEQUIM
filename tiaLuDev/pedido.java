package tiaLuDev;

import java.time.LocalDateTime;

public class pedido {
    private int idPedido;
    private LocalDateTime data;
    private String status;
    
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

    private static int proximoId = 1;
    
    public pedido(LocalDateTime data, String status){
        this.data = data;
        this.status = status;
        this.idPedido = proximoId++;
    }

}
