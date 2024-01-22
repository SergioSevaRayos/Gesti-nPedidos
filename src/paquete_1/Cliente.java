package paquete_1;

// Librerías
import java.util.*;

public class Cliente {
	 // Atributos
	static String	nombre;
	static String 	apellidos;
	static Date 	FechaDeAlta;
	static String 	telefono;
	static String 	direccion;
	static String 	historial;
	static int 		numPedido;
	// Variables
	static Scanner 	sc = new Scanner(System.in);
	static String 	nombreMinuscula;
	static String 	apellidosMayuscula;
	static String 	tipoTelefono;
	static boolean 	pedidoPagado = false;
	static String 	estadoPedido;
	public String inNombreYapellidos;

	// Constructor
	public Cliente(String nombre, String apellidos, Date FechaDeAlta, String telefono, String direccion, String historial) {
		Cliente.nombre 		= nombre;
		Cliente.apellidos 	= apellidos;
		Cliente.FechaDeAlta	= FechaDeAlta;
		Cliente.telefono 	= telefono;
		Cliente.direccion 	= direccion;
		Cliente.historial 	= historial;
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

		System.out.print("Introduce el teléfono --> ");
		telefono = sc.nextLine();
		
		if (telefono.length() != 9) {
			System.out.println("El teléfono es incorrecto, vuelva a intentarlo");
			inTelefono();
		}else {
			
			char primerCaracter = telefono.charAt(0);
			
			if (primerCaracter == '6' || primerCaracter == '7') {
				tipoTelefono = "Móvil";
			}if (primerCaracter == '8' || primerCaracter == '9') {
				tipoTelefono = "Fijo";
			}
		}


	}
	public static void inDireccion() {
		System.out.print("Introduce la dirección --> ");
		direccion = sc.nextLine();
	}
	public static void agregarPedido() {
		
		if (pedidoPagado = true) {
			estadoPedido = "Pagado";
			numPedido += 1;
		}else {
			estadoPedido = "Pendiente";
			pedidoPagado = false;
		}
	}
	public static void datos() {
		System.out.println(
				  "\nNombre        --> " + nombreMinuscula + "\n"
				+ "Apellidos     --> " + apellidosMayuscula + "\n"
				+ "Fecha alta    --> " + FechaDeAlta + "\n"
				+ "Teléfono      --> " + telefono + "\n"
				+ "Tipo          --> " + tipoTelefono + "\n"
				+ "Dirección     --> " + direccion + "\n"
				+ "Estado        --> " + estadoPedido + "\n"
				+ "Num Pedido    --> " + numPedido);
		
	}
	public static void main() {
		inNombreYapellidos();
		inTelefono();
		fechaAlta();
		inDireccion();
		agregarPedido();
		datos();

		
		

	}
}