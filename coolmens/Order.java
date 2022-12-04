package coolmens;

import java.util.Scanner;

public class Order {
	static Scanner myNum = new Scanner (System.in);
	
	AadiDiscount myDis = new AadiDiscount(150);
	DressShop p1 = new DressShop("red shirt", "black pant", 5, 1500);
	DressShop p2 = new DressShop("green shrit", "black pant", 4, 2000);
	DressShop[] myShop = { p1, p2 };
	public void myOder() {		
		System.out.println("Enter The Order Quantitive");
		int order = myNum.nextInt();
		
		int userCheck=1;
		while( userCheck == 1) {
			System.out.println("Order is confrim Enter 1 Or Exit Enter 2");
			userCheck = myNum.nextInt();
			if (userCheck == 1) {				
		for (int i = 0; i < myShop.length; i++) {
			order++;
			if (order <=myShop[i].getAvailable()) {					
				System.out.println("your order red black is available");
			} 
			else if (order <= myShop[i].getAvailable()) {					
				System.out.println("your order green black is available");
			} else {
				System.out.println("your order is not available");
			}
		}		
			} 
			else {
				System.out.println("Thanks for visiting");
			}
		

	    }
	}

}
