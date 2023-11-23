package app.vercel.nexus.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import app.vercel.nexus.beans.Email;
import app.vercel.nexus.dao.EmailDAO;

public class TesteInsertEmail {
	
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
		
		Email objEmail = new Email();
		
		EmailDAO dao = new EmailDAO();

		objEmail.setIdEmail(inteiro("ID do Email: "));
		objEmail.setEmail(texto("E-mail: "));
		objEmail.setStatusEmail(texto("Status do Email [A/I]: "));
		
		System.out.println(dao.inserir(objEmail));
	}

}
