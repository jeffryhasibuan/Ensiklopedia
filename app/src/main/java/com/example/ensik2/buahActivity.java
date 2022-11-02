package com.example.ensik2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class buahActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView B1, B2, B3, B4, B5, B6, B7, B8, B9, B10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);
        //region fullscreen code [to be placed before setContentView]
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        //endregion

        B1 = (CardView) findViewById(R.id.cardalpukat);
        B2 = (CardView) findViewById(R.id.cardbelimbing);
        B3 = (CardView) findViewById(R.id.cardblustru);
        B4 = (CardView) findViewById(R.id.carddelima);
        B5 = (CardView) findViewById(R.id.cardjambubiji);
        B6 = (CardView) findViewById(R.id.cardjeruknipis);
        B7 = (CardView) findViewById(R.id.cardkelapa);
        B8 = (CardView) findViewById(R.id.cardmengkudu);
        B9 = (CardView) findViewById(R.id.cardpepaya);
        B10 = (CardView) findViewById(R.id.cardpisang);

        B1.setOnClickListener((View.OnClickListener) this);
        B2.setOnClickListener((View.OnClickListener) this);
        B3.setOnClickListener((View.OnClickListener) this);
        B4.setOnClickListener((View.OnClickListener) this);
        B5.setOnClickListener((View.OnClickListener) this);
        B6.setOnClickListener((View.OnClickListener) this);
        B7.setOnClickListener((View.OnClickListener) this);
        B8.setOnClickListener((View.OnClickListener) this);
        B9.setOnClickListener((View.OnClickListener) this);
        B10.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cardalpukat:
                i = new Intent(this, alpukatActivity.class);
                startActivity(i);
                break;
            case R.id.cardbelimbing:
                i = new Intent(this, belimbingActivity.class);
                startActivity(i);
                break;
            case R.id.cardblustru:
                i = new Intent(this, blustruActivity.class);
                startActivity(i);
                break;
            case R.id.carddelima:
                i = new Intent(this, delimaActivity.class);
                startActivity(i);
                break;
            case R.id.cardjambubiji:
                i = new Intent(this, jambubijiActivity.class);
                startActivity(i);
                break;
            case R.id.cardjeruknipis:
                i = new Intent(this, jeruknipisActivity.class);
                startActivity(i);
                break;
            case R.id.cardkelapa:
                i = new Intent(this, kelapaActivity.class);
                startActivity(i);
                break;
            case R.id.cardmengkudu:
                i = new Intent(this, mengkuduActivity.class);
                startActivity(i);
                break;
            case R.id.cardpepaya:
                i = new Intent(this, pepayaActivity.class);
                startActivity(i);
                break;
            case R.id.cardpisang:
                i = new Intent(this, pisangActivity.class);
                startActivity(i);
                break;
        }

    }
}
