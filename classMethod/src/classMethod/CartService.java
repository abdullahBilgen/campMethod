package classMethod;

public class CartService {
	
	
	String [] cart;
	// constructor method
	public CartService() {
		
		//System.out.println("Sepet Olu�tu ve Bo� ");
		cart = new String[] {" "," "," "}; 
		
	}
	
	public void addToCard(String productName) {
		
		//System.out.println("Sepete Eklendi : " + productName);
		cart[0] = productName;
	}
	
	public void removeFromCart(String productName) {
		System.out.println("Sepetten ��kart�ld� : " + productName);

	}
	
	public void listCard() {
		System.out.println("Sepet Listelendi : ");

		
	}

}
