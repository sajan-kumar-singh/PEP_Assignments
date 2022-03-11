package Assignments;
import java.util.*;

public class Session3_Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter row");
			int r=sc.nextInt();
			System.out.println("Enter column");
			int c=sc.nextInt();
			char blacksquare='\u25A1';
			char whitesquare='\u25A0';
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(i%2==0) {
						char square=((j+1)%2)==0?blacksquare:whitesquare;
						System.out.print(square+" ");
					}
					else {
						char square=((j)%2)==0?blacksquare:whitesquare;
						System.out.print(square+" ");
					}
				}
				System.out.println();
			}
			int a=1,flag=0;
			char queen='\u2655';
			HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
			do {
				System.out.println("Enter i index for queen "+a);
				int i=sc.nextInt();
				System.out.println("Enter j index for queen "+a);
				int j=sc.nextInt();
				if(hm.containsKey(i)) {
					flag=1;
					continue;
				}
				hm.put(i, j);
			}while(a++<4);
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(i%2==0) {
						char square=((j+1)%2)==0?hm.containsKey(i)&&hm.get(i)==j?queen:blacksquare:whitesquare;
						System.out.print(square+" ");
					}
					else {
						char square=((j)%2)==0?hm.containsKey(i)&&hm.get(i)==j?queen:whitesquare:blacksquare;
						System.out.print(square+" ");
					}
				}
				System.out.println();
			}
			if(flag==1) {
				System.out.println("No queen in same row and column");
			}
			sc.close();
	}

}
