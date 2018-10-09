public class Calculette {
    public static void main(String[] args) {
        System.out.println("Calculette + try catch");
        // Deux variable de type int
        int number_1, number_2;
        char operator;
        int result;
        // Affiche
        System.out.println("Ecriver un nombre");
        // Recupère la saisie
        number_1 = Console.lireI();

        System.out.println("Ecriver un deuxième nombre");
        number_2 = Console.lireI();

        System.out.println("Ecriver un opérateur (+, -, *, /)");
        operator = Console.lireC();
        // Si la valeur de l'opérateur est
        switch (operator) {
        // +
        case '+':
            // Résultat
            result = number_1 + number_2;
            System.out.println("Le résultat est : " + result);
            break;
        // Sinon si
        case '-':
            result = number_1 - number_2;
            System.out.println("Le résultat est : " + result);
            break;
        // Sinon si
        case '*':
            result = number_1 * number_2;
            System.out.println("Le résultat est : " + result);
            break;
        // Sinon si
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