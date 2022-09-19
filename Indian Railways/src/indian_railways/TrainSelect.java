package indian_railways;
import java.util.Scanner;
public class TrainSelect {
	static Scanner scan= new Scanner(System.in);
	static String name;
	static String[] trainlist={"1) Chennai Exp ","2) Prashanti Exp","3) Venkatadri Exp"};
	static int number;
	
	

	public static void getName(){
	System.out.println("Please input your  name");
	name=scan.nextLine();
	System.out.println("Hello "+name);
	getTrain();
	}

	public static void getTrain(){
	System.out.println("Please select a train");
	for(int i=0;i<trainlist.length;i++){

	System.out.println(trainlist[i]);
	}
	number=scan.nextInt();
	System.out.println("You selected the Train "+trainlist[number-1].substring(3,trainlist[number-1].length()));
	getSeats();
	}
	public static void getSeats(){
	System.out.println("Please choose how many seats you would like");
	String seats=scan.next();
	System.out.println("Thank you,\nYou have selected "+seats+" seats for the train "+trainlist[number-1].substring(3,trainlist[number-1].length()) );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getName();
	}

}
