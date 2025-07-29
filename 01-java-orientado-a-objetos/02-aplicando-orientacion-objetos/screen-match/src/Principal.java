import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomenacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Sherlock Holmes");
        miPelicula.setFechaDeLanzamiento(2010);
        miPelicula.setDuracionEnMinutos(160);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.9);
        miPelicula.evalua(7.9);

        System.out.println(miPelicula.getTotalDeLasEvaluaciones());

        System.out.println("Su evaluación actual es: " + miPelicula.calculaMedia());


//-------------------------------------------------------------------------------------------------------------

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

//------------------------------------------------------------------------------------------------

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Harry Potter");
        otraPelicula.setFechaDeLanzamiento(1999);
        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.setIncluidoEnElPlan(true);


// --------------------------------------------------------------------------------------------------
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: " + calculadora.getTiempoTotal() + " minutos");

//-----------------------------------------------------------
        FiltroRecomenacion filtroRecomenacion =  new FiltroRecomenacion();
        filtroRecomenacion.filtra(miPelicula);

 //----------------------------------------------------

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(3);

        filtroRecomenacion.filtra(episodio);

    }
}
