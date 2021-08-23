package AssignmentThree;

public class Four_wheeler extends Vehicle{
	int speed=100;
	long distance=150L;
	int nos_of_tyre=4;
	Four_wheeler(){
		
	}
	
	@Override
	void run() {
		System.out.println("run method in FourWheeler");

	}
	
	@Override
	void stop() {
		System.out.println("stop method in FourWheeler");

	}
	
	public void Disp() {
		System.out.println("Four Wheeler info Speed "+speed+" Distance "+distance+" "+nos_of_tyre);
		System.out.println("Parent Vehicle info Speed "+super.speed+" Distance "+super.distance);
	}
}
