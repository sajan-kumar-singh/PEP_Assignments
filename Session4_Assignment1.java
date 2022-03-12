package Assignments;

public class Session4Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] pixel1= {12,45,78};
		int [] pixel2= {34,12,90};
		int [] pixel3= {0,234,56};
		
		int [] pixel4= {12,23,34};
		int [] pixel5= {45,56,67};
		int [] pixel6= {78,89,90};
		
		int [] pixel7= {9,98,87};
		int [] pixel8= {76,65,54};
		int [] pixel9= {43,32,21};
		
		int[][][] image= {
				{pixel1,pixel2,pixel3},
				{pixel4,pixel5,pixel6},
				{pixel7,pixel8,pixel9}
		};
		
		System.out.println("Nornmal Printing");
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[i].length;j++) {
				for(int k=0;k<image[i][j].length;k++) {
					System.out.print(image[i][j][k]+" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("90 degree right rotation");
		for(int i=0;i<image.length;i++) {
			for(int j=image[i].length-1;j>=0;j--) {
				for(int k=0;k<image[i][j].length;k++) {
					System.out.print(image[j][i][k]+" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("180 degree left rotation");
		for(int i=image.length-1;i>=0;i--) {
			for(int j=image[i].length-1;j>=0;j--) {
				for(int k=0;k<image[j][i].length;k++) {
					System.out.print(image[i][j][k]+" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int count=0;
		System.out.println("GreyScale transformation");
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[i].length;j++) {
				for(int k=0;k<image[i][j].length;k++) {
					count+=image[i][j][k];
				}
				count/=3;
				for(int k=0;k<image[i][j].length;k++) {
					System.out.print(count+" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
