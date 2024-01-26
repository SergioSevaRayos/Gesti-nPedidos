package paquete_1;

// Librer�as
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
	
	static Cliente cliente1 = new Cliente(null, null, null, null, null, null);
	static Cliente cliente2 = new Cliente(null, null, null, null, null, null);
	static Cliente cliente3 = new Cliente(null, null, null, null, null, null);

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
		nombreMinuscula = this.nombre;
		System.out.print("Introduce los apellidos --> ");
		this.apellidos = sc.nextLine();
		apellidosMayuscula = this.apellidos;
	}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public String toString() {
        return "Cliente: " + nombre;
    }
	// ------------------------------------------------- Fin Nombre
	// ------------------------------------------------- Inicio Fecha
	public void fechaAlta() {
		this.FechaDeAlta = new Date();
	}
    public void setFechaAlta(Date FechaDeAlta) {
        this.FechaDeAlta = FechaDeAlta;
    }
    public String getFechaAlta() {
        return "Fecha de alta: " +  FechaDeAlta;
    }

	// ------------------------------------------------- Fin Fecha
	// ------------------------------------------------- Inicio Tel�fono
	public void inTelefono() {
		System.out.print("Introduce el tel�fono --> ");
		this.telefono = sc.nextLine();
		
		if (this.telefono.length() != 9) {
			System.out.println("El tel�fono es incorrecto, vuelva a intentarlo");
			inTelefono();
		}else {
			char primerCaracter = this.telefono.charAt(0);
			
			if (primerCaracter == '6' || primerCaracter == '7') {
				tipoTelefono = "M�vil";
			}if (primerCaracter == '8' || primerCaracter == '9') {
				tipoTelefono = "Fijo";
			}
		}
	}
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return "N�mero de tel�fono: " + telefono;
    }
    // ------------------------------------------------- Fin Tel�fono
    // ------------------------------------------------- Inicio Direcci�n
	public void inDireccion() {
		System.out.print("Introduce la direcci�n --> ");
		this.direccion = sc.nextLine();
	}
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return "Direcci�n: " + direccion;
    }
    // ------------------------------------------------- Fin Direcci�n
 // ------------------------------------------------- Inicio N�mero pedido
    public void agregarPedido() {
			this.numPedido += 1;
	}
    public void setPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    public String getPedido() {
        return "N�mero de pedido: " + numPedido;
    }
    // ------------------------------------------------- Fin N�mero pedido
    
	public void datos() {
		System.out.println(
				  "\nNombre        --> " + nombre.toLowerCase() + "\n"
				+ "Apellidos     --> " + apellidos.toUpperCase() + "\n"
				+ "Fecha alta    --> " + FechaDeAlta + "\n"
				+ "Tel�fono      --> " + telefono + "\n"
				+ "Tipo          --> " + tipoTelefono + "\n"
				+ "Direcci�n     --> " + direccion + "\n"
				+ "Num Pedido    --> " + numPedido);
		
	}
}