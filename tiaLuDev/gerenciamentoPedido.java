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

            System.out.println("Quer adicionar mais itens?");
            System.out.println("Digite s para continuar ou n para sair");
            s = sc.nextLine();
        }

        this.listaPedidos.add(novoPedido);
        System.out.println("Pedido criado e adicionado com sucesso!");

    }

    public void listaPedidos(){
        for(pedido p : listaPedidos){
            System.out.println("Pedido de ID = " + p.getIdPedido() + ", com status atual em: " + p.getStatus() + " e realizado na data: " + p.getData());
            p.descPedido(p.getItens());
        }
    }

    public void atualizaStatus(){
        System.out.println("Qual o ID do pedido que deseja atualizar?");
        int idPedido = sc.nextInt();
        Boolean nEncontrado = false;

        for(pedido p: listaPedidos){
            if(p.getIdPedido() == idPedido){
                System.out.println("Status atual: " + p.getStatus());
                if(p.getStatus().equals("Aceito")){
                    p.setStatus("Preparando");
                    System.out.println("Status atualizado para: preparando");
                }else if(p.getStatus().equals("Preparando")){
                    p.setStatus("Feito");
                    System.out.println("Status atualizado para: feito");
                }else if(p.getStatus().equals("Feito")){
                    p.setStatus("Aguardando entregador");
                    System.out.println("Status atualizado para: aguardando entregador");
                }else if(p.getStatus().equals("Aguardando entregador")){
                    p.setStatus("Saiu para entrega");
                    System.out.println("Status atualizado para: saiu para entrega");
                }else if(p.getStatus().equals("Saiu para entrega")){
                    p.setStatus("Entregue");
                    System.out.println("Status atualizado para: Entregue");
                }else if(p.getStatus().equals("Entregue")){
                    System.out.println("Pedido ja foi entregue");
                }
                break;
            }else{
                 nEncontrado = true;
            }
        }
        if (nEncontrado) {
            System.out.println("Pedido não encontrado");
        }

    }

    public void listarPedidosPorStatus(){
        System.out.println("1 - aceito | 2- preparando | 3 - feito | 4 - aguardando entregador | 5 - saiu para entrega | 6 - entregue");
        int i = sc.nextInt();

        switch(i){
            case 1:
                for(pedido p : listaPedidos){
                    if(p.getStatus().equals("Aceito")){
                    System.out.println("Pedido de ID = " + p.getIdPedido() + ", com status atual em: " + p.getStatus() + " e realizado na data: " + p.getData());
                    p.descPedido(p.getItens());
                    }
                }
                break;
            case 2:
                for(pedido p : listaPedidos){
                    if(p.getStatus().equals("Preparando")){
                    System.out.println("Pedido de ID = " + p.getIdPedido() + ", com status atual em: " + p.getStatus() + " e realizado na data: " + p.getData());
                    p.descPedido(p.getItens());
                    }
                }
                break;
            case 3:
                for(pedido p : listaPedidos){
                    if(p.getStatus().equals("Feito")){
                    System.out.println("Pedido de ID = " + p.getIdPedido() + ", com status atual em: " + p.getStatus() + " e realizado na data: " + p.getData());
                    p.descPedido(p.getItens());
                    }
                }
                break;
            case 4:
                for(pedido p : listaPedidos){
                    if(p.getStatus().equals("Aguardando entregador")){
                    System.out.println("Pedido de ID = " + p.getIdPedido() + ", com status atual em: " + p.getStatus() + " e realizado na data: " + p.getData());
                    p.descPedido(p.getItens());
                    }
                }
                break;
            case 5:
                for(pedido p : listaPedidos){
                    if(p.getStatus().equals("Saiu para entrega")){
                    System.out.println("Pedido de ID = " + p.getIdPedido() + ", com status atual em: " + p.getStatus() + " e realizado na data: " + p.getData());
                    p.descPedido(p.getItens());
                    }
                }
                break;
            case 6:
                for(pedido p : listaPedidos){
                    if(p.getStatus().equals("Entregue")){
                    System.out.println("Pedido de ID = " + p.getIdPedido() + ", com status atual em: " + p.getStatus() + " e realizado na data: " + p.getData());
                    p.descPedido(p.getItens());
                    }
                }
                break;
            default:
            System.out.println("Status inválido");
        }
    }
}
