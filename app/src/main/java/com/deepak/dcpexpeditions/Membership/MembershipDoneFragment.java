package com.deepak.dcpexpeditions.Membership;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.deepak.dcpexpeditions.PaymentConfirmationSuccessfulFragment;
import com.deepak.dcpexpeditions.R;


public class MembershipDoneFragment extends Fragment implements View.OnClickListener {
    Button btn_make_payment;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_membership_done, container, false);

        btn_make_payment=view.findViewById(R.id.btn_make_payment);

        btn_make_payment.setOnClickListener(this);

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