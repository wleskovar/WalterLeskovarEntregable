package com.example.walterleskovarentregable.view;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.walterleskovarentregable.R;
import com.example.walterleskovarentregable.dao.DBRecetas;
import com.example.walterleskovarentregable.model.ItemReceta;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecetasFragment extends Fragment implements CeldaRecyclerViewAdapter.InformarSeleccion{

    private ItemReceta itemReceta;
    private NotificadorActividades notificador;
    private ItemTouchHelper itemTouchHelper;
    private DBRecetas dbRecetas;


    public RecetasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_recetas, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewRecetas);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        dbRecetas = new DBRecetas();

        final CeldaRecyclerViewAdapter celdaRecyclerViewAdapter = new CeldaRecyclerViewAdapter(dbRecetas.obtenerListadoDeRecetas(), this, view);
        recyclerView.setAdapter(celdaRecyclerViewAdapter);

        PantallaAccion.EventosCallback callback = new PantallaAccion.EventosCallback() {
            @Override
            public void onItemMove(int initialPosition, int finalPosition) {
                celdaRecyclerViewAdapter.onItemMove(initialPosition, finalPosition);

            }

            @Override
            public void removeItem(int position) {
                celdaRecyclerViewAdapter.removeItem(position);

            }
        };
        ItemTouchHelper androdItemTouchHelper = new ItemTouchHelper(new PantallaAccion(callback));
        androdItemTouchHelper.attachToRecyclerView(recyclerView);
        return view;

    }

    @Override
    public void informarSeleccion(ItemReceta itemReceta) {
        this.itemReceta = itemReceta;
        this.itemReceta.setVerDetalleReceta(true);
        notificador.recibirMensaje(dbRecetas);

    }

    /*
     * La receta seleccionada debe ser mostrada en un detalle.
     * Para esto pasamos la informacion a la actividad y esta se la pasa al fragment detalle
     * para lograr esto creamos una interface
     * */
    public interface NotificadorActividades {
        public void recibirMensaje(DBRecetas dbRecetas);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.notificador = (NotificadorActividades) context;
    }
}
