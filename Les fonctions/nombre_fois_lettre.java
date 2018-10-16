import java.io.*;
import java.util.*;

public class nombre_fois_lettre {
    public static void main(String[] args) {
        // -----------------------------------------------------------------------------
        // CREATION DES VARIABLES
        String phrase;
        Character lettre;
        Integer compteur;

        System.out.print("Saisissez votre phrase : ");
        phrase = Console.lireStr();
        phrase = phrase.toLowerCase();

        for (lettre = 'a'; lettre <= 'z'; lettre++) {
            compteur = 0;
            for (int i = 0; i < phrase.length(); i++) {
                if (phrase.charAt(i) == lettre) {
                    compteur++;
                }
            }
            if (compteur > 0) {
                System.out.println(compteur + " : " + lettre);
            }

        }
    }
}