import java.util.*;

public class RechercheDonneeTableau {

    public static void main(String[] args) {
        System.out.println("Créer un tableau, supprimer un élément, rechercher un élément");
        // ---------------------------------------------------------------------------------
        // CREATION DES VARIABLES
        String firstname;
        boolean search = false;
        // ---------------------------------------------------------------------------------
        // CREATION DU TABLEAU
        ArrayList<String> array = new ArrayList<String>();
        array.add("Marie");
        array.add("Océanne");
        array.add("Samantha");
        array.add("Tommy");
        array.add("Jerry");

        array.add("Anthony");
        array.add("Nassim");
        array.add("Amadou");
        array.add("Marion");
        array.add("Alban");

        array.add("Abbé");
        array.add("Antoine");
        array.add("Chris");
        array.add("Toufik");
        array.add("Thomas");

        array.add("Quentin");
        array.add("Stéphane");
        array.add("Sebastien");
        array.add("Manuela");
        array.add("André");

        // ---------------------------------------------------------------------------------
        // AFFICHAGE DU TABLEAU
        for (int index = 0; index < array.size(); index++) {
            System.out.println("INDICE : " + index + " || " + array.get(index));
        }
        // ---------------------------------------------------------------------------------
        // RECUPERATION DU PRENOM RECHERCHE
        System.out.print("Chercher le prénom : ");
        firstname = Console.lireStr();

        // ---------------------------------------------------------------------------------
        // AFFICHAGE DU TABLEAU
        for (int index = 0; index < array.size(); index++) {
            System.out.println("INDICE : " + index + " || " + array.get(index));
        }
        // ---------------------------------------------------------------------------------
        // VERIFICATION DU PRENOM
        for (int index = 0; index < array.size(); index++) {
            if (firstname.equals(array.get(index))) {
                search = true;
                array.remove(index);
                array.add("");
            }
        }
        // ---------------------------------------------------------------------------------
        // AFFICHAGE DU TABLEAU APRES SUPPRESSION
        for (

                int index = 0; index < array.size(); index++) {
            System.out.println("INDICE : " + index + " || " + array.get(index));
        }
        // ---------------------------------------------------------------------------------
        // REPONSE
        if (search == true) {
            System.out.println(firstname + " à était trouvé");
        } else {
            System.out.println(firstname + " n'a pas était trouvé");
        }
    }

}