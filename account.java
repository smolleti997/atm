import java.text.DecimalFormat;
import java.util.Scanner;

public class account {
	private int AccountNumber;
	private int Pin;
	private double checkingBalance = 0.00;
	private double savingBalance = 0.00;
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat money = new DecimalFormat("'$'###,###.##");
	
	public void setAccountNumber(int AccountNumber) {
		this.AccountNumber= AccountNumber;
		
	}
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	
	public void setPinNumber(int Pin) {
		this.Pin= Pin;
	}
 
	public int getPinNumber() {
		return Pin;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = checkingBalance - amount;
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = savingBalance - amount;
		return savingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		savingBalance = savingBalance + amount;
		return savingBalance;
	}
	
	public void getCheckingWithdraw() {
			System.out.println("Checking balance"+money.format(checkingBalance));
			System.out.println("Amount to be Withdrawn:");
			double amount = sc.nextDouble();
			
			if((checkingBalance-amount)>=0) {
				calcCheckingWithdraw(amount);
				System.out.println("New checking account balance: " +money.format(checkingBalance));	
			}
			
			else {
				System.out.println("Balance cannot be negative");
			}
			
	}
	
	public void getSavingWithdraw() {
		System.out.print("Saving balance"+money.format(savingBalance));
		System.out.println("Amount to be Withdrawn:");
		double amount = sc.nextDouble();
		
		if((savingBalance-amount)>=0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving account balance: " +money.format(savingBalance));	
		}
		
		else {
			System.out.println("Balance cannot be negative");
		}
		
}
	
	public void getCheckingDeposit() {
		System.out.println("Checking balance"+money.format(checkingBalance));
		System.out.println("Amount to be Deposited:");
		double amount = sc.nextDouble();
		
			calcCheckingWithdraw(amount);
			System.out.println("New checking account balance: " +money.format(checkingBalance));	
		
}
	public void getSavingDeposit() {
		System.out.println("Checking balance"+money.format(savingBalance));
		System.out.println("Amount to be Deposited:");
		double amount = sc.nextDouble();
		
			calcSavingWithdraw(amount);
			System.out.println("New saving account balance: " +money.format(savingBalance));	
}
	
}
