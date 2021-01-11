package assignment3;

import java.util.*;

public class Fruit3 {
	
	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		System.out.println("Enter your name:");
		String name = in.next();
		System.out.println("Name:" + name);
		
		System.out.println("Enter your age:");
		int age = in.nextInt();
		System.out.println("Age:" + age);
		
		System.out.println("Enter your gender (in letter form):");
		String str = in.next();
		char gender = str.charAt(0);
		System.out.println("Gender:" + gender);
		
		String [][] product = {{"Price of Apple","Price of Orange","Price of Pineapple"},{"RM1.20","RM1.30","RM1.50"}};
		System.out.println(product[0][0] + " " +product[1][0]);
        System.out.println(product[0][1] + " " +product[1][1]);
        System.out.println(product[0][2] + " " +product[1][2]);
        
		System.out.println();
		
		for (int i=0; i<50; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		System.out.println("Apple purchased? (true or false)");
			boolean apple = in.nextBoolean();
			System.out.println("Oranges purchased? (true or false)");
		    boolean orange = in.nextBoolean();
			System.out.println("Pineapples purchased? (true or false)");
		    boolean pineapple = in.nextBoolean();
		    
		    
			if(apple && !(orange || pineapple)) {
				PrintMethod1();
				}
			else if(orange && !(apple || pineapple)) {
				PrintMethod2();
			}
			else if(pineapple && !(apple || orange)) {
				PrintMethod3();
				}
			else if(orange && pineapple && !(apple)) {
				PrintMethod4();
				}
			else if(apple && pineapple && !(orange)) {
				PrintMethod5();
			}
			else if(apple && orange && !(pineapple)) {
				PrintMethod6();
				}
			else if(apple && orange && pineapple) {
				PrintMethod7();
		}
			else {
				System.out.println("Purchased failed, please try again. :( ");
			}
			
			in.close();

	}

	private static void PrintMethod1() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of apples purchased:");
		int quantity = in.nextInt();
		double price1 = 1.20;
		double total = quantity*price1 ;
		System.out.println("Total price: RM" + total + "0");
		in.close();
	}
	private static void PrintMethod2() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of oranges purchased:");
		int quantity = in.nextInt();
		double price2 = 1.30;
		double total = quantity*price2;
		System.out.println("Total price: RM" + total + "0");
		in.close();
	}
	private static void PrintMethod3() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of pineapple purchased:");
		int quantity = in.nextInt();
		double price3 = 1.50;
		double total = quantity*price3;
		System.out.println("Total price: RM" + total + "0");
		in.close();
	}
	private static void PrintMethod4() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of orange purchased:");
		int quantity = in.nextInt();
		System.out.println("Enter the quantity of pineapple purchased:");
		int quantity1 = in.nextInt();
		double price2 = 1.30;
		double price3 = 1.50;
		double total [] = {(quantity*price2), (quantity1*price3)};
		double total1 =  0;
		for(int i=0; i<total.length;i++) {
			total1 = total1 + total[i];
		}
		System.out.println("Total price: RM" + total1 + "0");
		in.close();
	}
	private static void PrintMethod5() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of apples purchased:");
		int quantity = in.nextInt();
		System.out.println("Enter the quantity of pineapple purchased:");
		int quantity1 = in.nextInt();
		double price1 = 1.20;
		double price3 = 1.50;
		double total [] = {(quantity*price1), (quantity1*price3)};
		double total1 =  0;
		for(int i=0; i<total.length;i++) {
			total1 = total1 + total[i];}
		
		System.out.println("Total price: RM" + total1 + "0");
		in.close();
	}
	private static void PrintMethod6() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of apples purchased:");
		int quantity = in.nextInt();
		System.out.println("Enter the quantity of oranges purchased:");
		int quantity1 = in.nextInt();
		double price1 = 1.20;
		double price2 = 1.30;
		double total [] = {(quantity*price1), (quantity1*price2)};
		double total1 =  0;
		for(int i=0; i<total.length;i++) {
			total1 = total1 + total[i];}
		
		System.out.println("Total price: RM" + total1 + "0");
		in.close();
	}
	private static void PrintMethod7() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of apples purchased:");
		int quantity = in.nextInt();
		System.out.println("Enter the quantity of oranges purchased:");
		int quantity1 = in.nextInt();
		System.out.println("Enter the quantity of pineapples purchased:");
		int quantity2 = in.nextInt();
		double price1 = 1.20;
		double price2 = 1.30;
		double price3 = 1.50;
		double total [] = {(quantity*price1), (quantity1*price2), (quantity2*price3)};
		double total1 =  0;
		for(int i=0; i<total.length;i++) {
			total1 = total1 + total[i];}
		
		System.out.println("Total price: RM" + total1 + "0");
		in.close();
	}
}
