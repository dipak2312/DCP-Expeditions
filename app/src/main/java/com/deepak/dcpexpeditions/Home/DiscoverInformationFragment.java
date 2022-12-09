package com.deepak.dcpexpeditions.Home;

import android.content.Context;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.deepak.dcpexpeditions.Membership.MembershipDoneFragment;
import com.deepak.dcpexpeditions.R;

public class DiscoverInformationFragment extends Fragment implements View.OnClickListener{
    Context context;
    RelativeLayout rel_user_info,rel_camera_info,rel_final_steps;
    Button btn_next_one,btn_next_two,btn_submit;
    ImageView img_one,img_two,img_three;
    EditText edit_full_name,edit_mobile_no,edit_email_id,edit_address,edit_state,edit_city,edit_pincode;
    CheckBox check_terms_condition;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_discover_information, container, false);
        context=getActivity();

        btn_next_one=(Button)v.findViewById(R.id.btn_next_one);
        btn_next_one.setOnClickListener(this);
        btn_next_two=(Button)v.findViewById(R.id.btn_next_two);
        btn_next_two.setOnClickListener(this);
        btn_submit=(Button)v.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(this);

        img_one=(ImageView)v.findViewById(R.id.img_one);
        img_two=(ImageView)v.findViewById(R.id.img_two);
        img_three=(ImageView)v.findViewById(R.id.img_three);

        rel_camera_info=(RelativeLayout)v.findViewById(R.id.rel_camera_info);
        rel_user_info=(RelativeLayout)v.findViewById(R.id.rel_user_info);
        rel_final_steps=(RelativeLayout)v.findViewById(R.id.rel_final_steps);

        edit_full_name=(EditText)v.findViewById(R.id.edit_full_name);
        edit_mobile_no=(EditText)v.findViewById(R.id.edit_mobile_no);
        edit_email_id=(EditText)v.findViewById(R.id.edit_email_id);
        edit_address=(EditText)v.findViewById(R.id.edit_address);
        edit_state=(EditText)v.findViewById(R.id.edit_state);
        edit_city=(EditText)v.findViewById(R.id.edit_city);
        edit_pincode=(EditText)v.findViewById(R.id.edit_pincode);

        return v;
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();

        if(id==btn_next_one.getId()) {
            /*if (edit_full_name.getText().toString().trim().equals("")) {
                edit_full_name.requestFocus();
                edit_full_name.setError("Full Name can't be blank");
            } else if (edit_mobile_no.getText().toString().trim().equals("")) {
                edit_mobile_no.requestFocus();
                edit_mobile_no.setError("Mobile No. can't be blank");
            } else if (edit_email_id.getText().toString().trim().equals("")) {
                edit_email_id.requestFocus();
                edit_email_id.setError("Email Id can't be blank");
            } else if (edit_address.getText().toString().trim().equals("")) {
                edit_address.requestFocus();
                edit_address.setError("Address can't be blank");
            } else if (edit_state.getText().toString().trim().equals("")) {
                edit_state.requestFocus();
                edit_state.setError("State can't be blank");
            } else if (edit_city.getText().toString().trim().equals("")) {
                edit_city.requestFocus();
                edit_city.setError("City can't be blank");
            } else if (edit_pincode.getText().toString().trim().equals("")) {
                edit_pincode.requestFocus();
                edit_pincode.setError("Pincode can't be blank");
            } else*/ {
                img_one.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.one));
                img_two.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.two));
                rel_user_info.setVisibility(View.GONE);
                rel_camera_info.setVisibility(View.VISIBLE);
            }
        }



        else if(id==btn_next_two.getId())
        {
            img_one.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.one));
            img_two.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.two_icon));
            img_three.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.three));
            rel_user_info.setVisibility(View.GONE);
            rel_camera_info.setVisibility(View.GONE);
            rel_final_steps.setVisibility(View.VISIBLE);

        }
        else if(id==btn_submit.getId())
        {
            DiscoverDoneFragment submit = new DiscoverDoneFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.frm_lay, submit);
            ft.addToBackStack(null);
            ft.commit();

        }
    }
}