package app.vercel.nexus.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.vercel.nexus.beans.Especialista;
import app.vercel.nexus.dao.EspecialistaDAO;

public class TesteSelecionarEspecialista {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EspecialistaDAO dao = new EspecialistaDAO();
		
		List<Especialista> listaEspecialista = (ArrayList<Especialista>) dao.selecionar();
			if(listaEspecialista != null) {
					for( Especialista especialista : listaEspecialista) {
						System.out.println(especialista.getIdEspecialista() + " " + 
										   especialista.getCpf() + " " + 
										   especialista.getCrm() + " " +
										   especialista.getProfissao() + "\n");
				}
			}

		}

}
