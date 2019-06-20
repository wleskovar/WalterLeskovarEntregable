package com.example.walterleskovarentregable.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.walterleskovarentregable.R;
import com.example.walterleskovarentregable.model.ItemReceta;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleRecetaFragment extends Fragment {

    public static final String RECETA = "receta";

    public final static String TITULO = "titulo";
    public final static String TIPO = "tipo";
    public final static String FOTO = "foto";
    public final static String INGREDIENTE = "ingrediente";
    public final static String PREPARACION = "preparacion";


    private TextView tituloReceta;
    private TextView tipoReceta;
    private ImageView fotoReceta;
    private TextView ingredienteReceta;
    private TextView preparacionReceeta;


    public DetalleRecetaFragment() {
        // Required empty public constructor


        // se implementa el patron de diseño FACTORY para poder generar los FRAGMENT en forma dinamica
        // de pasa a travez del BUNDLE la información para que cuando se genera el FRAGMENT reciba la información
    }

    public static DetalleRecetaFragment newInstance(ItemReceta itemReceta) {
        DetalleRecetaFragment detalleRecetaFragment = new DetalleRecetaFragment();
        Bundle unBundle = new Bundle();
        unBundle.putString(detalleRecetaFragment.TITULO, itemReceta.getTituloReceta());
        unBundle.putString(detalleRecetaFragment.TIPO, itemReceta.getTipoDeReceta());
        unBundle.putInt(detalleRecetaFragment.FOTO, itemReceta.getFotoReceta());
        unBundle.putString(detalleRecetaFragment.INGREDIENTE, itemReceta.getIngredientesrecta());
        unBundle.putString(detalleRecetaFragment.PREPARACION, itemReceta.getPreparacionReceta());

        detalleRecetaFragment.setArguments(unBundle);

        return detalleRecetaFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_receta, container, false);

        tituloReceta = view.findViewById(R.id.tituloDetalleTextView);
        tipoReceta = view.findViewById(R.id.tipoDetalleTextView);
        fotoReceta = view.findViewById(R.id.imagenDetalleImageView);
        ingredienteReceta = view.findViewById(R.id.ingredienteDetalleTextView);
        preparacionReceeta = view.findViewById(R.id.preparacionDetalleTextView);

        // obtego el objeto itemReceta que viene en el Bundle
        Bundle unBundleRecibido = getArguments();

        tituloReceta.setText(unBundleRecibido.getString(TITULO));
        tipoReceta.setText(unBundleRecibido.getString(TIPO));
        fotoReceta.setImageResource(unBundleRecibido.getInt(FOTO));
        ingredienteReceta.setText(unBundleRecibido.getString(INGREDIENTE));
        preparacionReceeta.setText(unBundleRecibido.getString(PREPARACION));

        return view;
    }

}
