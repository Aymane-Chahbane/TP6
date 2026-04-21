package exercice_3;

import java.util.ArrayList;
import java.util.List;

import exercice_3.Developpeur;
import exercice_3.Manager;
import exercice_3.Personne;
import exercice_3.Utils;

public class TestPersonnes {
    public static void main(String[] args) {
        List<Personne> equipe = new ArrayList<>();
        equipe.add(new Developpeur("Ali", 2000));
        equipe.add(new Manager("Hamid",      3000));
        equipe.add(new Developpeur("Hanane", 2200));

        // Affiche chaque personne via la méthode générique
        Utils.listerPersonnes(equipe);
    }
}
