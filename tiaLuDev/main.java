package tiaLuDev;

import java.util.Scanner;


public class main {

     public static void exibirMenu(){
        System.out.println("--- MENU PRINCIPAL ---");
        System.out.println("1. Registra novo cliente");
        System.out.println("2. Fazer um pedido");
        System.out.println("3. Registrar um novo item ao cardapio");
        System.out.println("4. Relatórios");
        System.out.println("5. Sair");
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
                gerenciadorItens.addItem();
                break;
            case 4:
                System.out.println("1. Relatorio simplificado");
                System.out.println("2. Relatorio detalhado");
                System.out.println("3. Sair");
                int opção = sc.nextInt();
                boolean x = true;
                while(x){
                    switch (opção) {
                        case 1:
                            gerenciadorPedido.gerarRelatorioSimplificado();
                            break;
                        case 2:
                            gerenciadorPedido.gerarRelatorioDetalhado();   
                        case 3:
                        x = false;                 
                        default:
                            System.out.println("Opção invalidade");
                    }
                    break;
                }
            case 5:
                on = false;
                System.out.println("Finalizando aplicação");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente");
        }

    }
}
}
