public class Compra implements Comparable<Compra> {

    private String nombre;

    private double precio;

    public Compra(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Compra: precio =" + precio +
                ", nombre: " + nombre;
    }

    @Override
    public int compareTo(Compra otroProducto) {
        return Double.valueOf(this.getPrecio()).compareTo(Double.valueOf(otroProducto.getPrecio()));
    }
}
