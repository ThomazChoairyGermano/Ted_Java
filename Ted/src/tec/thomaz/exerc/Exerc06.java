package tec.thomaz.exerc;

public class Exerc06 {
	private int numero;
	

    public Exerc06(int numero) {
        this.numero = numero;
    }

    
    public void imprimirAntSuc() {
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        
        

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
    }

}
