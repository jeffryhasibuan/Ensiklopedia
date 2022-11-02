package com.example.ensik2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.ensik2.adapter.TanamanAdapter;
import com.example.ensik2.model.TanamanItem;

import java.util.ArrayList;
import java.util.List;

public class daftartanamanActivity extends AppCompatActivity implements View.OnClickListener, TanamanAdapter.TanamanListener{
    private CardView D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11, D12, D13, D14, D15, D16, D17, D18, D19, D20,
            D21, D22, D23, D24, D25, D26, D27, D28, D29, D30, D31, D32, D33, D34, D35, D36, D37, D38, D39,
            D40, D41, D42;
    RecyclerView recyclerView;
    List<TanamanItem> tanamanItems = new ArrayList<>();
    TanamanAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftartanaman);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_900)));
        recyclerView = findViewById(R.id.listTanaman);

        tanamanItems.add(new TanamanItem("Adam Hawa", "Tradescantia spathacae", getResources().getDrawable(R.drawable.adamhawa)));
        tanamanItems.add(new TanamanItem("Adas", "Foeniculum vulgare Mill", getResources().getDrawable(R.drawable.adas1)));
        tanamanItems.add(new TanamanItem("Alpukat", "Persea americana", getResources().getDrawable(R.drawable.toalpukat)));
        tanamanItems.add(new TanamanItem("Asam Jawa", "Tamarindus indica", getResources().getDrawable(R.drawable.toasamjawa)));
        tanamanItems.add(new TanamanItem("Bakung", "Crinum asiaticum L", getResources().getDrawable(R.drawable.tobakung)));
        tanamanItems.add(new TanamanItem("Bambu Tali", "Asparagus cochinchinensis", getResources().getDrawable(R.drawable.tobambutali)));
        tanamanItems.add(new TanamanItem("Bandotan", "Ageratum conyzoides L", getResources().getDrawable(R.drawable.tobandotan)));
        tanamanItems.add(new TanamanItem("Bayam Duri", "Amaranthus Spinousus, Linn", getResources().getDrawable(R.drawable.tobayamduri)));
        tanamanItems.add(new TanamanItem("Belimbing", "Averhoa carambola", getResources().getDrawable(R.drawable.tobelimbing)));
        tanamanItems.add(new TanamanItem("Blustru", "Luffa cylindrica [L.] Rp", getResources().getDrawable(R.drawable.toblustru)));
        tanamanItems.add(new TanamanItem("Bunga Kenop", "Gomphrena globose Linn", getResources().getDrawable(R.drawable.tobungakenop)));
        tanamanItems.add(new TanamanItem("Cempaka", "Michelia campaca L", getResources().getDrawable(R.drawable.tocempaka1)));
        tanamanItems.add(new TanamanItem("Cengkeh", "Syzygium aromaticum", getResources().getDrawable(R.drawable.tocengkeh)));
        tanamanItems.add(new TanamanItem("Ciplukan", "Physalis angulata", getResources().getDrawable(R.drawable.tociplukan)));
        tanamanItems.add(new TanamanItem("Daun Encok", "Plumbago zeylanica", getResources().getDrawable(R.drawable.todaunencok)));
        tanamanItems.add(new TanamanItem("Daun Kelor", "Moringa oleifera, Lamk", getResources().getDrawable(R.drawable.todaunkelor)));
        tanamanItems.add(new TanamanItem("Daun Salam", "Syzygium polyanthum", getResources().getDrawable(R.drawable.todaunsalam)));
        tanamanItems.add(new TanamanItem("Delima", "Punica granatum", getResources().getDrawable(R.drawable.todelima)));
        tanamanItems.add(new TanamanItem("Enau", "Arenga pinnata", getResources().getDrawable(R.drawable.enau)));
        tanamanItems.add(new TanamanItem("Gambir", "Uncaria gambir", getResources().getDrawable(R.drawable.gambir)));
        tanamanItems.add(new TanamanItem("Genjer", "Clerodendron indicum L", getResources().getDrawable(R.drawable.togenjer)));
        tanamanItems.add(new TanamanItem("Iler", "Coleus scutellarioides, Linn,Benth", getResources().getDrawable(R.drawable.iler2)));
        tanamanItems.add(new TanamanItem("Jahe", "Zingiber officinale", getResources().getDrawable(R.drawable.tojahe)));
        tanamanItems.add(new TanamanItem("Jambu Biji", "Psidium guajava, Linn", getResources().getDrawable(R.drawable.tojambubiji)));
        tanamanItems.add(new TanamanItem("Jeruk Nipis", "Citrus aurantifolia,Swingle", getResources().getDrawable(R.drawable.tojeruknipis)));
        tanamanItems.add(new TanamanItem("Jintan Hitam", "Nigella sativa.", getResources().getDrawable(R.drawable.tojintanhitam)));
        tanamanItems.add(new TanamanItem("Kapulaga", "Amomum compactum Soland ex Maton", getResources().getDrawable(R.drawable.tokapulaga)));
        tanamanItems.add(new TanamanItem("Kayu Manis", "Cinnamonmun burmani (nees) BI.", getResources().getDrawable(R.drawable.tokayumanis)));
        tanamanItems.add(new TanamanItem("Kelapa", "Cocos nucifera, Linn.", getResources().getDrawable(R.drawable.tokelapa)));
        tanamanItems.add(new TanamanItem("Kencur", "Kaempferia galanga, Linn.", getResources().getDrawable(R.drawable.tokencur)));
        tanamanItems.add(new TanamanItem("Kubis", "Brassica oleracea var. capitata", getResources().getDrawable(R.drawable.tokubis)));
        tanamanItems.add(new TanamanItem("Kunyit", "Curcuma longa, Linn.", getResources().getDrawable(R.drawable.tokunyit)));
        tanamanItems.add(new TanamanItem("Lengkuas", "Alpinia galanga, Linn., Wild.", getResources().getDrawable(R.drawable.tolengkuas)));
        tanamanItems.add(new TanamanItem("Lidah Buaya", "Aloe vera, Linn", getResources().getDrawable(R.drawable.tolidahbuaya)));
        tanamanItems.add(new TanamanItem("Mengkudu", "Morinda citrifolia, Linn.", getResources().getDrawable(R.drawable.tomengkudu)));
        tanamanItems.add(new TanamanItem("Pepaya", "Carica papaya, Linn.", getResources().getDrawable(R.drawable.topepaya)));
        tanamanItems.add(new TanamanItem("Pisang", "Musa paradisiaca, Linn.", getResources().getDrawable(R.drawable.topisang)));
        tanamanItems.add(new TanamanItem("Rimbang", "Solanum torvum", getResources().getDrawable(R.drawable.torimbang)));
        tanamanItems.add(new TanamanItem("Secang", "Caesalpia sappan L", getResources().getDrawable(R.drawable.tosecang)));
        tanamanItems.add(new TanamanItem("Seledri", "Apium graveolens, Linn.", getResources().getDrawable(R.drawable.toseledri)));
        tanamanItems.add(new TanamanItem("Sirih", "Piper betle, Linn", getResources().getDrawable(R.drawable.todaunsirih)));
        tanamanItems.add(new TanamanItem("Temulawak", "Curcuma xanthorrhiza, Roxb.", getResources().getDrawable(R.drawable.totemulawak)));

        setupAdapter();

        adapter.setData(tanamanItems);
    }

    private void filter(String text) {
        // creating a new array list to filter our data.
        ArrayList<TanamanItem> filteredlist = new ArrayList<TanamanItem>();

        // running a for loop to compare elements.
        for (TanamanItem item : tanamanItems) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.getNama().toLowerCase().contains(text.toLowerCase()) || item.getNamaLatin().toLowerCase().contains(text.toLowerCase())) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item);
            }
        }
        if (filteredlist.isEmpty()) {
            // if no item is added in filtered list we are
            // displaying a toast message as no data found.
            Toast.makeText(this, "No Data Found..", Toast.LENGTH_SHORT).show();
        } else {
            // at last we are passing that filtered
            // list to our adapter class.
            adapter.filterList(filteredlist);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_daftar,menu);

        MenuItem menuItem = menu.findItem(R.id.search_view);
        SearchView searchView =(SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                searchView.setQuery("Masukkan teks", false);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                filter(s);
                return false;
            }
        });

        return true;
    }

    void setupAdapter(){
        adapter = new TanamanAdapter(this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onClick(TanamanItem data) {
        Intent i;

        switch (data.getNama()) {
            case "Adam Hawa":
                i = new Intent(this, adamhawaActivity.class);
                startActivity(i);
                break;
            case "Adas":
                i = new Intent(this, adasActivity.class);
                startActivity(i);
                break;
            case"Alpukat":
                i = new Intent(this, alpukatActivity.class);
                startActivity(i);
                break;
            case "Asam Jawa":
                i = new Intent(this, asamjawaActivity.class);
                startActivity(i);
                break;
            case "Bakung":
                i = new Intent(this, bakungActivity.class);
                startActivity(i);
                break;
            case "Bambu Tali":
                i = new Intent(this, bambutaliActivity.class);
                startActivity(i);
                break;
            case "Bandotan":
                i = new Intent(this, bandotanActivity.class);
                startActivity(i);
                break;
            case "Bayam Duri":
                i = new Intent(this, bayamduriActivity.class);
                startActivity(i);
                break;
            case "Belimbing":
                i = new Intent(this, belimbingActivity.class);
                startActivity(i);
                break;
            case "Blustru":
                i = new Intent(this, blustruActivity.class);
                startActivity(i);
                break;
            case "Bunga Kenop":
                i = new Intent(this, bungakenopActivity.class);
                startActivity(i);
                break;
            case "Cempaka":
                i = new Intent(this, cempakaActivity.class);
                startActivity(i);
                break;
            case "Cengkeh":
                i = new Intent(this, cengkehActivity.class);
                startActivity(i);
                break;
            case "Ciplukan":
                i = new Intent(this, ciplukanActivity.class);
                startActivity(i);
                break;
            case "Daun Encok":
                i = new Intent(this, daunencokActivity.class);
                startActivity(i);
                break;
            case "Daun Kelor":
                i = new Intent(this, daunkelorActivity.class);
                startActivity(i);
                break;
            case "Daun Salam":
                i = new Intent(this, daunsalamActivity.class);
                startActivity(i);
                break;
            case "Delima":
                i = new Intent(this, delimaActivity.class);
                startActivity(i);
                break;
            case "Enau":
                i = new Intent(this, enauActivity.class);
                startActivity(i);
                break;
            case "Gambir":
                i = new Intent(this, gambirActivity.class);
                startActivity(i);
                break;
            case "Genjer":
                i = new Intent(this, genjerActivity.class);
                startActivity(i);
                break;
            case "Iler":
                i = new Intent(this, ilerActivity.class);
                startActivity(i);
                break;
            case "Jahe":
                i = new Intent(this, jaheActivity.class);
                startActivity(i);
                break;
            case "Jambu Biji":
                i = new Intent(this, jambubijiActivity.class);
                startActivity(i);
                break;
            case "Jeruk Nipis":
                i = new Intent(this, jeruknipisActivity.class);
                startActivity(i);
                break;
            case "Jintan Hitam":
                i = new Intent(this, jintanActivity.class);
                startActivity(i);
                break;
            case "Kapulaga":
                i = new Intent(this, kapulagaActivity.class);
                startActivity(i);
                break;
            case "Kayu Manis":
                i = new Intent(this, kayumanisActivity.class);
                startActivity(i);
                break;
            case "Kelapa":
                i = new Intent(this, kelapaActivity.class);
                startActivity(i);
                break;
            case "Kencur":
                i = new Intent(this, kencurActivity.class);
                startActivity(i);
                break;
            case "Kubis":
                i = new Intent(this, kubisActivity.class);
                startActivity(i);
                break;
            case "Kunyit":
                i = new Intent(this, kunyitActivity.class);
                startActivity(i);
                break;
            case "Lengkuas":
                i = new Intent(this, lengkuasActivity.class);
                startActivity(i);
                break;
            case "Lidah Buaya":
                i = new Intent(this, lidahbuayaActivity.class);
                startActivity(i);
                break;
            case "Mengkudu":
                i = new Intent(this, mengkuduActivity.class);
                startActivity(i);
                break;
            case "Pepaya":
                i = new Intent(this, pepayaActivity.class);
                startActivity(i);
                break;
            case "Pisang":
                i = new Intent(this, pisangActivity.class);
                startActivity(i);
                break;
            case "Rimbang":
                i = new Intent(this, rimbangActivity.class);
                startActivity(i);
                break;
            case "Secang":
                i = new Intent(this, secangActivity.class);
                startActivity(i);
                break;
            case "Seledri":
                i = new Intent(this, seledriActivity.class);
                startActivity(i);
                break;
            case "Sirih":
                i = new Intent(this, sirihActivity.class);
                startActivity(i);
                break;
            case "Temulawak":
                i = new Intent(this, temulawakActivity.class);
                startActivity(i);
                break;
        }
    }
}