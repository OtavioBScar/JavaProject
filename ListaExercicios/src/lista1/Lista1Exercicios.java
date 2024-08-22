package lista1;

public class Lista1Exercicios {
	
	//Faça uma classe que converta metros para cm
	public static double MtC(double metros) {	
		double centimetros = metros * 100;
		return centimetros;
	}
	
	/*Faça uma classe que peça o raio de um circulo, calcule
	e mostre sua área */
	public static double RaioCirculo(double raio) {
		double PI = 3.14;
		double areaCirculo = PI * Math.pow(raio, 2);
		return areaCirculo;
	}
	
}
