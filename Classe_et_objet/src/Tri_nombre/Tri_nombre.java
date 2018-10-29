
package Tri_nombre;
import java.util.*;

public class Tri_nombre {
    public int array[];
    public int size;
    
    // Remplissage du tableau
    public static void entry(int array[]){
        Scanner sc = new Scanner(System.in);
        int key = 0;
        int number;
        System.out.println("Remplissez le tableau de nombre");
        do{
             number = sc.nextInt();
             array[key] = number;
             key++;
        }while(key < array.length);
        System.out.println("Le remplissage est terminé");
    }
    // Trie le tableau dans l'ordre croissant
    public static void order(int array[]){
        int temp;
        int compteur = 0;
        do{
            for (int i = 0; i < array.length -1; i++) {
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            compteur++;
        }while(compteur < array.length);

    }
    // Affiche le tableau
    public static void get_array(int array[]){
        System.out.println("Le tri est terminé");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
