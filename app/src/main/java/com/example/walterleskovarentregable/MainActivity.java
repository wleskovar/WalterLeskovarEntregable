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
import static com.example.walterleskovarentregable.view.RecetasFragment.DB_RECETAS;
import static com.example.walterleskovarentregable.view.SegundaActivity.BASEDATOS;
import static com.example.walterleskovarentregable.view.SegundaActivity.RECETAS_DATOS;

public class MainActivity extends AppCompatActivity implements RecetasFragment.NotificadorActividades{

    private DrawerLayout drawerLayout;
    private DBRecetas dbRecetas = new DBRecetas();



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

        // genero el contenido de la lista de recetas
        dbRecetas.obtenerListadoDeRecetas();


        Bundle bundle = new Bundle();
        bundle.putSerializable(DB_RECETAS, dbRecetas);

        RecetasFragment recetasFragment = new RecetasFragment();
        recetasFragment.setArguments(bundle);
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
    public void recibirMensaje(ItemReceta itemReceta) {
        // recibo el itemReceta seleccionado y pongo en verdadero el atributo verDetalleReceta
        itemReceta.setVerDetalleReceta(true);

        // cambiar a la segunda actividad
        Intent unItent = new Intent(MainActivity.this, SegundaActivity.class);
        Bundle unBundle = new Bundle();

        // cargo al Bunble el objeto con el listado de recetas y el itemReceta seleccionado
        unBundle.putSerializable(BASEDATOS, dbRecetas);
        //unBundle.putSerializable(RECETAS_DATOS, (Serializable) itemReceta);
        unItent.putExtras(unBundle);
        startActivity(unItent);
    }


}
