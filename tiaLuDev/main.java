package tiaLuDev;

import java.util.Scanner;


public class main {

     public static void exibirMenu(){
        System.out.println("--- MENU PRINCIPAL ---");
        System.out.println("1. Registra novo cliente");
        System.out.println("2. Fazer um pedido");
        System.out.println("3. Atualizar status de um pedido");
        System.out.println("4. Registrar um novo item ao cardapio");
        System.out.println("5. Relatórios");
        System.out.println("6. Listas");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    };

    

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    gerenciamentoClientes gerenciadorClientes = new gerenciamentoClientes();
    gerenciamentoCardapio gerenciadorItens = new gerenciamentoCardapio();
    gerenciamentoPedido gerenciadorPedido = new gerenciamentoPedido();


    boolean on = true;

    while (on) {
        exibirMenu();
        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {
            case 1:
                gerenciadorClientes.criarCliente();
                break;
            case 2:
                gerenciadorPedido.addItemPedido(gerenciadorClientes, gerenciadorItens);
                break;
            case 3:
                gerenciadorPedido.atualizaStatus();
                break;
            case 4:
                gerenciadorItens.addItem();
                break;
            case 5:
                boolean x = true;
                while(x){
                    System.out.println("1. Relatorio simplificado");
                    System.out.println("2. Relatorio detalhado");
                    System.out.println("3. Sair");
                    int opção = sc.nextInt();

                    switch (opção) {
                        case 1:
                            gerenciadorPedido.gerarRelatorioSimplificado();
                            break;
                        case 2:
                            gerenciadorPedido.gerarRelatorioDetalhado();   
                            break;
                        case 3:
                        x = false;                 
                        default:
                            System.out.println("Opção invalidade");
                    }
                    
                }
                break;
            case 6:
                boolean y = true;
                while(y){
                    System.out.println("1. Lista dos clientes");
                    System.out.println("2. Lista dos itens");
                    System.out.println("3. Lista dos pedidos");
                    System.out.println("4. Lista dos pedidos por status");
                    System.out.println("5. Sair");
                    int esc = sc.nextInt();
                    switch (esc) {
                        case 1:
                            gerenciadorClientes.listaClientes();
                            break;
                        case 2:
                            gerenciadorItens.listaItens();
                            break;
                        case 3:
                            gerenciadorPedido.listaPedidos();
                            break;
                        case 4:
                            gerenciadorPedido.listarPedidosPorStatus();
                            break;
                        case 5:
                            y = false;
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 7:
                on = false;
                System.out.println("Finalizando aplicação");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente");
                break;
        }

    }
}
}
