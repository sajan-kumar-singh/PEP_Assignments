package Assignments;

class Dishes{
	
	String name;
	int price;
	int quantity;
	
	static int totalQuantity;
	static int totalPrice;
	static int numOfDishes;
	
	
	Dishes(){
		numOfDishes++;
	}
	
	Dishes(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		totalQuantity += quantity;
		numOfDishes++;
		totalPrice += (price*quantity);
	}
	
	void showDish() {
		System.out.println("Dish: "+name+" "+price+" "+quantity);
	}
	
	void increment() {
		quantity++;
		totalQuantity++;
		Dishes.totalPrice+=this.price;
	}
	
	void decrement() {
		quantity--;
		totalQuantity--;
		Dishes.totalPrice-=this.price;
	}
	
	static void showDishData() {
		System.out.println("Number of Dishes: "+numOfDishes);
		System.out.println("Total Quantity: "+totalQuantity);
		System.out.println("Total Price: "+totalPrice);
	}
	
}

public class Session7_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dish dish1 = new Dish("Idli", 200, 1);
		Dish dish2 = new Dish("Dosa", 100, 1);
		Dish dish3 = new Dish("Paratha", 80, 2);
		Dish dish4 = new Dish("Litti", 150, 1);
		Dish dish5 = new Dish("Jalebi", 20, 3);
		
		Dish[] array = new Dish[5];
		array[0] = dish1;
		array[1] = dish2;
		array[2] = dish3;
		array[3] = dish4;
		array[4] = dish5;
		
		
		System.out.println("Dishes:");
		for(int i=0;i<array.length;i++) {
			array[i].showDish();
		}
		
		System.out.println("Sorted Dishes based on price");
		
		
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length-i;j++) {
				if(array[j-1].price>array[j].price) {
					Dish sample=array[j-1];
					array[j-1]=array[j];
					array[j]=sample;
				}
			}
		}
		
		for(int i=0;i<array.length;i++) {
			array[i].showDish();
		}
		
	}

}
