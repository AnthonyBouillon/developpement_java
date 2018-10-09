public class Ascii {
    public static void main(String[] args) {
        // Le int devient un char
        int a;
        System.out.println("Ecriver le code Unicode en decimal");
        a = Console.lireI();
        // Je transforme la valeur de a en unicode décimal
        System.out.println((char) a);
    }
}