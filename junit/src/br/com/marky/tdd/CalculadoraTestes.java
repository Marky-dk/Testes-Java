package br.com.marky.tdd;

public class CalculadoraTestes {
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		int soma = c.somar(4, 7);
		System.out.println(soma);
		
		soma = c.somar(0, 7);
		System.out.println(soma);
		
		soma = c.somar(0, 0);
		System.out.println(soma);
		
		soma = c.somar(4, -7);
		System.out.println(soma);
	}

}
