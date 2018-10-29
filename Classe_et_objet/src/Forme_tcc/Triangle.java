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
public class Triangle extends Forme{
    private float base;
    private float hauteur;
    
    public Triangle(float b, float h){
        float result;
        base = b;
        hauteur = h;
        
    }
    public float Aire(){
        return (base*hauteur) / 2;
    }
}
