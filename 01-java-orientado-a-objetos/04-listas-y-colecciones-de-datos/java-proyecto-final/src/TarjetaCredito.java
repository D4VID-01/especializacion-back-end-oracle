import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito{

    private double limite;

    private double saldo;

    private List<Compra>listaDeCompras;

    public TarjetaCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra){
        if (this.saldo >= compra.getPrecio()) {
            this.saldo -= compra.getPrecio();
            this.listaDeCompras.add(compra);
            return true;
        }

        return false;
    }

    public double total(){
        return this.limite - this.saldo;
    }

    public double getSaldo() {

        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
