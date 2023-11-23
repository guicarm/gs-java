package app.vercel.nexus.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import app.vercel.nexus.beans.Especialista;
import app.vercel.nexus.dao.EspecialistaDAO;

public class TesteDeletarEspecialista {

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Especialista objEspecialista = new Especialista();
		
		EspecialistaDAO dao = new EspecialistaDAO();
		
		objEspecialista.setIdEspecialista(inteiro("Digite o ID do especialista a ser deletado"));
		
		System.out.println(dao.deletar(objEspecialista.getIdEspecialista()));


	}

}
