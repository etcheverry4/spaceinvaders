package fr.unilim.iut.spaceinvaders;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fr.unilim.iut.spaceinvaders.moteurjeu.DessinJeu;

public class DessinSpaceInvaders implements DessinJeu {

	private SpaceInvaders si;

	public DessinSpaceInvaders(SpaceInvaders si) {

		this.si = si;

	}

	@Override
	public void dessiner(BufferedImage image) {

		if (this.si.aUnVaisseau()) {

			Vaisseau vaisseau = this.si.recupererVaisseau();
			this.dessinerUnVaisseau(vaisseau, image);

		}

	}

	private void dessinerUnVaisseau(Vaisseau vaisseau, BufferedImage im) {
		
		Graphics2D crayon = (Graphics2D) im.getGraphics();

		crayon.setColor(Color.gray);
		crayon.fillRect(vaisseau.abscisseLaPlusAGauche(), vaisseau.ordonneeLaPlusHaute(), vaisseau.longueur(), vaisseau.hauteur());

	}

}
