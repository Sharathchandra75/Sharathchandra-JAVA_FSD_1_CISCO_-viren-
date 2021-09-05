package AssignmentFifth;

public class HuMon {
 public static void main(String[]args)
 {
		Monkey mn = new Human();
		mn.bite();
		mn.jump();
		 Human hm = new Human();
		 hm.eat();
		 hm.sleep();
		 hm.bite();   // calling method form the child class
		 hm.jump();
 }
}
