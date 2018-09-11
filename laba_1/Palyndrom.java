import java.util.Scanner;

public class Palyndrom {

	public Palyndrom() {

	}

	public void start() {
		printInfo();
		String str = getString();
		print(isPalindrom(str.toCharArray()));
	}

	public boolean isPalindrom(char[] word) {
	    int i1 = 0;
	    int i2 = word.length - 1;
    	while (i2 > i1) {
        	if (word[i1] != word[i2]) {
            	return false;
        	}
	        ++i1;
	        --i2;
    	}
    	return true;
	}

	private void printInfo() {
		System.out.println();
		System.out.println("Введите слово");
	}

	public String getString() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public void print(boolean bool) {
		System.out.println(bool);
	}
}