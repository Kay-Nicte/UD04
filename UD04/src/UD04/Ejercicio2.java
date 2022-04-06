package UD04;

public class Ejercicio2 {

	public Ejercicio2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Asigno valor a tres variables, una tipo entero, otra tipo doble y otra tipo char
		int n = 9;
		double a = 21.5;
		char c = 'c';
		//Variable para mostrar el valor numérico de un char
		int ascii = (int) c;
		
		//Muestro por pantalla el valor de las tres variables que he creado
		System.out.println("Variable N = "+n);
		System.out.println("Variable A = "+a);
		System.out.println("Variable C = "+c);
		
		//Muestro por patalla la suma de n + a
		System.out.println("La suma de n+a es: "+(n+a));
		//Muestro por pantalla la resta a - n
		System.out.println("La diferencia de a-n es: "+(a-n));
		//Muestro por pantalla el valor numérico de la variable c
		System.out.println("El valor numérico del caracter c es: "+ascii);
	}

}
