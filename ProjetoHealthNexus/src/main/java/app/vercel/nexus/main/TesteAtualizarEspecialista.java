package app.vercel.nexus.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import app.vercel.nexus.beans.Especialista;
import app.vercel.nexus.dao.EspecialistaDAO;

public class TesteAtualizarEspecialista {

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
		
		Especialista objEspecialista = new Especialista();
		
		EspecialistaDAO dao = new EspecialistaDAO();
		
		objEspecialista.setIdEspecialista(inteiro("Insira o ID do Especialista a ser alterado: "));
		objEspecialista.setCpf(texto("CPF: "));
		objEspecialista.setCrm(texto("CRM: "));
		objEspecialista.setProfissao(texto("Profissão: "));
		
		System.out.println(dao.alterar(objEspecialista));

	}

}
