package app.vercel.nexus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.vercel.nexus.beans.Conta;
import app.vercel.nexus.conexoes.ConnectionFactory;

public class ContaDAO {
	
	public Connection minhaConexao;
	
	public ContaDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConnectionFactory().conexao();
	}

// ================ MÉTODO INSERT ===================
		public String inserir (Conta conta) throws SQLException {
			PreparedStatement stmt = minhaConexao.prepareStatement("insert into T_N_CONTA values (?, ?, ?)");
			stmt.setInt(1, conta.getIdConta());
			stmt.setString(2, conta.getNomeCompleto());
			stmt.setString(3, conta.getSenha());
			stmt.execute();
			stmt.close();
			
			return "Conta cadastrada com sucesso!";
		}
		
// ================ MÉTODO DELETE ===================
		public String deletar(int IdConta) throws SQLException {
			PreparedStatement stmt = minhaConexao.prepareStatement(" delete from T_N_CONTA where ID_CONTA = ?");
			stmt.setInt(1 , IdConta);
			stmt.executeUpdate();
			stmt.close();
			
			return "Conta deletada com sucesso!";

			}

// ================ MÉTODO UPDATE ===================
		public String alterar(Conta conta) throws SQLException {
			PreparedStatement stmt = minhaConexao.prepareStatement(" Update T_N_CONTA set NM_COMPLETO = ? , DS_SENHA = ?, where ID_CONTA = ? ");
			stmt.setString(1, conta.getNomeCompleto());
			stmt.setString(2, conta.getSenha());
			stmt.executeUpdate();
			stmt.close();		
					
			return "Conta alterada com sucesso!";
		}
		

// ================ MÉTODO SELECT ===================
		public List<Conta> selecionar() throws SQLException{
			List<Conta> listaContas = new ArrayList <Conta>();
			PreparedStatement stmt = minhaConexao.prepareStatement(" Select * from T_N_CONTA");
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Conta conta = new Conta();
				conta.setIdConta(rs.getInt(1));
				conta.setNomeCompleto(rs.getString(2));
				conta.setSenha(rs.getString(3));
				
				listaContas.add(conta);
			}
			
			return listaContas;
		}
	
}
