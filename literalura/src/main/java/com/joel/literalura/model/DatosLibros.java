package com.joel.literalura.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibros(
        @JsonAlias("title")String titulo,
        @JsonAlias("authors")List<DatosLibros> autor,
        @JsonAlias("languages")List<String> idiomas,
        @JsonAlias("download_count")Double numeroDeDescargas
) {
}
