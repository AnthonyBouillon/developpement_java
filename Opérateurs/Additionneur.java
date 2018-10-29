public class Additionneur {
    public static void main(String[] arguments) {
        System.out.println("**** Additionneur et diviseur (V1.0, 24/09/18) ****");
        int answer;
        double number_1, number_2, result_adition, result_division;

        System.out.println("Voulez vous addtionner ? (oui pour 0 / 1 pour non)");
        answer = Console.lireI();
        if (answer == 0) {
            System.out.println("Ecriver un premier nombre");
            number_1 = Console.lireD();

            System.out.println("Ecriver un second nombre");
            number_2 = Console.lireD();

            result_adition = number_1 + number_2;
            System.out.println(
                    "Le resultat de l'adition : " + number_1 + " + " + number_2 + " est egale a " + result_adition);
        } else {
            System.out.println("Voulez vous diviser ? (oui pour 0 / 1 pour non)");
            answer = Console.lireI();
            if (answer == 0) {
                System.out.println("Ecriver un premier nombre");
                number_1 = Console.lireD();

                System.out.println("Ecriver un second nombre");
                number_2 = Console.lireD();

                result_division = number_1 / number_2;
                System.out.println("Le resultat de la division : " + number_1 + " + " + number_2 + " est egale a "
                        + result_division);
            }

        }

    }
}