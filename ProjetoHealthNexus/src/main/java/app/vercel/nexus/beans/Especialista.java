package app.vercel.nexus.beans;

public class Especialista extends Conta{

	private int idEspecialista;
	private String crm;
	private String cpf;
	private String profissao;
	
	public Especialista() {
		super();
	}

	public Especialista(int idEspecialista, String crm, String cpf, String profissao) {
		super();
		this.idEspecialista = idEspecialista;
		this.crm = crm;
		this.cpf = cpf;
		this.profissao = profissao;
	}

	public Especialista(int idConta, String nomeCompleto, String senha, int idEspecialista, String crm, String cpf,
			String profissao) {
		super(idConta, nomeCompleto, senha);
		this.idEspecialista = idEspecialista;
		this.crm = crm;
		this.cpf = cpf;
		this.profissao = profissao;
	}

	public int getIdEspecialista() {
		return idEspecialista;
	}

	public void setIdEspecialista(int idEspecialista) {
		this.idEspecialista = idEspecialista;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
