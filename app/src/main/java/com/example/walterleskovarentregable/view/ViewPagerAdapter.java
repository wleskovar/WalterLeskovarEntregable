package com.example.walterleskovarentregable.view;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.walterleskovarentregable.model.ItemReceta;

import java.util.List;

import static com.example.walterleskovarentregable.view.SegundaActivity.DB;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<ItemReceta> unaListaDeItemReceta;


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.unaListaDeItemReceta = DB.getUnaListaDeRecetas();
    }

    @Override
    public Fragment getItem(int position) {
        return DetalleRecetaFragment.newInstance(unaListaDeItemReceta.get(position));
    }

    @Override
    public int getCount() {
        return this.unaListaDeItemReceta.size();
    }
}
