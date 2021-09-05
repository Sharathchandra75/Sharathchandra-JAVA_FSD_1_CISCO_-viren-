package AssignmentFifth;
import java .util.*;

public class Stringcls {
public static void main(String[]args)
{    //== method is used to compare the both String references 
	String t = "Delhi";
	String o = "Mumbai";
	String k = "delhi";
	String y  = new String("Mumbai");
	String l = new String("delhi");
	String p = new String("Hello");
	// equals() is used to compare the String Data
	System.out.println(o==l);
	System.out.println(y==p);
	System.out.println(t==o);
	System.out.println(k==y);
	System.out.println(p==y);
	System.out.println(o.equals(l));
	System.out.println(y.equals(p));
	System.out.println(t.equals(o));
	System.out.println(k.equals(y));
	System.out.println(p.equals(y));
	// String can be create by creaating the object and using literals method("")
	
}

}
