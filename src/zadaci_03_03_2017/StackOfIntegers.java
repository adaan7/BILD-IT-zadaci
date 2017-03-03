package zadaci_03_03_2017;

public class StackOfIntegers {

	private int[] elements;
	private int size;

	public StackOfIntegers() {
		elements = new int[16];
	}

	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	// metoda koja vraca true ako je stack prazan
	public boolean isEmpty() {
		return size == 0;
	}

	// metoda koja vraca posljednji element u stack-u
	public int peek() {
		return elements[size - 1];
	}

	// metoda koja ubacuje odreðenu vrijednog na zadnje mjesto
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	// metoda koja uklanja i vraca zadnji element u stack-u
	public int pop() {
		return elements[--size];
	}

	// metoda koja vraca velicinu stack-a
	public int getSize() {
		return size;
	}

	// metoda koja vraca specificni elemenat
	public int getElement(int index) {
		return elements[index];
	}

}
