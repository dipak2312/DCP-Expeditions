package com.deepak.dcpexpeditions.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.deepak.dcpexpeditions.Home.DiscoverSingleFragment;
import com.deepak.dcpexpeditions.Home.DiscoverTitleView;
import com.deepak.dcpexpeditions.Home.PackageCostFragment;
import com.deepak.dcpexpeditions.R;
import com.deepak.dcpexpeditions.onClickInformation;

import java.util.ArrayList;

public class DiscoverSingleAdapter extends RecyclerView.Adapter<DiscoverSingleAdapter.ViewHolder> {
    Context context;
    ArrayList<DiscoverTitleView> infoList;
    onClickInformation onClick;
    int pos=0;

    public DiscoverSingleAdapter(ArrayList<DiscoverTitleView>infoList) {
        this.infoList = infoList;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.discover_info_title_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.txt_categories.setText(infoList.get(position).getTxt_categories());
            holder.txt_arrow.setText(infoList.get(position).getTxt_arrow());



    }


    @Override
    public int getItemCount() {
        return infoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_categories,txt_arrow;
        RelativeLayout rel_text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_categories= itemView.findViewById(R.id.txt_categories);
            txt_arrow= itemView.findViewById(R.id.txt_arrow);
            rel_text= itemView.findViewById(R.id.rel_text);
            txt_categories.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id=view.getId();

                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    Fragment discover = new PackageCostFragment();
                    FragmentTransaction fm = activity.getSupportFragmentManager().beginTransaction();
                    fm.replace(R.id.frm_lay, discover).commit();
                }
            });

        }
    }
}
