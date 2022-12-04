package coolmens;
import java.util.*;
public class LuckyPerson {
	static Scanner c =new Scanner (System.in);	
	public void LuckyPerson1() {
		System.out.println("Participate Form ");
		System.out.println("Enter Your Name : ");		
		String name = c.nextLine();		
		System.out.println("Enter Your Age : ");		
		int age = c.nextInt();
		System.out.println("Enter Your Phone Number : ");		
		Long PhnNo = c.nextLong();
		System.out.println("Dear Costumer : " + name);
		System.out.println("We Are Stored Your Details in coolmens Database \n for purpose of, We Are Notified our showroom exclusive offers through your details");
		System.out.println("Thank You : " + name);
	}
		
	public void LuckyPerson(){
		System.out.println("Scratch Your Coupon or Enter Your Code : ");		
		int UrCde = c.nextInt();		
		int randomNum = (int)(Math.random()* (1000-500)+500); 
		System.out.println("Sorry, Better Luck Next Time ");
		System.out.println("Your coupon code is " +UrCde +" not match with our coupon code " + randomNum );
	}
}
