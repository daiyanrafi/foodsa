package com.example.foodsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodsa.Adapters.MainAdapter;
import com.example.foodsa.Models.MainModel;
import com.example.foodsa.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.logo, "Burger", "5","kacchi with thala bashon"));
        list.add(new MainModel(R.drawable.gaja, "nun", "4","kacchi "));
        list.add(new MainModel(R.drawable.kacchi, "lao", "15","kacchi wion"));
        list.add(new MainModel(R.drawable.mod, "kacchi", "3","kah thala bashon"));
        list.add(new MainModel(R.drawable.halim, "halim", "2","kacchi with thon"));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.recylerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);
    }
}