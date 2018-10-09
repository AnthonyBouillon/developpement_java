
public class SommeEntierInferieur {
    public static void main(String[] args) {
        System.out.println("Ecriver votre nombre");
        int number_saisie = Console.lireI();

        int number_1 = 10;
        for (int number = 0; number < number_saisie; number++) {
            System.out.println(number);
        }

    }
}