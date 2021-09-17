
public class Fish extends Animal {
	Fish(){
		super(0);
	}
	
	void walk() {
		System.out.println("Fish cant walk, it has " + legs + " legs to walk");
	}
}
