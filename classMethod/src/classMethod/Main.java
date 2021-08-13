package classMethod;

public class Main {

	public static void main(String[] args) {
	
		CartService cartService = new CartService();
		
		cartService.addToCard("Elma");
		cartService.addToCard("Armut");
		cartService.removeFromCart("Elma");
		cartService.listCard();


	}

}
