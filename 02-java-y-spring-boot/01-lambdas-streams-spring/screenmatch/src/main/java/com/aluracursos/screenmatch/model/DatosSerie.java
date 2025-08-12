package com.aluracursos.screenmatch.model;

/*
 * Jackson: biblioteca Java para serializar (objeto → JSON) y deserializar (JSON → objeto).
 * Ofrece alto rendimiento, soporte para múltiples formatos (JSON, XML, CSV, YAML)
 * y anotaciones avanzadas (@JsonProperty, @JsonAlias, @JsonIgnore, etc.)
 * para personalizar el mapeo entre clases Java y datos JSON.
 */

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*
 * @JsonIgnoreProperties: anotación de Jackson que permite ignorar
 * propiedades JSON desconocidas o específicas durante la deserialización.
 * Útil para evitar errores cuando el JSON tiene campos que no existen en la clase Java.
 */

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosSerie(
        /*
         * @JsonProperty:
         * Anotación de Jackson que especifica el nombre exacto
         * de una propiedad en JSON. Se usa para mapear un campo Java a ese nombre
         * durante la serialización (objeto → JSON) y deserialización (JSON → objeto).
         *
         * @JsonAlias:
         * Anotación de Jackson que permite definir uno o más nombres
         * alternativos para una propiedad solo durante la deserialización.
         * Se usa para aceptar múltiples nombres JSON de entrada que se mapean
         * a un mismo campo Java, sin afectar el nombre usado al serializar.
         */
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalDeTemporadas,
        @JsonAlias("imdbRating") String evaluacion
) {

}
