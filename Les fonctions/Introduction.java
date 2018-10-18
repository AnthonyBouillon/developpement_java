public class Introduction {
    public static void main(String[] args) {
        System.out.println("Calculette + try catch");
        int nombre_1, nombre_2;
        char operateur;

        System.out.println("Ecriver un nombre");
        nombre_1 = Console.lireI();

        System.out.println("Ecriver un deuxième nombre");
        nombre_2 = Console.lireI();

        System.out.println("Ecriver un opérateur (+, -, *, /)");
        operateur = Console.lireC();

        calculator(operateur, nombre_1, nombre_2);
    }

    public static void calculator(char operator, int number_1, int number_2) {
        double result;
        switch (operator) {
        case '+':
            result = number_1 + number_2;
            System.out.println("Le résultat est : " + result);
            break;
        case '-':
            result = number_1 - number_2;
            System.out.println("Le résultat est : " + result);
            break;
        case '*':
            result = number_1 * number_2;
            System.out.println("Le résultat est : " + result);
            break;
        case '/':
            try {
                result = number_1 / number_2;
                System.out.println("Le résultat est : " + result);
            } catch (ArithmeticException e) {
                System.out.println("C'est une division par 0");
            }
            break;
        default:
        }
    }
}
