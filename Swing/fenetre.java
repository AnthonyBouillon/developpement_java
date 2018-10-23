import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.*;

public class fenetre {
    public static void main(String[] args) {
        // Instanciation de la classe JRame()
        JFrame fenetre = new JFrame();
        // Défini la taille
        fenetre.setSize(800, 600);
        // Défini le titre de la fenetre
        fenetre.setTitle("Titre de l'application");
        // Permet de fermer la fenetre et d'arreter le programe
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centre la fenetre
        fenetre.setLocationRelativeTo(null);
        // Défini la couleur de fond
        fenetre.getContentPane().setBackground(Color.ORANGE);
        // -----------------------------------------------------

        // Affiche la fenetre
        fenetre.setVisible(true);
    }
}
