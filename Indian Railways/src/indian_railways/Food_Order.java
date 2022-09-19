package indian_railways;
import java.util.Scanner;
public class Food_Order {
	static Scanner scan= new Scanner(System.in);
	
	static String[] foodlist={"1) Chicken Biryani ","2) Meals","3)Chapathi","4)Vada","5)Samosa"};
	static int number;
	
	
	public static void getFood(){
	System.out.println("Please select a Food Item");
	for(int i=0;i<foodlist.length;i++){

	System.out.println(foodlist[i]);
	}
	number=scan.nextInt();
	System.out.println("Your Food Order is "+foodlist[number-1].substring(3,foodlist[number-1].length()));
	getSeats();
	}
	public static void getSeats(){
	System.out.println("Please Choose the Quantity of Selected Food Item");
	String seats=scan.next();
	System.out.println("Thank you,\nYou have selected "+seats+" Quantity of "+foodlist[number-1].substring(3,foodlist[number-1].length()) );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getFood();
	}

	
}
