package UD04;

public class Ejercicio5 {

	public Ejercicio5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaro cuatro variables enteras, les asigno un valor, y muestro por pantalla sus respectivos valores
		int a = 1;
		System.out.println("La variable a vale "+a+".");
		int b = 2;
		System.out.println("La variable b vale "+b+".");
		int c = 3;
		System.out.println("La variable c vale "+c+".");
		int d = 4;
		System.out.println("La variable d vale "+d+".");
		
		//B toma el valor de C
		b = c;
		System.out.println("B toma el valor de C. Ahora B vale "+b+" y C vale "+c+" también.");
		
		//C toma el valor de A
		c = a;
		System.out.println("C toma el valor de A. Ahora C vale "+c+" y A vale "+a+" también.");
		
		//A toma el valor de D
		a = d;
		System.out.println("A toma el valor de D. Ahora A vale "+a+" y D vale "+d+" también.");

		//D toma el valor de B
		d = b;
		System.out.println("D toma el valor de B. Ahora D vale "+d+" y B vale "+b+" también.");

	}

}
