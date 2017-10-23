package boletin3_2;

import java.util.Scanner;

public class Boletin3_2 {

    public static void main(String[] args) {
        
        Satelite satelite1 = new Satelite();
        
        satelite1.verPosicion();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserta los parámetros");
        
        satelite1.setSatelite(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        
        satelite1.verPosicion();
        
    }
    
}
