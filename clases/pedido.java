package clases;
// Bibliotecas necesarias
import java.util.ArrayList;
import java.util.List;
/*Producto y pedido tienen una relacion de asociacion, no hereda, ya que pedido no es un tipo de producto sino que usa y contiene objetos de tipo producto */
public class pedido 
{

// VARIABLE (la necesitaremos para el precio total)
double totalPrecio = 0.0;

// ASOCIACIÓN CON CLIENTE
// De esta manera se asocia la informacion del cliente con la del pedido, asi se sabra el nombre de quien lko ha hecho, su dirección...
private cliente cliente; 

//MÉTODO GET: importante ya que así se puede acceder a la información del cliente para cualquier cosa relacionada con el pedido de el.
public cliente getCliente()
{
    return cliente;
}

// LISTA DE LOS PRODCUTOS QUE TIENE UN PEDIDO:
private List <producto> listaproductos;

// CONSTRUCTOR + iniciar la lista de los productos
public pedido(cliente cliente)
{
this.cliente=cliente;
//puede contener cualquier objeto que herede de producto
this.listaproductos= new ArrayList<>();
}

// MÉTODOS
// Meter productos a la lista
public void meterProducto(producto producto)
{
if(producto != null) //mientras exista producto= mientras no sea null (nulo) 
{
this.listaproductos.add (producto);
}
}
 // Calcular el total
public double calcularElPrecioTotal() 
{
// En la variable producto se almacena cada elemento de la lista que se recorre uno por uno
for (producto Producto : listaproductos) 
{
//Se identifica el tipo de objeto (producto fisico o digital) y se ejecuta su calcularElPrecioFinal(), 
totalPrecio= totalPrecio+ Producto.calcularElPrecioFinal();
}
return totalPrecio;
}


}
