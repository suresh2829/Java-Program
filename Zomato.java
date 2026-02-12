import java.util.Scanner;
class Zomato 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\t\tWelcome to zomato app");
		System.out.println("select your restaurant");
		System.out.println("1.S.S.Hyderabad briyani \n2.WOW MOMO \n3.Pandiyas hotel");
		System.out.print("select any option:");
        int op =sc.nextInt();

		switch (op)
		{
		case 1:System.out.println("\t\t\t Welcome to S.S.Hyderabad briyani");
		       System.out.println("1.Chicken briyani-200rs \n2.Mutton briyani-300rs \n3.Egg briyani-150rs");
			   System.out.println("\t\t\twhich one you want?");
			   int dish1=sc.nextInt();
			   if (dish1==1)
			   {
				          System.out.println("you selected chicken briyani");
				          int price = 200;
				          System.out.println("Enter the quantity");
				          int quant= sc.nextInt();  //indha edathula namba ena user kita irundhu vanguromo adhaye declare panalam
				          int  bill = price * quant;
				          System.out.println("your price is:"+ bill);
				          System.out.print( "y - yes , no -no:");
				          char ab=sc.next().charAt(0);
				                if (ab=='y')
			                    {
				                      System.out.print("you must pay the amount:");
				                      int amo=sc.nextInt();
				                      if (bill==amo)
				                      {
					                         int generatedotp = (int)(Math.random()*9000)+1000;
					                         System.out.println("Your otp is:"+generatedotp);
					                         System.out.print("Enter your otp:");
					                         int userotp=sc.nextInt();
					                                if (generatedotp==userotp)
					                                {
						                                  System.out.println("your order is placed");
					                                }
						                            else
						                            {
						                                  System.out.println("order cancelled");
						                            }
				                      } 
				                      else
					                  {
						                     System.out.print("Insufficient amount");
					                  }
						 
				                }
				                else 
				                {
					                  System.out.print("Invalid option");
				                }
			   }
			   else if (dish1==2)
			   {
				          System.out.println("you selected chicken briyani");
				          int price1 = 300;
				          System.out.println("Enter the quantity");
				          int quant1= sc.nextInt();  //indha edathula namba ena user kita irundhu vanguromo adhaye declare panalam
				          int  bill1 = price1 * quant1;
				          System.out.println("your price is:"+ bill1);
				          System.out.print( "y - yes , no -no:");
				          char ab1=sc.next().charAt(0);
				                if (ab1=='y')
			                    {
				                      System.out.print("you must pay the amount:");
				                      int amo1=sc.nextInt();
				                      if (bill1==amo1)
				                      {
					                         int generatedotp = (int)(Math.random()*9000)+1000;
					                         System.out.println("Your otp is:"+generatedotp);
					                         System.out.print("Enter your otp:");
					                         int userotp=sc.nextInt();
					                                if (generatedotp==userotp)
					                                {
						                                  System.out.println("your order is placed");
					                                }
						                            else
						                            {
						                                  System.out.println("order cancelled");
						                            }
				                      } 
				                      else
					                  {
						                     System.out.print("Insufficient amount");
					                  }
						 
				                }
				                else 
				                {
					                  System.out.print("Invalid option");
				                }
			   }
			   
			   else if (dish1==3)
			   {
				          System.out.println("you selected chicken briyani");
				          int price2 = 150;
				          System.out.println("Enter the quantity");
				          int quant2= sc.nextInt();  //indha edathula namba ena user kita irundhu vanguromo adhaye declare panalam
				          int  bill2 = price2 * quant2;
				          System.out.println("your price is:"+ bill2);
				          System.out.print( "y - yes , no -no:");
				          char ab2=sc.next().charAt(0);
				                if (ab2=='y')
			                    {
				                      System.out.print("you must pay the amount:");
				                      int amo2=sc.nextInt();
				                      if (bill2==amo2)
				                      {
					                         int generatedotp = (int)(Math.random()*9000)+1000;
					                         System.out.println("Your otp is:"+generatedotp);
					                         System.out.print("Enter your otp:");
					                         int userotp=sc.nextInt();
					                                if (generatedotp==userotp)
					                                {
						                                  System.out.println("your order is placed");
					                                }
						                            else
						                            {
						                                  System.out.println("order cancelled");
						                            }
				                      } 
				                      else
					                  {
						                     System.out.print("Insufficient amount");
					                  }
						 
				                }
				                else 
				                {
					                  System.out.print("Invalid option");
				                }
			   }
			   else
			   {
				   System.out.println("invalid option");
				   
			   }
			   break;
			   
			   case 2:System.out.println("\t\t\t welcome to wow momos"); // Wow momo
		              System.out.println("1.Chicken steamed momo-250rs \n2.hot pepper momo-300rs \n3.veg momo-100rs");
			          System.out.println("\t\t\twhich one you want?");
			   int dish2=sc.nextInt();
			   if (dish2==1)
			   {
				          System.out.println("you selected chicken steamed momo");
				          int price3 = 300;
				          System.out.println("Enter the quantity");
				          int quant3= sc.nextInt();  //indha edathula namba ena user kita irundhu vanguromo adhaye declare panalam
				          int  bill3 = price3 * quant3;
				          System.out.println("your price is:"+ bill3);
				          System.out.print( "y - yes , no -no:");
				          char ab3=sc.next().charAt(0);
				                if (ab3=='y')
			                    {
				                      System.out.print("you must pay the amount:");
				                      int amo3=sc.nextInt();
				                      if (bill3==amo3)
				                      {
					                         int generatedotp = (int)(Math.random()*9000)+1000;
					                         System.out.println("Your otp is:"+generatedotp);
					                         System.out.print("Enter your otp:");
					                         int userotp=sc.nextInt();
					                                if (generatedotp==userotp)
					                                {
						                                  System.out.println("your order is placed");
					                                }
						                            else
						                            {
						                                  System.out.println("order cancelled");
						                            }
				                      } 
				                      else
					                  {
						                     System.out.print("Insufficient amount");
					                  }
						 
				                }
				                else 
				                {
					                  System.out.print("Invalid option");
				                }
			   }
			   else if (dish2==2)
			   {
				          System.out.println("you selected pepper fry momo");
				          int price4 = 300;
				          System.out.println("Enter the quantity");
				          int quant4= sc.nextInt();  //indha edathula namba ena user kita irundhu vanguromo adhaye declare panalam
				          int  bill4 = price4 * quant4;
				          System.out.println("your price is:"+ bill4);
				          System.out.print( "y - yes , no -no:");
				          char ab4=sc.next().charAt(0);
				                if (ab4=='y')
			                    {
				                      System.out.print("you must pay the amount:");
				                      int amo4=sc.nextInt();
				                      if (bill4==amo4)
				                      {
					                         int generatedotp = (int)(Math.random()*9000)+1000;
					                         System.out.println("Your otp is:"+generatedotp);
					                         System.out.print("Enter your otp:");
					                         int userotp=sc.nextInt();
					                                if (generatedotp==userotp)
					                                {
						                                  System.out.println("your order is placed");
					                                }
						                            else
						                            {
						                                  System.out.println("order cancelled");
						                            }
				                      } 
				                      else
					                  {
						                     System.out.print("Insufficient amount");
					                  }
						 
				                }
				                else 
				                {
					                  System.out.print("Invalid option");
				                }
			   }
			   
			   else if (dish2==3)
			   {
				          System.out.println("you selected veg momo");
				          int price5 = 100;
				          System.out.println("Enter the quantity");
				          int quant5= sc.nextInt();  //indha edathula namba ena user kita irundhu vanguromo adhaye declare panalam
				          int  bill5 = price5 * quant5;
				          System.out.println("your price is:"+ bill5);
				          System.out.print( "y - yes , no -no:");
				          char ab5=sc.next().charAt(0);
				                if (ab5=='y')
			                    {
				                      System.out.print("you must pay the amount:");
				                      int amo5=sc.nextInt();
				                      if (bill5==amo5)
				                      {
					                         int generatedotp = (int)(Math.random()*9000)+1000;
					                         System.out.println("Your otp is:"+generatedotp);
					                         System.out.print("Enter your otp:");
					                         int userotp=sc.nextInt();
					                                if (generatedotp==userotp)
					                                {
						                                  System.out.println("your order is placed");
					                                }
						                            else
						                            {
						                                  System.out.println("order cancelled");
						                            }
				                      } 
				                      else
					                  {
						                     System.out.print("Insufficient amount");
					                  }
						 
				                }
				                else 
				                {
					                  System.out.print("Invalid option");
				                }
			   }
			   
			                     break;
			              case 3:System.out.println("\t\t\t Welcome to pandiyas hotel");
		                         System.out.println("1.parotta-20rs \n2.chicken chukka-150rs \n3.Egg thokku-100s");
			                     System.out.println("\t\t\twhich one you want?");
			   int dish3=sc.nextInt();
			   if (dish3==1)
			   {
				          System.out.println("you selected parotta");
				          int price6 = 20;
				          System.out.println("Enter the quantity");
				          int quant6= sc.nextInt();  //indha edathula namba ena user kita irundhu vanguromo adhaye declare panalam
				          int  bill6 = price6 * quant6;
				          System.out.println("your price is:"+ bill6);
				          System.out.print( "y - yes , no -no:");
				          char ab6=sc.next().charAt(0);
				                if (ab6=='y')
			                    {
				                      System.out.print("you must pay the amount:");
				                      int amo6=sc.nextInt();
				                      if (bill6==amo6)
				                      {
					                         int generatedotp = (int)(Math.random()*9000)+1000;
					                         System.out.println("Your otp is:"+generatedotp);
					                         System.out.print("Enter your otp:");
					                         int userotp=sc.nextInt();
					                                if (generatedotp==userotp)
					                                {
						                                  System.out.println("your order is placed");
					                                }
						                            else
						                            {
						                                  System.out.println("order cancelled");
						                            }
				                      } 
				                      else
					                  {
						                     System.out.print("Insufficient amount");
					                  }
						 
				                }
				                else 
				                {
					                  System.out.print("Invalid option");
				                }
			   }
			   else if (dish3==2)
			   {
				          System.out.println("you selected chicken thokku");
				          int price7 = 150;
				          System.out.println("Enter the quantity");
				          int quant7= sc.nextInt();  //indha edathula namba ena user kita irundhu vanguromo adhaye declare panalam
				          int  bill7 = price7 * quant7;
				          System.out.println("your price is:"+ bill7);
				          System.out.print( "y - yes , no -no:");
				          char ab7=sc.next().charAt(0);
				                if (ab7=='y')
			                    {
				                      System.out.print("you must pay the amount:");
				                      int amo7=sc.nextInt();
				                      if (bill7==amo7)
				                      {
					                         int generatedotp = (int)(Math.random()*9000)+1000;
					                         System.out.println("Your otp is:"+generatedotp);
					                         System.out.print("Enter your otp:");
					                         int userotp=sc.nextInt();
					                                if (generatedotp==userotp)
					                                {
						                                  System.out.println("your order is placed");
					                                }
						                            else
						                            {
						                                  System.out.println("order cancelled");
						                            }
				                      } 
				                      else
					                  {
						                     System.out.print("Insufficient amount");
					                  }
						 
				                }
				                else 
				                {
					                  System.out.print("Invalid option");
				                }
			   }
			   
			   else if (dish3==3)
			   {
				          System.out.println("you selected Egg thokku");
				          int price8 = 100;
				          System.out.println("Enter the quantity");
				          int quant8= sc.nextInt();  //indha edathula namba ena user kita irundhu vanguromo adhaye declare panalam
				          int  bill8 = price8 * quant8;
				          System.out.println("your price is:"+ bill8);
				          System.out.print( "y - yes , no -no:");
				          char ab8=sc.next().charAt(0);
				                if (ab8=='y')
			                    {
				                      System.out.print("you must pay the amount:");
				                      int amo8=sc.nextInt();
				                      if (bill8==amo8)
				                      {
					                         int generatedotp = (int)(Math.random()*9000)+1000;
					                         System.out.println("Your otp is:"+generatedotp);
					                         System.out.print("Enter your otp:");
					                         int userotp=sc.nextInt();
					                                if (generatedotp==userotp)
					                                {
						                                  System.out.println("your order is placed");
					                                }
						                            else
						                            {
						                                  System.out.println("order cancelled");
						                            }
				                      } 
				                      else
					                  {
						                     System.out.print("Insufficient amount");
					                  }
						 
				                }
				                else 
				                {
					                  System.out.print("Invalid option");
				                }
			   }
			   else
			   {
				   System.out.println("invalid option");
				   
			   }
			   
			   
			   
			   
			   
			   
			   
			   
		
		}
	}
}
