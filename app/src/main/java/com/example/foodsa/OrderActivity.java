package com.example.foodsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodsa.Adapters.OrdersAdapter;
import com.example.foodsa.Models.OrdersModel;
import com.example.foodsa.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.halim, "halim with gosto", "4", "123334"));
        list.add(new OrdersModel(R.drawable.halim, "halim with gosto", "4", "123334"));
        list.add(new OrdersModel(R.drawable.halim, "halim with gosto", "4", "123334"));
        list.add(new OrdersModel(R.drawable.halim, "halim with gosto", "4", "123334"));
        list.add(new OrdersModel(R.drawable.halim, "halim with gosto", "4", "123334"));
        list.add(new OrdersModel(R.drawable.halim, "halim with gosto", "4", "123334"));
        list.add(new OrdersModel(R.drawable.halim, "halim with gosto", "4", "123334"));

        OrdersAdapter adapter = new OrdersAdapter(list, this);
        binding.recylerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);

        
    }
}