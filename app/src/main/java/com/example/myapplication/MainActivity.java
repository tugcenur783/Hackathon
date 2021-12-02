package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    EditText edt4, edt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button kayitol = findViewById(R.id.kayitol);
        Button giris = findViewById(R.id.giris);

        kayitol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,kaydol.class);
                startActivity(intent);
            }
        });
        edt4 = (EditText) findViewById(R.id.editTextTextPersonName);
        edt5 = (EditText) findViewById(R.id.editTextTextPersonName2);

        giris.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String e_mail = edt4.getText().toString();
                String password = edt5.getText().toString();

                if (v.getId() == giris.getId()) {
                    if (e_mail.length() == 0) {
                        edt4.requestFocus();
                        edt4.setError("Mail alani bos bırakilamaz.");
                    } else if (password.length() == 0) {
                        edt5.requestFocus();
                        edt5.setError("Password alani bos bırakilamaz.");
                    } else {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                }
            }
        });
        }




    @Override
    public void onClick(View v) {

    }
}