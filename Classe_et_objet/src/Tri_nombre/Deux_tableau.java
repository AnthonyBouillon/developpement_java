
package Tri_nombre;
import java.util.*;
public class Deux_tableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Instanciation de la classe Tri_nombre
        Tri_nombre Order_array = new Tri_nombre();
        int number = 0;
        // Fait deux fois
        while(number < 2){
            number++;
            System.out.println("Saisissez la taille du tableau");
            // Assigne une taille au tableau (attribut de la classe Tri_nombre)
            Order_array.size = sc.nextInt();
            Order_array.array = new int[Order_array.size];

            // Appel des trois méthodes de la classe Tri_nombre
            Order_array.entry(Order_array.array);
            Order_array.order(Order_array.array);
            Order_array.get_array(Order_array.array);
        }

    }
}
