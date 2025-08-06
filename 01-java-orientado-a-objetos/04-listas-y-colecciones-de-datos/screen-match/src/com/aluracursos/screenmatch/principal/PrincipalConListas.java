package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Sherlock Holmes", 2010);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Harry Potter", 1999);
        otraPelicula.evalua(6);
        var peliculaDeDavid = new Pelicula("El señor de los anillos", 2001);
        peliculaDeDavid.evalua(10);
        Serie casaDragon = new Serie("La casa del dragón", 2022 );

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeDavid);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println("Nombre: " + item.getNombre());
            if(item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String>listaDeActores = new ArrayList<>();
        listaDeActores.add("Penélope Cruz");
        listaDeActores.add("Antonio Banderas");
        listaDeActores.add("Ricardo Darin");

        System.out.println("Lista de artistas no ordenada: " + listaDeActores);
        Collections.sort(listaDeActores);
        System.out.println("Lista de artistas ordenada: " + listaDeActores);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada. " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista por fecha: " + lista);

    }
}
