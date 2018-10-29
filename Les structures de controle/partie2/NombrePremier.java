import java.util.Scanner;

public class NombrePremier {
    public static void main(String[] args) {
        System.out.println("CALCUL NOMBRE PREMIER");
        int n;
        boolean isPremier = true;
        System.out.println("Ecriver votre nombre");
        n = Console.lireI();

        if (n <= 1) {
            System.out.println("Non Premier");
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Non Premier");
            } else {
                System.out.println("Premier");
            }
        }

    }
}