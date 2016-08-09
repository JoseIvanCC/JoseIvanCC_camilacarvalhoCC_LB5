package hotel;

import java.util.ArrayList;

public class Recepcao {
	
	private ArrayList<Estadia> estadias;
	
	public Recepcao() {
		estadias = new ArrayList<Estadia>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(estadia);
	}

	public void checkOut(String nome) {
		for (int i = 0; i < estadias.size(); i++) {
			if (estadias.get(i).getNome().equals(nome)) {
				estadias.remove(i);
			}
			
		}
	}
	
	public int getNumDeHospedes() {
		return estadias.size();
	}
	
	public double getLucroTotal() {
		double valorTotal = 0.0;
		for (Estadia estadia : estadias) {
			valorTotal += estadia.getValor();
		}
		return valorTotal;
		
	}
	
	public String toString() {
		final String FIM_LINHA = System.lineSeparator();
		String mensagem = String.format("Estadias:%s", FIM_LINHA);  
		for (Estadia estadia: estadias){
			 mensagem += String.format("%s (%s): %d dias com o preco de R$ %.2f", 
					 estadia.getNome(), estadia.getTipo(), estadia.getDias(), estadia.getValor()).replace(",", ".");
		}
		
		return mensagem;
	}
	

}
