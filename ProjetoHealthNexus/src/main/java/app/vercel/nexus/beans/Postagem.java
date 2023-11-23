package app.vercel.nexus.beans;

public class Postagem {

	private int idPostagem;
	private String textoPostagem;
	
	public Postagem() {
		super();
	}

	public Postagem(int idPostagem, String textoPostagem) {
		super();
		this.idPostagem = idPostagem;
		this.textoPostagem = textoPostagem;
	}

	public int getIdPostagem() {
		return idPostagem;
	}

	public void setIdPostagem(int idPostagem) {
		this.idPostagem = idPostagem;
	}

	public String getTextoPostagem() {
		return textoPostagem;
	}

	public void setTextoPostagem(String textoPostagem) {
		this.textoPostagem = textoPostagem;
	}
}
