package com.deepak.dcpexpeditions.Home;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.deepak.dcpexpeditions.Membership.MembershipDoneFragment;
import com.deepak.dcpexpeditions.PaymentConfirmationSuccessfulFragment;
import com.deepak.dcpexpeditions.R;


public class DiscoverDoneFragment extends Fragment implements View.OnClickListener{
    Button make_payment_btn;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discover_done, container, false);
        make_payment_btn=(Button)view.findViewById(R.id.make_payment_btn);
        make_payment_btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();

        PaymentConfirmationSuccessfulFragment submit = new PaymentConfirmationSuccessfulFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.frm_lay, submit);
        ft.addToBackStack(null);
        ft.commit();
    }
}