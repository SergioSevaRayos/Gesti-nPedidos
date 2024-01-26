package paquete_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Producto {
	// Atributos
	private String 	nombre;
	private float 	precio;
	private int 	cantidad;

	static Scanner 	sc = new Scanner(System.in);
	
	static Producto producto1 = new Producto(null, 0, 0);
	static Producto producto2 = new Producto(null, 0, 0);
	static Producto producto3 = new Producto(null, 0, 0);
	static Producto producto4 = new Producto(null, 0, 0);
	static Producto producto5 = new Producto(null, 0, 0);
	
	// Contructor
	Producto(String nombre, float precio, int cantidad){
		this.nombre 	= nombre;
		this.precio 	= precio;
		this.cantidad 	= cantidad;
	}
	
	// Métodos seters y geters
	
	// Nombre
	public void inNombreProducto() {
		System.out.print("Introduce el nombre --> ");
		this.nombre = sc.next();
	}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    // Precio
    public void setPrecio() {
    	try {
            System.out.print("Introduce el precio --> ");
            this.precio = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.err.println("Error: Debes introducir un número válido\n"
            		+ "Formatos --> 0 - 0,0\n"
            		+ "Separa los decimales con una coma");
            sc.nextLine();
            setPrecio();
        }
    }
    public float getPrecio() {
        return precio;
    }
    // Cantidad
    public void setCantiadad() {
    	System.out.print("Introduce la cantidad --> ");
		this.cantidad = sc.nextInt();
    }
    public int getCantiadad() {
        return cantidad;
    }
    
    public void datos() {
		System.out.println(
				  "\nNombre  --> " + nombre + "\n"
				+ "Precio	 --> " + precio + "\n"
				+ "Cantidad  --> " + cantidad);
	}
}