//Main class that utilizes all of the classes in the checker, displays to console.
public class HandChecker {
	public static void main(String[] args) {
		
		for (int i = 0; i<1; i++) //Tests a single hand
		{
			Deck deck = new Deck();
			Hand hand = new Hand(deck);
			Hand hand2 = new Hand(deck);
			System.out.print("Black: ");
			hand.display();
			hand.displayAll();
			System.out.print("\nWhite: ");
			hand2.display();
			hand2.displayAll();
			if(hand.compareTo(hand2) == 1) {
				System.out.print("Black Wins." + " - with");
				hand.display();
			} else if(hand.compareTo(hand2) == -1 ){
				System.out.print("White Wins." + " - with");
				hand2.display();
			} else
				System.out.println("Tie.");
		}
	}
}
