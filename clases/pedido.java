package clases;
// Bibliotecas necesarias
import java.util.ArrayList;
import java.util.List;

public class pedido 
{

// ASOCIACIÓN CON CLIENTE (ya que un pedido se asocia con el cliente que lo ha hecho)
private cliente cliente;  

// LISTA DE LOS PRODCUTOS QUE TIENE UN PEDIDO:
private List <producto> listaproductos;

// CONSTRUCTOR + iniciar la lista de los productos
public pedido(cliente cliente)
{
this.cliente=cliente;
this.listaproductos= new ArrayList<>();
}

// MÉTODOS
// Meter productos a la lista
public void meterProducto(producto producto)
{
if(producto != null) //mientras exista producto y no sea nulo
{
this.listaproductos.add (producto);
}
}


}
