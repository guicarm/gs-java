package app.vercel.nexus.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import app.vercel.nexus.beans.Conta;
import app.vercel.nexus.dao.ContaDAO;

public class TesteInsertConta {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Conta objConta = new Conta();
		
		ContaDAO dao = new ContaDAO();

		objConta.setIdConta(inteiro("ID da Conta: "));
		objConta.setNomeCompleto(texto("Nome Completo: "));
		objConta.setSenha(texto("Senha: "));
		
		System.out.println(dao.inserir(objConta));
	}

}


