package simulation;

public class Sklep {
	
private int nrSklep;
private String nazwaSklep;
private Adres adresSklep = new Adres();
private String typ;
int zysk;

public Sklep(String nazwaSklep, String miasto, String ulica, int nrSklep){
	this.nazwaSklep = nazwaSklep;
	this.adresSklep.setAdres(miasto, ulica);
	this.nrSklep = nrSklep;
}

String getTyp() {
	return typ;
}
public double getZysk() {
	return zysk;
}
public String getNazwa() {
	return nazwaSklep;
}
public String getAdres() {
	return adresSklep.getAdres();
}

void Info(){
	System.out.println("Id: " + nrSklep);
	System.out.println(getNazwa());
	System.out.println(getAdres());
	System.out.println(getTyp());
	System.out.println("Zysk równy " + getZysk() + " z³");
}
}
