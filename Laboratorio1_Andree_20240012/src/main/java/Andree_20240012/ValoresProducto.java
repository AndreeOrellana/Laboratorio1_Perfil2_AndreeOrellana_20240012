package Andree_20240012;

public class ValoresProducto {

    private String nombreProducto;
    private double precioProducto;

    public ValoresProducto(String NombreProducto, double PrecioProducto){
        this.nombreProducto = NombreProducto;
        this.precioProducto = PrecioProducto;
    }

    public String getNombre(){
        return nombreProducto;
    }

    public double getPrecio(){
        return precioProducto;
    }
}
