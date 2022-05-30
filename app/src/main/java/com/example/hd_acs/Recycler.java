package com.example.hd_acs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hd_acs.Models.Data;
import com.example.hd_acs.Models.RecyclerAdapter;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Data> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        arrayList.add(new Data("Шляпа"));
        arrayList.add(new Data("Шапка"));
        arrayList.add(new Data("Панама"));

        recyclerView = findViewById(R.id.recicler);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager((this)));
    }
}