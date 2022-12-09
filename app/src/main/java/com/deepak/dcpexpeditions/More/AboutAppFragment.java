package com.deepak.dcpexpeditions.More;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.deepak.dcpexpeditions.R;


public class AboutAppFragment extends Fragment {
    TextView txt_about_app;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_about_app, container, false);

        txt_about_app = (TextView)v.findViewById(R.id.txt_about_app);



        String content="DCP Expeditions LLP today, is one of the fastest growing Photography Training Academies in India, with a strong team comprising of highly skilled and established photographers of the country and veterans in the field of digital photography. We boast of one of the best panel of experts comprising of renowned wildlife photographers, travel photographers, food photographers, astro photographers, photo journalists, digital artists, travelers, writers, divers, explorers, naturalists, conservationists, taxonomists, microbiologists, scientists, environmental biologists and digital imaging specialists. <br>" +
                " <br>" +
                "We are also the first in the country to have created a nationwide community platform involving wildlife, nature and travel photographers together ranging from amateurs to professionals, to build a very unique ecosystem. Our vision is to make Wildlife and Travel Photography a full time career opportunity for thousands of wildlife and travel enthusiasts of the country. Our team of experts handhold and facilitate personalized knowledge sharing to help one sharpen the skills fast and eventually join the crew. We educate, recruit, train, empower and create entrepreneurs who in turn, take the mission ahead.<br>" +
                " <br>" +
                "For every workshop we conduct and every expedition or photo tour we lead, in addition to the development of photographic skill sets, conservation photography remains one of the key learning element. We help people to learn how to make better images and how to use photography as a tool to depict the untold and unseen beauties of this world. We work in association with environmentalists, conservation activists, naturalists, scientists and researchers in an attempt to impart knowledge and generate awareness amongst common man about the earth’s natural history.";

        txt_about_app.setText(Html.fromHtml(content));
        return v;

    }
}