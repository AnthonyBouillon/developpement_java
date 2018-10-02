public class Multiples {
    public static void main(String[] args) {
        System.out.println("Programme qui calcule les N premiers multiples d'un nombre entier X")
        int NUMBER_1;
        int NUMBER_2;
        int NUMBER_1_BIS;

        System.out.println("Saisissez un nombre entier");
        NUMBER_1 = Console.lireI();
        System.out.println("Saisissez un deuxième entier");
        NUMBER_2 = Console.lireI();

        NUMBER_1_BIS = NUMBER_1;

        for (NUMBER_1 = 1; NUMBER_1 <= NUMBER_1_BIS; NUMBER_1++) {
            System.out.println(NUMBER_1 + "*" + NUMBER_2 + " = " + NUMBER_1 * NUMBER_2);
        }
    }
}