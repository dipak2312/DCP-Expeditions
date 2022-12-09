package com.deepak.dcpexpeditions.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.deepak.dcpexpeditions.R;
import com.deepak.dcpexpeditions.Store.StoreGadgetsCart;

import java.util.ArrayList;

public class StoreGadgetAdapter extends RecyclerView.Adapter<StoreGadgetAdapter.ViewHolder> {
    Context context;
    ArrayList<StoreGadgetsCart> storeGadgetsCarts;

    public StoreGadgetAdapter(Context context,ArrayList<StoreGadgetsCart> storeGadgetsCarts){
        this.context=context;
    }

    public StoreGadgetAdapter(ArrayList<StoreGadgetsCart> storeGadgetsCarts) {
        this.storeGadgetsCarts = storeGadgetsCarts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.store_gadgets_cart, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.camera.setImageResource(storeGadgetsCarts.get(position).getCamera());
        holder.camera_title.setText(storeGadgetsCarts.get(position).getCamera_title());
        holder.camera_features.setText(storeGadgetsCarts.get(position).getCamera_features());
        holder.camera_price.setText(storeGadgetsCarts.get(position).getCamera_price());
        holder.button_book.setText(storeGadgetsCarts.get(position).getButton_book());
    }

    @Override
    public int getItemCount() {
        return storeGadgetsCarts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView camera;
        TextView camera_title,camera_features,camera_price,button_book;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            camera = itemView.findViewById(R.id.camera);
            camera_title = itemView.findViewById(R.id.camera_title);
            camera_features = itemView.findViewById(R.id.camera_features);
            camera_price = itemView.findViewById(R.id.camera_price);
            button_book = itemView.findViewById(R.id.button_book);
        }
    }
}
