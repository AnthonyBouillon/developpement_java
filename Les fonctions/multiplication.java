import java.io.*;
import java.util.*;
import java.lang.*;

public class multiplication {
    public static void main(String[] args) {
        // -----------------------------------------------------------------------------
        // RECUPERATION DU NOMBRE A MULTIPLIER
        System.out.print("Saisissez la table à multiplier : ");
        int nombre = Console.lireI();
        // -----------------------------------------------------------------------------
        // APPELLE LA FONCTION
        table(nombre);
    }

    // -----------------------------------------------------------------------------
    // FONCTION QUI PERMET DE MULTIPLIER UN NOMBRE JUSQU'A 10
    public static void table(int table_a_multiplier) {
        for (int i = 1; i < 11; i++) {
            int multiplication = table_a_multiplier * i;
            System.out.println(i + " x " + table_a_multiplier + " = " + multiplication);
        }
    }
}
