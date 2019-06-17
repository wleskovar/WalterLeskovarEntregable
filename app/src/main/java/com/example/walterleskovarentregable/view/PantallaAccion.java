package com.example.walterleskovarentregable.view;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

public class PantallaAccion extends ItemTouchHelper.Callback {

    private EventosCallback callback;

    public PantallaAccion(EventosCallback callback) {
        this.callback = callback;
    }

    @Override
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override
    public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        int dragFlags = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
        int swiperFlags = ItemTouchHelper.END | ItemTouchHelper.START;
        return makeMovementFlags(dragFlags, swiperFlags);
    }

    @Override
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
        callback.onItemMove(viewHolder.getAdapterPosition(), target.getAdapterPosition());
        return true;
    }

    @Override
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
        callback.removeItem(viewHolder.getAdapterPosition());

    }

    public interface EventosCallback {
        void onItemMove(int initialPosition, int finalPosition);
        void removeItem(int position);
    }
}
