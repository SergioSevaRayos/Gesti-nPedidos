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
	
	static Pedido listaPedido = new Pedido();
	
    static Scanner sc = new Scanner(System.in);
	
    // Constructor
    Pedido() {
    	this.cliente = null;
    	this.producto1 = null;
    	this.producto2 = null;
    	this.producto3 = null;
        this.estado = null; 
        this.importeTotal = 0;
        this.pago = null;
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
