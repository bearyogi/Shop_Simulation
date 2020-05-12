package simulation;

public enum Gazety {
	WPROST(2.5,3.0,"Tygodnik Wprost"),
	NEWSWEEK(2.25,2.75,"Tygodnik Newsweek"),
	WYBORCZA(1.8,2.0,"Gazeta Wyborcza"),
	FORBES(4.9,5.7,"Miesiêczniki Forbes"),
	PLAY(7.0,7.45,"Miesiêczniki Play");
	
	private double cenaHurt;
	private double cenaDetal;
	private String napis;
	
	Gazety(double cenaHurt, double cenaDetal, String napis){
	this.cenaHurt = cenaHurt;
	this.cenaDetal = cenaDetal;
	this.napis = napis;
	}
	
	double getCenaHurtowa() {
		return cenaHurt;
	}
	
	double getCenaDetaliczna() {
		return cenaDetal;
	}
	
	public String toString() {
		return String.format(napis);
	}
}
