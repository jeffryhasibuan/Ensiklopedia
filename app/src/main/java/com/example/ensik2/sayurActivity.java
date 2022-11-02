package com.example.ensik2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class sayurActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView D1, D2, D3, D4, D5, D6, D7, D8, D9, D10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayur);

        //region fullscreen code [to be placed before setContentView]
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        //endregion

        D1 = (CardView) findViewById(R.id.cardbakung);
        D2 = (CardView) findViewById(R.id.cardbayamduri);
        D3 = (CardView) findViewById(R.id.cardblustru);
        D4 = (CardView) findViewById(R.id.carddaunkelor);
        D5 = (CardView) findViewById(R.id.cardgambir);
        D6 = (CardView) findViewById(R.id.cardgenjer);
        D7 = (CardView) findViewById(R.id.cardkubis);
        D8 = (CardView) findViewById(R.id.cardrimbang);
        D9 = (CardView) findViewById(R.id.cardsecang);
        D10 = (CardView) findViewById(R.id.cardseledri);


        D1.setOnClickListener((View.OnClickListener) this);
        D2.setOnClickListener((View.OnClickListener) this);
        D3.setOnClickListener((View.OnClickListener) this);
        D4.setOnClickListener((View.OnClickListener) this);
        D5.setOnClickListener((View.OnClickListener) this);
        D6.setOnClickListener((View.OnClickListener) this);
        D7.setOnClickListener((View.OnClickListener) this);
        D8.setOnClickListener((View.OnClickListener) this);
        D9.setOnClickListener((View.OnClickListener) this);
        D10.setOnClickListener((View.OnClickListener) this);


    }
    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.cardbakung: i = new Intent(this,bakungActivity.class); startActivity(i); break;
            case R.id.cardbayamduri: i = new Intent(this,bayamduriActivity.class); startActivity(i); break;
            case R.id.cardblustru: i = new Intent(this,blustruActivity.class); startActivity(i); break;
            case R.id.carddaunkelor: i = new Intent(this,daunkelorActivity.class); startActivity(i); break;
            case R.id.cardgambir: i = new Intent(this,gambirActivity.class); startActivity(i); break;
            case R.id.cardgenjer: i = new Intent(this,genjerActivity.class); startActivity(i); break;
            case R.id.cardkubis: i = new Intent(this,kubisActivity.class); startActivity(i); break;
            case R.id.cardrimbang: i = new Intent(this,rimbangActivity.class); startActivity(i); break;
            case R.id.cardsecang: i = new Intent(this,secangActivity.class); startActivity(i); break;
            case R.id.cardseledri: i = new Intent(this,seledriActivity.class); startActivity(i); break;

        }
    }
}
