import java.util.*;

public class RecupererAnnee {
    public static void main(String[] args) {
        int annee;
        int age;
        // Récupère le calendrier
        Calendar calendar = new GregorianCalendar();
        // Récupère l'année d'aujourd'hui
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Ecriver votre année de naissance");
        annee = Console.lireI();
        // L'age de l'utilisateur est égale à l'année saisie moins l'année
        // d'aujourd'hui
        age = year - annee;
        if (age == 18) {
            System.out.println(
                    "Suivant le mois et le jour vous êtes mineur ou majeur et vous avez environs " + age + "ans");
        } else if (age > 18) {
            System.out.println("Vous êtes majeur et vous avez " + age + " ans");
        } else {
            System.out.println("Vous êtes mineur et vous avez " + age + " ans");
        }
    }
}