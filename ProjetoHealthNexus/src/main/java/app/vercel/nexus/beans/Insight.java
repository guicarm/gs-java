package app.vercel.nexus.beans;

public class Insight {

	private int idInsight;
	private String tituloInsight;
	private String textoInsight;
	
	public Insight() {
		super();
	}

	public Insight(int idInsight, String tituloInsight, String textoInsight) {
		super();
		this.idInsight = idInsight;
		this.tituloInsight = tituloInsight;
		this.textoInsight = textoInsight;
	}

	public int getIdInsight() {
		return idInsight;
	}

	public void setIdInsight(int idInsight) {
		this.idInsight = idInsight;
	}

	public String getTituloInsight() {
		return tituloInsight;
	}

	public void setTituloInsight(String tituloInsight) {
		this.tituloInsight = tituloInsight;
	}

	public String getTextoInsight() {
		return textoInsight;
	}

	public void setTextoInsight(String textoInsight) {
		this.textoInsight = textoInsight;
	}
}
