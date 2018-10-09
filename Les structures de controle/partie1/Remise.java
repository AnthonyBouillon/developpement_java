import java.util.*;

public class Remise {
    public static void main(String[] args) {
        // Prix unitaire
        double PU;
        double QTE;
        double PAP;
        // Prix total
        double TOT;
        double PORT;
        double REM = 0;

        System.out.println("Ecriver le prix unitaire d'un produit");
        PU = Console.lireD();

        System.out.println("Ecriver la quantité commandée");
        QTE = Console.lireD();

        // Prix total = prix unitaire * quantité
        TOT = PU * QTE;
        // Si le prix total est supérieur à 500 euros,
        // le port est gratuit et la remise est de 10%
        if (TOT > 500) {
            REM = TOT * 0.1;
            PORT = 0;
            TOT = TOT - REM;
            PAP = TOT;
            System.out.println("Le prix total est de : " + PAP + " euros.");
        } else if (TOT >= 100 && TOT <= 200) {
            REM = TOT * 0.05;
            PORT = TOT * 0.02;
            if (PORT < 6) {
                PORT = 6;
            }
            TOT = TOT - REM;
            TOT = TOT + PORT;
            PAP = TOT;
            System.out.println("Le prix total est de : " + PAP + " euros.");
        } else if (TOT > 200 && TOT <= 500) {
            REM = TOT * 0.10;
            PORT = TOT * 0.02;
            if (PORT < 6) {
                PORT = 6;
            }
            TOT = TOT - REM;
            TOT = TOT + PORT;
            PAP = TOT;
            System.out.println("Le prix total est de : " + PAP + " euros.");
        } else if (TOT < 100) {
            PORT = TOT * 0.02;
            if (PORT < 6) {
                PORT = 6;
            }
            TOT = TOT + PORT;
            PAP = TOT;
            System.out.println("Le prix total est de : " + PAP + " euros.");
        }
    }
}