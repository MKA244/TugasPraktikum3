package com.example.tugaspraktikum3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private HewanAdapter adapter;
    private ArrayList<Hewan> hewanArrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new HewanAdapter(hewanArrayList,images);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private int[] images ={R.drawable.kucing,R.drawable.anjing,R.drawable.burung,R.drawable.ikan};

    private void addData() {
        hewanArrayList = new ArrayList<>();
        hewanArrayList.add(new Hewan("Kucing Rumahan", "Anak Kucing", "Karnivora"));
        hewanArrayList.add(new Hewan("Pug", "Anak Anjing", "Karnivora"));
        hewanArrayList.add(new Hewan("Elang", "Burung", "Karnivora"));
        hewanArrayList.add(new Hewan("Lele", "Ikan", "Omnivora"));
    }
}
