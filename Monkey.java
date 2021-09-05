package AssignmentFifth;

abstract public class Monkey
{
	 abstract void jump() ; //  created jump method in Parent class
	
	abstract void bite(); // created bite method in parent class
	
}
 interface Animal 
 {
	abstract void eat();
	 
	abstract void sleep();
	 
 }
 class Human extends Monkey implements Animal
 {
	 public void eat()      // adding the eat() only in  child class 
	 {
		 System.out.println("Eat () in Human");
	 }
	 public void sleep()   // adding the sleep()  only in child class
	 {
		 System.out.println("Sleep() in Human");
	 }
	 
	@Override       					
	void jump() {
		int a = 10;
		System.out.println("Monkey can jump upto "+ a+"feets");
		System.out.println("Jump() in Monkey, Method body in Human");
		
		// implemented method body for jump and bite in subclass 
		
	}
	@Override
	void bite() {
		int B=2;
		System.out.println("Monkey can eat " + B +" kgs of food");
		System.out.println("Bite() in Monkey, Method body in Human");
		
	}
 }
 
 
 