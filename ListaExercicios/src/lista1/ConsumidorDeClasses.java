package lista1;

import javax.swing.JOptionPane;

public class ConsumidorDeClasses {

	public static void main(String[] args) {
		//Consome classe MetrosParaCm
		double metros = Double.parseDouble(
				JOptionPane.showInputDialog("Metros: ")
		);
		double centimetros = Lista1Exercicios.MtC(metros);
		System.out.println("Conversão: " + centimetros + "cm");
		
		//Consome classe RaioCirculo
		double raio = Double.parseDouble(
				JOptionPane.showInputDialog("Raio do Circulo: ")
		);
		double AreaCirculo = Lista1Exercicios.RaioCirculo(raio);
		System.out.println("Área do circulo: " + AreaCirculo);
	}
}
