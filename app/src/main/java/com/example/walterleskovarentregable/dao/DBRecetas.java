package com.example.walterleskovarentregable.dao;


import com.example.walterleskovarentregable.R;
import com.example.walterleskovarentregable.model.ItemReceta;

import java.util.ArrayList;
import java.util.List;

public class DBRecetas {

    private List<ItemReceta> unaListaDeRecetas;

    public DBRecetas() {
        this.unaListaDeRecetas = new ArrayList<>();
    }

    public List<ItemReceta> obtenerListadoDeRecetas(){
        // cargo la lista con las recetas
        this.unaListaDeRecetas.add(new ItemReceta("Receta del bizcocho de leche evaporada caliente","Dulce", R.drawable.bizcocho_caliente, "Ingredientes\n" +
                "5 huevos\n" +
                "200 g de azúcar\n" +
                "120 g de aceite de oliva virgen extra \n" +
                "200 g de leche evaporada —ver consejos—\n" +
                "La ralladura de una piel de mandarina —o limón—\n" +
                "250 g de harina normal \n" +
                "12 g de levadura de repostería o polvos de hornear\n" +
                "Una pizca de sal","Preparación\n1. Precalienta el horno a 180ºC, calor arriba y abajo.\n" +
                "2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n" +
                "\n" +
                "3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n" +
                "\n" +
                "4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n" +
                "\n" +
                "5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n" +
                "\n" +
                "6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));


        return unaListaDeRecetas;
    }
}
