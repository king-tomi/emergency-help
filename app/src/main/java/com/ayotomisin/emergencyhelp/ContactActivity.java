package com.ayotomisin.emergencyhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.PublicKey;
import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {
    public static final  String PHONE_NUMBER1 = "com.ayotomisin.emergencyhelp.PHONE_NUMBER1";
    public static final  String PHONE_NUMBER2 = "com.ayotomisin.emergencyhelp.PHONE_NUMBER2";
    public static final  String PHONE_NUMBER3 = "com.ayotomisin.emergencyhelp.PHONE_NUMBER3";
    private EditText phone1;
    private EditText phone2;
    private EditText phone3;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact2);

        phone1 = findViewById(R.id.phone1);
        phone2 = findViewById(R.id.phone2);
        phone3 = findViewById(R.id.phone3);
        save = findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("numbers", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(PHONE_NUMBER1, phone1.getText().toString());
                editor.putString(PHONE_NUMBER2, phone2.getText().toString());
                editor.putString(PHONE_NUMBER3, phone3.getText().toString());

                editor.apply();

                phone1.setText("");
                phone2.setText("");
                phone3.setText("");
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences("numbers", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PHONE_NUMBER1, phone1.getText().toString());
        editor.putString(PHONE_NUMBER2, phone2.getText().toString());
        editor.putString(PHONE_NUMBER3, phone3.getText().toString());

        editor.apply();
    }
}