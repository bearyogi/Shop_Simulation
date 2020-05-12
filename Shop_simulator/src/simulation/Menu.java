package simulation;

public enum Menu {
	FLAKI(5.5,"Flaki"),
	CHLODNIK(8.2,"Ch³odnik"),
	FRYTKI(4.0,"Frytki"),
	ZIEMNIAKI(2.5,"Ziemniaki"),
	BIGOS(6.5,"Bigos"),
	PYZY(3.7,"Pyzy"),
	KOTLET_SCHABOWY(9.5,"Kotlet Schabowy"),
	NALESNIKI(4.5,"Naleœniki"),
	SUROWKA(1.9,"Surówka"),
	CHLEB(0.5,"Chleb"),
	KAWA(3.0,"Kawa"),
	HERBATA(2.5,"Herbata"),
	LODY(10.0,"Lody");
	
	private double cena;
	private String nazwa;
	Menu(double cena, String nazwa){
	this.cena = cena;
	this.nazwa = nazwa;
	}
	
	double getCena(){
		return cena;
	}
	String getNazwa() {
		return nazwa;
	}
}
