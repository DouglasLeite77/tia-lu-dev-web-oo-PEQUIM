package tiaLuDev;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class gerenciamentoPedido {
    private List<pedido> listaPedidos;
    private Scanner sc = new Scanner(System.in);

     public gerenciamentoPedido() {
        this.listaPedidos = new ArrayList<>();
    }

    public void addItemPedido(gerenciamentoCardapio gc, gerenciamentoClientes gcli){
        System.out.println("Digite o id do cliente");
        int clientex = sc.nextInt();
        sc.nextLine();
        
        cliente clientesel = null;

        for(cliente c: gcli.clientescad()){
            if(c.getIdCliente() == clientex){
                clientesel = c;
                break;
            }
        };
        if(clientesel == null){
            System.out.println("Cliente não encontrado");
            return;
        }

        pedido novoPedido = new pedido(clientesel); 

        String s = "s";

        while(s.equalsIgnoreCase("s")){
            System.out.println("Adicionar item ao pedido");
            System.out.println("Digite o id do Item");
            int idItemcard = sc.nextInt();

            System.out.println("Digite a quantidade");
            int qtdItem = sc.nextInt();
            sc.nextLine();

            itemCardapio itemCardapio = gc.buscarItem(idItemcard);

            if(itemCardapio != null){
                itemPedido itemdoPedido = new itemPedido(itemCardapio, qtdItem);

                novoPedido.addItem(itemdoPedido);
                System.out.println("Item " + itemdoPedido.getItem() + " Adicionado ao pedido");
            }else{
                System.out.println("ID inválido");
            }

            System.out.println("Adicionar mais itens?\\n" + //
                                "Digite s para continuar ou n para sair");
            s = sc.nextLine();
            System.out.println(s);
        }

        this.listaPedidos.add(novoPedido);
        System.out.println("Pedido criado e adicionado com sucesso!");

    }

    public void listaPedidos(){
        for(pedido p : listaPedidos){
            System.out.println(p.getIdPedido() + "  " +  p.getData());
            p.descPedido(p.getItens());
        }
    }
    
}
