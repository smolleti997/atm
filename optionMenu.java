
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

public class optionMenu extends account{
	Scanner sc = new Scanner(System.in);
	
	DecimalFormat money = new DecimalFormat("###,###.##");
	
	HashMap<Integer, Integer> data = new HashMap<>();
	
	public void getLogin() throws IOException{
		int x = 1;
		do {
			try {
				data.put(123456789,1234);
				data.put(234567890, 2345);
				
				System.out.print("Enter Account Number:");
				int accNum = sc.nextInt();
				while(!data.containsKey(accNum)) {
					System.out.println("Invalid account number");
					System.out.print("Enter Account Number:");
					accNum = sc.nextInt();
				}
				setAccountNumber(accNum);
				
				System.out.print("Enter PIN:");
				int pin = sc.nextInt();
				int count = 1;
				while(data.containsKey(accNum) && (data.get(accNum)!=pin) && (count<4)) {
					System.out.println("Invalid PIN, Please retry");
					count++;
					System.out.print("Enter PIN  Number:");
					pin = sc.nextInt();
					}
				 if(count<4) {
					 setPinNumber(pin);
					 getAccountType();
					 }
				 else {
					 System.out.println("Please retry after 30 minutes");
				 }
			}
			catch(Exception e)
			{
				System.out.println("Invalid characters. Only digits allowed.");
				x = 2;
			}
			
//			for( Entry<Integer, Integer> entry: data.entrySet()) {
//				if(entry.getKey()== getAccountNumber() && entry.getValue()== getPinNumber()) {
//				                    
//					getAccountType();
//				}
//			}
			
//			System.out.print("Incorrect Account number or Pin, Please try again");
		} while(x==1);
	}
	
	public void getAccountType() {
		System.out.println("Select the type of account you wish to access");
		System.out.println("1"+" Checking");
		System.out.println("2"+" Saving");
		System.out.println("3"+" Exit");
		System.out.println("Choice:");
		
		int select = sc.nextInt();
		
		switch(select) {
		
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you");
			break;
		default :
			System.out.println("Invalid choice");
			getAccountType();
				
		}
	}
	
	public void getChecking() {
		System.out.println("Select the operation");
		System.out.println("1 View Balance");
		System.out.println("2 Withdrawal");
		System.out.println("3 Deposit");
		System.out.println("4 Exit ");
		System.out.println("Choice:");
		
		int select = sc.nextInt();
		
		switch(select){
			case 1:
				System.out.println("Checking Account Balance: "+money.format(getCheckingBalance())+ "\n");
				getAccountType();
				break;
			case 2:
				getCheckingWithdraw();
				getAccountType();
				break;
			case 3:
				getCheckingDeposit();
				getAccountType();
				break;
			case 4:
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Invalid Choice");
				getChecking();
				
		}
		
		
	}



	public void getSaving() {
		System.out.println("Select the operation");
		System.out.println("1 View Balance");
		System.out.println("2 Withdrawal");
		System.out.println("3 Deposit");
		System.out.println("4 Exit ");
		System.out.println("Choice:");
		
		int select = sc.nextInt();
		
		switch(select){
			case 1:
				System.out.println("Savings Account Balance: "+money.format(getSavingBalance())+ "\n");
				getAccountType();
				break;
			case 2:
				getSavingWithdraw();
				getAccountType();
				break;
			case 3:
				getSavingDeposit();
				getAccountType();
				break;
			case 4:
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Invalid Choice");
				getSaving();
				
		}
		
	}
	
	
	
	
	
	
}