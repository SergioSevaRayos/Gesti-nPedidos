package paquete_1;

import java.util.Scanner;


public class GestionPedidos {
	static Scanner sc = new Scanner(System.in);
	
	static Cliente cliente2 = new Cliente(null, null, null, null, null, null);
	static Pedido pedido = new Pedido(null, null, null, null, null, 0, null);
	
	
	// TODO como crear clientes
	public static void menu() {
		Cliente cliente1 = new Cliente(null, null, null, null, null, null);
		Cliente cliente2 = new Cliente(null, null, null, null, null, null);
		Cliente cliente3 = new Cliente(null, null, null, null, null, null);
		Producto producto1 = new Producto(null, 0, 0);
		Producto producto2 = new Producto(null, 0, 0);
		Producto producto3 = new Producto(null, 0, 0);
		Producto producto4 = new Producto(null, 0, 0);
		Producto producto5 = new Producto(null, 0, 0);
		
		System.out.println("MENÚ INICIAL\n"
				+ "1. Crear clientes\n"
				+ "2. Crear productos\n"
				+ "3. Ver clientes");
		String op = sc.nextLine();
		switch (op) {
		case "1":
			
			System.out.println("CREAR CLIENTES");
			cliente1.inNombreYapellidos();
			if (cliente1.getNombre() != null) {
				System.out.println("El cliente 1 esta insertado\n"
						+ "Inserta el cliente 2");
				cliente2.inNombreYapellidos();
			}
			
			if (cliente1.getNombre() != null && cliente2.getNombre() != null) {
				System.out.println("El cliente 1 y 2 estan insertados\n"
						+ "Inserta el cliente 3");
				cliente3.inNombreYapellidos();
			}
			System.out.println("Cliente 1: " + cliente1.getNombre());
			System.out.println("Cliente 2: " + cliente2.getNombre());
			System.out.println("Cliente 3: " + cliente3.getNombre());
			break;
		case "2":
			System.out.println("CREAR PRODUCTOS\n"
					+ "Lista de productos\n"
					+ "1. Producto 1\n"
					+ "2. Producto 2\n"
					+ "3. Producto 3\n"
					+ "4. Producto 4\n"
					+ "5. Producto 5");
			op = sc.nextLine();
			switch (op) {
			case "1":
				System.out.println("Introduce el producto1");
				op = sc.nextLine();
				producto1.setNombre(op);
				System.out.println("Nombre --> " + producto1.getNombre());
				break;
			case "2":
				
				break;

			case "3":
				
				break;
			case "4":
				
				break;

			case "5":
				
				break;

			default:
				break;
			}
			
//			pedido.agregarCliente(cliente1);
//			pedido.agregarProducto1(producto1);

//			Pedido.main(null);

			break;
		case "3":
			System.out.println("VER CLIENTES");
//			cliente1.datos();
//			cliente2.datos();
			menu();
			break;
		default:
			System.out.println("Selección incorrecta");
			menu();
			break;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cliente cliente1 = new Cliente("Sergio", "Seva Rayos", null, "633841203", "Calle Santa Pola 4", null);
//		Producto producto1 = new Producto("pan", 2, 2);
//		
//		Pedido.agregarCliente(cliente1);
//		Pedido.obtenerClienteAsociado();
//		
//		Pedido.agregarProducto1(producto1);
//		Pedido.obtenerProducto1();
//		
//		System.out.println(Producto.nombre);
//		
		menu();
	}

}

