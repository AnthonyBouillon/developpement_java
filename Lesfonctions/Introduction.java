public class Introduction {
    public static void main(String[] args) {
        System.out.println("Calculette");
        int nombre_1, nombre_2;
        char operateur;
        double resultat;

        System.out.println("Ecriver un nombre");
        nombre_1 = Console.lireI();

        System.out.println("Ecriver un deuxième nombre");
        nombre_2 = Console.lireI();

        System.out.println("Ecriver un opérateur (+, -, *, /)");
        operateur = Console.lireC();

        Operation(operateur, nombre_1, nombre_2);
    }

    public static double Additionneur(int number_1, int number_2) {
        double result;
        result = number_1 + number_2;
        return result;
    }

    public static double Soustraction(int number_1, int number_2) {
        double result;
        result = number_1 - number_2;
        return result;
    }

    public static double Multiplication(int number_1, int number_2) {
        double result;
        result = number_1 * number_2;
        return result;
    }

    public static double Division(int number_1, int number_2) {
        double result;
        result = number_1 / number_2;
        return result;
    }

    public static void Operation(char operateur, int nombre_1, int nombre_2) {
        double resultat;
        if (operateur == '+') {
            resultat = Additionneur(nombre_1, nombre_2);
            System.out.println(resultat);
        } else if (operateur == '-') {
            resultat = Soustraction(nombre_1, nombre_2);
            System.out.println(resultat);
        } else if (operateur == '*') {
            resultat = Multiplication(nombre_1, nombre_2);
            System.out.println(resultat);
        } else if (operateur == '/') {
            if (nombre_2 == 0) {
                System.out.println("Division par zero impossible");
            } else {
                resultat = Division(nombre_1, nombre_2);
                System.out.println(resultat);
            }
        }
    }

}
