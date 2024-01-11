import java.util.ArrayList;

public class Historique {

	private ArrayList<Double> valeurs = new ArrayList<Double>();;

	/** Construire un historique vide.  */
	public Historique() {
	}

	/** Enregistrer une nouvelle information dans l'historique
	 * @param info l'information à enregistrer dans l'historique
	 */
	public void enregistrer(double info) {
		this.valeurs.add(info);
	}


	/** La i<SUP>è</SUP> valeur de l'historique, 1 correspond à la plus
	 * ancienne, getNbValeurs() à la plus récente (la dernière).
	 *
	 * <b>Attention :</b> Cette convention est différente de celle
	 * traditionnellement adoptée en Java pour les tableaux et vecteurs !
	 * @param i indice de l'opération compris en 1 et getNbValeurs().
	 */
	public  double getValeur(int i) { //implementation
		return this.valeurs.get(i-1);
	}

	/** Le nombre d'entiers enregistrés dans l'historique
	 * @return le nombre d'entiers dans l'historique
	 */
	public int getNbValeurs() {
		return this.valeurs.size();
	}

	public String toString() {
		return this.valeurs.toString();
	}
}
