package paquete_1;

import java.util.Scanner;

public class GestionPedidos {
	static Scanner sc = new Scanner(System.in);
	static Cliente cliente1 = new Cliente(null, null, null, null, null, null);
	static Cliente cliente2 = new Cliente(null, null, null, null, null, null);
	
	// TODO como crear clientes
	public static void menu() {
		System.out.println("MENÚ INICIAL\n"
				+ "1. Crear clientes\n"
				+ "2. Crear productos\n"
				+ "3. Ver clientes");
		 String op = sc.nextLine();
		switch (op) {
		case "1":

			
			System.out.println("CREAR CLIENTES");
			cliente1.main();
			menu();
			if (cliente1 != null) {
				cliente2.main();
				menu();
			}
			break;
		case "2":
			System.out.println("CREAR PRODUCTOS");
			menu();
			break;
		case "3":
			System.out.println("VER CLIENTES");
			cliente1.datos();
			cliente2.datos();
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
