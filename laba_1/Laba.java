import java.util.Scanner;

public class Laba {

	public Laba() {
		
	}

	public void start() {
		printInfo();
		int n = getNum();
		for (int i = 2; i <= n; i++) {
			if (simpleNum(i)) {
				printNum(i);
			}
		}
	}

	private boolean simpleNum(int N) {
		int i = 0;
		for(int k = 2; k < N; k++) {
			if(N % k == 0) {
				return false;
			} 
		} 
		return true;
	}

	private void printInfo() {
		System.out.println();
		System.out.println("Введите число");
	}

	private int getNum() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	private void printNum(int n) {
		System.out.println(n);
	}
}