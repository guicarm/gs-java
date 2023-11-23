package app.vercel.nexus.main;

import java.sql.Connection;
import java.sql.SQLException;

import app.vercel.nexus.conexoes.ConnectionFactory;


public class TesteConexao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection c = new ConnectionFactory().conexao();

		System.out.println("==========================================" + 
							"\nConectado com o banco de dados com sucesso!" +
							"\n==========================================");

		c.close();

	}

}
