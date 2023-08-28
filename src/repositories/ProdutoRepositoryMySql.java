package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import entities.Produto;
import interfaces.IProdutoRepository;

public class ProdutoRepositoryMySql implements IProdutoRepository {

	@Override
	public void inserir(Produto produto) throws Exception {
		
		// parametros para conexão com o MYSQL
		String host = "xxxxxx";
		String user = "xxxxxx";
		String pass = "xxxxxx";
		
		// abrindo conexão com o MYSQL
		Connection connection = DriverManager	.getConnection(host, user, pass);
		
		// cadastrando o produto (escrevendo uma setença SQL)
		PreparedStatement statement = connection.prepareStatement("insert into produto(nome, preco, quantidade) values(?, ?, ?)");
		statement.setString(1, produto.getNome());
		statement.setDouble(2, produto.getPreco());
		statement.setInt(3, produto.getQuantidade());
		
		statement.execute();
		
		// fechando a conexão
		connection.close();
		
		
	}

}
