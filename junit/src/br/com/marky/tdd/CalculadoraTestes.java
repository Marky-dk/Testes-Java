package br.com.marky.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTestes {
	
	@Test	
	public void somaDeDoisNumeros() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}

}
