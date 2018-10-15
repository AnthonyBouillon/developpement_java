import java.io.*;
import java.util.*;
import java.lang.*;

public class multiplication {
    public static void main(String[] args) {
        System.out.print("Saisissez la table à multiplier : ");
        int nombre = Console.lireI();
        table(nombre);
    }

    public static void table(int table_a_multiplier) {
        for (int i = 1; i < 11; i++) {
            int multiplication = table_a_multiplier * i;
            System.out.println(i + " x " + table_a_multiplier + " = " + multiplication);
        }
    }
}
