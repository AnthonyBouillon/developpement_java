/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forme_tcc;

/**
 *
 * @author 80010-37-15
 */
public class main extends Forme {
    public static void main(String[] args) {
        Forme[] Tableau = { new Carre(2), new Cercle(3), new Triangle(5,7)};
        float s = 0;

        for (Forme fo : Tableau){
         s += fo.Aire(); 
         System.out.println(s);
        }
        
    }
   
      

}
