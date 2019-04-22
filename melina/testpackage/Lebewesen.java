package testpackage;

public class Lebewesen{
	private String name;
	int alter;

	public Lebewesen(){}

	public Lebewesen(String nam){
		this.name = nam;
	}

	public Lebewesen(int alt){
		this.alter = alt;
	}

	public Lebewesen(String nam, int alt){
		this.name = nam;
		this.alter = alt;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String nam){
		this.name = nam;
	}

	public void setAlter(int alt){
		this.alter = alt;
	}

	public void set(String nam, int alt){
		this.setName(nam);
		this.setAlter(alt);
	}

}