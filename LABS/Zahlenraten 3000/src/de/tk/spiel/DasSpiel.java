package de.tk.spiel;

public class DasSpiel {
	protected int zufallsZahl, versuche=0;
	private boolean isEnde, isKleiner;
	public int getVersuche() {
		return versuche;
	}
	public boolean isEnde() {
		return isEnde;
	}
	public boolean isKleiner() {
		return isKleiner;
	}
	
	public DasSpiel() {  //Konstruktor
		zufallsZahl = (int) (Math.random()*100)+1;
	}
	
	/**
	 * Eingabe des Benutzers
	 * @param zahl
	 */
	public void eingabe(int zahl) {
		isEnde = zahl == zufallsZahl;
		isKleiner = zufallsZahl<zahl;
		versuche++;
	}
	
	
}
