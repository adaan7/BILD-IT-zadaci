package zadaci_15_02_2017;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Pozitivni cijeli broj je savr�en broj ukoliko je jednak zbiru svih
		 * svojih pozitivnih djelilaca, isklju�uju�i sebe. Na primjer, 6 je prvi
		 * savr�eni broj jer 6 = 3 + 2 + 1. Sljede�i savr�eni broj je 28 jer 28
		 * = 14 + 7 + 4 + 2 + 1. Samo 4 savr�ena broja postoje u rasponu od 0 do
		 * 10.000. Napi�ite program koji ispisuje sva 4.
		 */
		
		System.out.println("Savrseni brojevi od 0 do 10000: ");
		
		for (int number = 1; number < 10000; number++) {
			int divisor = number / 2;
			int sumOfDivisors = 0;
			
			// petlja radi dok je divisor veci od 0
			while (divisor > 0) {
				// ako je trenutni broj djeljiv sa trenutnim divisorom, divisor dodajemo sumi divisora
				if (number % divisor == 0) {
					sumOfDivisors += divisor;
				}
				
				// smanjujemo divisor za 1
				divisor--;
			}
			
			// ako je trenutni broj jednak sumi svojih divisora, ispisujemo taj broj
			if (number == sumOfDivisors) {
				System.out.print(number + " ");
			}
		}
		
	}

}
