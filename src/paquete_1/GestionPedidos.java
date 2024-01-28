package paquete_1;

import java.util.Scanner;

public class GestionPedidos {
	static Scanner sc = new Scanner(System.in);
	
	static int cantidadPr1;

	// TODO: Borrar todas las líneas de código inservibles
	// TODO: Incorporar el estado de los pedidos al proceso 
	// TODO: Vincular el coste del pedido al cobro (efectivo-tarjeta-cuenta)
	// TODO: Mejorar la interfaz
	public static void menuInicial() {
		System.out.println("MENÚ INICIAL\n"
				+ "1. Crear clientes\n"
				+ "2. Crear productos\n"
				+ "0. Salir");
		String op = sc.nextLine();
		switch (op) {
		case "1":

//			System.out.println("CREAR CLIENTES");
//			if (Cliente.cliente1.getNombre() == null) {
//				System.out.println("Cliente 1");
//				Cliente.cliente1.inNombreYapellidos();
//				Cliente.cliente1.fechaAlta();
//				Cliente.cliente1.inTelefono();
//				Cliente.cliente1.inDireccion();
//				if (Cliente.cliente2.getNombre() == null) {
//					System.out.println("Cliente 2");
//					Cliente.cliente2.inNombreYapellidos();
//					Cliente.cliente2.fechaAlta();
//					Cliente.cliente2.inTelefono();
//					while (Cliente.cliente1.getTelefono().equals(Cliente.cliente2.getTelefono())) {
//						System.out.println("Teléfono repetido");
//						Cliente.cliente2.inTelefono();
//					}
//					Cliente.cliente2.inDireccion();
//					if (Cliente.cliente3.getNombre() == null) {
//						System.out.println("Cliente 3");
//						Cliente.cliente3.inNombreYapellidos();
//						Cliente.cliente3.fechaAlta();
//						Cliente.cliente3.inTelefono();
//						while (Cliente.cliente2.getTelefono().equals(Cliente.cliente3.getTelefono()) ||
//								Cliente.cliente1.getTelefono().equals(Cliente.cliente3.getTelefono())) {
//							System.out.println("Teléfono repetido");
//							Cliente.cliente3.inTelefono();
//						}
//						Cliente.cliente3.inDireccion();
//					}
//				}
//			} else {
//				System.err.println("Los clientes ya se han introducido");
//			}
			menuInicial();
			sc.nextLine();
			break;

		case "2":
			System.out.println("MENÚ PRODUCTOS\n"
					+ "1. Introducir producto\n"
					+ "2. Borrar producto\n"
					+ "\n"
					+ "0. Atrás");
			op = sc.nextLine();
			switch (op) {
			case "1":
//				System.out.println("CREAR PRODUCTOS");
//				if (Producto.producto1.getNombre() == null) {
//					System.out.println("Producto 1");
//					Producto.producto1.inNombreProducto();
//					Producto.producto1.setPrecio();
//					Producto.producto1.setCantiadad();
//					System.out.println("Producto 1 insertado");
//				}
//				if (Producto.producto2.getNombre() == null) {
//					System.out.println("Producto 2");
//					Producto.producto2.inNombreProducto();
//					Producto.producto2.setPrecio();
//					Producto.producto2.setCantiadad();
//					System.out.println("Producto 2 insertado");
//				}
//				if (Producto.producto3.getNombre() == null) {
//					System.out.println("Producto 3");
//					Producto.producto3.inNombreProducto();
//					Producto.producto3.setPrecio();
//					Producto.producto3.setCantiadad();
//					System.out.println("Producto 3 insertado");
//				}
//				if (Producto.producto4.getNombre() == null) {
//					System.out.println("Producto 4");
//					Producto.producto4.inNombreProducto();
//					Producto.producto4.setPrecio();
//					Producto.producto4.setCantiadad();
//					System.out.println("Producto 2 insertado");
//				}
//				if (Producto.producto5.getNombre() == null) {
//					System.out.println("Producto 5");
//					Producto.producto5.inNombreProducto();
//					Producto.producto5.setPrecio();
//					Producto.producto5.setCantiadad();
//					System.out.println("Producto 5 insertado");
//				}
//				if (
//					Cliente.cliente1.getNombre() 	!= null &&
//					Cliente.cliente2.getNombre() 	!= null &&
//					Cliente.cliente3.getNombre() 	!= null &&
//					Producto.producto1.getNombre() 	!= null &&
//					Producto.producto2.getNombre() 	!= null &&
//					Producto.producto3.getNombre() 	!= null &&
//					Producto.producto4.getNombre() 	!= null &&	
//					Producto.producto5.getNombre() 	!= null ) {
//					System.out.println("Todos los productos han sido introducidos");
//					menuPedidos();
//				}
				menuPedidos();
//				menuInicial();
				break;
			case "2":
				System.out.println("Selecciona el producto que deseas eliminar");
				Producto.producto1.datos();
				Producto.producto2.datos();
				Producto.producto3.datos();
				Producto.producto4.datos();
				Producto.producto5.datos();
				System.out.println(""
						+ "1. " + Producto.producto1.getNombre() + "\n"
						+ "2. " + Producto.producto2.getNombre() + "\n"
						+ "3. " + Producto.producto3.getNombre() + "\n"
						+ "4. " + Producto.producto4.getNombre() + "\n"
						+ "5. " + Producto.producto5.getNombre() + "\n");
				op = sc.nextLine();
				switch (op) {
				case "1":
					System.out.println("Eliminando el producto........\n");
					Producto.producto1.eliminarPr1();
					System.out.println("Producto eliminado\n");
					break;
				case "2":
					System.out.println("Eliminando el producto........\n");					
					Producto.producto2.eliminarPr2();
					System.out.println("Producto eliminado\n");
					break;
				case "3":
					System.out.println("Eliminando el producto........\n");					
					Producto.producto3.eliminarPr3();
					System.out.println("Producto eliminado\n");
					break;
				case "4":
					System.out.println("Eliminando el producto........\n");					
					Producto.producto4.eliminarPr4();
					System.out.println("Producto eliminado\n");
					break;
				case "5":
					System.out.println("Eliminando el producto........\n");					
					Producto.producto5.eliminarPr5();
					System.out.println("Producto eliminado\n");
					break;
				default:
					break;
				}
				menuInicial();
				break;
			case "0":
				menuInicial();
				break;
			default:
				System.err.println("Selección incorrecta");
				menuInicial();
				break;
			}
			break;
		case "0":
			System.out.println("Saliendo.....");
			break;
		default:
			System.err.println("Selección incorrecta");
			menuInicial();
			break;
		}
	}
//	public static void menuInicial() {
//		System.out.println("MENÚ INICIAL\n"
//				+ "1. Crear clientes\n"
//				+ "2. Crear productos\n"
//				+ "3. Eliminar productos\n"
//				+ "4. Ver datos\n"
//				+ "5. Pagar\n"
//				+ "6. Menú pedidos\n"
//				+ "0. Salir");
//		String op = sc.nextLine();
//		switch (op) {
//		case "1":
//			System.out.println("CREAR CLIENTES");
//			if (Cliente.cliente1.getNombre() == null) {
//				System.out.println("Cliente 1");
//				Cliente.cliente1.inNombreYapellidos();
//				Cliente.cliente1.fechaAlta();
//				Cliente.cliente1.inTelefono();
//				Cliente.cliente1.inDireccion();
//				if (Cliente.cliente2.getNombre() == null) {
//					System.out.println("Cliente 2");
//					Cliente.cliente2.inNombreYapellidos();
//					Cliente.cliente2.fechaAlta();
//					Cliente.cliente2.inTelefono();
//					while (Cliente.cliente1.getTelefono().equals(Cliente.cliente2.getTelefono())) {
//						System.out.println("Teléfono repetido");
//						Cliente.cliente2.inTelefono();
//					}
//					Cliente.cliente2.inDireccion();
//					if (Cliente.cliente3.getNombre() == null) {
//						System.out.println("Cliente 3");
//						Cliente.cliente3.inNombreYapellidos();
//						Cliente.cliente3.fechaAlta();
//						Cliente.cliente3.inTelefono();
//						while (Cliente.cliente2.getTelefono().equals(Cliente.cliente3.getTelefono()) ||
//								Cliente.cliente1.getTelefono().equals(Cliente.cliente3.getTelefono())) {
//							System.out.println("Teléfono repetido");
//							Cliente.cliente3.inTelefono();
//						}
//						Cliente.cliente3.inDireccion();
//					}
//				}
//			} else {
//				System.err.println("Los clientes ya se han introducido");
//			}
//			menuInicial();
//			break;
//		case "2":
//			System.out.println("CREAR PRODUCTOS");
//			if (Producto.producto1.getNombre() == null) {
//				System.out.println("Producto 1");
//				Producto.producto1.inNombreProducto();
//				Producto.producto1.setPrecio();
//				Producto.producto1.setCantiadad();
//				System.out.println("Producto 1 insertado");
//			}
//			if (Producto.producto2.getNombre() == null) {
//				System.out.println("Producto 2");
//				Producto.producto2.inNombreProducto();
//				Producto.producto2.setPrecio();
//				Producto.producto2.setCantiadad();
//				System.out.println("Producto 2 insertado");
//			}
//			if (Producto.producto3.getNombre() == null) {
//				System.out.println("Producto 3");
//				Producto.producto3.inNombreProducto();
//				Producto.producto3.setPrecio();
//				Producto.producto3.setCantiadad();
//				System.out.println("Producto 3 insertado");
//			}
//			if (Producto.producto4.getNombre() == null) {
//				System.out.println("Producto 4");
//				Producto.producto4.inNombreProducto();
//				Producto.producto4.setPrecio();
//				Producto.producto4.setCantiadad();
//				System.out.println("Producto 2 insertado");
//			}
//			if (Producto.producto5.getNombre() == null) {
//				System.out.println("Producto 5");
//				Producto.producto5.inNombreProducto();
//				Producto.producto5.setPrecio();
//				Producto.producto5.setCantiadad();
//				System.out.println("Producto 5 insertado");
//			}
//			menuInicial();
//			break;
//		case "3":
//			System.out.println("Selecciona el producto que deseas eliminar");
//			Producto.producto1.datos();
//			Producto.producto2.datos();
//			Producto.producto3.datos();
//			Producto.producto4.datos();
//			Producto.producto5.datos();
//			System.out.println(""
//					+ "1. " + Producto.producto1.getNombre() + "\n"
//					+ "2. " + Producto.producto2.getNombre() + "\n"
//					+ "3. " + Producto.producto3.getNombre() + "\n"
//					+ "4. " + Producto.producto4.getNombre() + "\n"
//					+ "5. " + Producto.producto5.getNombre() + "\n");
//			op = sc.nextLine();
//			switch (op) {
//			case "1":
//				System.out.println("Eliminando el producto");
//				Producto.producto1.eliminarPr1();
//				System.out.println("Producto eliminado");
//				break;
//			case "2":
//				System.out.println("Eliminando el producto");
//				Producto.producto2.eliminarPr2();
//				System.out.println("Producto eliminado");
//				break;
//			case "3":
//				System.out.println("Eliminando el producto");
//				Producto.producto3.eliminarPr3();
//				System.out.println("Producto eliminado");
//				break;
//			case "4":
//				System.out.println("Eliminando el producto");
//				Producto.producto4.eliminarPr4();
//				System.out.println("Producto eliminado");
//				break;
//			case "5":
//				System.out.println("Eliminando el producto");
//				Producto.producto5.eliminarPr5();
//				System.out.println("Producto eliminado");
//				break;
//			default:
//				break;
//			}
//			menuInicial();
//			break;
//		case "4":
//			System.out.println("Datos introducidos");
//			Cliente.cliente1.datos();
//			Cliente.cliente2.datos();
//			Cliente.cliente3.datos();
//			Producto.producto1.datos();
//			Producto.producto2.datos();
//			Producto.producto3.datos();
//			Producto.producto4.datos();
//			Producto.producto5.datos();
//			menuInicial();
//			break;
//		case "5": 
//			System.out.println("Gestión del pago");
//			System.out.print("Selección del tipo de pago (Gest)\n"
//					+ "1. Efectivo\n"
//					+ "2. Tarjeta\n"
//					+ "3. Cuenta\n"
//					+ "Tipo de pago --> ");
//			String op1 = sc.nextLine();
//			System.out.println("");
//			Pedido.listaPedido.pagar(op1);
//			menuInicial();
//			break;
//		case "6":
//			menuPedidos();
//			break;
//		case "0":
//			System.out.println("Saliendo....");
//			break;
//		default:
//			System.out.println("Selección incorrecta");
//			menuInicial();
//			break;
//		}
//	}
	public static void menuPedidos() {
		System.out.println("MENU PEDIDOS\n"
				+ "1. Realizar pedidos\n"
				+ "\n"
				+ "0. Salir");
		String scTelefono = sc.nextLine();	
		switch (scTelefono) {
		case "1":
			System.out.print("REALIZAR EL PEDIDO\n"
					+ "Introduce el número de teléfono --> ");
			scTelefono = sc.nextLine();	
			try {
				if (Cliente.cliente1.getTelefono().equals(scTelefono)) {
					Cliente.cliente1.datos();
					Pedido.listaPedido.agregarCliente(Cliente.cliente1);
					menuProductos();
//					System.out.println(Pedido.listaPedido.getCliente() + "\n");
				}else if (Cliente.cliente2.getTelefono().equals(scTelefono)) {
					Cliente.cliente2.datos();
					Pedido.listaPedido.agregarCliente(Cliente.cliente2);
					menuProductos();
//					System.out.println(Pedido.listaPedido.getCliente() + "\n");
				}else if (Cliente.cliente3.getTelefono().equals(scTelefono)) {
					Cliente.cliente3.datos();
					Pedido.listaPedido.agregarCliente(Cliente.cliente3);
					menuProductos();
//					System.out.println(Pedido.listaPedido.getCliente() + "\n");
				}else {
					System.err.println("El teléfono no pertenece a ningún cliente");
					menuPedidos();
				}
				menuPedidos();
			} catch (Exception e) {
				System.err.println("El cliente no existe");
				menuPedidos();
				sc.nextLine();
			}
			break;
		case "0":
			menuInicial();
			break;
		default:
			break;
		}
//		System.out.print("REALIZAR EL PEDIDO\n"
//				+ "Introduce el número de teléfono --> ");
//		String scTelefono = sc.nextLine();		
//		try {
//			if (Cliente.cliente1.getTelefono().equals(scTelefono)) {
//				Cliente.cliente1.datos();
//			}else if (Cliente.cliente2.getTelefono().equals(scTelefono)) {
//				Cliente.cliente2.datos();
//			}else if (Cliente.cliente3.getTelefono().equals(scTelefono)) {
//				Cliente.cliente3.datos();
//			}else {
//				System.err.println("El teléfono no pertenece a ningún cliente");
//				menuPedidos();
//			}
//			menuInicial();
//		} catch (Exception e) {
//			System.err.println("El cliente no existe");
//			menuInicial();
//			sc.nextLine();
//		}
	}
	public static void menuProductos() {
		System.out.println("SELECCION DE PRODUCTOS\n"
				+ "1. " + Producto.producto1.getNombre() + "\n"
				+ "2. " + Producto.producto2.getNombre() + "\n"
				+ "3. " + Producto.producto3.getNombre() + "\n"
				+ "4. " + Producto.producto4.getNombre() + "\n"
				+ "5. " + Producto.producto5.getNombre() + "\n"
				+ "\n"
				+ "0. Terminar pedido");
		String op = sc.nextLine();
		switch (op) {
		case "1":
			Pedido.listaPedido.agregarProducto1(Producto.producto1);
			resumenPedido();
			menuProductos();
			break;
		case "2":
			Pedido.listaPedido.agregarProducto2(Producto.producto2);
			resumenPedido();
			menuProductos();
			break;
		case "3":
			Pedido.listaPedido.agregarProducto3(Producto.producto3);
			resumenPedido();
			menuProductos();
			break;
		case "4":
			Pedido.listaPedido.agregarProducto4(Producto.producto4);
			resumenPedido();
			menuProductos();
			break;
		case "5":
			Pedido.listaPedido.agregarProducto5(Producto.producto5);
			resumenPedido();
			menuProductos();
			break;
		case "0":
			System.out.println("Gestión del pago");
			System.out.print("Selección del tipo de pago\n"
					+ "1. Efectivo\n"
					+ "2. Tarjeta\n"
					+ "3. Cuenta\n"
					+ "Tipo de pago --> ");
			String op1 = sc.nextLine();
			System.out.println("");
			Pedido.listaPedido.pagar(op1);
			break;
		default:
			System.err.println("Selección incorrecta");
			menuProductos();
			break;
		}
	}
	
	//TODO: Cambiar los decimales del total del pedido, línea 516
	public static void resumenPedido() {
		System.out.println(
			  "\nRESUMEN DEL PEDIDO\n"
			+ "=====================================================\n"
			+ "PRODUCTO\tCANTIDAD\tPRECIO UD.\tTOTAL\n"
			+ "========\t========\t==========\t=====");

		if (Pedido.listaPedido.getProducto1() != null) {
			System.out.println(
					limitarCaracteres(Producto.producto1.getNombre(), 6) + "\t\t" + 
					Producto.producto1.getCantiadad() + "\t\t" +
					Producto.producto1.getPrecio() + "\t\t" +
					(Producto.producto1.getCantiadad() * Producto.producto1.getPrecio())
			);	
		}
		if (Pedido.listaPedido.getProducto2() != null) {
			System.out.println(
					limitarCaracteres(Producto.producto2.getNombre(), 6) + "\t\t" + 
					Producto.producto2.getCantiadad() + "\t\t" +
					Producto.producto2.getPrecio() + "\t\t" +
					(Producto.producto2.getCantiadad() * Producto.producto2.getPrecio())
			);	
		}
		if (Pedido.listaPedido.getProducto3() != null) {
			System.out.println(
					limitarCaracteres(Producto.producto3.getNombre(), 6) + "\t\t" + 
					Producto.producto3.getCantiadad() + "\t\t" +
					Producto.producto3.getPrecio() + "\t\t" +
					(Producto.producto3.getCantiadad() * Producto.producto3.getPrecio())
			);
		}
		if (Pedido.listaPedido.getProducto4() != null) {
			System.out.println(
					limitarCaracteres(Producto.producto4.getNombre(), 6) + "\t\t" + 
					Producto.producto4.getCantiadad() + "\t\t" +
					Producto.producto4.getPrecio() + "\t\t" +
					(Producto.producto4.getCantiadad() * Producto.producto4.getPrecio())
			);
		}
		if (Pedido.listaPedido.getProducto5() != null) {
			System.out.println(
					limitarCaracteres(Producto.producto5.getNombre(), 6) + "\t\t" + 
					Producto.producto5.getCantiadad() + "\t\t" +
					Producto.producto5.getPrecio() + "\t\t" +
					(Producto.producto5.getCantiadad() * Producto.producto5.getPrecio())
			);
		}
		System.out.println("====================================================="
				+ "\nTOTAL -----------------------------------------> " + Pedido.calcularTotalPedido() + "\n"
				+ "=====================================================");
	}
	
	
	
	private static String limitarCaracteres(String cadena, int longitudMaxima) {
	    return cadena.length() > longitudMaxima ? cadena.substring(0, longitudMaxima) : cadena;
	}

	public static void main(String[] args) {
		

		menuInicial();
//		resumenPedido();
	}
}
































