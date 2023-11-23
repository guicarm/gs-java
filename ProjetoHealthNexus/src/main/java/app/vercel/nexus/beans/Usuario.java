package app.vercel.nexus.beans;

public class Usuario extends Conta{

	private int idUsuario;
	private String tipoUsuario;
	
	public Usuario() {
		super();
	}

	public Usuario(int idUsuario, String tipoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.tipoUsuario = tipoUsuario;
	}

	public Usuario(int idConta, String nomeCompleto, String senha, int idUsuario, String tipoUsuario) {
		super(idConta, nomeCompleto, senha);
		this.idUsuario = idUsuario;
		this.tipoUsuario = tipoUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
}
