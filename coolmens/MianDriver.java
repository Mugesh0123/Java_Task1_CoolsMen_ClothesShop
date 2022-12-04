package coolmens;
import java.util.Arrays;
import java.util.Scanner;
public class MianDriver {
	static Scanner myNum = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Store data coolmens database in arrays
//		System.out.println("Do you want to check combo dress and aadi discount prices ? Enter 1 ");
//		System.out.println("Do you want to check employee salary and increse bouns amount ? Enter 2");
//		System.out.println("Do you want to check coustomer discount price ? Enter 3");
//		System.out.println("Do you want to participate coupon contest ? Enter 4");
//		System.out.println("Do you want to order ? Enter 5");

		AadiDiscount myDis = new AadiDiscount(150);
		 Order orders =new Order();
		DressShop p1 = new DressShop("red shirt", "black pant", 5, 1500);
		DressShop p2 = new DressShop("green shrit", "black pant", 4, 2000);
		DressShop[] myShop = { p1, p2 };
		EmployeeDetails d1 = new EmployeeDetails("mugesh", 10000, 2);
		EmployeeDetails d2 = new EmployeeDetails("ramesh", 20000, 3);
		EmployeeDetails[] myEmply = { d1, d2 };
		CostumerDetails c1 = new CostumerDetails("ravi", 2, 250);
		CostumerDetails c2 = new CostumerDetails("manoj", 3, 250);
		CostumerDetails[] myCstmr = { c1, c2 };
		
		int userCheck=1;
		while( userCheck == 1) {
			System.out.println("Do you want to check combo dress and aadi discount prices ? Enter 1 ");
			System.out.println("Do you want to check employee salary and increse bouns amount ? Enter 2");
			System.out.println("Do you want to check coustomer discount price ? Enter 3");
			System.out.println("Do you want to participate coupon contest ? Enter 4");
			System.out.println("Do you want to order ? Enter 5");
			System.out.println("Expolre coolmens Enter 1 Or Exit the coolmens Enter 2");
			userCheck = myNum.nextInt();
			if (userCheck == 1) { 
				System.out.println("Enter Shop Details");
				int shopDetails = myNum.nextInt();
		switch(shopDetails) {		
		case 1:		
		System.out.println("Dress combo prices");
		System.out.println(Arrays.toString(myShop));
		for (int i = 0; i < myShop.length; i++) {
			if (myShop[i].getComboPrice() == 1500) {
				myShop[i].setComboPrice(myShop[i].getComboPrice() - myDis.getAdiDiscnt());
			}
			if (myShop[i].getComboPrice() == 2000) {
				myShop[i].setComboPrice(myShop[i].getComboPrice() - myDis.getAdiDiscnt());
			}
		}
		System.out.println("Dress combo aadi prices");
		System.out.println(Arrays.toString(myShop));		
		break;
		case 2:		
		System.out.println("Employee salary");
		System.out.println(Arrays.toString(myEmply));
		System.out.println("Enter bonus increasment amount for 2 experience :");
		int s = myNum.nextInt();
		System.out.println("Enter bonus increasment amount for above 2 experience :");
		int n = myNum.nextInt();
		for (int i = 0; i < myEmply.length; i++) {
			if (myEmply[i].getExperience() < 2) {
				myEmply[i].seteSalary(myEmply[i].geteSalary() + s);
			}
			if (myEmply[i].getExperience() > 2) {
				myEmply[i].seteSalary(myEmply[i].geteSalary() + n);
			}
		}
		System.out.println("Aadi bonus with salary  ");
		System.out.println(Arrays.toString(myEmply));		
		break;
		case 3:		
		System.out.println("coustumer details");
		System.out.println(Arrays.toString(myCstmr));
		System.out.println("AadiDiscount is " + myDis.getAdiDiscnt());
		for (int i = 0; i < myCstmr.length; i++) {
			if (myCstmr[i].getdDetail() == 2) {
				myShop[i].setComboPrice(myShop[i].getComboPrice() - (myCstmr[i].getcDiscount()+myDis.getAdiDiscnt()));
			}
			if (myCstmr[i].getdDetail() == 3) {
				myShop[i].setComboPrice(myShop[i].getComboPrice()- (myCstmr[i].getcDiscount()+myDis.getAdiDiscnt()));
			}
		}
		System.out.println("Dress combo aadi prices with costumer discount for regular costumer ");
		System.out.println(Arrays.toString(myShop));	
		break;
		case 4:
		LuckyPerson lckyPer = new LuckyPerson();
		lckyPer.LuckyPerson1();
		lckyPer.LuckyPerson();		
		break;
		case 5:
		orders.myOder();
		break;
		}
	}else {
		System.out.println("thank you for visiting");
	}
   }
	}
	}
