package ro.cts.ase.clase.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int sumaFinantare=10;

	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}

	@Override
	public String toString() {

		final StringBuilder sb = new StringBuilder("Angajat{");
		sb.append(super.toString());
		sb.append("ocupatie='").append(ocupatie).append('\'');
		sb.append("salariu='").append(salariu).append('\'');
		sb.append("}");

		return sb.toString();
	}
	
	
	public void afisareFinantare() {
		// TODO Auto-generated method stub
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste "+Angajat.sumaFinantare+" Euro/zi in proiect.");

	}
	
}
