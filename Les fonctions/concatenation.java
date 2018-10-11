import java.io.*;

public class concatenation {
    public static void main(String[] args) {
        System.out.println("Ecrit ton premier mot");
        String mot_1 = Console.lireStr();
        System.out.println("Ecrit ton deuxième mot");
        String mot_2 = Console.lireStr();

        concatenation(mot_1, mot_2);
    }

    public static void concatenation(String word_1, String word_2) {
        System.out.println("Les chaines concatenés donnent : " + word_1 + word_2);
    }
}