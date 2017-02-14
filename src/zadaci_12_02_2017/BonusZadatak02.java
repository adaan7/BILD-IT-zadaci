package zadaci_12_02_2017;

import java.util.Scanner;

public class BonusZadatak02 {

	public static void main(String[] args) {

		/*
		 * Pretpostavimo da je starost zemlje, za sve praktiène svrhe, oko 4.55
		 * milijardi godina.
		 * 
		 * Anatomski moderni ljudi postoje zadnjih 200.000 godina. Neandertalci
		 * su izumrli prije otprilike 40.000 godina. Homo erectus, Homo habilis,
		 * Australopithecus su izumrli prije par miliona godina. Dinosauri su
		 * izumrli prije otprilike 66 miliona godina. Mnogo je to vremena.
		 * 
		 * Koncept dubokog vremena / geološkog vremena je teško zamisliv nama sa
		 * relativno kratkim vijekom trajanja. Stoga, zamislimo da imamo avion
		 * koji može letjeti u prošlost brzinom od jedne godine po sekundi. Ovaj
		 * nevjerovatni avion æe nam omoguæiti da steknemo bolji uvid i osjeæaj
		 * za duboko vrijeme. (Ako ništa drugo, vježbat æemo javu)
		 * 
		 * Napisati aplikaciju koja prima od korisnika unos (broj godina koji
		 * korisnik želi da se vrati u prošlost) te ispisuje korisniku broj:
		 * 
		 * 1. Sekundi, minuta i sati koliko bi trebalo putovati da se vrati do
		 * navedene godine u prošlosti. 2. BONUS: Dana, mjeseci, godina koliko
		 * bi trebalo putovati da se vrati do navedene godine u prošlosti. 3.
		 * BONUS: Decenija, stoljeæa, milenija koliko bi trebalo putovati da se
		 * vrati do navedene godine u prošlosti.
		 * 
		 * Drugi naèin da dobijemo osjeæaj za duboko vrijeme je da zamislimo da
		 * nas jedan korak (~75 cm) vraæa 1 godinu u prošlost. Naša aplikacija
		 * treba da ispisuje i sljedeæe (za isti unos kao i gore):
		 * 
		 * 1. Broj centimetara, metara i kilometara koje bi trebalo prohodati da
		 * se vrati do navedene godine u prošlosti. 2. Broj puta koliko bi
		 * prehodali prosjeèni fudbalski stadion (105 m) 3. Broj puta koliko bi
		 * prehodali obim zemlje (obim zemlje: 40.075 km)
		 * 
		 * Slobodno budite kreativni u nacinu prezentovanja rezultata.
		 */

		Scanner input = new Scanner(System.in);

		int numberOfYears = 0;

		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out
						.print("Ako imamo avion koji može letjeti u prošlost brzinom od jedne godine po sekundi, "
								+ "\nunesite broj godina za koliko zelite da se vratite u proslost: ");
				numberOfYears = input.nextInt();

				wrongUserInput = false;

				// ako je unesena godina manja od 0, ispisujemo odgovarajucu
				// poruku i trazimo novi unos od korisnika
				if (numberOfYears < 0) {
					System.out
							.println("Pogresan unos. Morate unijeti pozitivan cijeli broj.\n");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Pogresan unos. Morate unijeti pozitivan cijeli broj.\n");
				input.nextLine();
			}
		}

		input.close();

		// ako uzmemo da je jedna sekunda jednaka jednoj godini, racunamo koliko
		// nam treba sekundi, minuta i sati
		int totalSeconds = numberOfYears;
		int seconds = totalSeconds % 60;

		int totalMinutes = totalSeconds / 60;
		int minutes = totalMinutes % 60;

		int totalHours = totalMinutes / 60;
		int hours = totalHours % 24;

		System.out
				.println("\n\nDa bi otputovali "
						+ numberOfYears
						+ " godina nazad u proslost sa avionom "
						+ "\nkoji moze letjeti brzinom od jedne godine po sekundi treba nam: \n\n"
						+ hours + " sati, " + minutes + " minuta i " + seconds
						+ " sekundi.");

		// ako uzmemo da nam jedan korak predstavlja jednu godinu, racunamo
		// koliko nam treba cm, koliko metara, koliko km
		int step = 75;
		int centimeters = step * numberOfYears;
		int meters = centimeters / 100;
		int kilometers = centimeters / 1000;

		System.out
				.println("\n\nAko zamislimo da nas jedan korak (75 cm) vraca "
						+ "za 1 godinu u proslost, \nda se vratimo "
						+ numberOfYears + " godina u proslost "
						+ "trebali bi prohodati: \n\n" + kilometers
						+ " kilometara, ili\n" + meters + " metara, ili \n"
						+ centimeters + " centimetara.");
		System.out.println("\n\nTrebali bi prohodati: \n\n"
				+ String.format("%2.4f", (meters / 105.0))
				+ " fudbalskih stadiona, ili \n"
				+ String.format("%2.4f", (kilometers / 40075.0))
				+ " puta prohodati povrsinu Zemaljske kugle.");

	}
}
