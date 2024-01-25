package paquete_1;

//Librerías
import java.util.*;
import java.util.InputMismatchException;

public class PasarelaDePago {
	// Atributos
	static int		importe;
	static String 	codigoPago = generarCodigoPago();
	// Variables
	static Scanner 	sc = new Scanner(System.in);
	
	// Constuctor
	public PasarelaDePago(int importe, String codigoPago) {
		PasarelaDePago.importe 		= importe;
		PasarelaDePago.codigoPago 	= codigoPago;
	}
	public static void efectivo() {
		while (true) {
			try {
				System.out.print("Introduce el importe a pagar --> ");
				importe = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Error: Por Favor, introduce un valor correcto");
				sc.nextLine();
			}
		}
		int numCaracteres = String.valueOf(importe).length();
		if (numCaracteres == 2) {
			System.out.println("La cantidad de caracteres introducida es correcta" + "\n"
					+ "PAGADO");
			generarCodigoPago();
			System.out.println("Código de pago --> " + codigoPago);
		}else {
			System.out.println("La cantidad de caracteres es incorrecta");
			efectivo();
		}

	}
	public static void tarjeta() {
		System.out.println("Forma de pago mediante tarjeta seleccionado"
				+ "\nFormatos de numeración de las tarjetas\n"
				+ "4xxx xxxx xxxx xxxx --> Visa\n"
				+ "5xxx xxxx xxxx xxxx --> MasterCard\n"
				+ "3xxx xxxxxx xxxxx   --> American Expres\n");

		System.out.print("Introduce el número de tarjeta \nNúmero: ");
		String numeroTarjeta = sc.nextLine();

		int americanOk	= numeroTarjeta.indexOf("3");
		int visaOk		= numeroTarjeta.indexOf("4");
		int masterOk 	= numeroTarjeta.indexOf("5");

		String formatoVisMasOk 		= "\\d{4} \\d{4} \\d{4} \\d{4}";
		String formatoAmericanOk 	= "\\d{4} \\d{6} \\d{5}";


		if (americanOk == 0) {
			System.out.println("Tipo 	--> American Express\n"
					+ "Número 	--> " + numeroTarjeta);
			if (numeroTarjeta.matches(formatoVisMasOk)) {
				System.out.println("Formato adecuado");
				while (true) {
					try {
						System.out.print("Introduce el importe a pagar --> ");
						importe = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.err.println("Error: Por Favor, introduce un valor correcto");
						sc.nextLine();
					}
				}
				int numCaracteres = String.valueOf(importe).length();
				if (numCaracteres == 2) {
					System.out.println("La cantidad de caracteres introducida es correcta" + "\n"
							+ "PAGADO");
					generarCodigoPago();
					System.out.println("Código de pago --> " + codigoPago);
				}else {
					System.out.println("La cantidad de caracteres es incorrecta");
					efectivo();
				}

			}else {
				System.err.println("ERROR: Formato incorrecto");
				tarjeta();
			}

		}else if (visaOk == 0) {
			System.out.println("Tipo 	--> Visa\n"
					+ "Número 	--> " + numeroTarjeta);
			if (numeroTarjeta.matches(formatoVisMasOk)) {
				System.out.println("Formato adecuado");
				while (true) {
					try {
						System.out.print("Introduce el importe a pagar --> ");
						importe = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.err.println("Error: Por Favor, introduce un valor correcto");
						sc.nextLine();
					}
				}
				int numCaracteres = String.valueOf(importe).length();
				if (numCaracteres == 2) {
					System.out.println("La cantidad de caracteres introducida es correcta" + "\n"
							+ "PAGADO");
					generarCodigoPago();
					System.out.println("Código de pago --> " + codigoPago);
				}else {
					System.out.println("La cantidad de caracteres es incorrecta");
					efectivo();
				}
			}else {
				System.err.println("ERROR: Formato incorrecto");
				tarjeta();
			}
		}else if (masterOk == 0) {
			System.out.println("Tipo 	--> Master Card\n"
					+ "Número 	--> " + numeroTarjeta);
			if (numeroTarjeta.matches(formatoAmericanOk)) {
				System.out.println("Formato adecuado");
				while (true) {
					try {
						System.out.print("Introduce el importe a pagar --> ");
						importe = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.err.println("Error: Por Favor, introduce un valor correcto");
						sc.nextLine();
					}
				}
				int numCaracteres = String.valueOf(importe).length();
				if (numCaracteres == 2) {
					System.out.println("La cantidad de caracteres introducida es correcta" + "\n"
							+ "PAGADO");
					generarCodigoPago();
					System.out.println("Código de pago --> " + codigoPago);
				}else {
					System.out.println("La cantidad de caracteres es incorrecta");
					efectivo();
				}
			}else {
				System.err.println("ERROR: Formato incorrecto");
				tarjeta();
			}
		}else if (visaOk != 0 && americanOk != 0 && masterOk != 0) {
			System.err.println("ERROR: Tarjeta no reconocida");
			tarjeta();
		}
	}
	public static void cuenta() {
		System.out.print("Formato del número de cuenta \n"
	            + "EJEMPLO --> ES-01-2345-6789-01-2345678901\n"
	            + "Introduce el número de cuenta \n--> ");

	    String numeroCuenta = sc.nextLine();
	    String formatoCuentaOk = "[A-Z]{2}-\\d{2}-\\d{4}-\\d{4}-\\d{2}-\\d{10}";

	    if (numeroCuenta.matches(formatoCuentaOk)) {
	        System.out.println("Formato ok");
	    } else {
	        System.out.println("Formato incorrecto");
	    }
		
		if (numeroCuenta.matches(formatoCuentaOk)) {
			while (true) {
				try {
					System.out.print("Introduce el importe a pagar --> ");
					importe = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.err.println("Error: Por Favor, introduce un valor correcto");
					sc.nextLine();
				}
			}
			int numCaracteres = String.valueOf(importe).length();
			if (numCaracteres == 2) {
				System.out.println("\nLa cantidad introducida es correcta" + "\n"
						+ "PAGADO");
				generarCodigoPago();
				System.out.println("Código de pago --> " + codigoPago);
			}else {
				System.out.println("La cantidad es incorrecta");
				efectivo();
			}

		}else {
			System.err.println("ERROR: Formato incorrecto");
			cuenta();
		}
	}
	public static String generarCodigoPago() {
        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Obtener el tiempo en milisegundos desde la época
        long tiempoMilisegundos = fechaActual.getTime();

        // Convertir el tiempo en milisegundos a una cadena
        String codigoPago = Long.toString(tiempoMilisegundos);

        return codigoPago;
    }
	public static void main(String[] args) {
//		efectivo();
//		tarjeta();
//		cuenta();
	}

}
