package com.deepak.dcpexpeditions.Home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.deepak.dcpexpeditions.R;

public class HomeFragment extends Fragment implements View.OnClickListener {
    TextView discover_cate, discover_category;
    Button book_btn1,book_btn2,book_btn3,book_btn4;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        discover_cate = view.findViewById(R.id.discover_cate);
        discover_cate.setOnClickListener(this);
        discover_category = view.findViewById(R.id.discover_category);
        discover_category.setOnClickListener(this);
        book_btn1 = view.findViewById(R.id.book_btn1);
        book_btn1.setOnClickListener(this);
        book_btn2 = view.findViewById(R.id.book_btn2);
        book_btn2.setOnClickListener(this);
        book_btn3 = view.findViewById(R.id.book_btn3);
        book_btn3.setOnClickListener(this);
        book_btn4 = view.findViewById(R.id.book_btn4);
        book_btn4.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        if (id==discover_cate.getId()) {
            Fragment discover = new DiscoverCategoriesFragment();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.frm_lay, discover).commit();

        }
        else if (id==discover_category.getId()){
            Fragment discover = new DiscoverCategoriesFragment();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.frm_lay, discover).commit();
        }
        else if (id==book_btn1.getId()){
            Fragment discover = new DiscoverSingleFragment();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.frm_lay, discover).commit();
        }
        else if (id==book_btn2.getId()){
            Fragment discover = new DiscoverSingleFragment();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.frm_lay, discover).commit();
        }
        else if (id==book_btn3.getId()){
            Fragment discover = new DiscoverSingleFragment();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.frm_lay, discover).commit();
        }
        else if (id==book_btn4.getId()){
            Fragment discover = new DiscoverSingleFragment();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.frm_lay, discover).commit();
        }
    }
}
