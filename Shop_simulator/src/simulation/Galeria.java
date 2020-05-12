package simulation;

class Galeria extends Sklep{

	Sklep tabSklep[];
	String typ = "Galeria";
	public Galeria(String nazwaSklep, String miasto, String ulica, int nrSklep, Sklep tabSklep[]){
		super(nazwaSklep,miasto,ulica,nrSklep);
		this.tabSklep = new Sklep[tabSklep.length];
		System.arraycopy(tabSklep,0,this.tabSklep,0,tabSklep.length);
	}
	
	String getTyp() {
		return typ;
	}
	
	public String ListaSklepow() {
		String wynik = "";
		wynik += "\nLista sklepów:\n";
		
		for(int i = 0;i<tabSklep.length;i++)
		{
			wynik+=tabSklep[i].getNazwa();
			wynik+=" - ";
			wynik+=tabSklep[i].getTyp();
			wynik+=" - ";
			wynik+=tabSklep[i].getZysk();
			wynik+=" z³";
			wynik+="\n";
		}
		return wynik;
	}
	
	public double getZysk() {
		double wynik = 0;
		for(int i =0;i<tabSklep.length;i++)
		{
			wynik +=tabSklep[i].getZysk();
		}
		return wynik;
	}
	
	void Info(){
		super.Info();
		ListaSklepow();
	}
}
