package paquete_1;

import java.util.Scanner;

public class Pedido {
	// Atributos
	static Cliente cliente;
	static Producto producto1;
	static Producto producto2;
	static Producto producto3;
	float importeTotal = 0.00f;
	PasarelaDePago pago;
	static String tipoPago;
	
	static String[] estado = {"pagado", "preparando", "listo", "servido"};
    String estadoActual;
    static Scanner sc = new Scanner(System.in);
	
    // Constructor
    Pedido(Producto producto1, Producto producto2, Producto producto3, String estadoActual) {
    	Producto.producto1 = producto1;
    	Producto.producto2 = producto2;
    	Producto.producto3 = producto3;
        this.estadoActual = estado[0]; 
    }
    
    public static String pagar(String tipoPago) {
		System.out.println("Selecciona el método de pago\n"
				+ "1. Efectivo\n"
				+ "2. Tarjeta\n"
				+ "3. Cuenta\n");
		tipoPago = sc.nextLine();
		switch (tipoPago) {
		case "1": {
			System.out.println("Método de pago efectivo seleccionado");
			PasarelaDePago.efectivo();
			break;
		}
		case "2":
			System.out.println("Método de pago con tarjeta seleccionado");
			PasarelaDePago.tarjeta();
			break;
			
		case "3":
			System.out.println("Método de pago por cuenta seleccionado");
			PasarelaDePago.cuenta();
			break;
		default:
			System.out.println("Elección incorrecta");
			pagar(tipoPago);	
		}
		return tipoPago;
	}
    
    public static void agregarCliente(Cliente cliente) {
		Pedido.cliente = cliente;
	}
    public static Cliente obtenerClienteAsociado() {
        return cliente;
    }
    
    public static void agregarProducto1(Producto producto) {
    	Producto.producto1 = producto;
	}
    public static Producto obtenerProducto1() {
        return producto1;
    }
    
    public static void agregarProducto2(Producto producto) {
    	Producto.producto2 = producto;
	}
    public static Producto obtenerProducto2() {
        return producto2;
    }
    
    public Producto eliminarProducto(Producto producto) {
        if (producto != null) {
            producto = null;
            return producto;
        } else {
            return null;
        }
    }

    
}
