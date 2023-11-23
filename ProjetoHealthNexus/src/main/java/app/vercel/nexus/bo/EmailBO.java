package app.vercel.nexus.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import app.vercel.nexus.beans.Email;
import app.vercel.nexus.dao.EmailDAO;

public class EmailBO {

	EmailDAO emailDao;
	
//======== SELECT =========
	public ArrayList<Email> secionarBo() throws SQLException, ClassNotFoundException{
		emailDao = new EmailDAO();
		return  (ArrayList<Email>) emailDao.selecionar();
	}
	
	public void inserirBo(Email email) throws ClassNotFoundException, SQLException  {
		EmailDAO emailDao = new EmailDAO();
		emailDao.inserir(email);
	}
	
	public void atualizarBo(Email email) throws ClassNotFoundException, SQLException  {
		EmailDAO emailDao = new EmailDAO();
		emailDao.alterar(email);
	}
	
	public void deletarBo(int idEmail) throws ClassNotFoundException, SQLException {
		EmailDAO emailDao = new EmailDAO();
		emailDao.deletar(idEmail);
	}	

}
