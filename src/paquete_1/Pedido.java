package paquete_1;

import java.util.Scanner;

public class Pedido {
	
	// Atributos
	private Cliente cliente;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private Producto producto4;
	private Producto producto5;
	private String[] estado = {"pagado", "preparando", "listo", "servido"};
	private static double importeTotal;
	private PasarelaDePago pago;
	
	static Pedido listaPedido = new Pedido();
	
    static Scanner sc = new Scanner(System.in);
	
    // Constructor
    Pedido() {
    	this.cliente = null;
    	this.producto1 = null;
    	this.producto2 = null;
    	this.producto3 = null;
    	this.producto4 = null;
    	this.producto5 = null;
        this.estado = null; 
        this.importeTotal = 0.00f;
        this.pago = null;
    }
    

	// Métodos
    // Cliente
    public void agregarCliente(Cliente cliente) {
    	this.cliente = cliente;
    }
    public Cliente getCliente() {
        return  cliente;
    }
    public String toString() {
        return "Cliente: " + cliente;
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

    // Producto 4
    public Producto getProducto4() {
        return producto4;
    }
    public void agregarProducto4(Producto producto4) {
        this.producto4 = producto4;
    }

    // Producto 5
    public Producto getProducto5() {
        return producto5;
    }
    public void agregarProducto5(Producto producto5) {
        this.producto5 = producto5;
    }
    // Total
    public static double calcularTotalPedido() {
        importeTotal = 0.00f;

        if (listaPedido.getProducto1() != null) {
        	importeTotal += Producto.producto1.getCantiadad() * Producto.producto1.getPrecio();
        }
        if (listaPedido.getProducto2() != null) {
        	importeTotal += Producto.producto2.getCantiadad() * Producto.producto2.getPrecio();
        }
        if (listaPedido.getProducto3() != null) {
        	importeTotal += Producto.producto3.getCantiadad() * Producto.producto3.getPrecio();
        }
        if (listaPedido.getProducto4() != null) {
        	importeTotal += Producto.producto4.getCantiadad() * Producto.producto4.getPrecio();
        }
        if (listaPedido.getProducto5() != null) {
        	importeTotal += Producto.producto5.getCantiadad() * Producto.producto5.getPrecio();
        }

        return importeTotal;
    }
    // TODO: Añadir try/catch
	public void pagar(String TipoPago) {

		switch (TipoPago) {
		case "1":
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


    public static void main(String[] args) {
//    	pagar(TipoPago);
    	
	}


	
    
    
    
    


    
}
