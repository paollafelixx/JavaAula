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
		System.out.println("O nome do produto é  " + getNome() + 
				"\nO preço do produto é " + getPreco() + 
				"\nO peso do produto é " + getPeso() + 
				"\nO tipo de chocolate é " + getTipoChocolate() + 
				"\nO formato desse chocolate é " + getFormato());
	}

	public double calcularPesoTotal(double pesoEmbalagem) {
		double soma = pesoEmbalagem + getPeso();
		return soma;
		
	}
}
