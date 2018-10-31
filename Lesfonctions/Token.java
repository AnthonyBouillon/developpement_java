import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {

        String str1 = "robert;dupont;amiens;80000";
        String str2 = ";";
        int position;

        System.out.println("Entrer la position : ");
        position = Console.lireI();
        StrToken(str1, str2, position);
    }

    public static void StrToken(String str1, String str2, int position) {
        // Compteur de ;
        int compteur = 1;
        String string = "";
        for (int i = 0; i < str1.length(); i++) {
            // Si il tombe sur un ;
            if (str1.substring(i, i + 1).equals(str2)) {
                compteur++;
            }
            // Si on tombe sur un caractère autre que le ; , on affiche le reste des caractères jusqu'au prochain ;
            if ((compteur == position) && (!str1.substring(i, i + 1).equals(str2))) {
                string = string + str1.substring(i, i + 1);
            }
        }
        System.out.print(string);
    }
}