package clases;

public class cliente 
{

// VARIABLES
private String nombre;
private String apellidos;
private int numCliente;
private String correoElectronico;
private String direccion;

// CONSTRUCTOR
public cliente (String nombre, String apellidos, int numCliente, String correoElectronico, String direccion)
{
this.nombre= nombre;
this.apellidos= apellidos;
this.numCliente= numCliente;
this.correoElectronico= correoElectronico;
this.direccion= direccion;
}

// MÉTODOS GET (todos incluidos ya que los datos del cliente no van a cambiar)
public String getNombre() 
{
return nombre;
}

public String getApellidos() 
{
return apellidos;
}

public int getNumCliente() 
{
return numCliente;
}

public String getCorreoElectronico() 
{
return correoElectronico;
}

public String getDireccion() 
{
return direccion;
}





}
