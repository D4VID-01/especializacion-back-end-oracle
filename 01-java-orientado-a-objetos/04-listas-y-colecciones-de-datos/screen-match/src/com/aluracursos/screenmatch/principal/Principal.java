package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomenacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Sherlock Holmes", 2010);
        miPelicula.setDuracionEnMinutos(160);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.9);
        miPelicula.evalua(7.9);

        System.out.println(miPelicula.getTotalDeLasEvaluaciones());

        System.out.println("Su evaluación actual es: " + miPelicula.calculaMedia());

        System.out.println(); // Espacio
//-------------------------------------------------------------------------------------------------------------

        Serie casaDragon = new Serie("La casa del dragón", 2022 );
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        System.out.println(); // Espacio
//------------------------------------------------------------------------------------------------

        Pelicula otraPelicula = new Pelicula("Harry Potter", 1999);
        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.setIncluidoEnElPlan(true);

        System.out.println(); // Espacio
// --------------------------------------------------------------------------------------------------
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: " + calculadora.getTiempoTotal() + " minutos");

        System.out.println(); // Espacio
//-----------------------------------------------------------
        FiltroRecomenacion filtroRecomenacion =  new FiltroRecomenacion();
        filtroRecomenacion.filtra(miPelicula);

        System.out.println(); // Espacio
 //----------------------------------------------------

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(3);
        filtroRecomenacion.filtra(episodio);

        System.out.println(); // Espacio
//----------------------------------------------------------------

        var peliculaDeDavid = new Pelicula("El señor de los anillos", 2001);
        peliculaDeDavid.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeDavid);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);


        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);

        System.out.println("toStrng de la película: " + listaDePeliculas.get(0).toString());


    }
}
