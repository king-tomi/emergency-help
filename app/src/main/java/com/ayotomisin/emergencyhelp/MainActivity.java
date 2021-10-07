package com.ayotomisin.emergencyhelp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.ayotomisin.emergencyhelp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private final ArrayList<String> phone_numbers = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setSupportActionBar(binding.toolbar);

        setContentView(binding.getRoot());

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        navController.setGraph(R.navigation.nav_graph);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        Button help = findViewById(R.id.help);

        SharedPreferences sharedPreferences = getSharedPreferences("numbers", MODE_PRIVATE);

        String phone1 = sharedPreferences.getString(ContactActivity.PHONE_NUMBER1, "");
        String phone2 = sharedPreferences.getString(ContactActivity.PHONE_NUMBER2, "");
        String phone3 = sharedPreferences.getString(ContactActivity.PHONE_NUMBER3, "");

        phone_numbers.add("08090914321");
        phone_numbers.add("08133130185");
        phone_numbers.add("08069159748");

        help.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Random random = new SecureRandom();
               int position = random.nextInt(phone_numbers.size());
               String number = phone_numbers.get(position);

               try{
                   Intent make_call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));
                   startActivity(make_call);
               } catch (Exception e) {
                   System.out.println("Error Occurred");
               }
           }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.add_contact) {
            Intent contacts = new Intent(MainActivity.this, ContactActivity.class);
            startActivity(contacts);
            return true;
        }
        else if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}