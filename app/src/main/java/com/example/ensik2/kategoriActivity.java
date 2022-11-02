package com.example.ensik2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View;

import android.os.Bundle;

public class kategoriActivity extends AppCompatActivity {
    private Button btnbuah, btnrempah, btnsayur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        //region fullscreen code [to be placed before setContentView]
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        //endregion

        btnbuah = (Button) findViewById(R.id.btnbuah);
        btnbuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(kategoriActivity.this, buahActivity.class);
                startActivity(intent);
            }
        });
        btnrempah = (Button) findViewById(R.id.btnrempah);
        btnrempah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(kategoriActivity.this, rempahActivity.class);
                startActivity(intent);
            }
        });
        btnsayur = (Button) findViewById(R.id.btnsayur);
        btnsayur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(kategoriActivity.this, sayurActivity.class);
                startActivity(intent);
            }
        });

    }
}