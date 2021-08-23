package AssignmentSec;
public class AreaShapes {
int s,b,h ;
float r;
  AreaShapes()
  {
	  System.out.println("df cons");
  }
  AreaShapes(int i)
  {
	  s=i;
  }
  public void Square()
  {
	  System.out.println("Area of Square is : " +s*s);
  }
  AreaShapes(int i,int j)
  {
	  b=i;
	  h=j;
  }
  public void rectangle()
  {
	  System.out.println("Area of Rectangle : "+ (b*h));
  }
  AreaShapes(float f)
  {
	  float r = f;
  }
  public void circle()
  {
	  System.out.println("Area of Circle : "+ (0.14*r*r));
  }
 public  static void Rhombus()
 {
	int d1 = 5;
	 int d2=7;
	 int rh=(d1*d2)/2;
	 System.out.println("Area of Rhombus : "+ rh);
	 
 }
 public static void Triangle()
 {
	 int t1=5;
     int t2=6;
	 int trh=(1/2)*t1*t2;
	 System.out.println("Area of Triangle : "+ trh);
	 
 }
 public static void main(String[]args)
 {
	AreaShapes  A = new AreaShapes(12);
	A.Square();
	AreaShapes B = new AreaShapes(6,12);
	B.rectangle();
	AreaShapes C = new AreaShapes(95.0f);
	C.circle();
	AreaShapes.Rhombus();
	AreaShapes.Triangle();
	
	
	 
 }
 
  
}

