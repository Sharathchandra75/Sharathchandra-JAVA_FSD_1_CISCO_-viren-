package AssignmentFifth;

 class FountainPen  extends Pen
{

	@Override
	void write()
	{
		System.out.println("This Was Overriden from Pen() & Implemented In child class ");
		
	}

	@Override
	void refill() 
	{
		System.out.println("This Was Overriden from refill() & Implemented In child class ");
		
	}
	void  ChangeNib()
	{
		System.out.println("This ChangeNib method implemented in Child class");
	}
	}