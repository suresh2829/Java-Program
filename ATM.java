import java.util.Scanner;
class ATM 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int balance = 1000;
		int option;
	
		
		do{
		System.out.println("\n1.Display \n2.Deposit \n3.withdrawal \n4.exit");
		System.out.print("Select any option : ");
		option = sc.nextInt();
		switch (option)
		{
		case 1:System.out.print("Displaying your balance ");
			   System.out.println("your balance is " + balance);
			   break;
		case 2:System.out.print("Deposit your amount : ");
		       int amount =sc.nextInt();
			   balance = balance + amount;
			   System.out.println("your amount is deposited successfully  " + amount);
			   break;
			   
	    case 3:System.out.print("Enter the amount :");
		       int withdrawal = sc.nextInt();
			   if(withdrawal <= balance)
			    {  
			        balance = balance - withdrawal; 
			        System.out.println("withdrawal successfully ");
				}	
			    else
			     {
				   System.out.println("Insufficient amount ");
				 }
		       break;
	    case 4:System.out.print("tata bye bye");
			   break;
		
		default:System.out.println("Select correct option");
		}
		
		}while (option !=4);
		
		
		
		
	}
}
