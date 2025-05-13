package aufgaben.lösung_4.Unrefaktorisiert;

// Einfache Modelklasse (POJO). 
class Adresse {
	
	private String name;
	private String strasse;
	private String stadt;
	private String postleitzahl;
	private String land;
	
	Adresse(String name, String strasse, String stadt, String postleitzahl, String land){
		this.name = name;
		this.strasse = strasse;
		this.stadt = stadt;
		this.postleitzahl = postleitzahl;
		this.land = land;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	public String getPostleitzahl() {
		return postleitzahl;
	}
	public void setPostleitzahl(String postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}	
}

//-----------------------------------------------------------

class Bestellung {
	
	private Versandoption versender;
	private Adresse zielort;
	private Adresse herkunft;
	
	Bestellung(Adresse zielort, Adresse herkunft, Versandoption versender){
		this.zielort = zielort;
		this.herkunft = herkunft;
		this.versender = versender;
	}
	
	public Versandoption getVersendeMethode() {
		return versender;
	}
	public void setVersendeMethode(Versandoption versender) {
		this.versender = versender;
	}
	public Adresse getZielort() {
		return zielort;
	}
	public void setZielort(Adresse zielort) {
		this.zielort = zielort;
	}
	public Adresse getHerkunft() {
		return herkunft;
	}
	public void setHerkunft(Adresse herkunft) {
		this.herkunft = herkunft;
	}	
}

//---------------------------------------------------------------------------------------------------

// Wir simulieren eine einfache Kostenberechnungsanwendung. Die entstehenden Kosten werden auf Basis des
// verwendeten Versandanbieters berechnet: Hermes, DHL, UPS. 
// Auf den ersten Blick sieht diese Klasse ganz normal aus. Wir prüfen den Typ der Versendemethode in einer Enumeration
// und rufen dann eine Methode auf, um die Kosten entsprechend zu berechnen. 
// Was könnten die Probleme sein?
class VersandkostenBerechnungsService {

	public double berechneVersandkosten(Bestellung bestellung) {
		
		double result = -1.00d;
		switch (bestellung.getVersendeMethode()) {
		case DHL:
			result = berechneFuerDHL(bestellung);			
			break;
		case HERMES:
			result = berechneFuerHermes(bestellung);
			break;			
		case UPS:
			result = berechneFuerUPS(bestellung);			
			break;
		}
		return result;
	}
	
	private double berechneFuerUPS(Bestellung bestellung) {
		return 4.00d;
	}

	private double berechneFuerHermes(Bestellung bestellung) {
		return 2.95d;
	}

	private double berechneFuerDHL(Bestellung bestellung) {
		return 3.50d;
	}
}

//---------------------------------------------------------------------------------------------------------------------------------
enum Versandoption{
	HERMES,
	DHL,
	UPS
};

//---------------------------------------------------------------------------------------------------------------------------------

public class VersandkostenBerechnung {

		public static void main(String[] args) {
			
			Adresse zielort = new Adresse("Hendrick", "Zuhause 12", "Dortmund", "12345", "GER");
			Adresse herkunftsort = new Adresse("Gabi", "Wegstraße 12", "Berlin", "54321", "GER");
			
			Bestellung bestellung = new Bestellung(zielort, herkunftsort, Versandoption.HERMES);
			
			VersandkostenBerechnungsService service = new VersandkostenBerechnungsService();
			double versandkosten = service.berechneVersandkosten(bestellung);
			System.out.println(versandkosten);
		}
}
