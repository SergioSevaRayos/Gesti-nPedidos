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
	public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Precio
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    // Cantidad
    public int getCantiadad() {
        return cantidad;
    }
    public void setCantiadad(int cantidad) {
        this.cantidad = cantidad;
    }
}