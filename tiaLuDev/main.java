package tiaLuDev;

public class main {

    public static void main(String[] args){

    gerenciamentoClientes gerenciadorClientes = new gerenciamentoClientes();
    gerenciamentoCardapio gerenciadorItens = new gerenciamentoCardapio();
    gerenciamentoPedido gerenciadorPedido = new gerenciamentoPedido();


    cliente c1 = new cliente("bedo", "123123123");
    cliente c2 = new cliente("helto", "123123123");
    itemCardapio i1 = new itemCardapio("Queijo", 20);
    itemCardapio i2 = new itemCardapio("coca", 20);
    
    gerenciadorItens.addItem(i1);
    gerenciadorItens.addItem(i2);
    gerenciadorItens.listaItens();
    gerenciadorClientes.addCliente(c1);
    gerenciadorClientes.addCliente(c2);
    gerenciadorClientes.listaClientes();
    
    gerenciadorPedido.addItemPedido(gerenciadorItens, gerenciadorClientes);
    gerenciadorPedido.addItemPedido(gerenciadorItens, gerenciadorClientes);
    gerenciadorPedido.atualizaStatus();
    gerenciadorPedido.atualizaStatus();

    gerenciadorPedido.listarPedidosPorStatus();







    }
}
