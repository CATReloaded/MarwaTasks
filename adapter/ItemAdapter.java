package com.cat.reloaded.marwatasks.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cat.reloaded.marwatasks.CustomClass;
import com.cat.reloaded.marwatasks.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
     Context context;
     List<CustomClass> items;
    public ItemAdapter(@NonNull Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.litem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CustomClass item = items.get(position);
        holder.imageView.setImageResource(item.getImageView());
        holder.textView.setText(item.getTextView());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void setDataSource(List<CustomClass> List) {
        this.items = List;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView ;
        TextView textView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
