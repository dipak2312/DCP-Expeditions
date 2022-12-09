package com.deepak.dcpexpeditions.Store;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.deepak.dcpexpeditions.Home.DiscoverCategoriesFragment;
import com.deepak.dcpexpeditions.PaymentConfirmationSuccessfulFragment;
import com.deepak.dcpexpeditions.R;

public class StoreShoppingCartFragment extends Fragment implements View.OnClickListener{
    Button btn_place_order,update_btn;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_store_shopping_cart, container, false);

        btn_place_order = view.findViewById(R.id.btn_place_order);
        btn_place_order.setOnClickListener(this);
        update_btn = view.findViewById(R.id.update_btn);
        update_btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        if (id==btn_place_order.getId()) {
            Fragment discover = new PaymentConfirmationSuccessfulFragment();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.frm_lay, discover).commit();

        }
        else if (id==update_btn.getId()){
            Fragment discover = new StoreFragment();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.frm_lay, discover).commit();
        }

    }
}