package br.com.willywonkabeans;

public class Chocolate extends Produto {

	private String formato;

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public void mostrarAtributo() {
		System.out.println("O nome do produto �  " + getNome() + 
				"\nO pre�o do produto � " + getPreco() + 
				"\nO peso do produto � " + getPeso() + 
				"\nO tipo de chocolate � " + getTipoChocolate() + 
				"\nO formato desse chocolate � " + getFormato());
	}

	public double calcularPesoTotal(double pesoEmbalagem) {
		double soma = pesoEmbalagem + getPeso();
		return soma;
		
	}
}
