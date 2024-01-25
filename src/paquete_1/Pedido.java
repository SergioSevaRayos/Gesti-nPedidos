package paquete_1;

import java.util.Scanner;

public class Pedido {
	
	// Atributos
	private Cliente cliente;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private String[] estado = {"pagado", "preparando", "listo", "servido"};
	private float importeTotal = 0.00f;
	private PasarelaDePago pago;
	
	private static boolean pagoRealizado = false;
	private static String TipoPago = null;
    static Scanner sc = new Scanner(System.in);
	
    // Constructor
    Pedido(Cliente cliente, Producto producto1, Producto producto2, Producto producto3, String[] estado, float importeTotal, PasarelaDePago pago) {
    	this.cliente = cliente;
    	this.producto1 = producto1;
    	this.producto2 = producto2;
    	this.producto3 = producto3;
        this.estado = estado; 
        this.importeTotal = importeTotal;
        this.pago = pago;
    }
    

	// Métodos
    // Cliente
    public void agregarCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Cliente getCliente() {
        return cliente;
    }
    
    // Producto 1
    public Producto getProducto1() {
        return producto1;
    }
    public void agregarProducto1(Producto producto1) {
    	this.producto1 = producto1;
    }
    // Producto 2
    public Producto getProducto2() {
        return producto2;
    }
    public void agregarProducto2(Producto producto2) {
        this.producto2 = producto2;
    }
    // Producto 3
    public Producto getProducto3() {
        return producto3;
    }
    public void agregarProducto3(Producto producto3) {
        this.producto3 = producto3;
    }
    
    public static void pagar(String TipoPago) {
    	
    	System.out.println("Selección del tipo de pago\n"
				+ "1. Efectivo\n"
				+ "2. Tarjeta\n"
				+ "3. Cuenta");
		TipoPago = sc.nextLine();
		switch (TipoPago) {
		case "1":
			System.out.println("EFECTIVO");
			PasarelaDePago.efectivo();
			break;
		case "2":
			System.out.println("TARJETA");
			PasarelaDePago.tarjeta();
			break;
		case "3":
			System.out.println("CUENTA");
			PasarelaDePago.cuenta();
			break;
		default:
			System.out.println("Opción incorrecta, vuelve a intentarlo");
			pagar(TipoPago);
			break;
		}
	}
    
    public static void pedidoPagado() {
		if (pagoRealizado == true) {
			System.out.println("Pago realizado con éxito");
		}
	}
    public static void pedidoNoPagado() {
		if (pagoRealizado == false) {
			System.out.println("Pago pendiente");
		}
	}

    public static void main(String[] args) {
//    	pagar(TipoPago);
	}


	
    
    
    
    


    
}
