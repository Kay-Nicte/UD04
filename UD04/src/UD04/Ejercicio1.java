package UD04;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaro las dos variables con las que voy a operar, y las inicializo con un valor por defecto.
		int primerNumero = 27;
		int segundoNumero = 49;
		
		//Declaro las variables del operador, y les asigno la operación que realizarán
		int suma = primerNumero + segundoNumero;
		int resta = primerNumero - segundoNumero;
		int multiplicacion = primerNumero * segundoNumero;
		int division = primerNumero / segundoNumero;
		int residuo = primerNumero % segundoNumero;
		
		//Imprimo por pantalla el resultado de las operaciones realizadas
		System.out.println("La suma de "+primerNumero+" + "+segundoNumero+" es = "+suma);
		System.out.println("La resta de "+primerNumero+" - "+segundoNumero+" es = "+resta);
		System.out.println("La multiplicación de "+primerNumero+" · "+segundoNumero+" es = "+multiplicacion);
		System.out.println("La división de "+primerNumero+" / "+segundoNumero+" es = "+division);
		System.out.println("El resto de dividir "+primerNumero+" / "+segundoNumero+" es = "+residuo);
	}
}