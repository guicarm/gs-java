package app.vercel.nexus.excecoes;

public class Execao extends Exception{

//============ CLASSE PARA TRATAMENTO DO ERRO java.lang.NumberFormatException RELACIONADO AO INTEGER ==================
	public Execao() {
		super();
		System.out.println("Mensagem de falha.");
	}
	
	public Execao(Exception e) {
		super();
		if(e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			System.out.println("Por favor digite um número nesse campo.");
		} else {
			System.out.println("Falha desconhecida.");
		}
	}
}
