package AssignmentSec;

public class ReturnType {
	//creating the return type of int -add two numbers//
	public static int Twonum()
	{
		
		int number1, number2, answer;
        number1 = 25;
        number2 = 25;
        answer= number1+number2;
        System.out.println( "Adding of two numbers are ="+ answer);
        return  0;
	}

	 public static float Arcircle()
	 { //return type float ,area of circle//
		 
		float circle= 7;
         float  area=(22*circle*circle)/7 ;
         System.out.println("Area of Circle is: " + area);
		 return 0;
		 
	 }
	 
		    public  int rectangle() 
		    //Area of Rectangle //
		    {  
		    int width=10;
		   
		    int height=15;
		    
		    int area=width*height;  
		        System.out.println("Area of rectangle="+area);
				return 0;  
		     }  

		  
public static void main(String[]args)
{ 
	ReturnType .Arcircle();
    ReturnType  hw = new ReturnType ();
	hw.rectangle();
	ReturnType .Twonum();
}
}


