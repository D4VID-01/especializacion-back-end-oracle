package com.aluracursos.screenmatch.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos {
    /*
     * ObjectMapper:
     * clase principal de Jackson para convertir entre objetos Java
     * y JSON. Permite serializar objetos Java a JSON y deserializar JSON a objetos Java,
     * con múltiples opciones de configuración para personalizar el proceso.
     *
     * readValue:
     *  método de ObjectMapper que deserializa una cadena JSON
     * (o fuente de datos JSON) y la convierte en un objeto Java del tipo especificado.
     * Es la forma principal de transformar JSON en objetos Java.
     */
    private ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return  objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
