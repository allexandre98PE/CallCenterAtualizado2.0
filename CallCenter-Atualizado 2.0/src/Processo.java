public class Processo extends Thread {

	CallCenter atendente;
	String name;
	
	public Processo(String name, CallCenter atendente) {
		super();
		this.name = name;
		this.atendente = atendente;
	}

	public void run() {
		
		while(true)
		{
			atendente.ligacao(name);
		}
		
	}
}
