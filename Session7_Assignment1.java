package Assignments;

class Dish{
	
	String name;
	int price;
	int quantity;
	
	static int totalQuantity;
	static int totalPrice;
	static int numOfDishes;
	
	
	Dish(){
		numOfDishes++;
	}
	
	Dish(String name, int price, int quantity) {
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
		Dish.totalPrice+=this.price;
	}
	
	void decrement() {
		quantity--;
		totalQuantity--;
		Dish.totalPrice-=this.price;
	}
	
	static void showDishData() {
		System.out.println("Number of Dishes: "+numOfDishes);
		System.out.println("Total Quantity: "+totalQuantity);
		System.out.println("Total Price: "+totalPrice);
	}
	
}

public class Session7_Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dishes dish1 = new Dishes("Noodles", 200, 1);
		Dishes dish2 = new Dishes("Burger", 100, 1);
		
		
		dish1.increment();
		dish1.increment();
		
		dish2.increment();
		dish2.increment();
		dish2.increment();
		
		dish1.decrement();
		
		dish1.showDish();
		dish2.showDish();
		
		
		Dishes.showDishData();

	}

}
