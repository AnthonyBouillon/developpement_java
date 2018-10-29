public class Conversion {
    public static void main(String[] arguments) {
        System.out.println("**** Conversion temperature de Fahrenheit en celcius ****");
        double fahrenheit, celcius, result;
        // Récupère les degrès en Fahrenheit
        System.out.println("Ecriver la temperature en Fahrenheit");
        fahrenheit = Console.lireD();
        // Convertie en celcius
        celcius = fahrenheit - 32;
        result = celcius / 1.8;
        // Affiche le résultat
        System.out.println(fahrenheit + " en celcius fait : " + result);
    }
}