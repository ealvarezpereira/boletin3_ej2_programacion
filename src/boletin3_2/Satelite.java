/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_2;

/**
 *
 * @author quique
 */
public class Satelite {
    
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

 public Satelite ( ) {

    meridiano = paralelo = distanciaTerra = 0 ;
}

public void setSatelite ( double m, double p , double d ) {

    meridiano = m ;
    paralelo = p;
    distanciaTerra = d;

}

/*public double getMeridiano (){

    return meridiano;
    
}

public double getParalelo(){            

    return paralelo;
    
}

public double getTerra (){

    return distanciaTerra;

}*/

public void verPosicion ( ) {

System.out.println ("El satélite se encuentra en el paralelo " + paralelo + " meridiano " + meridiano + " a una distancia de la terra " + distanciaTerra);     
    
    
    
}

}