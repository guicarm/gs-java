package app.vercel.nexus.beans;

public class Conta {
	
	private int idConta;
	private String nomeCompleto;
	private String senha;
	
	public Conta() {
		super();
	}

	public Conta(int idConta, String nomeCompleto, String senha) {
		super();
		this.idConta = idConta;
		this.nomeCompleto = nomeCompleto;
		this.senha = senha;
	}
	
	
	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
