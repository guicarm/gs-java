package app.vercel.nexus.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.vercel.nexus.beans.Conta;
import app.vercel.nexus.dao.ContaDAO;

public class TesteSelecionarConta {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ContaDAO dao = new ContaDAO();
		
		List<Conta> listaConta = (ArrayList<Conta>) dao.selecionar();
			if(listaConta != null) {
					for( Conta conta : listaConta) {
						System.out.println(conta.getIdConta() + " " + 
										   conta.getNomeCompleto() + " " + 
										   conta.getSenha() + "\n");
			}
		}

	}

}
