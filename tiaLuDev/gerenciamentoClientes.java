package tiaLuDev;

import java.util.ArrayList;
import java.util.List;

public class gerenciamentoClientes {
    private List<cliente> listaClientes;


    public gerenciamentoClientes(){
        this.listaClientes = new ArrayList<>();
    }

    public void addCliente(cliente c){
        this.listaClientes.add(c);
        System.out.println("Cliente adicionando com sucesso");
    }
}
