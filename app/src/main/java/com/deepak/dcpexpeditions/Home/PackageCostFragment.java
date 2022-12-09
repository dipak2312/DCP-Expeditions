package com.deepak.dcpexpeditions.Home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.deepak.dcpexpeditions.Adapter.DiscoverSingleAdapter;
import com.deepak.dcpexpeditions.R;

import java.util.ArrayList;

public class PackageCostFragment extends Fragment {
    Context context;
    ArrayList<DiscoverTitleView> infoList;
    RecyclerView recyclerView;
    Button btn_book_now;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_package_cost, container, false);

        recyclerView= v.findViewById(R.id.recy_workshop);
        LinearLayoutManager lm=new LinearLayoutManager(context);
        lm.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(lm);


        infoList=new ArrayList<>();

        infoList.add(new DiscoverTitleView("DCP Expert","|"));
        infoList.add(new DiscoverTitleView("Stay","|"));
        infoList.add(new DiscoverTitleView("Package Cost","|"));
        infoList.add(new DiscoverTitleView("Registration","|"));


        recyclerView.setAdapter(new DiscoverSingleAdapter(infoList));

        btn_book_now= v.findViewById(R.id.btn_book_now);
        btn_book_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = view.getId();

                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment discover = new DiscoverInformationFragment();
                FragmentTransaction fm = activity.getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.frame_single, discover).commit();


            }
        });

        return v;
    }
}