package zadaci_10_03_2017;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * (OutOfMemoryError) Write a program that causes the JVM to throw an
		 * OutOfMemoryError and catches and handles this error.
		 */
		
		int matrixSize = 2000000000;
		
		// testing a program that causes out of memory error
		try {
			int[][] matrix = new int[matrixSize][matrixSize];
			
			System.out.println(matrix.toString());
		} catch (OutOfMemoryError err) {
			System.out.println(err.getMessage());
		}
		
	}

}
