package com.example.myapplication2.Adapter;

import static android.os.Build.VERSION_CODES.R;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Common.Common;
import com.example.myapplication.High;
import com.example.myapplication.Interface.Itemclickllistener;
import com.example.myapplication.Model.Model;
import com.example.myapplication.R;
import com.example.myapplication2.Common.Common;
import com.example.myapplication2.Model.Model;
import com.example.myapplication2.hightActivity;

import java.util.List;

class customViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView textView;
    public ImageView imageView;

    Itemclickllistener itemclickllistener;

    public void setItemclickllistener(Itemclickllistener itemclickllistener) {
        this.itemclickllistener = itemclickllistener;
    }

    public customViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = (TextView) itemView.findViewById(R.id.text_view);
        imageView = (ImageView) itemView.findViewById(R.id.image_view);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        View View = null;
        itemclickllistener.onclick(null,getAdapterPosition());
    }
}
public class CustomAdapter extends RecyclerView.Adapter<customViewHolder> {
    List<Model>items;
    Context context;
    int row_index = -1;


    public CustomAdapter(List<Model> items, hightActivity hightActivity) {

        this.items = items;
        this.context = hightActivity;
    }

    @NonNull
    @Override
    public customViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemView = layoutInflater.inflate(R.layout.hight,parent,false);
        return new customViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull customViewHolder holder, int position) {
        holder.textView.setText(items.get(position).getName());
        if(!items.get(position).isIschecked())
            holder.imageView.setImageResource(R.drawable.cashed);
        else
            holder.imageView.setImageResource(R.drawable.cashed);
        holder.setItemclickllistener(new Itemclickllistener() {
            @Override
            public void onclick(View view, int position) {
                row_index = position;
                Common.CurrentItem  = items.get(position);
                notifyDataSetChanged();
            }
        });


        if (row_index == position){
                holder.itemView.setBackgroundColor(Color.parseColor("#F8F8FA"));
                holder.textView.setTextColor(Color.parseColor("#c5c5c7"));

        }
        else {
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            holder.textView.setTextColor(Color.parseColor("#OOOOOO"));

        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
