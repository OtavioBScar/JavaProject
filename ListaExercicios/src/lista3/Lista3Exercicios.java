package lista3;

import java.util.ArrayList;

public class Lista3Exercicios {
		
	public static String Conversor() {
        StringBuilder resultado = new StringBuilder();

        for (int celsius = 10; celsius <= 100; celsius += 10) {
        	double calculo = (celsius * 9/5);
        	int CONSTANTE = 32;
            double fahrenheit = calculo + CONSTANTE;
            resultado.append(celsius).append("C é igual a").append(fahrenheit).append("Fahrenheit"); 
        }

        return resultado.toString();
    }
	
	public static ArrayList<Integer> ListaImpares() {
		
		ArrayList<Integer> listaImpares = new ArrayList<>();
		
		for (int i = 0; i<=20;i++) {
			if (i % 2 != 0) {
				listaImpares.add(i);
			} 
		}
		return listaImpares;
	}
}
	