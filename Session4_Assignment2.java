package Assignments;

public class Session4_Assignment2 {
	
	void insertionSort(int arr[]) {
		int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted array in insertion sort");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
	}
	
	 static void bubbleSort(int[] arr) {  
	    int n = arr.length;  
	    int temp = 0;  
	     for(int i=0; i < n; i++){  
	         for(int j=1; j < (n-i); j++){  
	              if(arr[j-1] > arr[j]){  
                     temp = arr[j-1];  
                     arr[j-1] = arr[j];  
                     arr[j] = temp;  
	             }      
	         }  
	     }
	     System.out.println("Sorted array in bubble sort");
	        for(int i=0;i<arr.length;i++) {
	        	System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	 }
	
	public static void main(String args[]) {
		int arr[]= {3,8,12,76,24,78,22,90};
		int arr2[]= {453,75,2,76,3,753,7,2};
		Session4_Assignment2 s4=new Session4_Assignment2();
		s4.insertionSort(arr);
		bubbleSort(arr2);
	}

}
