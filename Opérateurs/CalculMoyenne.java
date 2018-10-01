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

        noteSurveiller = noteSurveiller * 3;
        noteInterrogation = noteInterrogation * 2;
        result = (noteSurveiller + noteInterrogation + noteTP) / 6;

        System.out.println("Ta moyenne est de : " + result);
    }

}