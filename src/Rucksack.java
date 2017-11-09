import java.util.ArrayList;

/**
 * Ruckack hat die Eigenschaften Platzangebot 
 * @author daniellerch
 *
 */
public class Rucksack {
	private int platz;
	private ArrayList<Gegenstand> inhalt = new ArrayList<Gegenstand>();
	private int packGewicht;
	
	
	/**
	 *  Konstruktor für Rucksack, setzt Platz auf Default 10 und Packgewicht auf null. 
	 */
	public Rucksack() {
		platz = 10;
		packGewicht = 0;	
	}
	
	/**
	 * Konstruktor für Rücksack, der erlaubt die Defaults zu überschreiben
	 * @param platz Platzlimit für den Rucksack
	 * @param inhalt Inhalt des Rucksacks
	 */
	public Rucksack(int platz, Person haelter, ArrayList<Gegenstand> inhalt) {
		this.platz = platz;
		this.inhalt = inhalt;
	}
	
	public int getRucksackPlatz() {
		return platz;
	}
	
	public ArrayList<Gegenstand> getInhalt(){
		return inhalt;
	}
	
	public int gibPackGewicht() {
		for (Gegenstand g : inhalt) {
			packGewicht += g.gibGewicht();
		}
		return packGewicht;
	}
	
}
