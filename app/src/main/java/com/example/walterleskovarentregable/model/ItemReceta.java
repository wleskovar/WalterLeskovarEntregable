package com.example.walterleskovarentregable.model;

import java.io.Serializable;

public class ItemReceta implements Serializable {
    private String tituloReceta;
    private String tipoDeReceta;
    private Integer fotoReceta;
    private String ingredientesrecta;
    private String preparacionReceta;
    private boolean verDetalleReceta;

    // constructor vacio por si hay una futura implementacion

    public ItemReceta(){

    }

    // constructor donde se pasan como parametros los atributos de la clase ItemLista

    public void setVerDetalleReceta(boolean verDetalleReceta) {
        this.verDetalleReceta = verDetalleReceta;
    }

    public boolean isVerDetalleReceta() {
        return verDetalleReceta;
    }

    public ItemReceta(String tituloReceta, String tipoDeReceta, Integer fotoReceta, String ingredientesrecta, String preparacionReceta) {
        this.tituloReceta = tituloReceta;
        this.tipoDeReceta = tipoDeReceta;
        this.fotoReceta = fotoReceta;
        this.ingredientesrecta = ingredientesrecta;
        this.preparacionReceta = preparacionReceta;
        this.verDetalleReceta = false;
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
