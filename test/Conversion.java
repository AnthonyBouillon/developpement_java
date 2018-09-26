public class Conversion {
    public static void main(String[] arguments) {
        System.out.println("**** Conversion temperature (V1.0, 25/09/18) ****");
        float fahrenheit, celcius, result;
        System.out.println("Ecriver la temperature en Fahrenheit");
        fahrenheit = Console.lireD();
        celcius = fahrenheit - 32;
        result = celcius / 1.8;
        System.out.println(fahrenheit + " en celcius fait : " + result);
    }
}