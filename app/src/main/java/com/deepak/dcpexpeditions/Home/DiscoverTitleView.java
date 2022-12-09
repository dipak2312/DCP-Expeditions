package com.deepak.dcpexpeditions.Home;

import android.widget.RelativeLayout;
import android.widget.TextView;

public class DiscoverTitleView {
    String txt_categories;

    public String getTxt_categories() {
        return txt_categories;
    }

    public void setTxt_categories(String txt_categories) {
        this.txt_categories = txt_categories;
    }

    public String getTxt_arrow() {
        return txt_arrow;
    }

    public void setTxt_arrow(String txt_arrow) {
        this.txt_arrow = txt_arrow;
    }

    String txt_arrow;

    public DiscoverTitleView (String txt_categories, String txt_arrow) {
        this.txt_categories = txt_categories;
        this.txt_arrow = txt_arrow;

    }
}
