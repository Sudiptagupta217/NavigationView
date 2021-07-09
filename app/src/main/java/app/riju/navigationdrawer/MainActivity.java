package app.riju.navigationdrawer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    DrawerLayout drawer;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer =  findViewById(R.id.drawer_layout);
        navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(MainActivity.this);

        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.drawable.ic_baseline_menu_24);

        //set right icon
        navigationView.getMenu().getItem(1).setActionView(R.layout.menu_image);
        navigationView.getMenu().getItem(2).setActionView(R.layout.menu_image);

    }


    @SuppressLint("WrongConstant")
   // @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_Profile) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            finish();


        } else if (id == R.id.nav_Product) {
            navigationView.getMenu().clear(); //clear old inflated items.
            navigationView.inflateMenu(R.menu.producte_menu);
            navigationView.setNavigationItemSelectedListener(this);

        } else if (id == R.id.nav_Resources) {
            navigationView.getMenu().clear(); //clear old inflated items.
            navigationView.inflateMenu(R.menu.resource_menu);
            navigationView.setNavigationItemSelectedListener(this);

        } else if (id == R.id.nav_Events) {


        } else if (id == R.id.nav_Blogs) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_Case_Studies) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_Privacy) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_ContactUs) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_Logout) {

        } else if (id == R.id.nav_BackPress) {
            navigationView.getMenu().clear(); //clear old inflated items.
            navigationView.inflateMenu(R.menu.activity_home_drawer);
            navigationView.getMenu().getItem(1).setActionView(R.layout.menu_image);
            navigationView.getMenu().getItem(2).setActionView(R.layout.menu_image);
            navigationView.setNavigationItemSelectedListener(this);

        } else if (id == R.id.nav_Cloud_service) {


        } else if (id == R.id.nav_Public_Cloud) {


        } else if (id == R.id.nav_Private_Cloud) {


        } else if (id == R.id.nav_Multi_Cloud) {


        } else if (id == R.id.nav_Migration) {


        } else if (id == R.id.nav_BackPress1) {
            navigationView.getMenu().clear(); //clear old inflated items.
            navigationView.inflateMenu(R.menu.activity_home_drawer);
            navigationView.getMenu().getItem(1).setActionView(R.layout.menu_image);
            navigationView.getMenu().getItem(2).setActionView(R.layout.menu_image);
            navigationView.setNavigationItemSelectedListener(this);

        } else if (id == R.id.nav_ARTICLE) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            finish();


        } else if (id == R.id.nav_BLOGS) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_WEBINER_SESSIONS) {


        } else if (id == R.id.nav_Multi_CASE_STUDIES) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_VIDEO) {

        }

//        drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
//        if (!drawer.isDrawerOpen(GravityCompat.START))
            drawer.openDrawer(GravityCompat.START);
      //  else drawer.closeDrawer(GravityCompat.END);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
//        Intent i= new Intent(MainActivity.this,MainActivity.class);
//        startActivity(i);
//        finish();
//        Intent intent = new Intent(this, MainActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        startActivity(intent);

    }
}