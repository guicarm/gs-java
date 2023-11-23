package app.vercel.nexus.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
// ============== MÉTODO DE CONEXÃO COM BANCO DE DADOS ===============
			public Connection conexao() throws ClassNotFoundException, SQLException {
				//Driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "RM98874", "170505");
		}
}
