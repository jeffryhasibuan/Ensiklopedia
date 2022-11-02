package com.example.ensik2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnkategori, btnlist, btninfoaplikasi, btnkeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //region fullscreen code [to be placed before setContentView]
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        //endregion

        setContentView(R.layout.activity_main);

        btnkategori = (Button) findViewById(R.id.btnkategori);
        btnkategori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, kategoriActivity.class);
                startActivity(intent);
            }
        });
        btnlist = (Button) findViewById(R.id.btnlist);
        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, daftartanamanActivity.class);
                startActivity(intent);
            }
        });
        btninfoaplikasi = (Button) findViewById(R.id.btninfoaplikasi);
        btninfoaplikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, infoaplikasiActivity.class);
                startActivity(intent);
            }
        });
        btnkeluar = (Button) findViewById(R.id.btnkeluar);
        btnkeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Exit();
            }
        });
    }
    public void Exit(){
        finish();
    }
}
