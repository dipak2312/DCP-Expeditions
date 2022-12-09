package com.deepak.dcpexpeditions.Store;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deepak.dcpexpeditions.Adapter.StoreGadgetAdapter;
import com.deepak.dcpexpeditions.R;

import java.util.ArrayList;

public class StoreCartFragment extends Fragment {
    ArrayList<StoreGadgetsCart> storeGadgetsCarts;
    RecyclerView recy_store_cate,recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_store_cart, container, false);

        recyclerView= view.findViewById(R.id.recy_store_cate);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        storeGadgetsCarts = new ArrayList<>();

        storeGadgetsCarts.add(new StoreGadgetsCart(R.drawable.camera,"CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF","Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.","₹ 4,3660/-","Book Now  >"));
        storeGadgetsCarts.add(new StoreGadgetsCart(R.drawable.dcp_tshirt,"CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF","Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.","₹ 4,3660/-","Book Now  >"));
        storeGadgetsCarts.add(new StoreGadgetsCart(R.drawable.camera4,"CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF","Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.","₹ 4,3660/-","Book Now  >"));

        recyclerView.setAdapter(new StoreGadgetAdapter(storeGadgetsCarts));


        return view;
    }
}