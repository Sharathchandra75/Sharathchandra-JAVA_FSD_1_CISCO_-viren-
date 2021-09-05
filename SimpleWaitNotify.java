package AssignmentFifth;

public class SimpleWaitNotify {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer c = new Customer();

		new Thread() {
		public void run()
		{
		c.withdraw(5000);
		}
		}.start();

		new Thread() {
		public void run()
		{
		c.withdraw(4000);
		}
		}.start();

		new Thread() {
		public void run()
		{
		c.withdraw(10000);
		}
		}.start();

		new Thread() {
		public void run()
		{
		c.deposit(20000);
		}
		}.start();

		}

}
