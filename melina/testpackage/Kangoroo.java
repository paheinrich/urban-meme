package testpackage;
import testpackage.Lebewesen;

public class Kangoroo<E> extends Lebewesen {
	private E beutelinhalt;

	public E getBeutelinhalt(){
		return this.beutelinhalt;
	}

	public void setBeutelinhalt(E e){
		this.beutelinhalt = e;
	}
}