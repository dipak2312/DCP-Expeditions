package com.deepak.dcpexpeditions.More;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.deepak.dcpexpeditions.R;

public class ContactInfoFragment extends Fragment {
    Context context;
    TextView txt_address, txt_mobile_no, txt_email_id, txt_working_hour;
    String text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contact_info, container, false);

        txt_working_hour =(TextView)v.findViewById(R.id.txt_working_hour);
        text ="Working Hours: <br> Mon - Fri: 08:30AM - 06:00PM <br> Weekend: 08:30AM - 01:00PM";
        txt_working_hour.setText(Html.fromHtml(text));

        txt_mobile_no = (TextView)v.findViewById(R.id.txt_mobile_no);
        txt_email_id = (TextView)v.findViewById(R.id.txt_email_id);
        txt_address = (TextView)v.findViewById(R.id.txt_address);



        return v;
    }
}