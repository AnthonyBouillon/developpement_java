public class Additionneur {
    public static void main(String[] arguments) {
        System.out.println("**** Additionneur et diviseur (V1.0, 24/09/18) ****");
        int answer, number_1, number_2, result_adition;
        float result_division;

        System.out.println("Voulez vous addtionner ? (oui pour 0 / 1 pour non)");
        answer = Console.lireI();
        if (answer == 0) {
            System.out.println("Ecriver un premier nombre");
            number_1 = Console.lireI();
            System.out.println("Ecriver un second nombre");
            number_2 = Console.lireI();
            result_adition = number_1 + number_2;
            System.out.println(
                    "Le resultat de l'adition : " + number_1 + " + " + number_2 + " est egale a " + result_adition);
        } else {
            System.out.println("Voulez vous diviser ? (oui pour 0 / 1 pour non)");
            answer = Console.lireI();
            if (answer == 0) {
                System.out.println("Ecriver un premier nombre");
                number_1 = Console.lireI();
                System.out.println("Ecriver un second nombre");
                number_2 = Console.lireI();
                result_division = number_1 / number_2;
                System.out.println("Le resultat de la division : " + number_1 + " + " + number_2 + " est egale a "
                        + result_division);
            } else {
                System.out.println("Alors pourquoi tu me fait chier ?");
            }

        }

    }
}