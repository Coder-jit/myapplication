package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.text.Highlights;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.Adapter.CustomAdapter;
import com.example.myapplication2.Model.Model;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class hightActivity extends AppCompatActivity {

    RecyclerView List_Model;
    RecyclerView.LayoutManager layoutManager;
    List<Model> items;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hight);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(highlightActivity.this, hightActivity.class));

            }
        });
        List_Model = (RecyclerView) findViewById(R.id.R1);
        layoutManager = new LinearLayoutManager(this);
        List_Model.setHasFixedSize(true);
        List_Model.setLayoutManager(layoutManager);

        getData();

    }

    private void getData() {

        for(int z=0;z<10;z++)
        {
            Model item = new Model();
            item.setName("Item"+z);
            if(z%2==0)
                item.setIschecked(true);
            else
                item.setIschecked(false);
            items.add(item);
        }

        CustomAdapter adapter = new NewAdapter(items,this);
        List_Model.setAdapter(adapter);


    }
}