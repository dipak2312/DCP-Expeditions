package com.deepak.dcpexpeditions.Store;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.deepak.dcpexpeditions.Adapter.StoreAdapter;
import com.deepak.dcpexpeditions.Adapter.StoreGadgetAdapter;
import com.deepak.dcpexpeditions.R;

import java.util.ArrayList;


public class StoreFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    Spinner spinner_cate;
    Context context;
    ArrayList<StoreCart> storecart;
    StoreAdapter adapter;
    StoreGadgetAdapter gadgetAdapter;
    ArrayList<StoreGadgetsCart> storeGadgetsCarts;
    RecyclerView recyclerView, recy_store_category, recy_store_cate;
    String selecteditem;
    ArrayList<String> discoverList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_store, container, false);
        context = getActivity();
        recyclerView = v.findViewById(R.id.recy_store_category);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        storecart = new ArrayList<>();

        storecart.add(new StoreCart(R.drawable.camera, "CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF", "Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.", "₹ 4,3660/-", "Book Now  >"));
        storecart.add(new StoreCart(R.drawable.camera, "CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF", "Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.", "₹ 4,3660/-", "Book Now  >"));
        storecart.add(new StoreCart(R.drawable.camera2, "CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF", "Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.", "₹ 4,3660/-", "Book Now  >"));
        storecart.add(new StoreCart(R.drawable.camera3, "CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF", "Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.", "₹ 4,3660/-", "Book Now  >"));
        storecart.add(new StoreCart(R.drawable.camera4, "CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF", "Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.", "₹ 4,3660/-", "Book Now  >"));
        storecart.add(new StoreCart(R.drawable.camera5, "CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF", "Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.", "₹ 4,3660/-", "Book Now  >"));
        storecart.add(new StoreCart(R.drawable.camera6, "CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF", "Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.", "₹ 4,3660/-", "Book Now  >"));
        storecart.add(new StoreCart(R.drawable.camera7, "CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF", "Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.", "₹ 4,3660/-", "Book Now  >"));
        storecart.add(new StoreCart(R.drawable.camera8, "CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF", "Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.", "₹ 4,3660/-", "Book Now  >"));
        storecart.add(new StoreCart(R.drawable.camera, "CANON 100 – 400 MM F/4.5 – 5.6 IS II, EF", "Versatile, portable super-telephoto zoom lens. Superb image quality right across the frame. Prevent camera shake with a 4-stop Image Stabilizer. Customise the feel of the zoom control for different situations.", "₹ 4,3660/-", "Book Now  >"));
        recyclerView.setAdapter(new StoreAdapter(storecart));

        discoverList = new ArrayList<>();
        discoverList.add("Discover Category");
        discoverList.add("Gadget");


        spinner_cate = v.findViewById(R.id.spinner_cate);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), R.layout.spinner, discoverList);
        spinner_cate.setAdapter(adapter);

        spinner_cate.setOnItemSelectedListener(this);

        return v;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        //Toast.makeText(context, discoverList.get(position), Toast.LENGTH_SHORT).show();

        selecteditem = adapterView.getItemAtPosition(position).toString();

        /*if(!selecteditem.equals("Discover Category")) {
            getStoreList(selecteditem);
        }
        else{
            selecteditem.equals("Gadget");
            getStoreGadget(selecteditem);
        }*/

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    /*private void getStoreList(String selecteditem) {
        String.format("storecart%s", selecteditem);
        getStoreList(selecteditem);
        //txt_count.setText("Count"+" "+"-"+" "+String.valueOf(storecart.size()));
        adapter = new StoreAdapter(context, storecart);
        recy_store_category.setAdapter(adapter);

         //getStoreList(selecteditem);
        adapter=new StoreAdapter(context,storecart);
        recy_store_category.setAdapter(adapter);
    }

    private void getStoreGadget(String selecteditem) {
        storecart.clear();
        //storecart=selecteditem.equals();
        gadgetAdapter = new StoreGadgetAdapter(context, storeGadgetsCarts);
        recy_store_cate.setAdapter(gadgetAdapter);

    }*/
    }




