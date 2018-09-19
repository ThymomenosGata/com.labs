import java.util.Scanner;

public class Lab1 {
	public static void main(String[] argv) {
		printEnterPoint(1);
		Point3d firstPoint = getPoint();

		printEnterPoint(2);
		Point3d secondPoint = getPoint();

		printEnterPoint(3);
		Point3d thridPoint = getPoint();

		if (firstPoint.equals(secondPoint) || secondPoint.equals(thridPoint) || firstPoint.equals(thridPoint)) {
			printError();
		} else {
			printResult("X", computeAreaX(firstPoint, secondPoint, thridPoint));
			printResult("Y", computeAreaY(firstPoint, secondPoint, thridPoint));
			printResult("Z", computeAreaZ(firstPoint, secondPoint, thridPoint));
		}
	}

	public static Point3d getPoint() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("x: ");
		double x = scanner.nextDouble();
		System.out.println("y: ");
		double y = scanner.nextDouble();
		System.out.println("z: ");
		double z = scanner.nextDouble();
		return new Point3d(x, y, z);
	}

	public static void printError() {
		System.out.println("Не может быть 2-х равных точек");
	}

	public static void printEnterPoint(int n) {
		System.out.println("Введите " + n + " точку");
	}

	public static void printResult(String str, double result) {
		System.out.println("Площадь стороны " + str + " равна: " + result);
	}

	public static double computeAreaX(Point3d firstPoint, Point3d secondPoint, Point3d thridPoint) {
		return Math.sqrt(
			(firstPoint.getX() + secondPoint.getX() + thridPoint.getX()) * 
			(- firstPoint.getX() + secondPoint.getX() + thridPoint.getX()) * 
			(firstPoint.getX() - secondPoint.getX() + thridPoint.getX()) * 
			(firstPoint.getX() + secondPoint.getX() - thridPoint.getX())) / 4;
	}

	public static double computeAreaY(Point3d firstPoint, Point3d secondPoint, Point3d thridPoint) {
		return Math.sqrt(
			(firstPoint.getY() + secondPoint.getY() + thridPoint.getY()) * 
			(- firstPoint.getY() + secondPoint.getY() + thridPoint.getY()) * 
			(firstPoint.getY() - secondPoint.getY() + thridPoint.getY()) * 
			(firstPoint.getY() + secondPoint.getY() - thridPoint.getY())) / 4;
	}

	public static double computeAreaZ(Point3d firstPoint, Point3d secondPoint, Point3d thridPoint) {
		return Math.sqrt(
			(firstPoint.getZ() + secondPoint.getZ() + thridPoint.getZ()) * 
			(- firstPoint.getZ() + secondPoint.getZ() + thridPoint.getZ()) * 
			(firstPoint.getZ() - secondPoint.getZ() + thridPoint.getZ()) * 
			(firstPoint.getZ() + secondPoint.getZ() - thridPoint.getZ())) / 4;
	}

} 