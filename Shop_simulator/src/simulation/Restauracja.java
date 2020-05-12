package simulation;
import java.util.ArrayList;

class Restauracja<T> extends Sklep {
	public ArrayList<Zamowienie<T>> zamowienia = new ArrayList<Zamowienie<T>>();
	private int ileStolikow;
	private int czyZajety[];
	private double zysk=0;
	private double zyskRezerwacje=0;
	private String typ = "Restauracja";
	Restauracja(String nazwaSklep, String miasto, String ulica, int nrSklep,int ileStolikow){
			super(nazwaSklep,miasto,ulica,nrSklep);
			this.ileStolikow = ileStolikow;
			czyZajety = new int[ileStolikow];
			for(int i=0;i<ileStolikow;i++)
				czyZajety[i] = 0;
	}
	
	void rezerwacja(String nazwisko, int nrStolika) {
		if(czyZajety[nrStolika-1]==0)
		{
			czyZajety[nrStolika-1]=1;
			zyskRezerwacje+=1;
			System.out.println("Zarezerwowano stolik numer " + nrStolika + " na nazwisko " + nazwisko);
		}
		else if(czyZajety[nrStolika-1] > 0 || nrStolika>ileStolikow)
		{
			System.out.print("Stolik nr " + nrStolika + " zajety!!!\nWolne Stoliki:\t");
			for(int i=0;i<ileStolikow;i++)
			{
				if(czyZajety[i]==0)
					System.out.print(i+1 + " ");
			}
			System.out.println("");
		}
	}
	
	void usun_rezerwacje(int nrStolika) {
		System.out.println("Rezerwacja stolika nr " + nrStolika + " - usuniêta");
		czyZajety[nrStolika-1] = 0;
	}
	
	void dodajKlienta(Zamowienie<T> zamowienie) {
		zamowienia.add(zamowienie);
	
		
	}
	Zamowienie<T> klient(int nrZamowienia) {
		return zamowienia.get(nrZamowienia);
	}
	
	String getTyp() {
		return typ;
	}
	public double getZysk() {
		zysk = 0;
		for(int i=0;i<zamowienia.size();i++)
		{
			zysk+=zamowienia.get(i).kwota();
		}
		return ((2.0*(zysk+zyskRezerwacje))/10.0);
	}
	void Info() {
		super.Info();
	}
}
