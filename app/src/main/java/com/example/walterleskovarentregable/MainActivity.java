package com.example.walterleskovarentregable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.walterleskovarentregable.dao.DBRecetas;
import com.example.walterleskovarentregable.model.ItemReceta;
import com.example.walterleskovarentregable.view.AboutUsFragment;
import com.example.walterleskovarentregable.view.DetalleRecetaFragment;
import com.example.walterleskovarentregable.view.FragmentMain;
import com.example.walterleskovarentregable.view.RecetasFragment;
import com.example.walterleskovarentregable.view.SegundaActivity;
import com.google.android.material.navigation.NavigationView;

import java.io.Serializable;

import static com.example.walterleskovarentregable.view.DetalleRecetaFragment.RECETA;
import static com.example.walterleskovarentregable.view.SegundaActivity.RECETAS_DATOS;

public class MainActivity extends AppCompatActivity implements RecetasFragment.NotificadorActividades{

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // parte para incluir el fragment_main
        FragmentMain fragmentMain = new FragmentMain();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction unfragmentTransaction = fragmentManager.beginTransaction();
        unfragmentTransaction.replace(R.id.contenedorFragment, fragmentMain);
        unfragmentTransaction.commit();

        // parte para gestionar el NavigationView
        NavigationView navigationView = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                itemSeleccionado(itemId);
                return false;
            }
        });

    }

    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawers();
        }else {
            super.onBackPressed();
        }
    }

    public void itemSeleccionado(int itemId){
        switch (itemId){
            case R.id.menu1:
                fragmentReceta();
                break;
            case R.id.menu2:
                fragmentAboutUs();
                break;
            default:
                Toast.makeText(MainActivity.this, "NADA", Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawers();
    }

    private void fragmentReceta(){
        // parte para incluir el fragment_receta
        RecetasFragment recetasFragment = new RecetasFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction unfragmentTransaction = fragmentManager.beginTransaction();
        unfragmentTransaction.replace(R.id.contenedorFragment, recetasFragment);
        unfragmentTransaction.commit();
    }

    private void fragmentAboutUs(){
        // parte para incluir el fragment_about_us
        AboutUsFragment aboutUsFragment = new AboutUsFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction unfragmentTransaction = fragmentManager.beginTransaction();
        unfragmentTransaction.replace(R.id.contenedorFragment, aboutUsFragment);
        unfragmentTransaction.commit();
    }

    @Override
    public void recibirMensaje(DBRecetas dbRecetas) {
        // cambiar a la segunda actividad
        Intent unItent = new Intent(MainActivity.this, SegundaActivity.class);
        Bundle unBundle = new Bundle();
        unBundle.putSerializable(RECETAS_DATOS, (Serializable) dbRecetas);
        unItent.putExtras(unBundle);
        startActivity(unItent);


        //fragmentDetalleReceta(itemReceta);

    }

    /*private void fragmentDetalleReceta(ItemReceta itemReceta){
        // parte para incluir el fragment_detalle_receta

        Bundle unBundle = new Bundle();
        // cargo en el bundle el objeto itemReceta por eso uso Serializable
        unBundle.putSerializable(RECETA, (Serializable) itemReceta);

        DetalleRecetaFragment detalleRecetaFragment = new DetalleRecetaFragment();

        detalleRecetaFragment.setArguments(unBundle);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction unfragmentTransaction = fragmentManager.beginTransaction();
        unfragmentTransaction.replace(R.id.contenedorFragment, detalleRecetaFragment);
        unfragmentTransaction.commit();
    }*/
}
