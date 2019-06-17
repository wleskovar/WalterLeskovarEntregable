package com.example.walterleskovarentregable.dao;


import com.example.walterleskovarentregable.R;
import com.example.walterleskovarentregable.model.ItemReceta;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DBRecetas implements Serializable {

    private List<ItemReceta> unaListaDeRecetas;

    public DBRecetas() {
        this.unaListaDeRecetas = new ArrayList<>();
    }

    public List<ItemReceta> obtenerListadoDeRecetas(){
        // cargo la lista con las recetas
        this.unaListaDeRecetas.add(new ItemReceta("Receta del bizcocho de leche evaporada caliente","Dulce", R.drawable.bizcocho_caliente, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Bocados de huevo y bonito","Salado", R.drawable.bocados_huevo_bonito, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Bollitos de chocolate clasicos","Dulce", R.drawable.bollitos_de_chocolate_clasicos_bollycaos, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Brownie cheesecake","Dulce", R.drawable.brownie_cheesecake, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Ensalada de berenjenas","Ensalada", R.drawable.ensalada_berenjena, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Ensalada de papas y pesto","Ensalada", R.drawable.ensalada_patata_pesto, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Ensalada de salmon y mango","Ensalada", R.drawable.ensalada_salmon_mango, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Tortilla de rucula","Tortilla", R.drawable.tortilla_rucula, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Ensalada de tirabeques y vieiras","Ensalada", R.drawable.ensalada_tirabeques_vieiras, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Pisto de calabacin","Salado", R.drawable.pisto_calabacin, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Pan de aceite","Pan", R.drawable.pan_de_aceite, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Panetone miniatura","Pan", R.drawable.panettone_miniatura, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Papas rellenas de berenjena","Salado", R.drawable.patatas_rellenas_berenjena, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Revuelto de criadillas de la tierra","Salado", R.drawable.revuelto_criadillas_tierra, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));
        this.unaListaDeRecetas.add(new ItemReceta("Tortilla de papas gratinadas","Salado", R.drawable.tortilla_patatas_gratinada, "5 huevos\n200 g de azúcar.\n120 g de aceite de oliva virgen extra.\n200 g de leche evaporada.\nLa ralladura de una piel de mandarina o limón\n250 g de harina normal.\n12 g de levadura de repostería o polvos de hornear\nUna pizca de sal.","1. Precalienta el horno a 180ºC, calor arriba y abajo.\n2. Engrasa tu molde y espolvorea una pizca de harina con la ayuda de un colador bien repartida por todo el molde.\n3. Bate los huevos, la sal y el azúcar durante 5 minutos con unas varillas o ayudándote con una máquina de varillas, y reserva.\n4. Pon la leche evaporada en un cazo junto con el aceite. Justo antes de que comience a hervir retira del fuego y remueve con unas varillas. Añade esta mezcla a los huevos y el azúcar sin dejar de batir, poco a poco.\n5. Tamiza la harina y añádela a la masa junto con la levadura, no de una vez, sino de tres o cuatro veces, incorpora la ralladura de limón y de naranja y remueve lo justo para que se integre toda la masa.\n6. Vierte la masa en el molde. Levanta el molde un par de centímetros y golpea suavemente contra la encimera. Repite de nuevo este proceso que te ayudará a eliminar las burbujas de aire."));

        return unaListaDeRecetas;
    }
}
