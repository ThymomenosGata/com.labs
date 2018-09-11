import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Laba laba = new Laba();
		Palyndrom palyndrom = new Palyndrom();

		printInfo();

		switch(getNum()) {
			case 1: {
				laba.start();
				break;
			}

			case 2: {
				palyndrom.start();
				break;
			}
		}

	}

	public static void printInfo() {
		System.out.println("Для подсчета простых чисел введите 1;");
		System.out.println("Для проверки палиндрома введите 2;");
	}

	public static int getNum() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}