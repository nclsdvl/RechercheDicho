package utils;


import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Michel-HP
 */
public class utilitaires {

    public static int saisirEntier(String s, String x) {

        int entier = 0;
        boolean encore = true;
        String valeurSaisie = "";

        while (encore == true) {
            valeurSaisie = showInputDialog(null, "Veuillez la valeur d'un entier ", "Entier", QUESTION_MESSAGE);
            try {
                entier = new Integer(valeurSaisie);
                System.out.println("entier vaut : " + entier);
                encore = false;
            } catch (NumberFormatException nfe) {
                showMessageDialog(null, "Veuillez entrer un entier SVP ", "Erreur", ERROR_MESSAGE);
            }
        }
        return entier;
    }
    public static void afficherBoiteDeDialogue(String message, String titre) {
        showMessageDialog(null, message, titre, INFORMATION_MESSAGE);
    }
}
