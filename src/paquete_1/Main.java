package paquete_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Sergio", "Seva Rayos", null, "633841203", "Calle Santa Pola 4", null);
		Cliente cliente2 = new Cliente("Pepe", "Tevas Gil", null, "633841203", "Calle Santa Pola 4", null);
		Producto producto1 = new Producto("pan", 2, 2);
		
		Pedido.agregarCliente(cliente1);
		Pedido.obtenerClienteAsociado();
		
		Pedido.agregarProducto1(producto1);
		Pedido.obtenerProducto1();
		
		System.out.println(Producto.nombre);
		
		
		// Comprobar la asociación
        if (Cliente.nombre != null) {
            System.out.println("Cliente asociado al pedido: " + Cliente.nombre);
        } else {
            System.out.println("No hay cliente asociado al pedido.");
        }
		
	}

}
