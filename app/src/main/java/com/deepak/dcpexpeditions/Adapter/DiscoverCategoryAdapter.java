package com.deepak.dcpexpeditions.Adapter;

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

import com.deepak.dcpexpeditions.Home.DiscoverCategoryView;
import com.deepak.dcpexpeditions.Home.DiscoverSingleFragment;
import com.deepak.dcpexpeditions.R;

import java.util.ArrayList;

public class DiscoverCategoryAdapter extends RecyclerView.Adapter<DiscoverCategoryAdapter.ViewHolder> {

    static ArrayList<DiscoverCategoryView> allcategory;

    public DiscoverCategoryAdapter(ArrayList<DiscoverCategoryView> allcategory){
        this.allcategory = allcategory;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.discover_category_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.blog_image.setImageResource(allcategory.get(position).getBlog_image());
        holder.txt_amount.setText(allcategory.get(position).getTxt_amount());
        holder.blog_name.setText(allcategory.get(position).getBlog_name());
        holder.workshop_date.setText(allcategory.get(position).getWorkshop_date());
        holder.button.setText(allcategory.get(position).getButton());


    }

    @Override
    public int getItemCount() {
        return allcategory.size() ;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView blog_image;
        TextView txt_amount,blog_name,workshop_date,button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            blog_image = itemView.findViewById(R.id.blog_image);
            txt_amount = itemView.findViewById(R.id.txt_amount);
            blog_name = itemView.findViewById(R.id.blog_name);
            workshop_date = itemView.findViewById(R.id.workshop_date);
            button = itemView.findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id=view.getId();

                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    Fragment discover = new DiscoverSingleFragment();
                    FragmentTransaction fm = activity.getSupportFragmentManager().beginTransaction();
                    fm.replace(R.id.frm_lay, discover).commit();


                }
            });


        }
    }
}
