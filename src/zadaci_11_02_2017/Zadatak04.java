package zadaci_11_02_2017;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100
		 * nasumiènih brojeva, 10 po liniji.
		 */
		
		// pozivamo metodu koja ispisuje 100 random uppercase karaktera i 100 random brojeva
		print100RandomCharsAnd100RandomNumbers();

	}
	
	public static void print100RandomCharsAnd100RandomNumbers() {
		// niz karaktera
		char[] chars = new char[100];
		// niz integera
		int[] numbers = new int[100];
		
		System.out.println("100 random uppercase characters: ");
		for (int i = 1; i <= chars.length; i++) {
			// generisemo random uppercase karakter
			chars[i - 1] = (char)((int)(Math.random() * 26 + 65));
			
			// ispisujemo karakter
			System.out.print(chars[i - 1] + " ");
			
			// ako smo ispisali 10 karaktera, prelazimo u novi red
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n100 random numbers: ");
		for (int i = 1; i <= numbers.length; i++) {
			// generisemo random broj od 0 do 99 (ukljucujici 99)
			numbers[i - 1] = (int)(Math.random() * 100);
			
			// ispisujemo random broj
			System.out.printf("%2d ", numbers[i - 1]);
			
			// ako smo ispisali 10 brojeva, prelazimo u novi red
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
