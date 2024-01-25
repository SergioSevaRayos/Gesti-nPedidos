package paquete_1;

public class Producto {
	// Atributos
	private String 	nombre;
	private int 	precio;
	private int 	cantidad;

	// Contructor
	Producto(String nombre, int precio, int cantidad){
		this.nombre 	= nombre;
		this.precio 	= precio;
		this.cantidad 	= cantidad;
	}
	
	// Métodos seters y geters
	
	// Nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    // Precio
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getPrecio() {
        return precio;
    }
    // Cantidad
    public void setCantiadad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCantiadad() {
        return cantidad;
    }
}