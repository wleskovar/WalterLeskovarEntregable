package com.example.walterleskovarentregable.view;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.walterleskovarentregable.dao.DBRecetas;
import com.example.walterleskovarentregable.model.ItemReceta;

import java.util.ArrayList;
import java.util.List;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<ItemReceta> unaListaDeItemReceta;
    private List<DetalleRecetaFragment> unaListaDeDetalleREcetaFragment;


    public ViewPagerAdapter(FragmentManager fm, DBRecetas dbRecetas) {
        super(fm);
        this.unaListaDeItemReceta = dbRecetas.getUnaListaDeRecetas();

        //genero el listado de fragment en forma dinamica segun la cantidad de recetas en la lista
        this.unaListaDeDetalleREcetaFragment = new ArrayList<>();
        for (ItemReceta receta: unaListaDeItemReceta) {
            this.unaListaDeDetalleREcetaFragment.add(DetalleRecetaFragment.newInstance(receta));
        }
    }

    @Override
    public Fragment getItem(int position) {
        return unaListaDeDetalleREcetaFragment.get(position);
    }

    @Override
    public int getCount() {
        return this.unaListaDeDetalleREcetaFragment.size();
    }
}
