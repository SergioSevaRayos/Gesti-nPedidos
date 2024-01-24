package paquete_1;

// Librerías
import java.util.*;

public class Cliente {
	 // Atributos
	private String	nombre;
	private String 	apellidos;
	private Date 	FechaDeAlta;
	private String 	telefono;
	private String 	direccion;
	private String 	historial;
	private int 	numPedido;
	// Variables
	static Scanner 	sc = new Scanner(System.in);
	static String 	nombreMinuscula;
	static String 	apellidosMayuscula;
	static String 	tipoTelefono;
	public String 	inNombreYapellidos;

	// Constructor
	public Cliente(String nombre, String apellidos, Date FechaDeAlta, String telefono, String direccion, String historial) {
		this.nombre 		= nombre;
		this.apellidos 		= apellidos;
		this.FechaDeAlta	= FechaDeAlta;
		this.telefono 		= telefono;
		this.direccion 		= direccion;
		this.historial 		= historial;
	}
	
	// ------------------------------------------------- Inicio Nombre
	public void inNombreYapellidos() {
		System.out.print("Introduce el nombre --> ");
		this.nombre = sc.nextLine();
		nombreMinuscula = this.nombre.toLowerCase();
		System.out.print("Introduce los apellidos --> ");
		this.apellidos = sc.nextLine();
		apellidosMayuscula = this.apellidos.toUpperCase();
	}
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	// ------------------------------------------------- Fin Nombre
	// ------------------------------------------------- Inicio Fecha
	public void fechaAlta() {
		this.FechaDeAlta = new Date();
	}
	public Date getFechaAlta() {
        return FechaDeAlta;
    }
    public void setFechaAlta(Date FechaDeAlta) {
        this.FechaDeAlta = FechaDeAlta;
    }
	// ------------------------------------------------- Fin Fecha
	// ------------------------------------------------- Inicio Teléfono
	public void inTelefono() {
		System.out.print("Introduce el teléfono --> ");
		this.telefono = sc.nextLine();
		
		if (this.telefono.length() != 9) {
			System.out.println("El teléfono es incorrecto, vuelva a intentarlo");
			inTelefono();
		}else {
			char primerCaracter = this.telefono.charAt(0);
			
			if (primerCaracter == '6' || primerCaracter == '7') {
				tipoTelefono = "Móvil";
			}if (primerCaracter == '8' || primerCaracter == '9') {
				tipoTelefono = "Fijo";
			}
		}
	}
	public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    // ------------------------------------------------- Fin Teléfono
    // ------------------------------------------------- Inicio Dirección
	public void inDireccion() {
		System.out.print("Introduce la dirección --> ");
		this.direccion = sc.nextLine();
	}
	public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    // ------------------------------------------------- Fin Dirección
 // ------------------------------------------------- Inicio Número pedido
    public void agregarPedido() {
			this.numPedido += 1;
	}
	public int getPedido() {
        return numPedido;
    }
    public void setPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    // ------------------------------------------------- Fin Número pedido
    
	public void datos() {
		System.out.println(
				  "\nNombre        --> " + nombreMinuscula + "\n"
				+ "Apellidos     --> " + apellidosMayuscula + "\n"
				+ "Fecha alta    --> " + FechaDeAlta + "\n"
				+ "Teléfono      --> " + telefono + "\n"
				+ "Tipo          --> " + tipoTelefono + "\n"
				+ "Dirección     --> " + direccion + "\n"
				+ "Num Pedido    --> " + numPedido);
		
	}
	public void main() {
		inNombreYapellidos();
		inTelefono();
		fechaAlta();
		inDireccion();
//		agregarPedido();


		
		

	}
}