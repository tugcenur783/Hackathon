package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ilan extends AppCompatActivity implements View.OnClickListener {
    EditText edt1, edt2, edt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilan);

        Button kaydet = findViewById(R.id.ilankaydet);

        edt1 = (EditText) findViewById(R.id.editTextTextEmailAddress);
        edt2 = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        edt3 = (EditText) findViewById(R.id.editTextTextMultiLine2);


        kaydet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String baslik = edt1.getText().toString();
                String fiyat = edt2.getText().toString();
                String aciklama = edt3.getText().toString();

                if (v.getId() == kaydet.getId()) {
                    if (baslik.length() == 0) {
                        edt1.requestFocus();
                        edt1.setError("Baslik alani bos bırakilamaz.");
                    } else if (fiyat.length() == 0) {
                        edt2.requestFocus();
                        edt2.setError("Fiyat alani bos bırakilamaz.");
                    } else if (aciklama.length() == 0) {
                        edt3.requestFocus();
                        edt3.setError("Aciklama alani bos bırakilamaz.");
                    }
                    else {
                        Intent intent = new Intent(Ilan.this, basarili.class);
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

