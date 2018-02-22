package com.example.aspirev.selki;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView =null ;
    Toolbar toolbar =null ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment fragment = new MainFragment();
        android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
        FragmentTransaction.replace(R.id.fragment_container,fragment);
        FragmentTransaction.commit();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.avenir) {
            // Handle the camera action
        } else if (id == R.id.avisrec) {

        } else if (id == R.id.map) {
            MainFragment fragment = new MainFragment();
            android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
            FragmentTransaction.replace(R.id.fragment_container,fragment);
            FragmentTransaction.commit();
        } else if (id == R.id.infperso) {

        } else if (id == R.id.map) {
            AvisRecuFragment fragment = new AvisRecuFragment();
            android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
            FragmentTransaction.replace(R.id.fragment_container,fragment);
            FragmentTransaction.commit();
        } else if (id == R.id.infperso) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
