import java.util.Scanner;

public class NombrePremier {
    public static void main(String[] args) {
        int n;
        boolean isPremier = true;
        System.out.println("Ecriver votre nombre");
        n = Console.lireI();
        if (n < 0) {
            isPremier = false;
        } else if (n != 0 && n != 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n != i && n % i == 0) {
                    isPremier = false;
                }
            }
        } else {
            isPremier = false;
        }
        if (isPremier == true) {
            System.out.println("C'est un nombre premier");
        } else {
            System.out.println("Ce n'est pas un nombre premier");
        }
    }
}