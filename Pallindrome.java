package AssignmentFifth;
import java.io.InputStream;
import java  .util.*;
public class Pallindrome 
{
	public static void main(String[]args) {
		String Str1 ="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to check");
		Str1=scan.nextLine();
		if(Str1.length()<50) {
			Pallindrome obj =new Pallindrome();
		boolean res=obj.Palindrome(Str1);
			if(res==true) {
				System.out.println(Str1+ " is Palindrome");
			}else 
			{ 
				System.out.println(Str1+" is not palindrome");
			}
		}
		else {System.out.println(" Your Input exceeds the limit");}
	}
	private boolean Palindrome(String input)
	{
		String rev = "";
		for(int i =input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		if(rev.contentEquals(input))
		{
			return true;
		}
		else 
			return false;
	}
}  
