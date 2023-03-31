package tec.thomaz.app;

import tec.thomaz.exerc.Exerc05;

public class App05 {
	

	public static void main(String[] args) {
		Exerc05 calcSalario = new Exerc05(1300, 3000);
		

        System.out.printf("O salário é %.2f\n", calcSalario.calcQuantiSalMin());

	}

}
