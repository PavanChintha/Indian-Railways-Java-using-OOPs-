package indian_railways;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fare implements IndianRailwaySystem {
public void BookTicket()throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 
	for(int x=1; x==1;){
		
			System.out.print("ENTER PASSENGER'S NAME: ");
			String search = in.readLine();
			String again;
			
			
			int s=1;
			for(int b=0;b<z;b++){
				if(search.equalsIgnoreCase(ticketS[b][0])){
					System.out.println("***************************************");
					System.out.println("**        PASSENGER'S DETAILS        **");
					System.out.println("***************************************");
					System.out.println("PASSENGER'S NAME: " + ticketS[b][0]);
					System.out.println("PASSENGER'S DESTINATION : " + ticketS[b][1]);
					System.out.println("FARE PRICE: " + ticketD[b][0]);
					System.out.println("NO. OF PASSENGERS: " + ticketI[b][0]);
					System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[b][1]);
						System.out.println("***************************************");
					System.out.println("***************************************");
					s=0;
					x=0;
					
					if(ticketS[b][2].equals("x")){
						System.out.println("Passenger's Already Paid!");
						x=0;
					}
					else{
						ticketS[b][2]="x";
						
					
						for(x=1; x==1;){
							System.out.println("\nPASSENGER'S TOTAL FARE: Php "+ticketD[b][2]);
							System.out.print("ENTER AMOUNT TO PAY: ");
							pay[b] = Double.parseDouble(in.readLine());
							change[b]=pay[b]-ticketD[b][2];
				
							if(change[b]<0){
								System.out.println("Invalid Input!");
								x=1;
							}
							else{
								System.out.println("CHANGE:  "+change[b]);
								System.out.println("");
								x=0;
							}
						}
					}
				}
			}
			if (s==1){
				System.out.println("\nPASSENGER'S NAME NOT FOUND!\n");
				for(int q=1; q==1;){
				
				System.out.print("Do you wish to continue with this transaction? [Y/N]: ");
				again=in.readLine();
				
				if(again.equalsIgnoreCase("y")){
					q=0;
				}
				else if (again.equalsIgnoreCase("n")){
					q=0;
					x=0;
					
				}
				else{
					System.out.println("\nInvalid input!\n");
				}
			
	
			}
		}	
	}
    
}

}

