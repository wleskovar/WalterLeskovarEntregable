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

    private TextView tituloReceta;
    private TextView tipoReceta;
    private ImageView fotoReceta;
    private TextView ingredienteReceta;
    private TextView preparacionReceeta;


    public DetalleRecetaFragment() {
        // Required empty public constructor
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
        ItemReceta itemReceta = (ItemReceta) unBundleRecibido.get(RECETA);

        tituloReceta.setText(itemReceta.getTituloReceta());
        tipoReceta.setText(itemReceta.getTipoDeReceta());
        fotoReceta.setImageResource(itemReceta.getFotoReceta());
        ingredienteReceta.setText(itemReceta.getIngredientesrecta());
        preparacionReceeta.setText(itemReceta.getPreparacionReceta());

        return view;
    }

}
