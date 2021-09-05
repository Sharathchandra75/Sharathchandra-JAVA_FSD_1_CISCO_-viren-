package AssignmentFifth;

public class Customer
{
	int amount = 10000;

	synchronized void withdraw(int amount) {
	System.out.println("Money Will Be Withdraw ...");

	if(this.amount<amount) {
	System.out.println("Less Balance: waiting for deposit...");
	try {
	wait();
	}
	catch(Exception e) {}
	}
	this.amount-=amount;
	System.out.println("Transaction were Completed...The left Over Money is "+ this.amount);
	}

	synchronized void deposit(int amount) {
	System.out.println("Going to deposit...");
	this.amount+=amount;

	System.out.println("Deposit completed..."+ this.amount);
	notify();
	}
	



	

}

