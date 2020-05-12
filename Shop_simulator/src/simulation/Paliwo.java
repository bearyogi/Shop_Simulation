package simulation;

public enum Paliwo {

	BENZYNA("benzyna"),
	OLEJ_NAPEDOWY("olej_napedowy"),
	BIOPALIWO("biopaliwo"),
	LPG("LPG");
	String nazwa;
	
	Paliwo(String nazwa){
		this.nazwa = nazwa;
	}
	
	String getNazwa() {
		return nazwa;
	}
}
