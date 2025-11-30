package clases;

public class productoFisico extends producto
{
    
// VARIABLE
// En el enunciado se pide establecer un coste de envio para los productos físicps
private double costesEnvio;

// CONSTRUCTOR
public productoFisico(double costesEnvio, String nombre, String descripcion, int numSerie, double precioInicial)
{
super(nombre, descripcion, numSerie, precioInicial);
this.costesEnvio = costesEnvio;
}

// MÉTODOS GET Y SET: los costes de envio  pueden necesitar ser cambiados asi que aqui si añadimos un set
public double getCostesEnvio() 
{
return costesEnvio;
}

public void setCostesEnvio(double costesEnvio) 
{
this.costesEnvio = costesEnvio;
}

// MÉTODO PARA EL PRECIO CON ENVIO
public double calcularElPrecioFinal() 
{
double precioConEnvio=0.0;
precioConEnvio=getPrecioInicial() + this.costesEnvio;
return precioConEnvio;
}
}
