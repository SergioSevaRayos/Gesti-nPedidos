package paquete_1;

import java.util.*;

public class Cliente {
	 // Atributos
	static String nombre;
	static String apellidos;
	static Date FechaDeAlta;
	static String telefono;
	static String direccion;
	static String historial;
	// Variables
	static Scanner sc = new Scanner(System.in);
	static String nombreMinuscula;
	static String apellidosMayuscula;
	static String tipoTelefono;

	
	
	// Constructor
	public Cliente(String nombre, String apellidos, Date FechaDeAlta, String telefono, String direccion, String historial) {
		Cliente.nombre = nombre;
		Cliente.apellidos = apellidos;
		Cliente.FechaDeAlta = FechaDeAlta;
		Cliente.telefono = telefono;
		Cliente.direccion = direccion;
		Cliente.historial = historial;
	}
	
	public static void inNombreYapellidos() {
		System.out.print("Introduce el nombre --> ");
		nombre = sc.nextLine();
		nombreMinuscula = nombre.toLowerCase();
		System.out.print("Introduce los apellidos --> ");
		apellidos = sc.nextLine();
		apellidosMayuscula = apellidos.toUpperCase();
	}
	
	public static void fechaAlta() {
		FechaDeAlta = new Date();
	}

	public static void inTelefono() {

		System.out.print("Introduce el tel�fono --> ");
		telefono = sc.nextLine();
		
		if (telefono.length() != 9) {
			System.out.println("El tel�fono es incorrecto, vuelva a intentarlo");
			inTelefono();
		}else {
			
			char primerCaracter = telefono.charAt(0);
			
			if (primerCaracter == '6' || primerCaracter == '7') {
				tipoTelefono = "M�vil";
			}if (primerCaracter == '8' || primerCaracter == '9') {
				tipoTelefono = "Fijo";
			}
		}


	}
	
	public static void datos() {
		System.out.println(
				  "\nNombre        -->\t" + nombreMinuscula + "\n"
				+ "Apellidos     -->\t" + apellidosMayuscula + "\n"
				+ "Fecha         -->\t" + FechaDeAlta + "\n"
				+ "Tel�fono      -->\t" + telefono + "\n"
				+ "Tipo          -->\t" + tipoTelefono);
		
	}
	
	public static void main(String[] args) {

		inNombreYapellidos();
		inTelefono();
		fechaAlta();
		datos();
//		System.out.println(FechaDeAlta);
		
	}
}