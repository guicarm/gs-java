package app.vercel.nexus.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import app.vercel.nexus.beans.Conta;
import app.vercel.nexus.dao.ContaDAO;

public class TesteDeletarConta {

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

			Conta objConta = new Conta();
				
			ContaDAO dao = new ContaDAO();
				
			objConta.setIdConta(inteiro("Digite o ID da conta a ser deletada: "));
				
			System.out.println(dao.deletar(objConta.getIdConta()));

		}

}

