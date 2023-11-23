package app.vercel.nexus.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import app.vercel.nexus.beans.Conta;
import app.vercel.nexus.dao.ContaDAO;

public class TesteAtualizarConta {

	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Conta objConta = new Conta();
		
		ContaDAO dao = new ContaDAO();
		
		objConta.setIdConta(inteiro("Insira o ID da Conta a ser alterada: "));
		objConta.setNomeCompleto(texto("Nome Completo: "));
		objConta.setSenha(texto("Senha: "));
		
		System.out.println(dao.alterar(objConta));

	}

}
