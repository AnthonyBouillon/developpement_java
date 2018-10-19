public class SommeIntervalle {
    public static void main(String[] args) {
        int number_1;
        int number_2;
        int resultat = 0;
        System.out.println("Saisissez le premier nombre");
        number_1 = Console.lireI();
        System.out.println("Saisissez le deuxième nombre");
        number_2 = Console.lireI();

        for (int i = number_1 + 1; i < number_2; i++) {
            resultat = resultat + i;
        }
        System.out.println(resultat);
    }
}