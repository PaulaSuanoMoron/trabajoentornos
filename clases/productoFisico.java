package clases;

public class productoFisico extends producto
{
    
// VARIABLE
// En el enunciado se pide establecer un coste de envio para los productos físicps
private double costesEnvio;

// CONSTRUCTOR
public productoFisico(double costesEnvio, String nombre, String descripcion, int numSerie, int stock, double precioInicial)
{
super(nombre, descripcion, numSerie, stock, precioInicial);
this.costesEnvio = costesEnvio;
}

// MÉTODOS GET Y SET: los costes de envio al igual que los precios pueden necesitar ser cambiados asi que aqui si añadimos un set
public double getCostesEnvio() 
{
return costesEnvio;
}

public void setCostesEnvio(double costesEnvio) 
{
this.costesEnvio = costesEnvio;
}

// MÉTODO PARA EL PRECIO CON ENVIO
public double calcularPrecioFinal() 
{
return getPrecioInicial() + this.costesEnvio;
}
}
