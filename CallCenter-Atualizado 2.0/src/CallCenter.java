import java.util.concurrent.Semaphore;

public class CallCenter {
	
	Semaphore t1 = new Semaphore(1);
	Semaphore t2 = new Semaphore(1);
	Semaphore t3 = new Semaphore(1);
	Semaphore t4 = new Semaphore(1);
	Semaphore t5 = new Semaphore(1);
	
	
	public void ficandoOcupado(int id, String  nome){
		System.out.println("Atendente "+ id +" recebeu a ligacao: "+nome);
		System.out.println("##### LINHA ATENDENTE "+id+" -> status: OCUPADO\n");

	}

	public void ficandoDisponivel(int id, String nome){
		System.out.println("Atendente "+id+" -> Ligacao concluida com o "+nome);
		System.out.println("##### LINHA ATENDENTE "+id+" -> status: DISPONIVEL\n");
	}


	public void ligacao(String name) {

		
		
		int aux =1 + (int) (Math.random() * (6 - 1)); // Gerar numero aleatorio pra ser o atendente
		switch(aux){
			case 1:
			try {
				t1.acquire();
				ficandoOcupado(aux, name);
				Thread.sleep( (int) ((Math.random() * (6 - 1)) + 1) * 1000);
				ficandoDisponivel(aux, name);
				
				t1.release();
			} catch (InterruptedException e) {
			}
			break;
			
			case 2:
			try {
				t2.acquire();
				ficandoOcupado(aux, name);
				Thread.sleep( (int) ((Math.random() * (6 - 1)) + 1) * 1000);
				ficandoDisponivel(aux, name);
				t2.release();
			} catch (InterruptedException e) {
			}
			break;

			case 3:
			try {
				t3.acquire();
				ficandoOcupado(aux, name);
				Thread.sleep( (int) ((Math.random() * (6 - 1)) + 1) * 1000);
				ficandoDisponivel(aux, name);
				t3.release();
			} catch (InterruptedException e) {
			}
			break;

			case 4:
			try {
				t4.acquire();
				ficandoOcupado(aux, name);
				Thread.sleep( (int) ((Math.random() * (6 - 1)) + 1) * 1000);
				ficandoDisponivel(aux, name);
				t4.release();
			} catch (InterruptedException e) {
			}
			break;

			default:
			try {
				t5.acquire();
				ficandoOcupado(aux, name);
				Thread.sleep( (int) ((Math.random() * (6 - 1)) + 1) * 1000);
				ficandoDisponivel(aux, name);
				t5.release();
			} catch (InterruptedException e) {
			}
			
		}

	}
}

