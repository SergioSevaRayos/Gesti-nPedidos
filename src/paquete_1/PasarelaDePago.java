package paquete_1;


//Librerías
import java.util.*;
//import java.util.InputMismatchException;
import java.text.DecimalFormat;
import java.util.Random;

public class PasarelaDePago {
	// Atributos
	static double	importe;
	static String 	codigoPago;
	// Variables
	static Scanner 	sc = new Scanner(System.in);
	private static Random random = new Random();

	// Constuctor
	public PasarelaDePago(double importe, String codigoPago) {
		PasarelaDePago.importe 		= importe;
		PasarelaDePago.codigoPago 	= codigoPago;
	}
	public static void efectivo() {

		importe = Pedido.calcularTotalPedido();

		double totalPedido = Pedido.calcularTotalPedido();

		DecimalFormat formato = new DecimalFormat("#0.00");

		String totalFormateado = formato.format(totalPedido);

		System.out.println("El importe es: " + totalFormateado);

		if (Pedido.listaPedido.getCliente() == Cliente.cliente1) {
			codigoPago = PasarelaDePago.generarCodigoPago();
			Cliente.cliente1.inHistorial(codigoPago);
			System.out.println(Pedido.listaPedido.getCliente() + " | " + Cliente.cliente1.getHistorial());
			Cliente.cliente1.agregarPedido();
		}
		if (Pedido.listaPedido.getCliente() == Cliente.cliente2) {
			PasarelaDePago.generarCodigoPago();
			codigoPago = PasarelaDePago.generarCodigoPago();
			Cliente.cliente2.inHistorial(codigoPago);
			System.out.println(Pedido.listaPedido.getCliente() + " | " + Cliente.cliente2.getHistorial());
			Cliente.cliente2.agregarPedido();
		}
		if (Pedido.listaPedido.getCliente() == Cliente.cliente3) {
			PasarelaDePago.generarCodigoPago();
			codigoPago = PasarelaDePago.generarCodigoPago();
			Cliente.cliente3.inHistorial(codigoPago);
			System.out.println(Pedido.listaPedido.getCliente() + " | " + Cliente.cliente3.getHistorial());
			Cliente.cliente3.agregarPedido();
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
//				while (true) {
//					try {
//						System.out.print("Introduce el importe a pagar --> ");
//						importe = sc.nextInt();
//						break;
//					} catch (InputMismatchException e) {
//						System.err.println("Error: Por Favor, introduce un valor correcto");
//						sc.nextLine();
//					}
//				}
//				int numCaracteres = String.valueOf(importe).length();
//				if (numCaracteres == 2) {
//					System.out.println("La cantidad de caracteres introducida es correcta" + "\n"
//							+ "PAGADO");
//					generarCodigoPago();
//					System.out.println("Código de pago --> " + codigoPago);
//				}else {
//					System.out.println("La cantidad de caracteres es incorrecta");
//					efectivo();
//				}

			}else {
				System.err.println("ERROR: Formato incorrecto");
				tarjeta();
			}

		}else if (visaOk == 0) {
			System.out.println("Tipo 	--> Visa\n"
					+ "Número 	--> " + numeroTarjeta);
			if (numeroTarjeta.matches(formatoVisMasOk)) {
				System.out.println("Formato adecuado");
//				while (true) {
//					try {
//						System.out.print("Introduce el importe a pagar --> ");
//						importe = sc.nextInt();
//						break;
//					} catch (InputMismatchException e) {
//						System.err.println("Error: Por Favor, introduce un valor correcto");
//						sc.nextLine();
//					}
//				}
//				int numCaracteres = String.valueOf(importe).length();
//				if (numCaracteres == 2) {
//					System.out.println("La cantidad de caracteres introducida es correcta" + "\n"
//							+ "PAGADO");
//					generarCodigoPago();
//					System.out.println("Código de pago --> " + codigoPago);
//				}else {
//					System.out.println("La cantidad de caracteres es incorrecta");
//					efectivo();
//				}
			}else {
				System.err.println("ERROR: Formato incorrecto");
				tarjeta();
			}
		}else if (masterOk == 0) {
			System.out.println("Tipo 	--> Master Card\n"
					+ "Número 	--> " + numeroTarjeta);
			if (numeroTarjeta.matches(formatoAmericanOk)) {
				System.out.println("Formato adecuado");
//				while (true) {
//					try {
//						System.out.print("Introduce el importe a pagar --> ");
//						importe = sc.nextInt();
//						break;
//					} catch (InputMismatchException e) {
//						System.err.println("Error: Por Favor, introduce un valor correcto");
//						sc.nextLine();
//					}
//				}
//				int numCaracteres = String.valueOf(importe).length();
//				if (numCaracteres == 2) {
//					System.out.println("La cantidad de caracteres introducida es correcta" + "\n"
//							+ "PAGADO");
//					generarCodigoPago();
//					System.out.println("Código de pago --> " + codigoPago);
//				}else {
//					System.out.println("La cantidad de caracteres es incorrecta");
//					efectivo();
//				}
			}else {
				System.err.println("ERROR: Formato incorrecto");
				tarjeta();
			}
		}else if (visaOk != 0 && americanOk != 0 && masterOk != 0) {
			System.err.println("ERROR: Tarjeta no reconocida");
			tarjeta();
		}
		importe = Pedido.calcularTotalPedido();

		double totalPedido = Pedido.calcularTotalPedido();

		DecimalFormat formato = new DecimalFormat("#0.00");

		String totalFormateado = formato.format(totalPedido);

		System.out.println("El importe es: " + totalFormateado);

		if (Pedido.listaPedido.getCliente() == Cliente.cliente1) {
			codigoPago = PasarelaDePago.generarCodigoPago();
			Cliente.cliente1.inHistorial(codigoPago);
			System.out.println(Pedido.listaPedido.getCliente() + " | " + Cliente.cliente1.getHistorial());

		}
		if (Pedido.listaPedido.getCliente() == Cliente.cliente2) {
			PasarelaDePago.generarCodigoPago();
			codigoPago = PasarelaDePago.generarCodigoPago();
			Cliente.cliente2.inHistorial(codigoPago);
			System.out.println(Pedido.listaPedido.getCliente() + " | " + Cliente.cliente2.getHistorial());
		}
		if (Pedido.listaPedido.getCliente() == Cliente.cliente3) {
			PasarelaDePago.generarCodigoPago();
			codigoPago = PasarelaDePago.generarCodigoPago();
			Cliente.cliente3.inHistorial(codigoPago);
			System.out.println(Pedido.listaPedido.getCliente() + " | " + Cliente.cliente3.getHistorial());
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
//			while (true) {
//				try {
//					System.out.print("Introduce el importe a pagar --> ");
//					importe = sc.nextInt();
//					break;
//				} catch (InputMismatchException e) {
//					System.err.println("Error: Por Favor, introduce un valor correcto");
//					sc.nextLine();
//				}
//			}
//			int numCaracteres = String.valueOf(importe).length();
//			if (numCaracteres == 2) {
//				System.out.println("\nLa cantidad introducida es correcta" + "\n"
//						+ "PAGADO");
//				generarCodigoPago();
//				System.out.println("Código de pago --> " + codigoPago);
//			}else {
//				System.out.println("La cantidad es incorrecta");
//				efectivo();
//			}

		}else {
			System.err.println("ERROR: Formato incorrecto");
			cuenta();
		}
		importe = Pedido.calcularTotalPedido();

		double totalPedido = Pedido.calcularTotalPedido();

		DecimalFormat formato = new DecimalFormat("#0.00");

		String totalFormateado = formato.format(totalPedido);

		System.out.println("El importe es: " + totalFormateado);

		if (Pedido.listaPedido.getCliente() == Cliente.cliente1) {
			codigoPago = PasarelaDePago.generarCodigoPago();
			Cliente.cliente1.inHistorial(codigoPago);
			System.out.println(Pedido.listaPedido.getCliente() + " | " + Cliente.cliente1.getHistorial());

		}
		if (Pedido.listaPedido.getCliente() == Cliente.cliente2) {
			PasarelaDePago.generarCodigoPago();
			codigoPago = PasarelaDePago.generarCodigoPago();
			Cliente.cliente2.inHistorial(codigoPago);
			System.out.println(Pedido.listaPedido.getCliente() + " | " + Cliente.cliente2.getHistorial());
		}
		if (Pedido.listaPedido.getCliente() == Cliente.cliente3) {
			PasarelaDePago.generarCodigoPago();
			codigoPago = PasarelaDePago.generarCodigoPago();
			Cliente.cliente3.inHistorial(codigoPago);
			System.out.println(Pedido.listaPedido.getCliente() + " | " + Cliente.cliente3.getHistorial());
		}
	}
	public static String generarCodigoPago() {

		if (random == null) {
			random = new Random();
		}

		Date fechaActual = new Date();

		long tiempoMilisegundos = fechaActual.getTime();

		int componenteAleatorio = random.nextInt(10000);

		String codigoPago = Long.toString(tiempoMilisegundos) + componenteAleatorio;

		return codigoPago;
	}
	public static void main(String[] args) {
		//		System.out.println(PasarelaDePago.generarCodigoPago());
		//		
		//		System.out.println(PasarelaDePago.generarCodigoPago());
		//		
		//		System.out.println(PasarelaDePago.generarCodigoPago());




		//		efectivo();
		//		tarjeta();
		//		cuenta();
	}

}
