
import java.util.Scanner;

public class ATMOpeartions{
	static double balance=0;
	public static void checkBalance()
	{
		System.out.println("Your Balace is "+balance);
	}
	public static void withdraw(double amount) {
		
		if(amount%100!=0)
		{
			System.out.println("Please enter amount multples of 100");
		}
		else {
			if(amount>balance)
				System.out.println("Insufficient balance");
			else{ 
				balance=balance-amount;
                System.out.println("amount withdrawn successfully");
            }
		}
	}
	public static void deposit(double amount) {
		if(amount%100!=0)
			System.out.println("Please deposit amount multiples 100");
		else {
			balance+=amount;
            System.out.println("Deposited successfully");
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PIN");
		String password="123";
		String pass=sc.next();
		if(password!=pass)
		   System.out.println("Access Denied\nPlease enter valid PIN");
		boolean exit=false;
		while(!exit)
		{
			System.out.println("Select below opeartions");
			System.out.println("1.Check Balance");
			System.out.println("2.Withdraw Amount");
			System.out.println("3.Deposit");
			System.out.println("4.exit");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:checkBalance();break;
			case 2:System.out.println("Enetr amount to be wityhdrwan");
                    withdraw(sc.nextDouble());break;
			case 3:System.out.println("Enter teh amount to be deposited");
                    deposit(sc.nextDouble());break;
			case 4:exit=true;
                   System.out.println("Visit Again");break;
			default:System.out.println("Enter a valid opration");
			}
			
		}
	}
	}
