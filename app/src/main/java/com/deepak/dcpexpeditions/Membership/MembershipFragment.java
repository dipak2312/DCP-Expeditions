package com.deepak.dcpexpeditions.Membership;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.deepak.dcpexpeditions.R;


public class MembershipFragment extends Fragment implements View.OnClickListener{
    Button book_btn, button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_membership, container, false);

        button = view.findViewById(R.id.button);
        button.setOnClickListener(this);

        book_btn = view.findViewById(R.id.book_btn);
        book_btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();

        Fragment button = new MembershipInformationFragment();
        FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
        fm.replace(R.id.frm_lay, button).commit();

    }
}