package com.example.walterleskovarentregable.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.walterleskovarentregable.R;
import com.example.walterleskovarentregable.dao.DBRecetas;
import com.example.walterleskovarentregable.model.ItemReceta;

import java.io.Serializable;

import static com.example.walterleskovarentregable.view.DetalleRecetaFragment.RECETA;
import static com.example.walterleskovarentregable.view.SegundaActivity.RECETAS_DATOS;

/**
 * A simple {@link Fragment} subclass.
 */
public class SegundaFragmentMain extends Fragment {


    public SegundaFragmentMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_segunda_fragment_main, container, false);

        // obtego la lista de recetas que viene en el Bundle
        Bundle unBundleRecibido = getArguments();
        DBRecetas dbRecetas = (DBRecetas) unBundleRecibido.get(RECETAS_DATOS);


        // carga una receta en el fragmente detalle receta. -- ATENCION: para la prueba se tomo el primer elemento
        fragmentDetalleReceta(dbRecetas.obtenerListadoDeRecetas().get(0));

        return view;
    }

    private void fragmentDetalleReceta(ItemReceta itemReceta){
        // parte para incluir el fragment_detalle_receta

        Bundle unBundle = new Bundle();
        // cargo en el bundle el objeto itemReceta por eso uso Serializable
        unBundle.putSerializable(RECETA, (Serializable) itemReceta);

        DetalleRecetaFragment detalleRecetaFragment = new DetalleRecetaFragment();

        // pasa los datos al fragment del detalle
        detalleRecetaFragment.setArguments(unBundle);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction unfragmentTransaction = fragmentManager.beginTransaction();

        // se una como contenedor del detalle el SegundaMainFragment
        unfragmentTransaction.replace(R.id.contenedorSegundaFragment, detalleRecetaFragment);
        unfragmentTransaction.commit();
    }

}
