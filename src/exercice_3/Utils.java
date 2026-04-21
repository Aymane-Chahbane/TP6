package exercice_3;

import java.util.List;
import exercice_3.Personne;
public class Utils {
   
	
    public static void listerPersonnes(List<? extends Personne> personnes) {
        for (Personne p : personnes) {
            p.affiche();
        }
    }
}
