package app.vercel.nexus.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import app.vercel.nexus.beans.Conta;
import app.vercel.nexus.dao.ContaDAO;


public class ContaBO {

	ContaDAO contaDao;
	
//======== SELECT =========
		public ArrayList<Conta> secionarBo() throws SQLException, ClassNotFoundException{
			contaDao = new ContaDAO();
			return  (ArrayList<Conta>) contaDao.selecionar();
		}
		
		public void inserirBo(Conta conta) throws ClassNotFoundException, SQLException  {
			ContaDAO contaDao = new ContaDAO();
			contaDao.inserir(conta);
		}
		
		public void atualizarBo(Conta conta) throws ClassNotFoundException, SQLException  {
			ContaDAO contaDao = new ContaDAO();
			contaDao.alterar(conta);
		}
		
		public void deletarBo(int idConta) throws ClassNotFoundException, SQLException {
			ContaDAO contaDao = new ContaDAO();
			contaDao.deletar(idConta);
		}	
}
