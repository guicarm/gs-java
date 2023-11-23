package app.vercel.nexus.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import app.vercel.nexus.beans.Especialista;
import app.vercel.nexus.dao.EspecialistaDAO;

public class EspecialistaBO {

	EspecialistaDAO especialistaDao;
	
	//======== SELECT =========
			public ArrayList<Especialista> secionarBo() throws SQLException, ClassNotFoundException{
				especialistaDao = new EspecialistaDAO();
				return  (ArrayList<Especialista>) especialistaDao.selecionar();
			}
			
			public void inserirBo(Especialista especialista) throws ClassNotFoundException, SQLException  {
				EspecialistaDAO especialistaDao = new EspecialistaDAO();
				especialistaDao.inserir(especialista);
			}
			
			public void atualizarBo(Especialista especialista) throws ClassNotFoundException, SQLException  {
				EspecialistaDAO especialistaDao = new EspecialistaDAO();
				especialistaDao.alterar(especialista);
			}
			
			public void deletarBo(int idEspecialista) throws ClassNotFoundException, SQLException {
				EspecialistaDAO especialistaDao = new EspecialistaDAO();
				especialistaDao.deletar(idEspecialista);
			}	
}
