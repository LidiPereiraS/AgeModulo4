package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Agencia;



public class AgenciaDAO {
	
	public void save( Agencia agencia) {
		/*
		 * Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
		 * de dados
		 */

		String sql = "INSERT INTO Agencia (Promocao, Preco, ContatoId, DestinoId)" + "VALUES(?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parámetro da sql
			pstm.setString(1, agencia.getPromocao());

			// Adicionar o valor do segundo parâmetro da sql
			pstm.setString(2, agencia.getPreco());

			// Adicionar o valor do terceiro parâmetro da sql
			pstm.setString(3, agencia.getContato());

			pstm.setString(3, agencia.getDestino());
			// Executar a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fecha as conexões
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeById(int id) {
		String sql = "DELETE FROM Agencia WHERE Id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Agencia agencia) {
		String sql = "UPDATE Agencia SET Nome = ?, Promocao = ?,  = ? WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adiciona o valor do primeiro parâmetro da sql
			pstm.setString(1, agencia.getPromocao());

			// Adicionar o valor do segundo parâmetro da sql
			pstm.setString(2, agencia.getPreco());

			// Adicionar o valor do terceiro parâmetro da sql
			pstm.setString(3, agencia.getContato());
			
			
			pstm.setString(3, agencia.getDestino());

			

			// Executa a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conexões
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Agencia> getAgencia() {

		String sql = "SELECT * FROM Agencia";

		List<Agencia> agencias  = new ArrayList<Agencia>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faça
			while (rset.next()) {
				Agencia agencia = new Agencia();

				// Recupera o id do banco e atribui ele ao objeto
				agencia.setId_agencia(rset.getInt("ID"));

				// Recupera o nome do banco e atribui ele ao objeto
				agencia.setPromocao(rset.getString("Promocao"));

				// Recupera a idade do banco e atribui ele ao objeto
				agencia.setPreco(rset.getString("Preco"));

				// Recupera a data do banco e atribui ela ao objeto
				agencia.setContato(rset.getString("Contato"));
				
				agencia.setDestino(rset.getString("Destino"));

				// Adiciona o contato recuperado, a lista de cl
				agencias.add(agencia);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return agencias;
	}
}
