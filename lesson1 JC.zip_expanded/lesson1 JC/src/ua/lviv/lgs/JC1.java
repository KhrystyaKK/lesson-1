package ua.lviv.lgs;

public class JC1 {
	public static void main(String[] args) {
// 1. Написати по одній змінній кожного типу примітивних типів даних
		byte a = 100;
		short b = 32000;
		int c = 5;
		long d = 92233700;
		float x = 44.03f;
		double y = 3.14;
		char z = 'A';
		boolean s = true;
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("d= " + d);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println("s= " + s);

		// 2. Вивести на консоль мінімальне та максимальне значення типів даних.
		// Вивід здійснюється за допомогою System.out.println() та Java Wrappers
		// (обгортки примітивів)

		System.out.println("Byte max value = " + Byte.MAX_VALUE);
		System.out.println("Byte max value = " + Byte.MIN_VALUE);
		System.out.println("Short max value = " + Short.MAX_VALUE);
		System.out.println("Short max value = " + Short.MIN_VALUE);
		System.out.println("int max value = " + Integer.MAX_VALUE);
		System.out.println("int max value = " + Integer.MIN_VALUE);
		System.out.println("long max value = " + Long.MAX_VALUE);
		System.out.println("long max value = " + Long.MIN_VALUE);
		System.out.println("float max value = " + Float.MAX_VALUE);
		System.out.println("float max value = " + Float.MIN_VALUE);
		System.out.println("double max value = " + Double.MAX_VALUE);
		System.out.println("double max value = " + Double.MIN_VALUE);
		System.out.println("char max value = " + (int) Character.MAX_VALUE);
		System.out.println("char max value = " + (int) Character.MIN_VALUE);
		System.out.println("boolean max value = " + Boolean.TRUE);
		System.out.println("boolean max value = " + Boolean.FALSE);

		// 3. Створити масив, наповнити його 10 значеннями типами int, знайти
		// максимальне та мінімальне значення в масиві та вивести їх на консоль

		int[] array = { -25, 145, 4, 15, 42, 6, 22, 599, -56, 8 };
		int min = 0;
		int max = array[1];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.println("array min = " + min);

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println("array max = " + max);

	}

}
