package com.example.citra.projek_konveksi;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class distro extends AppCompatActivity {

    private DrawerLayout draw;
    private ActionBarDrawerToggle toggle;

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distro);

        setTitle("Distro");

        //buat action barnya
        toolbar= findViewById(R.id.nav_action);
        setSupportActionBar(toolbar);

        //membuat sidebar -start-
        draw = findViewById(R.id.drawerLayout);
        toggle = new ActionBarDrawerToggle(this, draw,R.string.open,R.string.close);

        draw.addDrawerListener(toggle);
        toggle.syncState();
        //-end-

        //membuat icon sidebar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //agar icon dipencet keluar sidebar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
