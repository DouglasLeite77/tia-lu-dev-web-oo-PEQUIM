package tiaLuDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gerenciamentoCardapio {
    private List<itemCardapio> listaItens;
    public Scanner sc = new Scanner(System.in);


    public gerenciamentoCardapio(){
        this.listaItens = new ArrayList<>();
    }

    public void addItem(){
        System.out.println("Digite o nome do item");
        String nome = sc.nextLine();
        System.out.println("Digite o preço");
        float preco = sc.nextFloat();
        itemCardapio novoItemCardapio = new itemCardapio(nome, preco);

        this.listaItens.add(novoItemCardapio);
        System.out.println("Item adicionando com sucesso");
    }

    public void listaItens(){
        for(itemCardapio i: listaItens){
            System.out.println("Nome = " + i.getNome() + " | " + "preço = " + i.getPreco() + " | " + "ID = " + i.getIdItem());
        }
    }

    public itemCardapio buscarItem(int id){
        for(itemCardapio i: this.listaItens){
            if(i.getIdItem() == id){
                return i;
            }
        }

        return null;
    }
}
