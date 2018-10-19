
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Une suite de combien ?");
        int n = Console.lireI();
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        long f0 = 0;
        long f1 = 1;
        // FORMULAIRE DE FIBONACCI
        for (int i = 0; i < n; i++) {
            f0 = f0 + f1; // f0 = 1; f0 = 1; f0 = 2; f0 = 3
            f1 = f0 - f1; // f1 = 0; f1 = 1; f1 = 1;
            System.out.println(f0);
        }
    }
}