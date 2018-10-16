import java.io.*;
import java.util.*;
import java.lang.*;

public class Nombre_de_mot {
    public static void main(String[] args) {
        // -----------------------------------------------------------------------------
        // RECUPERATION DE LA PHRASE DE L'UTILISATEUR
        System.out.print("Saisissez une phrase : ");
        String phrase = Console.lireStr();
        // -----------------------------------------------------------------------------
        // APPELLE LA FONCTION
        nombre_de_mot(phrase);
    }

    // -----------------------------------------------------------------------------
    // FONCTION QUI COMPTE LE NOMBRE DE MOT DANS UNE PHRASE
    public static void nombre_de_mot(String phrase_utilisateur) {
        // Regex qui remplace tout caractères spéciaux par rien
        phrase_utilisateur = phrase_utilisateur.replaceAll("[';.,?/:+=%*)}{!(\"\t@&|<>]", "");
        // Compte le nombre d'espaces
        int nombre_de_mot = phrase_utilisateur.split(" ").length;
        System.out.print("Il y a : " + nombre_de_mot + " mots");
    }
}