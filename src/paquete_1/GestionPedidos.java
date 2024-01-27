package paquete_1;

import java.util.Scanner;

public class GestionPedidos {
	static Scanner sc = new Scanner(System.in);

	// TODO: tengo que terminar de crear el menú e ir implantado todas las partes de la
	// práctica
	public static void menuInicial() {
		System.out.println("MENÚ INICIAL\n"
				+ "1. Crear clientes\n"
				+ "2. Crear productos\n"
				+ "3. Eliminar productos\n"
				+ "4. Ver datos\n"
				+ "5. Pagar\n"
				+ "6. Menú pedidos\n"
				+ "0. Salir");
		String op = sc.nextLine();
		switch (op) {
		case "1":
			System.out.println("CREAR CLIENTES");
			if (Cliente.cliente1.getNombre() == null) {
				System.out.println("Cliente 1");
				Cliente.cliente1.inNombreYapellidos();
				Cliente.cliente1.fechaAlta();
				Cliente.cliente1.inTelefono();
				Cliente.cliente1.inDireccion();
				if (Cliente.cliente2.getNombre() == null) {
					System.out.println("Cliente 2");
					Cliente.cliente2.inNombreYapellidos();
					Cliente.cliente2.fechaAlta();
					Cliente.cliente2.inTelefono();
					while (Cliente.cliente1.getTelefono().equals(Cliente.cliente2.getTelefono())) {
						System.out.println("Teléfono repetido");
						Cliente.cliente2.inTelefono();
					}
					Cliente.cliente2.inDireccion();
					if (Cliente.cliente3.getNombre() == null) {
						System.out.println("Cliente 3");
						Cliente.cliente3.inNombreYapellidos();
						Cliente.cliente3.fechaAlta();
						Cliente.cliente3.inTelefono();
						while (Cliente.cliente2.getTelefono().equals(Cliente.cliente3.getTelefono()) ||
								Cliente.cliente1.getTelefono().equals(Cliente.cliente3.getTelefono())) {
							System.out.println("Teléfono repetido");
							Cliente.cliente3.inTelefono();
						}
						Cliente.cliente3.inDireccion();
					}
				}
			} else {
				System.err.println("Los clientes ya se han introducido");
			}
			menuInicial();
			break;
		case "2":
			System.out.println("CREAR PRODUCTOS");
			if (Producto.producto1.getNombre() == null) {
				System.out.println("Producto 1");
				Producto.producto1.inNombreProducto();
				Producto.producto1.setPrecio();
				Producto.producto1.setCantiadad();
				System.out.println("Producto 1 insertado");
			}
			if (Producto.producto2.getNombre() == null) {
				System.out.println("Producto 2");
				Producto.producto2.inNombreProducto();
				Producto.producto2.setPrecio();
				Producto.producto2.setCantiadad();
				System.out.println("Producto 2 insertado");
			}
			if (Producto.producto3.getNombre() == null) {
				System.out.println("Producto 3");
				Producto.producto3.inNombreProducto();
				Producto.producto3.setPrecio();
				Producto.producto3.setCantiadad();
				System.out.println("Producto 3 insertado");
			}
			if (Producto.producto4.getNombre() == null) {
				System.out.println("Producto 4");
				Producto.producto4.inNombreProducto();
				Producto.producto4.setPrecio();
				Producto.producto4.setCantiadad();
				System.out.println("Producto 2 insertado");
			}
			if (Producto.producto5.getNombre() == null) {
				System.out.println("Producto 5");
				Producto.producto5.inNombreProducto();
				Producto.producto5.setPrecio();
				Producto.producto5.setCantiadad();
				System.out.println("Producto 5 insertado");
			}
			menuInicial();
			break;
		case "3":
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
				System.out.println("Eliminando el producto");
				Producto.producto1.eliminarPr1();
				System.out.println("Producto eliminado");
				break;
			case "2":
				System.out.println("Eliminando el producto");
				Producto.producto2.eliminarPr2();
				System.out.println("Producto eliminado");
				break;
			case "3":
				System.out.println("Eliminando el producto");
				Producto.producto3.eliminarPr3();
				System.out.println("Producto eliminado");
				break;
			case "4":
				System.out.println("Eliminando el producto");
				Producto.producto4.eliminarPr4();
				System.out.println("Producto eliminado");
				break;
			case "5":
				System.out.println("Eliminando el producto");
				Producto.producto5.eliminarPr5();
				System.out.println("Producto eliminado");
				break;
			default:
				break;
			}
			menuInicial();
			break;
		case "4":
			System.out.println("Datos introducidos");
			Cliente.cliente1.datos();
			Cliente.cliente2.datos();
			Cliente.cliente3.datos();
			Producto.producto1.datos();
			Producto.producto2.datos();
			Producto.producto3.datos();
			Producto.producto4.datos();
			Producto.producto5.datos();
			menuInicial();
			break;
		case "5": 
			System.out.println("Gestión del pago");
			System.out.print("Selección del tipo de pago (Gest)\n"
					+ "1. Efectivo\n"
					+ "2. Tarjeta\n"
					+ "3. Cuenta\n"
					+ "Tipo de pago --> ");
			String op1 = sc.nextLine();
			System.out.println("");
			Pedido.listaPedido.pagar(op1);
			menuInicial();
			break;
		case "6":
			menuPedidos();
			break;
		case "0":
			System.out.println("Saliendo....");
			break;
		default:
			System.out.println("Selección incorrecta");
			menuInicial();
			break;
		}
	}
	public static void menuPedidos() {
		System.out.print("MENÚ PEDIDOS\n"
				+ "Introduce el número de teléfono --> ");
		String scTelefono = sc.nextLine();		
		try {
			if (Cliente.cliente1.getTelefono().equals(scTelefono)) {
				Cliente.cliente1.datos();
			}else if (Cliente.cliente2.getTelefono().equals(scTelefono)) {
				Cliente.cliente2.datos();
			}else if (Cliente.cliente3.getTelefono().equals(scTelefono)) {
				Cliente.cliente3.datos();
			}else {
				System.err.println("El teléfono no pertenece a ningún cliente");
				menuPedidos();
			}
			menuInicial();
		} catch (Exception e) {
			System.err.println("El cliente no existe");
			menuInicial();
			sc.nextLine();
		}
	}

	public static void main(String[] args) {
		menuInicial();
	}
}
































