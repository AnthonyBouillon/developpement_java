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
public class Cercle extends Forme{
    private float rayon;

    public Cercle(float r){
        rayon = r;
    }

    public float Aire(){
        return (float)(Math.PI * Math.pow(rayon, 2));
    }
}

