package zadaci_16_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Great circle distance predstavlja udaljenost izmeðu dvije taèke na
		 * površine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku
		 * širinu i dužinu dvije taèke. Great circle distance izmeðu ove dvije
		 * taèke može biti izraèunata koristeæi se sljedeæom formulom: d =
		 * radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 -
		 * y2)). Napisati program koij pita korisnika da unese geografsku širinu
		 * i dužinu u stepenima dvije taèke na površini zemlje te mu ispisuje
		 * great circle distance. Prosjeèni radius zemlje je 6.371.01 km.
		 * Stepene koje korisnik unese trebamo promijeniti u radianse koristeæi
		 * se Math.toRadians metodom jer Java trigonometrijske metode koriste
		 * radianse. Širina i dužina u ovoj formuli se odnose na zapad i sjever.
		 * Koristimo negativne vrijednosti da oznaèimo istok i jug.
		 */
		
		Scanner input = new Scanner(System.in);
		
		// pozivamo metode koje uzimaju unos od korisnika
		double x1 = DoubleUserInput.getDouble(input, "Unesite x1: ");
		double y1 = DoubleUserInput.getDouble(input, "Unesite y1: ");
		double x2 = DoubleUserInput.getDouble(input, "Unesite x2: ");
		double y2 = DoubleUserInput.getDouble(input, "Unesite y2: ");
		
		input.close();
		
		final double RADIUS = 6371.01;
		
		// pretvaramo stepene u radianse
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		// izracunamo udaljenost izmedju dvije unesene tacke
		double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		// ispisujemo great circle distance
		System.out.println("\nUdaljenost izmedju dvije tacke: " + distance + " km");

	}

}
