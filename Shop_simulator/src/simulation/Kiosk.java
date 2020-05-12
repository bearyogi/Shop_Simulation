package simulation;

public class Kiosk extends Sklep implements Transakcje {


	private int ileDostepne[] = new int[] {10,10,10,10,10};
	private int ileSprzedanych[] = new int[] {0,0,0,0,0};
	private String typ = "Kiosk";
	public Kiosk(String nazwaSklep, String miasto, String ulica, int nrSklep){
		super(nazwaSklep, miasto, ulica, nrSklep);
	}
	
	String magazyn() {
		  String wynik = (Gazety.WPROST.name() + " - " + ileDostepne[0] + " szt." + "\n"
		+ Gazety.NEWSWEEK.name() + " - " + ileDostepne[1] + " szt." + "\n"
		+ Gazety.WYBORCZA.name() + " - " + ileDostepne[2] + " szt." + "\n"
		+ Gazety.FORBES.name() + " - " + ileDostepne[3] + " szt." + "\n"
		+ Gazety.PLAY.name() + " - " + ileDostepne[4] + " szt.");
		  return wynik;
	}
	
	double koszt() {
		double wynik = 0;
		wynik += ileSprzedanych[0] * Gazety.WPROST.getCenaHurtowa();
		wynik += ileSprzedanych[1] * Gazety.NEWSWEEK.getCenaHurtowa();
		wynik += ileSprzedanych[2] * Gazety.WYBORCZA.getCenaHurtowa();
		wynik += ileSprzedanych[3] * Gazety.FORBES.getCenaHurtowa();
		wynik += ileSprzedanych[4] * Gazety.PLAY.getCenaHurtowa();
		return wynik;
	}
	
	double dochod() {
		double wynik = 0;
		wynik += ileSprzedanych[0] * Gazety.WPROST.getCenaDetaliczna();
		wynik += ileSprzedanych[1] * Gazety.NEWSWEEK.getCenaDetaliczna();
		wynik += ileSprzedanych[2] * Gazety.WYBORCZA.getCenaDetaliczna();
		wynik += ileSprzedanych[3] * Gazety.FORBES.getCenaDetaliczna();
		wynik += ileSprzedanych[4] * Gazety.PLAY.getCenaDetaliczna();
		return wynik;
	}
	
	String getTyp() {
		return typ;
	}
	
	public double getZysk() {
		return dochod() - koszt();
	}
	
	 public int getIlosc(Gazety g) {
		 int wybor = 0;
		switch(g) {
		case WPROST: 
			wybor = ileDostepne[0];
		break;
		case NEWSWEEK:
			wybor = ileDostepne[1];
		break;
		case WYBORCZA:
			wybor = ileDostepne[2];
		break;
		case FORBES:
			wybor = ileDostepne[3];
		break;
		case PLAY:
			wybor = ileDostepne[4];
		break;
		}
		return wybor;
	}
	
	public int getSprzedaz(Gazety g) {
		int wybor = 0;
		switch(g) {
		case WPROST: 
			wybor = ileSprzedanych[0];
		break;
		case NEWSWEEK:
			wybor = ileSprzedanych[1];
		break;
		case WYBORCZA:
			wybor = ileSprzedanych[2];
		break;
		case FORBES:
			wybor = ileSprzedanych[3];
		break;
		case PLAY:
			wybor = ileSprzedanych[4];
		break;
		}
		return wybor;
	}
	
	public void wykonaj(Czynnosc c, Gazety g,int n) {
		switch(c) {
		case SPRZEDAZ:
			switch(g) {
			case WPROST: 
				if(ileDostepne[0]>=n)
				{
					ileDostepne[0]-=n;
					ileSprzedanych[0]+=n;
				}
				else 
				{
					System.out.println("Brak towaru w liczbie " + n +"sztuk - " + g);
				}
			break;
			case NEWSWEEK:
				if(ileDostepne[1]>=n)
				{
					ileDostepne[1]-=n;
					ileSprzedanych[1]+=n;
				}
				else 
				{
					System.out.println("Brak towaru w liczbie " + n +"sztuk - " + g);
				}
			break;
			case WYBORCZA:
				if(ileDostepne[2]>=n)
				{
					ileDostepne[2]-=n;
					ileSprzedanych[2]+=n;
				}
				else 
				{
					System.out.println("Brak towaru w liczbie " + n +"sztuk - " + g);
				}
			break;
			case FORBES:
				if(ileDostepne[3]>=n)
				{
					ileDostepne[3]-=n;
					ileSprzedanych[3]+=n;
				}
				else 
				{
					System.out.println("Brak towaru w liczbie " + n +"sztuk - " + g);
				}
			break;
			case PLAY:
				if(ileDostepne[4]>=n)
				{
					ileDostepne[4]-=n;
					ileSprzedanych[4]+=n;
				}
				else 
				{
					System.out.println("Brak towaru w liczbie " + n +"sztuk - " + g);
				}
			break;
				
			}
		break;
		
		case DOSTAWA:
			switch(g) {
			case WPROST: 
				ileDostepne[0]+=n;
			break;
			case NEWSWEEK:
				ileDostepne[1]+=n;
			break;
			case WYBORCZA:
				ileDostepne[2]+=n;
			break;
			case FORBES:
				ileDostepne[3]+=n;
			break;
			case PLAY:
				ileDostepne[4]+=n;
			break;
			}
		break;
		}
	}
	
	void Info() {
		super.Info();
		System.out.println(magazyn());
		System.out.println();
		System.out.println("Dochód : " + dochod() + " z³");
	}
}
