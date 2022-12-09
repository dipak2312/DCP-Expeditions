package com.deepak.dcpexpeditions.Membership;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.deepak.dcpexpeditions.R;

public class MembershipInformationFragment extends Fragment implements View.OnClickListener {
    Button btn_next_one;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_membership_information, container, false);

        btn_next_one = view.findViewById(R.id.btn_next_one);
        btn_next_one.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {

        Fragment button = new MembershipPackagesFragment();
        FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
        fm.replace(R.id.frm_lay, button).commit();

    }
}