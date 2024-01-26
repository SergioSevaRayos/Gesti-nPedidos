package paquete_1;

import java.util.Scanner;


public class GestionPedidos {
	static Scanner sc = new Scanner(System.in);
	
	// TODO: tengo que terminar de crear el menú e ir implantado todas las partes de la
	// práctica
	public static void menu() {
		System.out.println("MENÚ INICIAL\n"
				+ "1. Crear clientes\n"
				+ "2. Crear productos\n"
				+ "3. Ver datos");
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
					Cliente.cliente2.inDireccion();
					if (Cliente.cliente3.getNombre() == null) {
						System.out.println("Cliente 3");
						Cliente.cliente3.inNombreYapellidos();
						Cliente.cliente3.fechaAlta();
						Cliente.cliente3.inTelefono();
						Cliente.cliente3.inDireccion();
					}
				}
			}
			Cliente.cliente1.datos();
			Cliente.cliente2.datos();
			Cliente.cliente3.datos();
			menu();
			break;
		case "2":
			System.out.println("CREAR PRODUCTOS");
			if (Producto.producto1.getNombre() == null) {
				System.out.println("Producto 1");
				Producto.producto1.inNombreProducto();
				Producto.producto1.setPrecio();
				Producto.producto1.setCantiadad();
				System.out.println("Producto 1 insertado");
				if (Producto.producto2.getNombre() == null) {
					System.out.println("Producto 2");
					Producto.producto2.inNombreProducto();
					Producto.producto2.setPrecio();
					Producto.producto2.setCantiadad();
					System.out.println("Producto 2 insertado");
					if (Producto.producto3.getNombre() == null) {
						System.out.println("Producto 3");
						Producto.producto3.inNombreProducto();
						Producto.producto3.setPrecio();
						Producto.producto3.setCantiadad();
						System.out.println("Producto 4 insertado");
						if (Producto.producto4.getNombre() == null) {
							System.out.println("Producto 4");
							Producto.producto4.inNombreProducto();
							Producto.producto4.setPrecio();
							Producto.producto4.setCantiadad();
							System.out.println("Producto 4 insertado");
							if (Producto.producto5.getNombre() == null) {
								System.out.println("Producto 5");
								Producto.producto5.inNombreProducto();
								Producto.producto5.setPrecio();
								Producto.producto5.setCantiadad();
								System.out.println("Producto 5 insertado");
							}
						}
					}
				}	
			}
			Producto.producto1.datos();
			Producto.producto2.datos();
			Producto.producto3.datos();
			Producto.producto4.datos();
			Producto.producto5.datos();
			menu();

			break;
		case "3":
			System.out.println("VER DATOS");
			Cliente.cliente1.datos();
			Cliente.cliente2.datos();
			Cliente. cliente3.datos();
			Producto.producto1.datos();
			Producto.producto2.datos();
			System.out.println("Agregando datos al pedido");
			Pedido.listaPedido.agregarProducto1(Producto.producto1);
			Producto.producto1.datos();
			Producto.producto1.datos();
//			System.out.println(Pedido.listaPedido.getCliente());
//			Pedido.listaPedido.agregarCliente(Cliente.cliente1);
//			Pedido.listaPedido.agregarProducto1(Producto.producto1);
//
//
//			Pedido.listaPedido.agregarCliente(Cliente.cliente1);
//			System.out.println(Pedido.listaPedido.getCliente());
//			System.out.println(Cliente.cliente1.getFechaAlta());
//			System.out.println(Cliente.cliente1.getPedido());
			menu();
			break;
		default:
			System.out.println("Selección incorrecta");
			menu();
			break;
		}
	}
	

	public static void main(String[] args) {

		menu();
	}

}

