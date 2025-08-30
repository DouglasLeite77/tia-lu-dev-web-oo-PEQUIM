package tiaLuDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gerenciamentoClientes {
    private List<cliente> listaClientes;
    public Scanner sc = new Scanner(System.in);


    public gerenciamentoClientes(){
        this.listaClientes = new ArrayList<>();
    }

    public void criarCliente(){
        System.out.println("Digite o nome do cliente");
        String nome = sc.nextLine();
        System.out.println("Digite o numero de telefone do cliente");
        String telefone = sc.nextLine();
        cliente novoCliente = new cliente(nome, telefone);
        this.listaClientes.add(novoCliente);
        System.out.println("Cliente adicionando com sucesso");
        listaClientes();
    }

    public void listaClientes(){
         for(cliente c : listaClientes){
            System.out.println("Nome = " + c.getNome() + " | "  + "Telefone: " + c.getTelefone() +" | " + "ID = " + c.getIdCliente());
        }
    }

    public List<cliente> clientescad(){
        return this.listaClientes;
    }
}
