
public abstract class Animal {

		protected int legs;
		Animal(){
			legs = -1;
		}
		
		Animal(int legs){
			this.legs = legs;
		}
		
		void eat() {
			
		}
		
		void walk() {
			System.out.println("The Animal uses " + legs + " legs to walk");
		}
}
