import java.io.*;
import java.util.*;

public class nombre_fois_lettre {
    public static void main(String[] args) {
        // -----------------------------------------------------------------------------
        // CREATION VARIABLE
        String phrase;
        // -----------------------------------------------------------------------------
        // RECUPERATION SAISIE
        System.out.print("Saisissez votre phrase : ");
        phrase = Console.lireStr();
        phrase = phrase.toLowerCase();
        // -----------------------------------------------------------------------------
        // APPELLE FONCTION
        compteur_lettre(phrase);
    }

    public static void compteur_lettre(String phrase_utilisateur) {
        // -----------------------------------------------------------------------------
        // CREATION VARIABLE
        Character lettre;
        Integer compteur;
        // -----------------------------------------------------------------------------
        // LECTURE DE TOUTE L'ALPHABET
        for (lettre = 'a'; lettre <= 'z'; lettre++) {
            compteur = 0;
            // -----------------------------------------------------------------------------
            // COMPTEUR DU NOMBRE DE FOIS QUE LA LETTRE APPARAIT DANS LA PHRASE
            for (int i = 0; i < phrase_utilisateur.length(); i++) {
                if (phrase_utilisateur.charAt(i) == lettre) {
                    compteur++;
                }
            }
            // -----------------------------------------------------------------------------
            // AFFICHE LE RESULTAT
            if (compteur > 0) {
                System.out.println(compteur + " : " + lettre);
            }
        }
    }
}