import java.io.*;
import java.util.*;
import java.lang.*;

public class Nombre_de_mot {
    public static void main(String[] args) {
        // -----------------------------------------------------------------------------
        // RECUPERATION DE LA PHRASE DE L'UTILISATEUR
        System.out.print("Saisissez une phrase : ");
        String word = Console.lireStr();
        // -----------------------------------------------------------------------------
        // APPELLE LA FONCTION
        word_number(word);
    }

    // -----------------------------------------------------------------------------
    // FONCTION QUI COMPTE LE NOMBRE DE MOT DANS UNE PHRASE
    public static void word_number(String word_user) {
        word_user = word_user.replaceAll("[';.,?/:+=%*)}{!(\"\t@&|<>]", "");
        StringTokenizer test = new StringTokenizer(word_user);
        System.out.println(test.countTokens());
    }
}