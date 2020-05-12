package simulation;

public class Adres {
	public String miasto;
	public String ulica;
	Adres(){
		
	}
public void setAdres(String miasto, String ulica) {
	this.miasto = miasto;
	this.ulica = ulica;
}
public String getAdres() {
	return miasto + ", " + ulica;
}
}
