import java.util.Scanner;
import java.time.LocalDate;
public class Phase1 {

	public static void main(String[] args) {
		String AddressSet = "";
		int DeliveryCharge = 0;
		
		
		
		System.out.println("Please enter your Full name"); //asks user to input name
		Scanner Name = new Scanner(System.in);
		String name = Name.nextLine();
		System.out.println("You have stored your name as " + name);
		
		System.out.println();
		
		System.out.println("Please enter your Email Address");//asks user to input email
		Scanner Email = new Scanner(System.in);
		String email = Email.nextLine();
		System.out.println("You have stored your email as " + email);
		
		System.out.println();
		
		System.out.println("Please enter your Phone Number");//asks user to input Phone number
		Scanner PhoneNumber = new Scanner(System.in);
		String phonenumber = PhoneNumber.nextLine();
		System.out.println("You have stored your phone number as " + phonenumber);
		
		System.out.println();
		
		System.out.println("Please enter the date you wish to rent your items: (dd/mm/yy)"); //asks user to input the date they want to rent the items
		Scanner Date = new Scanner(System.in);
		String RD = Date.nextLine();
		System.out.println("You have selected a renting date of " + RD);
		
		System.out.println();
		
		System.out.println("Please enter how many days you wish to rent for"); //asks user to input how many days they want to rent the items for
		Scanner amountofdays = new Scanner(System.in);
		int AD = amountofdays.nextInt();
		System.out.println("You have selected to rent your items for " + AD + " days");
		
		System.out.println();
		
		System.out.println("Please enter a letter: V= Vacation Venue, B = Bella's Beach, or G = Griffen's Grove");//asks user to input which location they want the rented items to go to
		Scanner Location = new Scanner(System.in);
		char LD = Location.next().charAt(0);
		
		
		if(LD == 'V' || LD =='v') { //location 1 - Vacation Venue
			DeliveryCharge = 0;
			AddressSet = "Vacation Venue";
			System.out.println("You have selected " + AddressSet + " your delivery charge will be 0$");
			
		}
		else if(LD == 'B'||LD =='b') { //location 2 - Bella's Beach
			DeliveryCharge = 10;
			AddressSet = "Bella's Beach";
			System.out.println("You have selected " + AddressSet + " your delivery charge will be 10$");
		}
		else if (LD == 'G'||LD =='g') {//location 3 - Griffens Grove
			DeliveryCharge = 20;
			AddressSet = "Griffens Grove";
			System.out.println("You have selected " + AddressSet + " your delivery charge will be 20$");
		}
		

			System.out.println();
		
		System.out.println("How many total items would you like to rent today?");//asks user to input total number of items they want to rent for this reservation
		Scanner ECount = new Scanner(System.in);
		int ECounter = ECount.nextInt();
		
		
		if(ECounter <= 20 && ECounter > 0)
		{
		System.out.println("How many paddle boards would you like?");//asks user to input amount of paddle boards they want
		Scanner EInput =  new Scanner(System.in);
		int BoatCount1 = EInput.nextInt();
		int BoatCost1 = 65;
		if(BoatCount1 > 0) {
		System.out.println("Added to cart");
		}
		
		
		System.out.println("");
		
		System.out.println("How many Single Kayak's would you like?");//asks user to input amount of single kayaks they want
		Scanner EInput2 =  new Scanner(System.in);
		int BoatCount2 = EInput.nextInt();
		int BoatCost2 = 45;
		if(BoatCount2 > 0) {
		System.out.println("Added to cart");
		}
		
		
		System.out.println("");
		
		System.out.println("How many Tandem Kayak's would you like?"); //asks user to input amount of Tandem Kayaks they want
		Scanner EInput3 =  new Scanner(System.in);
		int BoatCount3 = EInput.nextInt();
		int BoatCost3 = 65;
		if(BoatCount3 > 0) {
		System.out.println("Added to cart");
		}
		
		
		System.out.println("");
		
		System.out.println("How many 3+ person canoes would you like?");//asks user to input amount of 3+ person canoes they want
		Scanner EInput4 =  new Scanner(System.in);
		int BoatCount4 = EInput.nextInt();
		int BoatCost4 = 75;
		if(BoatCount4 > 0) {
		System.out.println("Added to cart");
		}
		
		
		System.out.println("");
		
		System.out.println("How many sling low chairs would you like?");//asks user to input amount of sling low chairs they want
		Scanner EInput5 =  new Scanner(System.in);
		int CCount1 = EInput.nextInt();
		int CCost1 = 5;
		if(CCount1 > 0) {
		System.out.println("Added to cart");
		}
		
		
		System.out.println("");
		
		System.out.println("How many Chaise lounge chairs would you like?");//asks user to input amount of chaise lounge they want
		Scanner EInput6 =  new Scanner(System.in);
		int CCount2 = EInput.nextInt();
		int CCost2 = 7;
		if(CCount2 > 0) {
		System.out.println("Added to cart");
		}
		
		
		System.out.println("");
		
		System.out.println("How many folding classic chairs would you like?");//asks user to input amount of classic chairs they want
		Scanner EInput7 =  new Scanner(System.in);
		int CCount3 = EInput.nextInt();
		int CCost3 = 5;
		if(CCount3 > 0) {
		System.out.println("Added to cart");
		}
		
		
		System.out.println("");
		
		System.out.println("How many Adirondack chairs would you like?");//asks user to input amount of Adirondack chairs they want
		Scanner EInput8 =  new Scanner(System.in);
		int CCount4 = EInput.nextInt();
		int CCost4 = 10;
		if(CCount4 > 0) {
		System.out.println("Added to cart");
		}
		
		
		System.out.println("");
		
		System.out.println("How many Chair-Side Umbrellas would you like?");//asks user to input amount of Chair-Side Umbrellas they want
		Scanner EInput9 =  new Scanner(System.in);
		int UCount1 = EInput.nextInt();
		int UCost1 = 5;
		if(UCount1 > 0) {
		System.out.println("Added to cart");
		}
		
		
		System.out.println("");
		
		System.out.println("How many Single Umbrellas would you like?");//asks user to input amount of Single Umbrellas they want
		Scanner EInput10 =  new Scanner(System.in);
		int UCount2 = EInput.nextInt();
		int UCost2 = 10;
		if(UCount2 > 0) {
		System.out.println("Added to cart");
		}
		
		
		System.out.println("");
		
		System.out.println("How many Family Umbrellas would you like?");//asks user to input amount of Family Umbrellas they want
		Scanner EInput11 =  new Scanner(System.in);
		int UCount3 = EInput.nextInt();
		int UCost3 = 15;
		if(UCount3 > 0) {
		System.out.println("Added to cart");
		}
		
		
		System.out.println("");
		
		System.out.println("How many Tents would you like?");//asks user to input amount of tents they want
		Scanner EInput12 =  new Scanner(System.in);
		int UCount4 = EInput.nextInt();
		int UCost4 = 20;
		if(UCount4 > 0) {
		System.out.println("Added to cart");
		}
		
		
		
		int TotalItems = (BoatCount1 + BoatCount2 + BoatCount3 + BoatCount4 + CCount1 + CCount2 + CCount3 + CCount4 + UCount1 + UCount2 + UCount3 + UCount4); //calculates total amount of items selected
		if(TotalItems == 0)
		{
			System.out.println("Please enter at least one item to rent!");//if no items were selected, error
		}
		
		if(CCount4 >0) 
			
			System.out.println("What color would you like the adirondack chairs to be?: Red, Green, or Blue");//asks user a specific question about color of chair
			Scanner CCount4Color =  new Scanner(System.in);
			String CCount4color = CCount4Color.next();
			
		
		
		
		if(BoatCount1 > 0)
		{
			System.out.println("Please enter how many people are riding in each paddle Boat!");//asks user how many people are going to be in each paddle board
			Scanner PInput1 =  new Scanner(System.in);
			int People1 = EInput.nextInt();
			
			System.out.println("Please enter how many LifeJackets you will need for each boat!");//asks user how many lifejackets they need
			Scanner LJInput1 =  new Scanner(System.in);
			int LifeJacket1 = EInput.nextInt();
			
			if(LifeJacket1 > 3)
			{
				System.out.println("Too many lifejacket, please select less than 3!");//if its too many, error
			}
			
			
			System.out.println("Please enter the size of life jackets you need, seperated by a comma!(1-6)");//asks user for size of life jackets
			Scanner LJSInput1 =  new Scanner(System.in);
			String JacketSize1 = EInput.next();
			
			
			System.out.println("Please enter how many paddles you will need for each boat");//asks user for amount of paddles they will need
			Scanner PaddleInput1 =  new Scanner(System.in);
			int PaddleInputCount = EInput.nextInt();
			
		}
		if(BoatCount3 > 0)
		{
			System.out.println("Please enter how many people are riding in each Tandem Kayak!");//asks user how many riders will be in the tandem kayak
			Scanner PInput3 =  new Scanner(System.in);
			int People3 = EInput.nextInt();
			
			System.out.println("Please enter how many LifeJackets you will need for each boat!");//asks user how many lifejackets they need
			Scanner LJInput3 =  new Scanner(System.in);
			int LifeJacket3 = EInput.nextInt();
			
			if(LifeJacket3 > 3)
			{
				System.out.println("Too many lifejacket, please select less than 3!");//if its too many, error
			}
			
	
			System.out.println("Please enter the size of life jackets you need, seperated by a comma!(1-6)");//asks user for size of life jackets
			Scanner LJSInput3 =  new Scanner(System.in);
			String JacketSize3 = EInput.next();
			
			System.out.println("Please enter how many paddles you will need for each boat");//asks user for amount of paddles they will need
			Scanner PaddleInput3 =  new Scanner(System.in);
			int PaddleInputCount3 = EInput.nextInt();
			
		}
		
		if(BoatCount4 > 0)
		{
			System.out.println("Please enter how many people are riding in the 3 person canoe!");//asks user to input how many people are going to be in the canoe
			Scanner PInput4 =  new Scanner(System.in);
			int People4 = EInput.nextInt();
			
			System.out.println("Please enter how many LifeJackets you will need for each boat!");//asks user how many lifejackets they need
			Scanner LJInput4 =  new Scanner(System.in);
			int LifeJacket4 = EInput.nextInt();
			
			if(LifeJacket4 > 3)
			{
				System.out.println("Too many lifejacket, please select less than 3!");//if its too many, error
			}
			
	
			System.out.println("Please enter the size of life jackets you need, seperated by a comma!(1-6)");//asks user for size of life jackets
			Scanner LJSInput4 =  new Scanner(System.in);
			String JacketSize4 = EInput.next();
			
			System.out.println("Please enter how many paddles you will need for each boat");//asks user for amount of paddles they will need
			Scanner PaddleInput4 =  new Scanner(System.in);
			int PaddleInputCount4 = EInput.nextInt();
		}
			
			
			
			

			
				
			double TotalBoatsCost = ((BoatCount1 *BoatCost1)*AD) + ((BoatCount2 *BoatCost2)*AD) + ((BoatCount3 *BoatCost3)*AD) + ((BoatCount4 *BoatCost4)*AD); //calculates Boat cost
			double TotalChairsCost = ((CCost1 * CCount1)*AD) + ((CCost2 * CCount2)*AD) + ((CCost3 * CCount3)*AD) + ((CCost4 * CCount4)*AD);//calculates Chair cost
			double TotalUmbrellaCost = ((UCost1 * UCount1)*AD) + ((UCost2 * UCount2)*AD) + ((UCost3 * UCount3)*AD) + ((UCost4 * UCount4)*AD); //calculates umbrella cost
			
			int TotalBeachChairs = (CCount1 + CCount2 + CCount3 + CCount4); //counts chairs
			
			if(TotalBeachChairs >= 4) //discount for chairs
			{
				TotalChairsCost = TotalChairsCost * .90;
			}
			
			if(AD >= 3) //discount for boats
			{
				TotalBoatsCost = TotalBoatsCost *.90;
			}
			double Cost = ((TotalBoatsCost + TotalChairsCost + TotalUmbrellaCost))*1.06 + DeliveryCharge - ((TotalBoatsCost + TotalChairsCost + TotalUmbrellaCost)) + DeliveryCharge; //tax
			double TotalCost = ((TotalBoatsCost + TotalChairsCost + TotalUmbrellaCost) + DeliveryCharge)*1.06; //total cost
			
			if(BoatCount1 > 0) 
			{System.out.println("You have rented " + BoatCount1 +  " Paddle Boat(s) for $65/day for " + AD + " day(s) at " + AddressSet);} //breakdown of information
			
			if(BoatCount2 > 0)
			{System.out.println("You have rented " + BoatCount2 +  " Single Kayak(s) for $45/day for " + AD + " day(s) at " + AddressSet);}
			
			if(BoatCount3 > 0)
			{System.out.println("You have rented " + BoatCount3 +  " Tandem Kayak(s) for $65/day for " + AD + " day(s) at " + AddressSet);}
			
			if(BoatCount4 > 0)
			{System.out.println("You have rented " + BoatCount4 +  " 3 person Canoe(s) for $75/day for " + AD + " day(s) at " + AddressSet);}
			
			if(CCount1 > 0)
			{System.out.println("You have rented " + CCount1 +  " Sling low Chair(s) for $5/day for " + AD + " day(s) at " + AddressSet);}
			
			if(CCount2 > 0)
			{System.out.println("You have rented " + CCount2 +  " Chaise Lounge Chair(s) for $7/day for " + AD + " day(s) at " + AddressSet);}
			
			if(CCount3 > 0)
			{System.out.println("You have rented " + CCount3 +  " Folding Classing Chair(s) for $5/day for " + AD + " day(s) at " + AddressSet);}
			
			if(CCount4 > 0)
			{System.out.println("You have rented " + CCount4 + " " + CCount4color +" Adirondack Chair(s) for $10/day for " + AD + " day(s) at " + AddressSet);}
			
			if(UCount1 > 0)
			{System.out.println("You have rented " + UCount1 +  " Chair-Side Umbrella(s) for $5/day for " + AD + " day(s) at " + AddressSet);}
			
			if(UCount2 > 0)
			{System.out.println("You have rented " + UCount2 +  " Single Umbrella(s) for $10/day for " + AD + " day(s) at " + AddressSet);}	
			
			if(UCount3 > 0)
			{System.out.println("You have rented " + UCount3 +  " Family Umbrella(s) for $15/day for " + AD + " day(s) at " + AddressSet);}
			
			if(UCount4 > 0)
			{System.out.println("You have rented " + UCount4 +  " Tent(s) for $20/day for " + AD + " day(s) at " + AddressSet);}
			
	
													//reciept!!!
				System.out.println();
				System.out.println("****************************************************************************");
				System.out.println("Thank you for your reservation with Victorias Vacation Venue " + name);
				System.out.println("");
				System.out.println("Delivary Charge is: $" + DeliveryCharge);
				System.out.println("Your tax is: $" + Cost);
				System.out.println("You have a grand total of: $" + TotalCost);
				System.out.println("");
				System.out.println("****************************************************************************");
				
				
				if(TotalItems > ECounter) {
					System.out.println("You specified " + ECounter + " amount of items, but selected " + TotalItems + " amount of items, please fix this"); //error checking
				}
				
				if(TotalItems < ECounter) {
					System.out.println("You specified " + ECounter + " amount of items, but only selected " + TotalItems + " amount of items, please fix this");//error checking
				}
				}
				
				else
				{
					System.out.println("Sorry, you may rent 1-20 items today");//error checking
				}
				
		}

		
		
		

		
	}



