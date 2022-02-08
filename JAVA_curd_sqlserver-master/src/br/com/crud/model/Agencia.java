package br.com.crud.model;

public class Agencia {

	private int Id_agencia;
	private String promocao;
	private String preco;
	private int Id_Cliente;
	private Cliente cliente;
	private int Id_destino;
	private String contato;
	private String destino;
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public int getId_agencia() {
		return Id_agencia;
	}
	public void setId_agencia(int id_agencia) {
		Id_agencia = id_agencia;
	}
	public String getPromocao() {
		return promocao;
		
	}
	public void setPromocao(String promocao) {
		this.promocao = promocao;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public int getId_Cliente() {
		return Id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		Id_Cliente = id_Cliente;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getId_destino() {
		return Id_destino;
	}
	public void setId_destino(int id_destino) {
		Id_destino = id_destino;
	}
	
}

