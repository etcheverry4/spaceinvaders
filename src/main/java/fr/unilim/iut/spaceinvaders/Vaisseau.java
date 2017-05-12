package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

	Position origine;
	Dimension dimension;

	public Vaisseau(int longueur, int hauteur) {

		this(longueur, hauteur, 0, 0);

	}

	public Vaisseau(int longueur, int hauteur, int x, int y) {

		this(new Dimension(longueur, hauteur), new Position(x, y));

	}

	public Vaisseau(Dimension dimension, Position positionOrigine) {
		
		this.dimension = dimension;
		this.origine = positionOrigine;
		
	}

	public boolean occupeLaPosition(int x, int y) {

		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));

	}

	public boolean estOrdonneeCouverte(int y) {

		return (ordonneeLaPlusHaute() <= y) && (y <= ordonneeLaPlusBasse());

	}

	public int ordonneeLaPlusBasse() {

		return this.origine.ordonnee();

	}

	public int ordonneeLaPlusHaute() {

		return ordonneeLaPlusBasse() - this.dimension.hauteur() + 1;

	}

	public boolean estAbscisseCouverte(int x) {

		return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());

	}

	public int abscisseLaPlusAGauche() {

		return this.origine.abscisse();

	}

	public int abscisseLaPlusADroite() {

		return abscisseLaPlusAGauche() + this.dimension.longueur() - 1;

	}

	public int abscisse() {

		return abscisseLaPlusAGauche();

	}

	public void seDeplacerVersLaDroite() {

		this.origine.changerAbscisse(this.origine.abscisse() + 1);

	}

	public void seDeplacerVersLaGauche() {

		this.origine.changerAbscisse(this.origine.abscisse() - 1);

	}

	public void positionner(int x, int y) {

		this.origine.changerAbscisse(x);
		this.origine.changerOrdonnee(y);

	}

}