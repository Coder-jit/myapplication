package com.example.myapplication2;

import static android.os.Build.VERSION_CODES.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.Adapter.Itemclickllistener;
import com.example.myapplication2.Model.Model;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.ViewHolder> {
    public TextView textView;
    public ImageView imageView;

    Itemclickllistener itemclickllistener;

    public void setItemclickllistener(Itemclickllistener itemclickllistener) {
        this.itemclickllistener = itemclickllistener;
    }


    @Override
    public void onClick(View v) {
        View View = null;
        itemclickllistener.onclick(null,getAdapterPosition());
    }



    Context xyz;

    List<Model> items;

    public NewAdapter(List<Model> items, hightActivity hightActivity) {
        this.items = items;
        this.xyz = hightActivity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            textView = (TextView) itemView.findViewById(R.id.text_view);
            imageView = (ImageView) itemView.findViewById(R.id.image_view);
            itemView.setOnClickListener(this);
        }
    }
}
