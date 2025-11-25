package clases;

public class productoDigital extends producto
{

// VARIABLE
private String licencia;
// (El enunciado pide establecer un IVA o descuentos para productos digitales)
private double descuento= 0.15;

// CONSTRUCTOR: hay que llamar al constructor de producto
public productoDigital (String licencia, String nombre, String descripcion, int numSerie, int stock, int precioInicial, double descuento)
{
// Super para acceder a la clase padre (producto)
super(nombre, descripcion, numSerie, stock, precioInicial);
this.licencia= licencia;
this.descuento= descuento;
}

// MÉTODOS: solo get ya que no se cambiará, por lo que un set no es necesario
public String getLicencia() 
{
return licencia;
}

// MÉTODOS: sacar el precio final
public double calcularPrecioFinal()
{
double precioDescontado;
precioDescontado=getPrecioInicial()-(getPrecioInicial()*descuento);
return precioDescontado;
}

}
