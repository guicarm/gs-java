package app.vercel.nexus.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.vercel.nexus.beans.Email;
import app.vercel.nexus.dao.EmailDAO;

public class TesteSelecionarEmail {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		EmailDAO dao = new EmailDAO();
				
		List<Email> listaEmail = (ArrayList<Email>) dao.selecionar();
			if(listaEmail != null) {
					for( Email email : listaEmail) {
						System.out.println(email.getIdEmail() + " " + 
										   email.getEmail() + " " + 
										   email.getStatusEmail() + "\n");
				}
			}

		}

}
