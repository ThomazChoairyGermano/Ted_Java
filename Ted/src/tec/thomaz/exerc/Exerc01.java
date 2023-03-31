package tec.thomaz.exerc;

public class Exerc01 {
	
	private int anos;
    private int meses;
    private int dias;

    public Exerc01(){

    }

    public Exerc01(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    
    public int totalDias(){
        int idadeDias = anos * 365 + meses * 30 + dias;
        return idadeDias;
    }

}
