package indian_railways;

public class Journey implements IndianRailwaySystem {
   
    public void Set_Details() {
    	//"available[]" is the SEAT AVAILABLE//
    			//store 20 seats every destination [1-5]//
    			for(int o=1; o<=5; o++){
    				available[o]=20;
    				}
    }

	public void Get_Details() {
		
		//the DESTINATION DETAILS//
		//display the "Destination", every destination "Fare", and the "Seat" available//
		System.out.println("***************************************");
		System.out.println("**   DESTINATION |FARE|  SEAT  **");
		System.out.println("***************************************");
		System.out.println("** 1.)CHENNAI    | 600 |   "+available[1]+"   **");
		System.out.println("** 2.)HYDERABAD  | 170 |   "+available[2]+"   **");
		System.out.println("** 3.)VIZAG      | 150 |   "+available[3]+"   **");
		System.out.println("** 4.)GOA        | 200 |   "+available[4]+"   **");
		System.out.println("** 5.)TIRUPATI   | 250 |   "+available[5]+"   **");
		System.out.println("***************************************");
		System.out.println("***************************************\n");
		System.out.println("PWD, STUDENT, & SENIOR CITIZEN with 20% DISCOUNT!!!\n");
	}
}
