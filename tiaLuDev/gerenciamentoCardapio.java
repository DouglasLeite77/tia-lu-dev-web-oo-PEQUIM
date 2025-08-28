package tiaLuDev;

import java.util.ArrayList;
import java.util.List;

public class gerenciamentoCardapio {
    private List<itemCardapio> listaItens;


    public gerenciamentoCardapio(){
        this.listaItens = new ArrayList<>();
    }

    public void addItem(itemCardapio i){
        this.listaItens.add(i);
        System.out.println("Item adicionando com sucesso");
    }

    public void listaItens(){
        for(itemCardapio i: listaItens){
            System.out.println("Nome = " + i.getNome() + " | " + "preço = " + i.getPreco() + " | " + "ID = " + i.getIdItem());
        }
    }
}
