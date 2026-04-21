package Exercice_1;

import Exercice_1.Forme;

public class Carre extends Forme {

	
	private double largeur, hauteur;

	public Carre(String couleur, double largeur, double hauteur) {
		super(couleur);
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	@Override
	public void dessiner() {
		System.out.println(
				"Dessiner un Carre de couleur " + couleur + ", largeur=" + largeur + ", hauteur=" + hauteur);
	}

}
