import java.util.Scanner;


public class AreaTriangulo {

	public static void area() {
		Scanner entradaDeDatos = new Scanner(System.in);
	
		float base = 0.0f;
		float altu = 0.0f;
		float area = 0.0f;
		System.out.println("Introduzca la base del triangulo: ");
		base = entradaDeDatos.nextFloat();
	
		System.out.println("Introduzca la altura del triangulo: ");
		altu = entradaDeDatos.nextFloat();
		// operacion matematica de calcular area triangulo
		area = base * altu / 2;
		System.out.println("El area de un triangulo de lado " + base + " y altura " + altu + " es " + area);
	}

	public AreaTriangulo() {
		super();
	}

}