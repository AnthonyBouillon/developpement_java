public class Exercice3 {
    public static void main(String[] args) {
        System.out.println("Calculette + try catch");
        int number_1, number_2;
        char operator;
        int result;
        System.out.println("Ecriver un nombre");
        number_1 = Console.lireI();
        System.out.println("Ecriver un deuxième nombre");
        number_2 = Console.lireI();
        System.out.println("Ecriver un opérateur (+, -, *, /)");
        operator = Console.lireC();
        if (operator == '+') {
            result = number_1 + number_2;
            System.out.println("Le résultat est : " + result);
        } else if (operator == '-') {
            result = number_1 - number_2;
            System.out.println("Le résultat est : " + result);
        } else if (operator == '*') {
            result = number_1 * number_2;
            System.out.println("Le résultat est : " + result);
        } else if (operator == '/') {
            try {
                result = number_1 / number_2;
                System.out.println("Le résultat est : " + result);
            } catch (ArithmeticException e) {
                System.out.println("C'est une division par 0");
            }
        } else {
            System.out.println("L'opérateur n'est pas conforme");
        }
    }
}