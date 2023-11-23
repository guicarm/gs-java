package app.vercel.nexus.beans;

public class Email {

	private int idEmail;
	private String email;
	private String statusEmail;
	
	public Email() {
		super();
	}

	public Email(int idEmail, String email, String statusEmail) {
		super();
		this.idEmail = idEmail;
		this.email = email;
		this.statusEmail = statusEmail;
	}

	public int getIdEmail() {
		return idEmail;
	}

	public void setIdEmail(int idEmail) {
		this.idEmail = idEmail;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatusEmail() {
		return statusEmail;
	}

	public void setStatusEmail(String statusEmail) {
		this.statusEmail = statusEmail;
	}	
}
