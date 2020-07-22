package view;

import java.awt.GridBagConstraints;

/**
 * Il est utilis� pour d�finir la contrainte du gridbaglayout.
 *
 */
public class Constraint
{
	private static GridBagConstraints constraint = new GridBagConstraints();

	/**
	 * D�finissez la position / les param�tres visuels d'un �l�ment avant de l'ajouter
* sur le panneau.
	 * 
	 * @param constraint
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param weightx
	 * @param weighty
	 * @param anchor
	 * @param fill
	 */
	public static void setup(int x, int y, int width, int height, double weightx, double weighty, int anchor, int fill)
	{
		constraint.gridx = x;
		constraint.gridy = y;
		constraint.gridwidth = width;
		constraint.gridheight = height;
		constraint.weightx = weightx;
		constraint.weighty = weighty;
		constraint.anchor = anchor;
		constraint.fill = fill;
	}

	/**
	 * Renvoie la contrainte.
	 * 
	 * @return constraint
	 */
	public static GridBagConstraints get()
	{
		return constraint;
	}
}
