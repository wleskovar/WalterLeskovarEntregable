package com.example.walterleskovarentregable.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.walterleskovarentregable.R;
import com.example.walterleskovarentregable.dao.DBRecetas;
import com.example.walterleskovarentregable.model.ItemReceta;

import java.io.Serializable;
import java.util.List;

public class SegundaActivity extends AppCompatActivity {

    public static final String INDICE = "indice";
    public static final String BASEDATOS = "base_datos";
    private DBRecetas dbRecetas;
    private int posicionDeLaReceta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent unIntentRecibido = getIntent();
        Bundle unBundleRecibido = unIntentRecibido.getExtras();
        dbRecetas = (DBRecetas) unBundleRecibido.get(BASEDATOS);
        posicionDeLaReceta = (int) unBundleRecibido.get(INDICE);

        // Implementacion del ViewPager

        ViewPager viewPager = findViewById(R.id.contenedor_viewPager);
        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(50);
        viewPager.setOffscreenPageLimit(2);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), dbRecetas );
        viewPager.setAdapter(adapter);

        viewPager.setCurrentItem(posicionDeLaReceta); // debe llegar la posicion desde el MainActivity
    }

}
