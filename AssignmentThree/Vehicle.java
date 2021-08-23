package AssignmentThree;
public class Vehicle {
	int speed=150;
	long distance=250L;
	
	 Vehicle(){
		
	}
     Vehicle(int speed,long distance){
		this.speed=speed;
		this.distance=distance;
	}
	void run() {
		System.out.println("Parent Class Of Vehicle in run()");

	}
	
	void stop() {
		System.out.println("Parent Class Vehicle in stop()");

	}
	
	public void fuel(int a) {
		System.out.println("This is fuel() Having in 1args Parent class");

	}
	
public void fuel(float f,String s) {
		System.out.println("This is fuel() Having in 2args Parent class");
	}

public void fuel(char ch,int i) 
{
	System.out.println("This is fuel() Having in 3args of Parent class");

}
public void Disp() 
{
	
}
	
}