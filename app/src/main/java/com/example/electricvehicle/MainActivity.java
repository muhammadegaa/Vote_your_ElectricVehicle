package com.example.electricvehicle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCars;
    public static ImageView image;
    private ArrayList<Car> list = new ArrayList<>();
    private String title = "Electric Vehicle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvCars = findViewById(R.id.rv_cars);
        rvCars.setHasFixedSize(true);

        list.addAll(CarsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCars.setLayoutManager(new LinearLayoutManager(this));
        ListCarAdapter listCarAdapter = new ListCarAdapter(list);
        rvCars.setAdapter(listCarAdapter);

        listCarAdapter.setOnItemClickCallback(new ListCarAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Car data) {
                showSelectedCar(data);

            }
        });
    }

    private void showSelectedCar(Car car){

    }

    private void showAbout(){
        Intent about = new Intent(MainActivity.this, About.class);
        startActivity(about);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        if (selectedMode == R.id.profile) {
            title = "About";
            showAbout();
        }
    }

    private void setActionBarTitle(String title) {
        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
