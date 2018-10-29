public class Changeable {
    public static void main(String[] arguments) {
        System.out.println("**** Variable changeable ****");
        int nX;
        int nY;
        int nA;

        System.out.println("Ecriver la valeur de nX");
        nX = Console.lireI();

        System.out.println("Ecriver la valeur de nY");
        nY = Console.lireI();

        nA = nX;
        nX = nY;
        nY = nA;

        System.out.println("A présent la valeur de nX est : " + nX);
        System.out.println("A présent la valeur de nY est : " + nY);
    }
}