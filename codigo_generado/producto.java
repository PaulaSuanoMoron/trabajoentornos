package codigo_generado;
public abstract class producto {
    private String nombre;
    private String descripcion;
    private int numSerie;
    private double precioInicial;
    public void producto(String nombre, String descripcion, int numSerie, double precioInicial);
    public String getNombre();
    public String getDescripcion();
    public int getNumSerie();
    public double getPrecioInicial();
    public double calcularElPrecioFinal();
}
