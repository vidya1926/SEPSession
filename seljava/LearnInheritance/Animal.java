package LearnInheritance;

public class Animal {
	
	String color="Black";
	final int x=10;
	
	public boolean makeSound(int x)
	{
		System.out.println("MakeSounds");
		return false;
	}
	
	public void canWalk() {
		System.out.println("Ability to walk");
	}
	
	public void noOfLegs(int legs) {
	System.out.println(legs);
			}
	

}
