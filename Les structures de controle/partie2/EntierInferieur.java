public class EntierInferieur {
    public static void main(String[] args) {
        int nombre;
        System.out.println("Ecriver un nombre");
        nombre = Console.lireI();
        for (int i = nombre - 1; i >= 0; i--) {
            System.out.println(i);
        }
    }
}