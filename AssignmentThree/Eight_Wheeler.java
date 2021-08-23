package AssignmentThree;

public class Eight_Wheeler extends Vehicle{

	int speed=110;
	long distance=200L;
	int nos_of_tyre=8;
	Eight_Wheeler(){
		
	}
	
	void run() {
		System.out.println("stop method in EightWheeler");

	}
	
	void stop() {
		System.out.println("stop method in EightWheeler");

	}
	
	public void Disp() {
		System.out.println("Eight Wheeler info Speed "+speed+" Distance "+distance+" Tyres "+nos_of_tyre);
		System.out.println("Parent Vehicle info Speed "+super.speed+" Distance "+super.distance);
	}
	}

