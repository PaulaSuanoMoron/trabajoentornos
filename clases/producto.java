// la clase sera abstracta para poder heredar de ella
package clases;
public abstract class producto 
{

// VARIABLES 
private String nombre;
private String descripcion;
private int numSerie;
private double precioInicial;

// CONSTRUCTOR: para inicializar las variables que han sido creadas anteriormente
public producto (String nombre, String descripcion, int numSerie, int stock, double precioInicial)
{
this.nombre= nombre;
this.descripcion= descripcion;
this.numSerie= numSerie;
this.precioInicial= precioInicial;
}

// MÉTODOS: get (incluyo todos los atributos) y set (incluyo stock y precio ya que pueden cambiar)
public String getNombre() 
{
return nombre;
}

public String getDescripcion() 
{
return descripcion;
}

public int getNumSerie() 
{
return numSerie;
}

public double getPrecioInicial() 
{
return precioInicial;
}



// MÉTODO ABSTRACTO: las subclases tendrán que tener si o si su propia implementación, desde producto no se puede calcular el precio de cualquier tipo de prodcuto,
// por ello todo tipo de producto que herede de producto debe tener una forma propia de hacerlo (producto digital y producto fisico)
public abstract double calcularElPrecioFinal();






}
