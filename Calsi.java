package AssignmentFifth;

import java .util.Scanner;
  class Calsi{
	  public long power( int n ,int p) throws Exception
	  {
		  if(n<0 || p<0)throw new Exception("n or p not be negative");
		  else if(n==0 && p==0) throw  new Exception("n or p not to be zero");
		  else
			  return(long) Math.pow(n, p);
	  }
   
  public static class Assign_exp
  {
	  public static void main(String[]args) throws Exception
	  {
		  Calsi calsi = new Calsi();
		  Scanner scan = new Scanner(System.in);
		  int n = scan.nextInt();
		  int  p = scan.nextInt();
		  try {
			  System.out.println(calsi.power(n, p));
		  }
		  catch(Exception e) {
			  System.out.println(e);
		  } scan.close();
		  
	  }
  
  }
  }