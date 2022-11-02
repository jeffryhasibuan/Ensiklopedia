package com.example.ensik2;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.tools.build.jetifier.core.utils.Log;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private  ArrayList<ItemModel> dataItem;

     Context context;
     public AdapterRecyclerView(ArrayList<ItemModel>dataItem,Context context)
     {
     this.dataItem = dataItem;
     this.context = context;
     }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public
        TextView textHead;
        TextView textSubhead;
        ImageView imageIcon;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textHead = itemView.findViewById(R.id.headline);
            textSubhead = itemView.findViewById(R.id.subheadline);
            imageIcon = itemView.findViewById(R.id.imageList);


        }


    }

    AdapterRecyclerView(ArrayList<ItemModel> dataItem){
        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){

        TextView textHead = holder.textHead;
        TextView textSubhead = holder.textSubhead;
        ImageView imageIcon = holder.imageIcon;

        textHead.setText(dataItem.get(position).getName());
        textSubhead.setText(dataItem.get(position).getType());
        imageIcon.setImageResource(dataItem.get(position).getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {

            if (dataItem.get(position).getName().equals("Alpukat")){
                context.startActivity(new Intent(context,alpukatActivity.class));
            }
            if ( dataItem.get(position).getName().equals("Jambu Biji")){
                context.startActivity(new Intent(context, jambubijiActivity.class));
            }

        }
    });

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }


}