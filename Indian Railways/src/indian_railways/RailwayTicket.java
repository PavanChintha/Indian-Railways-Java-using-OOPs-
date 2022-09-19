package indian_railways;
import java.util.*;
import java.util.Scanner;
public class RailwayTicket {
public String name;
public String coach;
public long ph_no;
public int amt;
public int totalamt;
static Scanner sc= new Scanner(System.in);
    public void accept()
{
	System.out.println("Enter a name:");
	name=sc.nextLine();
	System.out.println("Enter Coach:");
	coach=sc.nextLine();
	System.out.println("Enter Phone Number:");
	ph_no=sc.nextLong();
	System.out.println("Enter amount:");
	amt=sc.nextInt();
}	
	public void update() {
	if(coach.equalsIgnoreCase("First_Ac"))
		totalamt=amt+700;
	else if (coach.equalsIgnoreCase("Second_Ac"))
		totalamt=amt+500;
	else if (coach.equalsIgnoreCase("Third_Ac"))
		totalamt=amt+250;
	else if (coach.equalsIgnoreCase("Sleeper"))
		totalamt=amt;
	else {
		System.out.println("Please Enter valid Coach !!!");
	}
} 
	public void display() {
		System.out.println("----Ticket Details ---- ");
		System.out.println("Name: "+name);
		System.out.println("Coach: "+coach);
		System.out.println("Total Amount: "+totalamt);
		System.out.println("Phone Number: "+ph_no);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    RailwayTicket obj=new RailwayTicket();
    obj.accept();
    obj.update();
    obj.display();
	}

}
