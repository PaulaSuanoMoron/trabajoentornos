package clases;

public class productoDigital extends producto
{

// VARIABLE
private int licencia;
// (El enunciado pide establecer un IVA o descuentos para productos digitales)
private double descuento;

// CONSTRUCTOR: hay que llamar al constructor de producto
public productoDigital (int licencia, String nombre, String descripcion, int numSerie, int precioInicial, double descuento)
{
// Super para acceder a la clase padre (producto)
super(nombre, descripcion, numSerie, precioInicial);
this.licencia= licencia;
this.descuento= descuento;
}

// MÉTODOS: solo get ya que no se cambiará, por lo que un set no es necesario
public int getLicencia() 
{
return licencia;
}

public double getdescuento()
{
    return descuento;
}

// MÉTODOS: sacar el precio final
public double calcularElPrecioFinal()
{
double precioDescontado;
precioDescontado=getPrecioInicial()-(getPrecioInicial()*descuento);
return precioDescontado;
}

}
