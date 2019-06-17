package com.example.walterleskovarentregable.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.walterleskovarentregable.R;
import com.example.walterleskovarentregable.model.ItemReceta;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.Collections;
import java.util.List;

public class CeldaRecyclerViewAdapter extends RecyclerView.Adapter {

    private List<ItemReceta> unaListaItemReceta;
    private InformarSeleccion objetoInformarSeleccion;
    private View recetaFragmentView;

    public CeldaRecyclerViewAdapter(List<ItemReceta> unaListaItemReceta, InformarSeleccion objetoInformarSeleccion, View recetaFragmentView) {
        this.unaListaItemReceta = unaListaItemReceta;
        this.objetoInformarSeleccion = objetoInformarSeleccion;
        this.recetaFragmentView = recetaFragmentView;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.celda_recycler_iew, parent, false);
        CeldaRecyclerView_ViewHolder celdaRecyclerView_viewHolder = new CeldaRecyclerView_ViewHolder(view);
        return celdaRecyclerView_viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemReceta unaCeldaDeLaLista = this.unaListaItemReceta.get(position);
        CeldaRecyclerView_ViewHolder celdaRecyclerView_viewHolder = (CeldaRecyclerView_ViewHolder) holder;
        celdaRecyclerView_viewHolder.binCeldaRecyclerView(unaCeldaDeLaLista);


    }

    @Override
    public int getItemCount() {
        return this.unaListaItemReceta.size();
    }

    private class CeldaRecyclerView_ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imagenItemViewItem;
        private TextView tituloItemTextView;
        private TextView tipoItemTextView;
        private ItemReceta itemReceta;

        public CeldaRecyclerView_ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagenItemViewItem = itemView.findViewById(R.id.imagenItemViewItem);
            tituloItemTextView = itemView.findViewById(R.id.tituloItemTextView);
            tipoItemTextView = itemView.findViewById(R.id.tipoItemTextView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    objetoInformarSeleccion.informarSeleccion(unaListaItemReceta.get(getAdapterPosition()));
                }
            });
        }

        public void binCeldaRecyclerView(ItemReceta itemReceta) {
            this.itemReceta = itemReceta;
            this.imagenItemViewItem.setImageResource(this.itemReceta.getFotoReceta());
            this.tituloItemTextView.setText(this.itemReceta.getTituloReceta());
            this.tipoItemTextView.setText(this.itemReceta.getTipoDeReceta());
        }

    }

    public interface InformarSeleccion {
        public void informarSeleccion(ItemReceta itemReceta);
    }

    public void onItemMove(int initialPosition, int finalPosition) {
        if (initialPosition < unaListaItemReceta.size() && finalPosition < unaListaItemReceta.size()) {
            if (initialPosition < finalPosition) {

                for (int i = initialPosition; i < finalPosition; i++) {
                    // Collections.swap cambia los elementos en la lista
                    Collections.swap(unaListaItemReceta, i, i + 1);
                }

            } else {
                for (int i = initialPosition; i > finalPosition; i--) {
                    Collections.swap(unaListaItemReceta, i, i - 1);
                }
            }
            // mueve los elementos, los cambia en forma interna en la lista, falta actualizar la vista
            notifyItemMoved(initialPosition, finalPosition);
        }

    }

    public void removeItem(final int position) {
        Snackbar.make(recetaFragmentView.findViewById(R.id.recyclerView), "Esta seguro de eliminar?", Snackbar.LENGTH_LONG)
                .setAction("Borrar item", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        unaListaItemReceta.remove(position);
                        notifyItemRemoved(position);

                    }
                }).addCallback(new BaseTransientBottomBar.BaseCallback<Snackbar>() {
            @Override
            public void onDismissed(Snackbar transientBottomBar, int event) {
                super.onDismissed(transientBottomBar, event);
                notifyItemChanged(position);
            }
        }).show();


    }
}
