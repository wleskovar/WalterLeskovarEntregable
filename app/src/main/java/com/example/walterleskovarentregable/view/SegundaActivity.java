package com.example.walterleskovarentregable.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import com.example.walterleskovarentregable.R;
import com.example.walterleskovarentregable.dao.DBRecetas;

public class SegundaActivity extends AppCompatActivity {

    public static final String RECETAS_DATOS = "receta_datos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent unIntentRecibido = getIntent();
        Bundle unBundleRecibido = unIntentRecibido.getExtras();
        // DBRecetas dbRecetas = (DBRecetas) unBundleRecibido.get(RECETAS_DATOS);


        // parte para incluir el fragment_segunda_fragment_main
        SegundaFragmentMain segundaFragmentMain = new SegundaFragmentMain();

        // paso la informacion recibida al fragment
        segundaFragmentMain.setArguments(unBundleRecibido);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction unfragmentTransaction = fragmentManager.beginTransaction();
        unfragmentTransaction.replace(R.id.contenedorSegundaFragment, segundaFragmentMain);
        unfragmentTransaction.commit();
    }
}
