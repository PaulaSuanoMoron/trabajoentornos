package clases;

public class main 
{
public static void main(String[] args) 
{
//CLIENTE
cliente primerCliente = new cliente ("Pepe", "García Moreno", 1, "pepegarciamoreno@gmail.com", "Calle Larga");

//PRODUCTOS

//Producto físico
productoFisico monitor = new productoFisico(5.0, "Monitor gaming", "Monitor de alta resolución específico para jugadores de videojuegos.", 
1234, 200.0);

//Producto digital
productoDigital software = new productoDigital(1234, "Windows11", "Sistema operativo de Windows11", 34567, 100, 0.20);

//PEDIDO
pedido pedidoPrimerCliente = new pedido (primerCliente);

//Ahora meto los dos productos en su pedido
pedidoPrimerCliente.meterProducto(monitor);
pedidoPrimerCliente.meterProducto(software);

//RESUMEN DEL PEDIDO (información del cliente, resumen del pedido, y factura con el precio)
System.out.println("RESUMEN DEL PEDIDO");
System.out.println(" ");


System.out.println("Información del cliente número "+ pedidoPrimerCliente.getCliente().getNumCliente());

System.out.println("Nombre completo: " + pedidoPrimerCliente.getCliente().getNombre() + " " + pedidoPrimerCliente.getCliente().getApellidos());
System.out.println("Dirección de envío: "+ pedidoPrimerCliente.getCliente().getDireccion());
System.out.println(" ");


System.out.println("Datos del pedido realizado");
//uso la variable monitor tal cual ya que estoy en la clase donde la he creado
System.out.println("Productos hardware: " + monitor.getNombre() + "-Número de serie: "+ monitor.getNumSerie());
System.out.println("Descripción: " + monitor.getDescripcion());
System.out.println("Precio: "+ monitor.getPrecioInicial());
System.out.println("Coste de envio: " + monitor.getCostesEnvio());
System.out.println("Precio más los gastos de envio: " + monitor.calcularElPrecioFinal());
System.out.println(" ");
System.out.println("Productos software: " + software.getNombre() + "-Número de serie: "+software.getNumSerie());
System.out.println("Descripción: " + software.getDescripcion());
System.out.println("Precio: " + software.getPrecioInicial());
System.out.println("Descuento aplicado: " +software.getdescuento());
System.out.println("Precio con el descuento aplicado: "+ software.calcularElPrecioFinal());
System.out.println(" ");
System.out.println("Total: "+ pedidoPrimerCliente.calcularElPrecioTotal());

}



}
