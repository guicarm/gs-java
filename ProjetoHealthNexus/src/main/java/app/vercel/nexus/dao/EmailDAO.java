package app.vercel.nexus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.vercel.nexus.beans.Email;
import app.vercel.nexus.conexoes.ConnectionFactory;

public class EmailDAO {

	public Connection minhaConexao;
	
	public EmailDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConnectionFactory().conexao();
	}

// ================ MÉTODO INSERT ===================
		public String inserir (Email email) throws SQLException {
			PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO T_N_EMAIL VALUES (?, ?, ?)"); 
	            stmt.setInt(1, email.getIdEmail());
	            stmt.setString(2, email.getEmail());
	            stmt.setString(3, email.getStatusEmail());
	            stmt.executeUpdate();
	            
	            return "Email cadastrado com sucesso!";
		}
		
// ================ MÉTODO DELETE ===================
		public String deletar(int idEmail) throws SQLException {
			PreparedStatement stmt = minhaConexao.prepareStatement(" delete from T_N_EMAIL where ID_EMAIL = ?");
			stmt.setInt(1 , idEmail);
			stmt.executeUpdate();
			stmt.close();
			
			return "Email deletado com sucesso!";

			}

// ================ MÉTODO UPDATE ===================
		public String alterar(Email email) throws SQLException {
			PreparedStatement stmt = minhaConexao.prepareStatement(" Update T_N_EMAIL set DS_EMAIL = ? where ID_EMAIL = ? ");
			stmt.setString(1, email.getEmail());
			 stmt.setInt(2, email.getIdEmail());
			stmt.executeUpdate();
			stmt.close();		
					
			return "Email alterado com sucesso!";
		}
		

// ================ MÉTODO SELECT ===================
		public List<Email> selecionar() throws SQLException{
			List<Email> listaEmails = new ArrayList <Email>();
			PreparedStatement stmt = minhaConexao.prepareStatement(" Select * from T_N_EMAIL");
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Email email = new Email();
				email.setIdEmail(rs.getInt(1));
				email.setEmail(rs.getString(2));
				email.setStatusEmail(rs.getString(3));
				listaEmails.add(email);
			}
			
			return listaEmails;
		}
}
