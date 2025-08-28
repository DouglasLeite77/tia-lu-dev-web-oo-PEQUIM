package tiaLuDev;

public class main {

    public static void main(String[] args){

    gerenciamentoClientes gerenciadorClientes = new gerenciamentoClientes();
    gerenciamentoCardapio gerenciadorItens = new gerenciamentoCardapio();
    gerenciamentoPedido gerenciadorPedido = new gerenciamentoPedido();


    cliente c1 = new cliente("bedo", "123123123");
    cliente c2 = new cliente("helto", "123123123");
    itemCardapio i1 = new itemCardapio("Queijo", 20);
    itemPedido it1 = new itemPedido(i1, 2);
    
    gerenciadorItens.addItem(i1);
    gerenciadorItens.listaItens();
    gerenciadorClientes.addCliente(c1);
    gerenciadorClientes.addCliente(c2);
    gerenciadorClientes.listaClientes();
    System.out.println(it1.getItem());
    }
}
