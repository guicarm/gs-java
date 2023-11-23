package app.vercel.nexus.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import app.vercel.nexus.beans.Email;
import app.vercel.nexus.dao.EmailDAO;

public class TesteDeletarEmail {

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Email objEmail = new Email();
		
		EmailDAO dao = new EmailDAO();
			
		objEmail.setIdEmail(inteiro("Digite o ID do email a ser deletado: "));
			
		System.out.println(dao.deletar(objEmail.getIdEmail()));


	}

}
