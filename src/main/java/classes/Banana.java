package classes;

public class Banana {

	int age = 0;
	
	public Banana(){
		
	}
	
	public void justIncrementAge(int age) {
		age++;
	}
	
	public Banana(int age) {
		this.age = age;
	}
	
	public void ripen() {
		this.age++;

	}
	
	public int getAge() {
		return age;
	}
}

