public class Changeable {
    public static void main(String[] arguments) {
        System.out.println("**** Variable changeable (V1.0, XX/XX/XX) ****");
        int nX;
        int nY;
        int nA;
        System.out.println("Ecriver la valeur de nX");
        nX = Console.lireI();
        System.out.println("La valeur de nX est : " + nX);
        System.out.println("Ecriver la valeur de nY");
        nY = Console.lireI();
        System.out.println("La valeur de nX est : " + nY);
        nA = nX;
        nX = nY;
        nY = nA;
        System.out.println("A présent la valeur de nX est : " + nA);
        System.out.println("A présent la valeur de nY est : " + nX);
        System.out.println("A présent la valeur de nX est : " + nX);
        System.out.println("A présent la valeur de nY est : " + nY);
    }
}