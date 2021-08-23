package AssignmentThree;

public class Three_Wheeler extends Vehicle{

	int speed=40;
	long distance=50;
	int nos_of_tyre=3;
	Three_Wheeler(){
		
	}
	
	
	void run() {
		System.out.println("run method in ThreeWheeler");

	}
	
	void stop() {
		System.out.println("stop method in ThreeWheeler");

	}
	
	public void Disp() {
		System.out.println("ThreeWheeler info Speed "+speed+" Distance "+distance+" Tyres "+nos_of_tyre);
		System.out.println("Parent Vehicle info Speed"+super.speed+" Distance "+super.distance);
	}
}
