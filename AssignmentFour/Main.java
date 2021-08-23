package AssignmentFour;
import java.util.*;
public class Main 
{
	public static void main( String []args) {

		Scanner sc = new Scanner(System.in);
		LinkedHashSet l1 = new LinkedHashSet();
		TreeSet<String> t = new TreeSet<String>();
		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		System.out.println("Enter Hashset i/p");
		l1.add(sc.nextInt());
		l1.add(sc.nextInt());
		l1.add(sc.nextFloat());
		l1.add(sc.nextFloat());
		l1.add(sc.next());
		l1.add(sc.next());
		l1.add(sc.nextBoolean());
		l1.add(sc.nextBoolean());
		System.out.println("values of L1"+l1);
		System.out.println("enter eight integer values");
		for(int i =1;i<8;i++)
		{
			l2.add(sc.nextInt());
		}
		System.out.println("Values of l2: "+l2);
		t.add("C"); 
		t.add("CPP");
		t.add("Java"); 
		t.add("python");
		t.add("Go"); 
		t.add("Data Stucture"); 
		System.out.println(t.remove("CPP"));
		System.out.println(t.remove("Python"));
		System.out.println("After Removing: "+t); 
		t.add("ml");
		t.add("IOT");
		t.add("Ruby");
		System.out.println("After adding 3 Languages: "+t);
		System.out.println("Is Set contains java : "+t.contains ("Java"));
		t.clear();
		System.out.println("After Removing all elements form the set: "+t); 
		
		
	}
}
