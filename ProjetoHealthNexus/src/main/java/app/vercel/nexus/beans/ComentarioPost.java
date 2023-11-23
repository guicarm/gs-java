package app.vercel.nexus.beans;

public class ComentarioPost {

	private int idComentarioPost;
	private String tituloComentario;
	private String textoComentario;
	
	public ComentarioPost() {
		super();
	}

	public ComentarioPost(int idComentarioPost, String tituloComentario, String textoComentario) {
		super();
		this.idComentarioPost = idComentarioPost;
		this.tituloComentario = tituloComentario;
		this.textoComentario = textoComentario;
	}

	public int getIdComentarioPost() {
		return idComentarioPost;
	}

	public void setIdComentarioPost(int idComentarioPost) {
		this.idComentarioPost = idComentarioPost;
	}

	public String getTituloComentario() {
		return tituloComentario;
	}

	public void setTituloComentario(String tituloComentario) {
		this.tituloComentario = tituloComentario;
	}

	public String getTextoComentario() {
		return textoComentario;
	}

	public void setTextoComentario(String textoComentario) {
		this.textoComentario = textoComentario;
	}
}
