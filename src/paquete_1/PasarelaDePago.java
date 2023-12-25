package paquete_1;

//Librerías
import java.util.*;
import java.util.InputMismatchException;

public class PasarelaDePago {
	// Atributos
	static int importe = 0;
	static Date CodigoPago;
	
	// Variables
	static Scanner 	sc = new Scanner(System.in);
	
	// Constuctor
	public PasarelaDePago(int importe, Date CodigoPago) {
		PasarelaDePago.importe 		= importe;
		PasarelaDePago.CodigoPago 	= CodigoPago;
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
		}else {
			System.out.println("La cantidad de caracteres es incorrecta");
			efectivo();
		}

	}
	public static void tarjeta() {
		System.out.println("Forma de pago mediante tarjeta seleccionado"
				+ "\nFormatos de numeración de las tarjetas\n"
				+ "xxxx xxxx xxxx xxxx --> Visa\n"
				+ "xxxx xxxx xxxx xxxx --> MasterCard\n"
				+ "xxxx xxxxxx xxxxx   --> American Expres\n");

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
				}else {
					System.out.println("La cantidad de caracteres es incorrecta");
					efectivo();
				}

			}else {
				System.err.println("ERROR: Formato incorrecto");
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
				}else {
					System.out.println("La cantidad de caracteres es incorrecta");
					efectivo();
				}
			}else {
				System.err.println("ERROR: Formato incorrecto");
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
				}else {
					System.out.println("La cantidad de caracteres es incorrecta");
					efectivo();
				}
			}else {
				System.err.println("ERROR: Formato incorrecto");
			}
		}
	}
	public static void cuenta() {
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
				}else {
					System.out.println("La cantidad de caracteres es incorrecta");
					efectivo();
				}

			}else {
				System.err.println("ERROR: Formato incorrecto");
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
				}else {
					System.out.println("La cantidad de caracteres es incorrecta");
					efectivo();
				}
			}else {
				System.err.println("ERROR: Formato incorrecto");
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
				}else {
					System.out.println("La cantidad de caracteres es incorrecta");
					efectivo();
				}
			}else {
				System.err.println("ERROR: Formato incorrecto");
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarjeta();
	}

}
