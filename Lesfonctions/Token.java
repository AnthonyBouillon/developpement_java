import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {

        String string_1 = "Film;Serie;Anime";

        System.out.println("Quel élément vous désirez ?");
        int n = Console.lireI();

        token(string_1, ";", n);
    }

    public static void token(String string_1, String string_2, int n) {
        StringTokenizer strtok = new StringTokenizer(string_1, string_2);
        for (int i = 1; i < n; i++) {
            strtok.nextElement();
        }
        System.out.println(strtok.nextElement());
    }
}