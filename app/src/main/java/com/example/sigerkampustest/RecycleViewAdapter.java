package com.example.sigerkampustest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleViewAdapter extends  RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    private ArrayList<String> logoUnila = new ArrayList<>();
    private ArrayList<String> Unila = new ArrayList<>();
    private Context context;

    public RecycleViewAdapter(ArrayList<String> logoUnila, ArrayList<String> unila, Context context) {
        this.logoUnila = logoUnila;
        this.Unila = unila;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).asBitmap().load(logoUnila.get(position)).into(holder.imageViewlogoUnila);

        holder.textViewUnila.setText(Unila.get(position));

    }

    @Override
    public int getItemCount() {
        return Unila.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imageViewlogoUnila;
        TextView textViewUnila;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewlogoUnila = itemView.findViewById(R.id.imageViewlogoUnila);
            textViewUnila = itemView.findViewById(R.id.textViewUnila);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }

}
