public class CalculMoyenne {
    public static void main(String[] arguments) {
        System.out.println("**** Calculer une moyenne (V1.0, 25/09/18) ****");
        double noteSurveiller, noteInterrogation, noteTP, result;

        System.out.println("Note de devoir");
        noteSurveiller = Console.lireD();

        System.out.println("Note d'interrogation");
        noteInterrogation = Console.lireD();

        System.out.println("Note de travaux pratique");
        noteTP = Console.lireD();
        // Note * coefficient de la note
        noteSurveiller = noteSurveiller * 3;
        noteInterrogation = noteInterrogation * 2;
        // Résultat des note avec leur coefficient divisé par le nombre de note
        result = (noteSurveiller + noteInterrogation + noteTP) / 6;
        // Affiche
        System.out.println("Ta moyenne est de : " + result);
    }

}