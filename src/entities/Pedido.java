package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	private Date moment;
	private StatusPedido status;
	private Cliente cliente;
	private List<PedidoItem > pedidos = new ArrayList<>();
	

	
	public Pedido() {
	}

	public Pedido(Date moment, StatusPedido status, Cliente cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public StatusPedido getStatus() {
		return status;
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<PedidoItem> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<PedidoItem> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void addPedidos(PedidoItem itenspedidos) {
		pedidos.add(itenspedidos);
		System.out.println(pedidos);
	}
	
	public void removerPedidos(PedidoItem itenspedidos) {
		pedidos.remove(itenspedidos);
	}
	
	public double total() {
		double valorTotal=0.0;
		for(PedidoItem p: pedidos) {
			valorTotal+=p.subTotal(); 
		}
		return valorTotal;
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data do pedido: ");
		sb.append(moment + "\n");
		sb.append("Status do pedido: ");
		sb.append(status +"\n");
		sb.append("Cliente: ");
		sb.append(cliente+"\n");
		sb.append("Itens pedido:\n");
		for(PedidoItem p: pedidos) {
			sb.append(p + "\n");
		}
		sb.append("Preço total: $" );
		sb.append(String.format("%.2f", total()));
		return sb.toString();

	}
	
	
	
	


	
	
	
	
	
	

}
