package simulation;

public class Zamowienie<T> {

	private T klient;
	private int ilePotraw[] = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0};
	Zamowienie(T klient){
		this.klient = klient;
	}
	
	T getKto() {
		return klient;
	}

	void zamawiam(Menu ...zamowienia) {
		for(int i=0;i<zamowienia.length;i++)
		{
			switch(zamowienia[i]) {
			case FLAKI:
				ilePotraw[0]++;
				break;
			case CHLODNIK:
				ilePotraw[1]++;
				break;
				
			case FRYTKI:
				ilePotraw[2]++;
				break;
				
			case ZIEMNIAKI:
				ilePotraw[3]++;
				break;
				
			case BIGOS:
				ilePotraw[4]++;
				break;
				
			case PYZY:
				ilePotraw[5]++;
				break;
				
			case KOTLET_SCHABOWY:
				ilePotraw[6]++;
				break;
				
			case NALESNIKI:
				ilePotraw[7]++;
				break;
				
			case SUROWKA:
				ilePotraw[8]++;
				break;
				
			case CHLEB:
				ilePotraw[9]++;
				break;
				
			case KAWA:
				ilePotraw[10]++;
				break;
				
			case HERBATA:
				ilePotraw[11]++;
				break;
				
			case LODY:
				ilePotraw[12]++;
				
				break;
			}
		}
	}
	double kwota() {
		double wynik = 0;
		wynik += ilePotraw[0] * Menu.FLAKI.getCena();
		wynik += ilePotraw[1] * Menu.CHLODNIK.getCena();
		wynik += ilePotraw[2] * Menu.FRYTKI.getCena();
		wynik += ilePotraw[3] * Menu.ZIEMNIAKI.getCena();
		wynik += ilePotraw[4] * Menu.BIGOS.getCena();
		wynik += ilePotraw[5] * Menu.PYZY.getCena();
		wynik += ilePotraw[6] * Menu.KOTLET_SCHABOWY.getCena();
		wynik += ilePotraw[7] * Menu.NALESNIKI.getCena();
		wynik += ilePotraw[8] * Menu.SUROWKA.getCena();
		wynik += ilePotraw[9] * Menu.CHLEB.getCena();
		wynik += ilePotraw[10] * Menu.KAWA.getCena();
		wynik += ilePotraw[11] * Menu.HERBATA.getCena();
		wynik += ilePotraw[12] * Menu.LODY.getCena();
		return wynik;
	}
	void rachunek() {
		if(ilePotraw[0]>0) System.out.println(ilePotraw[0] + " raz(y) " + Menu.FLAKI.getNazwa() + " po " + Menu.FLAKI.getCena() + " z³");
		if(ilePotraw[1]>0) System.out.println(ilePotraw[1] + " raz(y) " + Menu.CHLODNIK.getNazwa() + " po " + Menu.CHLODNIK.getCena()+ " z³");
		if(ilePotraw[2]>0) System.out.println(ilePotraw[2] + " raz(y) " + Menu.FRYTKI.getNazwa() + " po " + Menu.FRYTKI.getCena()+ " z³");
		if(ilePotraw[3]>0) System.out.println(ilePotraw[3] + " raz(y) " + Menu.ZIEMNIAKI.getNazwa() + " po " + Menu.ZIEMNIAKI.getCena()+ " z³");
		if(ilePotraw[4]>0) System.out.println(ilePotraw[4] + " raz(y) " + Menu.BIGOS.getNazwa() + " po " + Menu.BIGOS.getCena()+ " z³");
		if(ilePotraw[5]>0) System.out.println(ilePotraw[5] + " raz(y) " + Menu.PYZY.getNazwa() + " po " + Menu.PYZY.getCena()+ " z³");
		if(ilePotraw[6]>0) System.out.println(ilePotraw[6] + " raz(y) " + Menu.KOTLET_SCHABOWY.getNazwa() + " po " + Menu.KOTLET_SCHABOWY.getCena()+ " z³");
		if(ilePotraw[7]>0) System.out.println(ilePotraw[7] + " raz(y) " + Menu.NALESNIKI.getNazwa() + " po " + Menu.NALESNIKI.getCena()+ " z³");
		if(ilePotraw[8]>0) System.out.println(ilePotraw[8] + " raz(y) " + Menu.SUROWKA.getNazwa() + " po " + Menu.SUROWKA.getCena()+ " z³");
		if(ilePotraw[9]>0) System.out.println(ilePotraw[9] + " raz(y) " + Menu.CHLEB.getNazwa() + " po " + Menu.CHLEB.getCena()+ " z³");
		if(ilePotraw[10]>0) System.out.println(ilePotraw[10] + " raz(y) " + Menu.KAWA.getNazwa() + " po " + Menu.KAWA.getCena()+ " z³");
		if(ilePotraw[11]>0) System.out.println(ilePotraw[11] + " raz(y) " + Menu.HERBATA.getNazwa() + " po " + Menu.HERBATA.getCena()+ " z³");
		if(ilePotraw[12]>0) System.out.println(ilePotraw[12] + " raz(y) " + Menu.LODY.getNazwa() + " po " + Menu.LODY.getCena()+ " z³");
		System.out.println("________________");
		System.out.println("Razem:\t" + kwota() + " z³");
		System.out.println();
	}
}

