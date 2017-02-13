package zadaci_12_02_2017;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od
		 * 52 karte. Program treba ispisati koja karta je izvuèena (A, 2, 3, 4,
		 * 5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta (Srce,
		 * Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku
		 * kocke.
		 */
		
		// niz stringova koji sadrzi imena znakova
		String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
		// niz strinogva koji sadrzi imena karti
		String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		// generisemo random brojeve koji ce predstavljati znak ili ime karte
		int randomSuit = (int)(Math.random() * 4);
		int randomCard = (int)(Math.random() * 13);
		
		// ispisujemo koja je karta izvucena
		System.out.println("Card you picked is: " + cards[randomCard] + " of " + suits[randomSuit]);

	}

}
