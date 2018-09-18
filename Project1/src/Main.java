/*Jake Krempl
 * Project 1
 * Dr. Demarco
 * 9/16/18
*/


import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
				
			DecimalFormat df = new DecimalFormat("#.00");
				
				Scanner reader = new Scanner(System.in); //creates scanner
				
				System.out.println("Enter number of years until retirement: "); //asks user to input number of years until retirement
				int Years = reader.nextInt();
				
				if (Years <= 0) {
					System.out.println("Please enter a valid number"); //if the number of years was invalid, exits the program and asks to enter a valid number
					System.exit(0);
				}
				
				
				System.out.println("Enter amount of money able to save annually: "); //asks user how much money they can input
				double MoneySaved = reader.nextDouble();
				
				reader.close(); //closes scanner
				
				
				double total = 0;
			    for(int i=1; i <= Years; i++) {
			        total += MoneySaved;
			        total *= 1.05;
			        
			        
			        System.out.println(df.format(total));
			    }
			    
			    
				
				

			}
		}


	


