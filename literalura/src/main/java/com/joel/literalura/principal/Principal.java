package com.joel.literalura.principal;

import java.util.Scanner;

import com.joel.literalura.model.Datos;
import com.joel.literalura.service.ConsumoAPI;
import com.joel.literalura.service.ConvierteDatos;

public class Principal {
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);
    public void muestraMenu(){
        // var json = consumoAPI.obtenerDatos(URL_BASE);
        // System.out.println(json);
        // var datos = conversor.obtenerDatos(json, Datos.class);
        // System.out.println(datos);
        
        
    }
}
