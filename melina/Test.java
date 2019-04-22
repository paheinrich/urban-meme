import testpackage.Lebewesen;
import testpackage.Menschen;
import testpackage.Liste;
import testpackage.Kangoroo;

public class Test{
	public static void main (String [] args){

	// 	Menschen asd = new Menschen(3);
	// 	Menschen qwe = new Menschen(5);
	// 	asd.setMutter(qwe);
	// 	System.out.println( asd.getMutter() );

	// 	Liste a = new Liste();
	// 	Liste b = new Liste();
	// 	Liste c = new Liste();
	// 	Liste d = new Liste();
	// 	Liste e = new Liste();
	// 	Liste f = new Liste();
	// 	Liste g = new Liste();
	// 	Liste h = new Liste();

	// 	a.next = b;
	// 	b.next = c;

	// 	a.name = "Peter";
	// 	b.name = "Hans";
	// 	c.name = "Anna";

	// 	System.out.println(a.isInList("Hans"));
	// 	System.out.println(a.isInList("Peter"));
	// 	System.out.println(a.isInList("Tobi"));
	// 	System.out.println(a.isInList("Aline"));
	// 	System.out.println(a.isInList("Sarah"));
	// 	System.out.println(a.isInList("Anna"));
	// 	System.out.println(a.isInList("LOL"));
		Kangoroo asd = new Kangoroo();
		Menschen wer = new Menschen();
		asd.setBeutelinhalt(wer);
	}
}