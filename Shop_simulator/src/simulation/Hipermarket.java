package simulation;

class Hipermarket extends Sklep {
	private double zysk;
	private String typ = "Hipermarket";
	public Hipermarket(String nazwaSklep, String miasto, String ulica, int nrSklep){
		super(nazwaSklep, miasto, ulica, nrSklep);
	}
	
	String getTyp() {
		return typ;
	}
	
	void zarobek(int klienci, double sredniWydatek) {
		zysk+=(5*(klienci*sredniWydatek))/100;
	}
	
	public double getZysk() {
		return zysk;
	}
	
	void Info() {
		super.Info();
	}
	
	class StacjaPaliw {
		private double zyskPaliwa[] = new double[4];
		Paliwo paliwo;
		private double zyskStacja=0;
		StacjaPaliw(double[] zyskPaliwa) {
			for(int i=0;i<3;i++)
			{
				this.zyskPaliwa[i] = zyskPaliwa[i];
			}
		}
		
		void zatankuj(Paliwo paliwo, double litry) {
			switch (paliwo) {
			case BENZYNA:
				zysk+=litry*zyskPaliwa[0];
				zyskStacja+=litry*zyskPaliwa[0];
				break;
			case OLEJ_NAPEDOWY:
				zysk+=litry*zyskPaliwa[1];
				zyskStacja+=litry*zyskPaliwa[1];
				break;
			case BIOPALIWO:
				zysk+=litry*zyskPaliwa[2];
				zyskStacja+=litry*zyskPaliwa[2];
				break;
			case LPG:
				zysk+=litry*zyskPaliwa[3];
				zyskStacja+=litry*zyskPaliwa[3];
				break;
			}
		}
		
		double zyskStacji() {
			return zyskStacja;
		}
		
		void setPaliwa(double zyskPaliwa[]) {
			for(int i=0;i<3;i++)
			{
				this.zyskPaliwa[i] = zyskPaliwa[i];
			}
		}
		
	}
}
