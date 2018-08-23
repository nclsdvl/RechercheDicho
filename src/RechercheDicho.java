import utils.utilitaires;



public class RechercheDicho {


    public static void main (String [] args){
        int [] TabEntiers = {-17, -14, -3, 0, 5, 7, 9, 14, 20, 32};
        int x = utilitaires.saisirEntier("Merci d entrer le nombre à trouver", "X");
        rechercherEntier(TabEntiers, x);
    }

    public static int rechercherEntier ( int [] TabEntiers, int x){
        boolean trouve = false;



        int ideb = 0;
        int ifin = TabEntiers.length;
        int im = (ifin-ideb)/2;

        while (trouve == false && (ifin - ideb)>1){

            im =ideb +  (ifin - ideb)/2;

            if (x<TabEntiers[im]){
                ifin = im;
            }else if (x > TabEntiers[im]){
                ideb = im;
            }else {
                if (x == TabEntiers[im]){
                    trouve = true;
                    utilitaires.afficherBoiteDeDialogue( "l'indice de "+x+ " dans ce tableau est " +im,  "Résultat");
                }

            }
        }

        if (trouve){
            return im;
        }
        else{
            utilitaires.afficherBoiteDeDialogue( "x n'est pas dans le tableau!!!",  "Résultat");
        }

        return -1;

    }
}
