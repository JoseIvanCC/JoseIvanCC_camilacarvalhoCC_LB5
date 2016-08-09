package hotel;

import java.text.DecimalFormat;

public class Estadia {
	private Animal animal;
	private double valor;
	private int dias;

	public Estadia(String nome, String tipo, int idade, int dias,double valor) {
		this.animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getNome() {
		return this.animal.getNome();
	}

	public String getTipo() {
		return this.animal.getTipo();

	}

	public int getIdade() {
		return this.animal.getIdade();
	}
	public String toString(){
		double valor = getValor();
		DecimalFormat formNumero = new DecimalFormat(); //cria uma instancia dessa classe
		formNumero.setMaximumFractionDigits(2); //passa quanto é o maximo de casas decimais que vc quer
		formNumero.format(valor);//formata seu número
		return this.getNome()+", "+this.getTipo()+", "+this.getDias()+" dias com o preço de R$ "+valor;
	}
}
