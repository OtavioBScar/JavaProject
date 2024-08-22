package lista2;

import javax.swing.JOptionPane;

public class ConsumidorDeClasses {

	public static void main(String[] args) {
		// consome classe PorcentagemAumento
		double salario = Double.parseDouble(
				JOptionPane.showInputDialog("Seu salário: ")
		);
		double novoSalario = Lista2Exercicios.PorcentagemAumento(salario);
		System.out.println("Seu novo salário será: R$" + novoSalario);
		
		// consome classe NumeroPorExtenso
		int numero = Integer.parseInt(
				JOptionPane.showInputDialog("Número: ")
		);
		String Extenso = Lista2Exercicios.NumeroPorExtenso(numero);
		System.out.println(Extenso);
	}

}
