package com.example.ensik2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class rempahActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView R1,R2,R3,R4,R5,R6,R7,R8,R9,R10,R11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rempah);

        //region fullscreen code [to be placed before setContentView]
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        //endregion

        R1 = (CardView) findViewById(R.id.cardasamjawa);
        R2 = (CardView) findViewById(R.id.cardcengkeh);
        R3 = (CardView) findViewById(R.id.cardjahe);
        R4 = (CardView) findViewById(R.id.cardjintanhitam);
        R5 = (CardView) findViewById(R.id.cardkapulaga);
        R6 = (CardView) findViewById(R.id.cardkayumanis);
        R7 = (CardView) findViewById(R.id.cardkencur);
        R8 = (CardView) findViewById(R.id.cardkunyit);
        R9 = (CardView) findViewById(R.id.cardlengkuas);
        R10 = (CardView) findViewById(R.id.cardsecang);
        R11 = (CardView) findViewById(R.id.cardtemulawak);

        R1.setOnClickListener((View.OnClickListener) this);
        R2.setOnClickListener((View.OnClickListener) this);
        R3.setOnClickListener((View.OnClickListener) this);
        R4.setOnClickListener((View.OnClickListener) this);
        R5.setOnClickListener((View.OnClickListener) this);
        R6.setOnClickListener((View.OnClickListener) this);
        R7.setOnClickListener((View.OnClickListener) this);
        R8.setOnClickListener((View.OnClickListener) this);
        R9.setOnClickListener((View.OnClickListener) this);
        R10.setOnClickListener((View.OnClickListener) this);
        R11.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cardasamjawa: i = new Intent(this,asamjawaActivity.class);
                startActivity(i);
                break;
            case R.id.cardcengkeh: i = new Intent(this,cengkehActivity.class); startActivity(i); break;
            case R.id.cardjahe: i = new Intent(this,jaheActivity.class); startActivity(i); break;
            case R.id.cardjintanhitam: i = new Intent(this,jintanActivity.class); startActivity(i); break;
            case R.id.cardkapulaga: i = new Intent(this,kapulagaActivity.class); startActivity(i); break;
            case R.id.cardkayumanis: i = new Intent(this,kayumanisActivity.class); startActivity(i); break;
            case R.id.cardkencur: i = new Intent(this,kencurActivity.class); startActivity(i); break;
            case R.id.cardkunyit: i = new Intent(this,kunyitActivity.class); startActivity(i); break;
            case R.id.cardlengkuas: i = new Intent(this,lengkuasActivity.class); startActivity(i); break;
            case R.id.cardsecang: i = new Intent(this,secangActivity.class); startActivity(i); break;
            case R.id.cardtemulawak: i = new Intent(this,lengkuasActivity.class); startActivity(i); break;
        }
    }
}

