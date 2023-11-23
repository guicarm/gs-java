package app.vercel.nexus.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import app.vercel.nexus.beans.Especialista;
import app.vercel.nexus.dao.EspecialistaDAO;

public class TesteInsertEspecialista {

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
		
		Especialista objEspecialista = new Especialista();
		
		EspecialistaDAO dao = new EspecialistaDAO();

		objEspecialista.setIdEspecialista(inteiro("ID do Especialista: "));
		objEspecialista.setCpf(texto("CPF: "));
		objEspecialista.setCrm(texto("CRM: "));
		objEspecialista.setProfissao(texto("Profissão: "));
		
		System.out.println(dao.inserir(objEspecialista));
	}

}
