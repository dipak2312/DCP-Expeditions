package com.deepak.dcpexpeditions.More;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.deepak.dcpexpeditions.R;


public class MoreAboutFragment extends Fragment implements View.OnClickListener {
    TextView dcp;
    RelativeLayout rel_about_us,rel_contact_info;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_more_about, container, false);

        dcp = (TextView)v.findViewById(R.id.dcp);
        dcp.setOnClickListener(this);
        rel_contact_info=(RelativeLayout)v.findViewById(R.id.rel_contact_info);
        rel_contact_info.setOnClickListener(this);
        rel_about_us=(RelativeLayout)v.findViewById(R.id.rel_about_us);
        rel_about_us.setOnClickListener(this);

        return v;

    }
    @Override
    public void onClick(View view) {
        int id=view.getId();

        if(id==dcp.getId())
        {

            AboutAppFragment about_app = new AboutAppFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.frame_more, about_app);
            ft.addToBackStack(null);
            ft.commit();
        }
        if(id==rel_contact_info.getId())
        {
            ContactInfoFragment contact = new ContactInfoFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.frame_more, contact);
            ft.addToBackStack(null);
            ft.commit();
        }
    }
}