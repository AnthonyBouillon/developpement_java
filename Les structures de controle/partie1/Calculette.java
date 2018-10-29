public class Calculette {
    public static void main(String[] args) {
        System.out.println("Calculette + try catch");

        int number_1, number_2;
        char operator;
        int result;

        System.out.println("Ecriver un nombre");
        number_1 = Console.lireI();

        System.out.println("Ecriver un deuxieme nombre");
        number_2 = Console.lireI();

        System.out.println("Ecriver un operateur (+, -, *, /)");
        operator = Console.lireC();

        // Si la valeur de l'opérateur est
        switch (operator) {
        // +
        case '+':
            result = number_1 + number_2;
            System.out.println("Le resultat est : " + result);
            break;
        case '-':
            result = number_1 - number_2;
            System.out.println("Le resultat est : " + result);
            break;
        case '*':
            result = number_1 * number_2;
            System.out.println("Le resultat est : " + result);
            break;
        case '/':
            try {
                result = number_1 / number_2;
                System.out.println("Le resultat est : " + result);
            } catch (ArithmeticException e) {
                System.out.println("C'est une division par 0");
            }
            break;
        default:
        }
    }
}