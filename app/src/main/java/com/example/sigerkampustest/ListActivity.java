package com.example.sigerkampustest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ArrayList<String> logoUnila = new ArrayList<>();
    private ArrayList<String> Unila = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecycleViewAdapter adapter = new RecycleViewAdapter(logoUnila, Unila, this);

        RecyclerView.setAdapter(adapter);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet(){
        Unila.add("Universitas Lampung");
        logoUnila.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjMvMDkvMjgvMjgvZDkwZTAyNTktNTg5NS00NTZhLTk3MmEtMTAxYmU4N2VlZWM4LyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=4685dbed85ba6ad3");

        Unila.add("Institut Teknologi Sumatera (ITERA)");
        logoUnila.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjMvMDkvMjgvMzYvNTUwNWYxMzgtMGU0Mi00Mzc1LWIyNTAtOTEzZjA1YWQzNGYyLyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=e18493823fd969bd");

        Unila.add("Institut Agama Islam Negeri Raden Intan Lampung");
        logoUnila.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjMvMDkvMzcvMzYvNmNhNGI4MDAtMjY5Yy00YTcxLWE1ZTgtNzAyOGZhNjczYWM3LyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=6348eacc8dc883e8");

        prosesRecyclerViewAdapter();


    }

}