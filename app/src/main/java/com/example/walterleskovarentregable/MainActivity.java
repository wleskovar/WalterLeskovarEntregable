package com.example.walterleskovarentregable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.walterleskovarentregable.R;
import com.example.walterleskovarentregable.view.AboutUsFragment;
import com.example.walterleskovarentregable.view.FragmentMain;
import com.example.walterleskovarentregable.view.RecetasFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

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
                Toast.makeText(MainActivity.this, "Menu 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                fragmentAboutUs();
                Toast.makeText(MainActivity.this, "Menu 2", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(MainActivity.this, "NADA", Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawers();
    }

    public void fragmentReceta(){
        // parte para incluir el fragment_receta
        RecetasFragment recetasFragment = new RecetasFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction unfragmentTransaction = fragmentManager.beginTransaction();
        unfragmentTransaction.replace(R.id.contenedorFragment, recetasFragment);
        unfragmentTransaction.commit();
    }

    public void fragmentAboutUs(){
        // parte para incluir el fragment_receta
        AboutUsFragment aboutUsFragment = new AboutUsFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction unfragmentTransaction = fragmentManager.beginTransaction();
        unfragmentTransaction.replace(R.id.contenedorFragment, aboutUsFragment);
        unfragmentTransaction.commit();
    }
}
