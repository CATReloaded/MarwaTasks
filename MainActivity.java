package com.cat.reloaded.marwatasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import com.cat.reloaded.marwatasks.adapter.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupRecyclerView();
    }
    private void setupRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.rv);
//        LinearLayoutManager mngr= new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(mngr);//listview
        GridLayoutManager mngr = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(mngr);
        ItemAdapter adapter = new ItemAdapter(this);
        recyclerView.setAdapter(adapter);
        List<CustomClass> items = setupDataSource();
        adapter.setDataSource(items);


    }
    private List<CustomClass> setupDataSource(){
        List<CustomClass> items = new ArrayList<>();
        int images[] = {
                R.drawable.cook,
                R.drawable.croom,
                R.drawable.download,
                R.drawable.images,
                R.drawable.ppp,
                R.drawable.screen15,
                R.drawable.sky,
                R.drawable.vignettes_265x300_330690,
                R.drawable.will,};


        String names [] ={"Cooking Diary",
                "Disc Pool",
                "Empires and Puzzles",
                "The Alchemist code",
                "Pubg",
                "Tiles Hop",
                "Rolling Sky",
                "Hungry shark",
                "Will Hero"};
        for (int i = 0; i <names.length ; i++) {
            items.add(new CustomClass(names[i],images[i]));
        }
        return items;
    }
}
