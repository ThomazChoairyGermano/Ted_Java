package tec.thomaz.app;

import tec.thomaz.exerc.Exerc02;

public class App02 {

	public static void main(String[] args) {
		Exerc02 media01 = new Exerc02(8, 9, 7);
        Exerc02 media02 = new Exerc02(4, 5, 6);

        
        System.out.println(media01.media());
        
        System.out.println(media02.media());
        
        System.out.println((media01.media()+media02.media())/2);

	}

}
