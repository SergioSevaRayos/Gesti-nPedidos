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
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    // Producto 1
    public Producto getProducto1() {
        return producto1;
    }
    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }
    // Producto 2
    public Producto getProducto2() {
        return producto2;
    }
    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }
    // Producto 3
    public Producto getProducto3() {
        return producto3;
    }
    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }
    
    public static void main(String[] args) {
		
	}
    
    
    
    


    
}
