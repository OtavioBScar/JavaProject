package lista2;

public class Lista2Exercicios {

	public static double PorcentagemAumento(double salario) {
		double aumento = 0;
		
		if (salario < 500) {
			aumento = 1.2;
		} else if (salario >= 500 && salario < 1000) {
			aumento = 1.15;
		} else if (salario >= 1000 && salario < 2000) {
			aumento = 1.1;
		} else if (salario >= 2000) {
			aumento = 1;
		}
		
		double novoSalario = salario * aumento;
		return novoSalario;
	}
	
	public static String NumeroPorExtenso(int numero) {
		String[] nums = {"zero", "um", "dois","tres", "quatro", "cinco",
				"seis", "sete", "oito", "nove", "dez", "onze", "doze",
				"treze", "quatorze", "quinze", "dezesseis", "dezessete",
				"dezoito", "dezenove", "vinte"};
		if (numero < 0 || numero > 20) {
			return "Digite um número entre 0 e 20";
		} else {
		return nums[numero];
		}
	}
}
