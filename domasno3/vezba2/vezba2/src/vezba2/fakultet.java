package vezba2;

public class fakultet {

	public static void main(String[] args) {
		public String nazivNaFakultet;
		public int brojNaSmerovi;
		public int brojNaStudenti;
		public String dekan;
		public String sediste;
		
		public void pMetod() {
			System.out.println("Zgolemen broj na studenti: " + (this.brojNaStudenti + 50));
		}
		
		public int vMetod (int namali){
			int namalenaVrednost = this.brojNaStudenti - namali;
			return namalenaVrednost;
		}
		
		public void tMetod() {
			System.out.println("Naziv na fakultet: " + this.nazivNaFakultet + ", Sediste: " + this.sediste);
		}
	




	}


