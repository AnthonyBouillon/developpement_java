import java.io.*;
import java.util.*;
import java.lang.*;

public class introduction {
    public static void main(String[] args) {
        System.out.print("Saisissez une phrase : ");
        String phrase = Console.lireStr();
        nombre_de_mot(phrase);
    }

    public static void nombre_de_mot(String phrase_utilisateur) {
        phrase_utilisateur = phrase_utilisateur.replaceAll("[';.,?/:+=%*)}{!(\"\t@&|<>]", "");
        int nombre_de_mot = phrase_utilisateur.split(" ").length;
        System.out.print("Il y a : " + nombre_de_mot + " mots");
    }
}