
public class Dog extends Animal implements Pet{
	private String name;
	
	Dog(String name){
		super(4);	//Dog has 4 legs
		this.name = name;
	}
	
	Dog(){
		super(4);
		this.name = "No name yet";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void Play() {
		System.out.println("Owner is playing with dog " + this.name);
	}

}
