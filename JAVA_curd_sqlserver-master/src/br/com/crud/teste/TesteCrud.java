package br.com.crud.teste;


import br.com.crud.dao.ClienteDAO;
import br.com.crud.model.Cliente;

public class TesteCrud {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = new ClienteDAO();
		
		// ------------ Cria um contato e salva no banco
		Cliente cliente = new Cliente();
		cliente.setNome("Paulo");
		cliente.setEndereco("Rua javaés");
		cliente.setTelefone("2335784");
		
		clienteDAO.save(cliente);
		
		// ------------ Atualiza o contato com id = 1 com os dados do objeto contato1
		//Cliente cliente1 = new Cliente();
		//cliente1.setId_Cliente(1);
		//cliente1.setNome("Paulo");
		//cliente1.setEndereco("Rua José Pereira");
		//cliente1.setTelefone("968366333");
		
		//clienteDAO.update(cliente1);
		
		// ------------ Remove o contato com id
		// clienteDAO.removeById(2);
		
		//------------ Lista todos os contatos do banco de dados
		//for (Cliente a : clienteDAO.getCliente()) {
			//System.out.println("Nome: " + a.getNome() + " " + a.getTelefone());
		//}
	}
}
