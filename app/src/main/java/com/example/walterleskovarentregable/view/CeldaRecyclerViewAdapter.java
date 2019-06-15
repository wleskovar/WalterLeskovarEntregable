package com.example.walterleskovarentregable.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.walterleskovarentregable.R;
import com.example.walterleskovarentregable.model.ItemReceta;

import java.util.List;

public class CeldaRecyclerViewAdapter extends RecyclerView.Adapter {

    private List<ItemReceta> unaListaItemReceta;
    private InformarSeleccion objetoInformarSeleccion;

    public CeldaRecyclerViewAdapter(List<ItemReceta> unaListaItemReceta, InformarSeleccion objetoInformarSeleccion ) {
        this.unaListaItemReceta = unaListaItemReceta;
        this.objetoInformarSeleccion = objetoInformarSeleccion;
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

        public void binCeldaRecyclerView(ItemReceta itemReceta){
            this.itemReceta = itemReceta;
            this.imagenItemViewItem.setImageResource(this.itemReceta.getFotoReceta());
            this.tituloItemTextView.setText(this.itemReceta.getTituloReceta());
            this.tipoItemTextView.setText(this.itemReceta.getTipoDeReceta());
        }

    }

    public interface InformarSeleccion {
        public void informarSeleccion(ItemReceta itemReceta);
    }

}
