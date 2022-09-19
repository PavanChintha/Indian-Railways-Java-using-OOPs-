package indian_railways;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface IndianRailwaySystem {
    
    String user,password,yn,search,again,choice;
    public  int to=0,y=1,z=0,end=0,r=1;
    public  int x,print;
    int available[] = new int[6];
    int ticketI[][] = new int [100][3];
    String ticketS[][] = new String[100][3];
    double ticketD[][] = new double [100][3];
    double pay[] = new double[20];
    double change[] = new double[20];
}
    public static void main(String args[])  {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        
        for(int i=1;i<4;){
    		System.out.print("Enter Username: ");
    		user = in.readLine();
    		System.out.print("Enter Password: ");
    		password = in.readLine();
        
        
        
        	//if user and password are correct proceed to MAIN MENU//
        	if(user.equals("1") && password.equals("1")){
        	
        		for(int x=1; x==1;){
        			//the MAIN MENU//
        			System.out.println("********************************************");
        			System.out.println("** RAILWAY RESERVATION SYSTEM   **");
        			System.out.println("********************************************");
        			System.out.println("** [1] Destination                   **");
        			System.out.println("** [2] Passengers                    **");
        			System.out.println("** [3] Billing                       **");
        			System.out.println("** [4] View                          **");
        			System.out.println("** [5] Exit                          **");
        			System.out.println("***************************************");
        			System.out.println("***************************************\n");
        	
        			for(x=1; x==1;){
    					System.out.print("ENTER CHOICE: ");
    					choice=in.readLine();
    					
    					//if CHOICE is "1" display the DESTINATION//
    					if (choice.equals("1")){
    			
        					x=0;
    					}
    					
    					//if CHOICE is "2" proceed to Ticket Booking//
    					else if (choice.equals("2")){
    						int print=1;
    						
    						
    					
        						x=0;
        						
        					}
        					
        					
        					
     
        					
        					
        		
    					else if (choice.equals("3")){
    			          
    					}
    					else if (choice.equals("4")){
    						
    						
    				
    					}		
    					
    					else if(choice.equals("5")){
    						end=1;
    						x=0;
    						System.out.println("Thank You!");
    					}
    				
    					else{
    						System.out.println("Invalid Input!");
    						x=1;
    					}
        			}
        	
        			for(y=1; y==1;){
        				if(end==1){
        					break;
        				}
        				System.out.print("Do you want another transaction? [Y/N]: ");
       				 	yn = in.readLine();
        	
        				if (yn.equalsIgnoreCase("y")){
        					x=1;
        					y=0;
        				}
        				else if (yn.equalsIgnoreCase("n")){
        					System.out.println("\nThank You!!!");
        					break;
        				}
        				else{
        					System.out.println("Invalid Input!!!");
        					y=1;
        				}
        			}
        		}
        		i=4;
        	}
        	else{
        		System.out.println("\nInvalid user or password!\n");
        		i++;
        	}
        }
        }
    	
        	
        	
        
        
        
        


