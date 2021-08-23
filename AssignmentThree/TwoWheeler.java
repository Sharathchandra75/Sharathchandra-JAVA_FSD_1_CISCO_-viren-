package AssignmentThree;

public class TwoWheeler extends Vehicle {

	int speed=60;
	long distance=50;
	int nos_of_tyre=2;
	TwoWheeler()
	{
		
	}
	@Override
	void run() 
	{
		System.out.println("run method in TwoWheeler()");

	}
	@Override
	void stop() {
		System.out.println("stop method in TwoWheeler() ");

	}
	
	
	public void Disp() {
		System.out.println("TwoWheeler info speed "+speed+" Distance "+distance+" No of Tyres "+nos_of_tyre);
		System.out.println("Parent Vehicle info speed "+super.speed+" Distance "+super.distance);
	}
	

}
