package testpackage;

public class Liste{
	public String name;
	public Liste next;

	public Liste(String str){
		this.name = str;
	}

	public boolean isInList(String str){
		int count = 1;
		if(this.name == str){
			System.out.println(count);
			return true;
		}
		else if(this.next == null){
			return false;
		}
		else{
			return this.next.isInList(str, count);
		}
	}

	public boolean isInList(String str, int count){
		count += 1;
		if(this.name == str){
			System.out.println(count);
			return true;
		}
		else if(this.next == null){
			return false;
		}
		else{
			return this.next.isInList(str, count);
		}
	}
}