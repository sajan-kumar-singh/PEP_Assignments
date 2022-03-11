package Assignments;
import java.util.*;
public class Session3_Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		int amt=sc.nextInt();
		System.out.println("Enter promocode");
		int promocode=sc.nextInt();
		sc.close();
		 
		int jumbo=101;
		int zomhello=201;
		
		
		double discount=promocode==jumbo&&amt>=200?0.5*amt:0;
		discount=promocode==zomhello&&amt>=159?0.6*amt>=120?120:0.6*120:discount;
		
		amt-=discount;
		
		if(discount!=0) {
			System.out.println("Promocode applied \n"+"Discount="+discount+"\nPlease pay: \u20b9"+amt);
		}
		else {
			if(promocode!=jumbo&&promocode!=zomhello) {
				System.out.println("Please enter right promocode like jumbo or zomhello");
			}
			else if(amt<200) {
				System.out.println("Amount is lesser. Please add "+(200-amt)+" more.");
			}
		}
		
		
		

	}

}
