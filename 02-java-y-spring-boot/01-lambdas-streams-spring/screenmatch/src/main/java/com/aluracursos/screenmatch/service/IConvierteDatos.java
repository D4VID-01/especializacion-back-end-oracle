package com.aluracursos.screenmatch.service;

public interface IConvierteDatos {
    /*
     * Método que recibe un JSON en forma de String y la clase del tipo T,
     * y devuelve un objeto de tipo T deserializado desde ese JSON.
     * Permite convertir datos JSON en objetos Java de forma flexible.
     */
    <T> T obtenerDatos(String json, Class<T> clase);
}
