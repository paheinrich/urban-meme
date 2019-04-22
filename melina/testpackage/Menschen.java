package testpackage;
import testpackage.Lebewesen;

public class Menschen extends Lebewesen{
	private int groesse;
	private int anzahlBeine = 2;
	private Menschen mutter;

	public Menschen(){}

	public Menschen(int gro, Menschen mut){
		this.groesse = gro;
		this.mutter = mut;
	}

	public Menschen(int groesse){
		this.groesse = groesse;
	}

	public int getGroesse(){
		return this.groesse;

	}
	public int getAnzahlBeine(){
		return this.anzahlBeine;
	}

	public void setgroesse(int a){
		this.groesse = a;
	}

	public void setanzahlBeine(int b){
		this.anzahlBeine = b;
	}

	public Menschen getMutter(){
		return this.mutter;
	}

	public void setMutter(Menschen men){
		this.mutter = men;
	}


}