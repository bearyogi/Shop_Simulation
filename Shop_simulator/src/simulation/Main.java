package simulation;
public class Main {

	public static void main(String[] args) {
		
		
		double zyskPaliwa[] = new double[]{3.4,2.5,7.5,1.1};
		double nowePaliwa[] = new double[] {5.5,3.0,1.5,6.7};
		Zamowienie<Integer> zamowienie;
		
		Hipermarket hiper = new Hipermarket("LIDL","Busko","Wakra 5",1);
		Hipermarket.StacjaPaliw stacja = hiper.new StacjaPaliw(zyskPaliwa);
		hiper.zarobek(5, 20);
		stacja.setPaliwa(nowePaliwa);
		stacja.zatankuj(Paliwo.BENZYNA, 6);
		
		Kiosk kiosk = new Kiosk("MIREK","Kielce","Polna 3",2);
		kiosk.wykonaj(Czynnosc.DOSTAWA, Gazety.FORBES, 15);
		kiosk.wykonaj(Czynnosc.SPRZEDAZ, Gazety.FORBES, 10);
		
		Restauracja<Integer> restauracja = new Restauracja<Integer>("PIEROGI","Kielce","Nowy Œwiat 14a",1,10);
		restauracja.rezerwacja("Kowalski", 1);
		restauracja.rezerwacja("Nowak", 1);
		restauracja.usun_rezerwacje(1);
		restauracja.rezerwacja("Nowak", 1);
		System.out.println();
		restauracja.dodajKlienta(new Zamowienie<Integer>(0));
		restauracja.dodajKlienta(new Zamowienie<Integer>(1));
		zamowienie = restauracja.klient(0);
		zamowienie.zamawiam(Menu.BIGOS,Menu.BIGOS,Menu.CHLEB,Menu.HERBATA);
		zamowienie = restauracja.klient(1);
		zamowienie.zamawiam(Menu.FRYTKI,Menu.LODY);
		System.out.println("Kto zamowil lody i frytki : " + zamowienie.getKto());
		zamowienie.rachunek();
		zamowienie = restauracja.klient(0);
		zamowienie.zamawiam(Menu.ZIEMNIAKI);
		System.out.println("A kto bigos i ziemniaki : " + zamowienie.getKto());
		zamowienie.rachunek();
		restauracja.Info();
		System.out.println();
		
		hiper.Info();
		System.out.println("Zysk z samej stacji : " + stacja.zyskStacji() + " z³");
		System.out.println();
		
		kiosk.Info();
		System.out.println("Iloœæ sprzedanego Forbes'a : " + kiosk.getSprzedaz(Gazety.FORBES));
		System.out.println("Iloœæ posiadanych gazet Wyborcza :" + kiosk.getIlosc(Gazety.WYBORCZA));
		System.out.println();
		
		Sklep sklepy[] = new Sklep[3];
		sklepy[0] = hiper;
		sklepy[1] = kiosk;
		sklepy[2] = restauracja;
		Galeria galeria = new Galeria("Echo","Warszawa","Warszawska",3,sklepy);
		galeria.Info();
		System.out.println();
		System.out.println(galeria.ListaSklepow());
	}

}
