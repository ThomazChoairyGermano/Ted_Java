package tec.thomaz.exerc;

public class Exerc05 {
	private double salarioMinimo;
    private double salarioUsuario;

    public Exerc05(double salarioMinimo, double salarioUsuario) {
        this.salarioMinimo = salarioMinimo;
        this.salarioUsuario = salarioUsuario;
    }

    
    public double calcQuantiSalMin(){
        double quantiSalMin = salarioUsuario / salarioMinimo;
        return quantiSalMin;
    }

}
