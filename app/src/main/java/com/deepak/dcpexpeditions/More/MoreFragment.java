package com.deepak.dcpexpeditions.More;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.deepak.dcpexpeditions.R;


public class MoreFragment extends Fragment implements View.OnClickListener{
    Context context;
    RelativeLayout rel_about_us,rel_contact_info;
    TextView about;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_more, container, false);
        context=getActivity();

        rel_about_us=(RelativeLayout)v.findViewById(R.id.rel_about_us);
        rel_about_us.setOnClickListener(this);
        rel_contact_info=(RelativeLayout)v.findViewById(R.id.rel_contact_info);
        rel_contact_info.setOnClickListener(this);

        return v;

    }

    @Override
    public void onClick(View view) {

        int id=view.getId();

        if(id==rel_about_us.getId())
        {

            MoreAboutFragment about = new MoreAboutFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.frame_more, about);
            ft.addToBackStack(null);
            ft.commit();
        }
        else  {
            ContactInfoFragment contact = new ContactInfoFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.frame_more, contact);
            ft.addToBackStack(null);
            ft.commit();
        }
        }

    }
