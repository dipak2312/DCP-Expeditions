package com.deepak.dcpexpeditions.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.deepak.dcpexpeditions.R;
import com.deepak.dcpexpeditions.Store.StoreCart;
import com.deepak.dcpexpeditions.Store.StoreShoppingCartFragment;

import java.util.ArrayList;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {
    ArrayList<StoreCart> storecart;
    Context context;

    public StoreAdapter(Context context, ArrayList<StoreCart> storecart) {
        this.context=context;
    }

    public StoreAdapter(ArrayList<StoreCart> storecart) {
        this.storecart=storecart;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.store_cart, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.camera.setImageResource(storecart.get(position).getCamera());
        holder.camera_title.setText(storecart.get(position).getCamera_title());
        holder.camera_features.setText(storecart.get(position).getCamera_features());
        holder.camera_price.setText(storecart.get(position).getCamera_price());
        holder.button_book.setText(storecart.get(position).getButton_book());

    }

    @Override
    public int getItemCount() {
        return storecart.size() ;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView camera;
        TextView camera_title, camera_features, camera_price, button_book;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            camera = itemView.findViewById(R.id.camera);
            camera_title = itemView.findViewById(R.id.camera_title);
            camera_features = itemView.findViewById(R.id.camera_features);
            camera_price = itemView.findViewById(R.id.camera_price);
            button_book = itemView.findViewById(R.id.button_book);

            button_book.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id=view.getId();
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    Fragment discover = new StoreShoppingCartFragment();
                    FragmentTransaction fm = activity.getSupportFragmentManager().beginTransaction();
                    fm.replace(R.id.frm_lay, discover).commit();
                }
            });

        }

    }
}
