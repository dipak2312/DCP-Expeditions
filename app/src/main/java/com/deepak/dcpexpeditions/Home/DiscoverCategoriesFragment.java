package com.deepak.dcpexpeditions.Home;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deepak.dcpexpeditions.Adapter.DiscoverCategoryAdapter;
import com.deepak.dcpexpeditions.R;

import java.util.ArrayList;


public class DiscoverCategoriesFragment extends Fragment {
    Context context;
    ArrayList<DiscoverCategoryView>allcategory;
    RecyclerView recy_work_shop_category,recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_discover_categories, container, false);

        recyclerView = v.findViewById(R.id.recy_work_shop_category);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, true));

        allcategory=new ArrayList<>();


        allcategory.add(new DiscoverCategoryView(R.drawable.flight_img, "₹ 2,500/-", "DCP Online Masterclass - Photographing Birds In Flight, May 2020", "30, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.workshop_img, "₹ 2,500/-", "DCP Online Masterclass - Advanced Photography Workshop, May 2020", "31, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.flight_img, "₹ 2,500/-", "DCP Online Masterclass - Photographing Birds In Flight, May 2020", "30, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.workshop_img, "₹ 2,500/-", "DCP Online Masterclass - Advanced Photography Workshop, May 2020", "31, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.flight_img, "₹ 2,500/-", "DCP Online Masterclass - Photographing Birds In Flight, May 2020", "30, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.workshop_img, "₹ 2,500/-", "DCP Online Masterclass - Advanced Photography Workshop, May 2020", "31, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.flight_img, "₹ 2,500/-", "DCP Online Masterclass - Photographing Birds In Flight, May 2020", "30, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.workshop_img, "₹ 2,500/-", "DCP Online Masterclass - Advanced Photography Workshop, May 2020", "31, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.flight_img, "₹ 2,500/-", "DCP Online Masterclass - Photographing Birds In Flight, May 2020", "30, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.workshop_img, "₹ 2,500/-", "DCP Online Masterclass - Advanced Photography Workshop, May 2020", "31, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.flight_img, "₹ 2,500/-", "DCP Online Masterclass - Photographing Birds In Flight, May 2020", "30, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.workshop_img, "₹ 2,500/-", "DCP Online Masterclass - Advanced Photography Workshop, May 2020", "31, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.flight_img, "₹ 2,500/-", "DCP Online Masterclass - Photographing Birds In Flight, May 2020", "30, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.workshop_img, "₹ 2,500/-", "DCP Online Masterclass - Advanced Photography Workshop, May 2020", "31, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.flight_img, "₹ 2,500/-", "DCP Online Masterclass - Photographing Birds In Flight, May 2020", "30, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.workshop_img, "₹ 2,500/-", "DCP Online Masterclass - Advanced Photography Workshop, May 2020", "31, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.flight_img, "₹ 2,500/-", "DCP Online Masterclass - Photographing Birds In Flight, May 2020", "30, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.workshop_img, "₹ 2,500/-", "DCP Online Masterclass - Advanced Photography Workshop, May 2020", "31, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.flight_img, "₹ 2,500/-", "DCP Online Masterclass - Photographing Birds In Flight, May 2020", "30, May 2020", "Book Now"));
        allcategory.add(new DiscoverCategoryView(R.drawable.workshop_img, "₹ 2,500/-", "DCP Online Masterclass - Advanced Photography Workshop, May 2020", "31, May 2020", "Book Now"));

        //DiscoverCategoryAdapter adapter = new DiscoverCategoryAdapter(context, allcategory);
        recyclerView.setAdapter(new DiscoverCategoryAdapter(allcategory));

        return v;
    }
}