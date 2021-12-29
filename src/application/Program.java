package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoItem;
import entities.Produto;
import entities.enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date moment = new Date();
		

		
		
		System.out.println("Digite os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email=sc.nextLine();
		System.out.print("Data de nascimento (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		Cliente cliente = new Cliente(nome, email, data);
		
		System.out.println("Digite os dados do pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next().toUpperCase());
		Pedido pedido = new Pedido (moment,status, cliente);
	
		
		System.out.println("Quantos itens para esse pedido: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Digite os dados do #"+i+" produto");
			System.out.println("Nome do produto: ");
			String nomeP = sc.nextLine();
			System.out.println("preco: ");
			Double preco=sc.nextDouble();
			System.out.println("Quantidade: ");
			Integer quantidade= sc.nextInt();
			
			Produto produto = new Produto(nomeP,preco);
			
			PedidoItem itenspedidos = new PedidoItem(quantidade,preco, produto);
			pedido.addPedidos(itenspedidos);
		}
		System.out.println();
		
		

		System.out.println("Resumo do pedido");
		System.out.println(pedido);
//		System.out.println("Momento do pedido: "+ pedido.getMoment());
//		System.out.println("Status do pedido: "+ pedido.getStatus());
//		System.out.println("Cliente: "+ cliente.getNome()+" "+ cliente.getDataNascimento()+" - "+ cliente.getEmail());
//		System.out.println("Itens Pedidos:");
//		pedido.total();
//		System.out.println("Preço total: $"+pedido.total());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
