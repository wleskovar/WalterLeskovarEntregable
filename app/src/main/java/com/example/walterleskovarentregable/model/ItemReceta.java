package com.example.walterleskovarentregable.model;

import java.io.Serializable;

public class ItemReceta implements Serializable {
    private String tituloReceta;
    private String tipoDeReceta;
    private Integer fotoReceta;
    private String ingredientesrecta;
    private String preparacionReceta;

    // constructor vacio por si hay una futura implementacion

    public ItemReceta(){

    }

    // constructor donde se pasan como parametros los atributos de la clase ItemLista

    public ItemReceta(String tituloReceta, String tipoDeReceta, Integer fotoReceta, String ingredientesrecta, String preparacionReceta) {
        this.tituloReceta = tituloReceta;
        this.tipoDeReceta = tipoDeReceta;
        this.fotoReceta = fotoReceta;
        this.ingredientesrecta = ingredientesrecta;
        this.preparacionReceta = preparacionReceta;
    }

    public String getTituloReceta() {
        return tituloReceta;
    }

    public String getTipoDeReceta() {
        return tipoDeReceta;
    }

    public Integer getFotoReceta() {
        return fotoReceta;
    }

    public String getIngredientesrecta() {
        return ingredientesrecta;
    }

    public String getPreparacionReceta() {
        return preparacionReceta;
    }
}
