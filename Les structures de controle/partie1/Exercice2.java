import java.util.*;

public class Exercice2 {
    public static void main(String[] args) {
        int annee;
        int age;
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Ecriver votre année de naissance");
        annee = Console.lireI();
        age = year - annee;
        annee = annee + 18;
        if ((annee - 18) == (year - 18)) {
            System.out.println(
                    "Suivant le mois et le jour vous êtes mineur ou majeur et vous avez environs " + age +   ans");
        } else if (annee < year) {
            System.out.println("Vous êtes majeur et vous avez " + age + " ans"); 
        } else {
            System.out.println("Vous êtes mineur et vous avez " + age + " ans"); 
            System.out.println(year - 18);
        }
    }
}