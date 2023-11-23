package app.vercel.nexus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.vercel.nexus.beans.Especialista;
import app.vercel.nexus.conexoes.ConnectionFactory;

public class EspecialistaDAO {
	
public Connection minhaConexao;
	
	public EspecialistaDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConnectionFactory().conexao();
	}

// ================ MÉTODO INSERT ===================
			public String inserir (Especialista especialista) throws SQLException {
				PreparedStatement stmt = minhaConexao.prepareStatement("insert into T_N_ESPECIALISTA values (?, ?, ?, ?)");
				stmt.setInt(1, especialista.getIdEspecialista());
				stmt.setString(2, especialista.getCpf());
				stmt.setString(3, especialista.getCrm());
				stmt.setString(4, especialista.getProfissao());
				stmt.execute();
				stmt.close();
				
				return "Especialista cadastrado com sucesso!";
			}
			
// ================ MÉTODO DELETE ===================
			public String deletar(int idEspecialista) throws SQLException {
				PreparedStatement stmt = minhaConexao.prepareStatement(" delete from T_N_ESPECIALISTA where ID_ESPECIALISTA = ?");
				stmt.setInt(1 , idEspecialista);
				stmt.executeUpdate();
				stmt.close();
				
				return "Especialista deletado com sucesso!";

				}

// ================ MÉTODO UPDATE ===================
			public String alterar(Especialista especialista) throws SQLException {
				PreparedStatement stmt = minhaConexao.prepareStatement(" Update T_N_ESPECIALISTA set NR_CPF = ? , DS_CRM = ?, NM_PROFISSAO = ?, where ID_ESPECIALISTA = ? ");
				stmt.setString(1, especialista.getCpf());
				stmt.setString(2, especialista.getCrm());
				stmt.setString(3, especialista.getProfissao());
				stmt.executeUpdate();
				stmt.close();		
						
				return "Especialista alterado com sucesso!";
			}
			

// ================ MÉTODO SELECT ===================
			public List<Especialista> selecionar() throws SQLException{
				List<Especialista> listaEspecialistas = new ArrayList <Especialista>();
				PreparedStatement stmt = minhaConexao.prepareStatement(" Select * from T_N_ESPECIALISTA");
			
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					Especialista especialista = new Especialista();
					especialista.setIdEspecialista(rs.getInt(1));
					especialista.setCpf(rs.getString(2));
					especialista.setCrm(rs.getString(3));
					especialista.setProfissao(rs.getString(4));

					listaEspecialistas.add(especialista);
				}
				
				return listaEspecialistas;
			}
		
	}


