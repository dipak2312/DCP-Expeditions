package com.deepak.dcpexpeditions.Home;

public class DiscoverCategoryView {
    int blog_image;
    String txt_amount,blog_name,workshop_date,button;

    public int getBlog_image() {
        return blog_image;
    }

    public void setBlog_image(int blog_image) {
        this.blog_image = blog_image;
    }

    public String getTxt_amount() {
        return txt_amount;
    }

    public void setTxt_amount(String txt_amount) {
        this.txt_amount = txt_amount;
    }

    public String getBlog_name() {
        return blog_name;
    }

    public void setBlog_name(String blog_name) {
        this.blog_name = blog_name;
    }

    public String getWorkshop_date() {
        return workshop_date;
    }

    public void setWorkshop_date(String workshop_date) {
        this.workshop_date = workshop_date;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public DiscoverCategoryView (int blog_image, String txt_amount, String blog_name, String workshop_date, String button){
        this.blog_image = blog_image;
        this.blog_name = blog_name;
        this.txt_amount = txt_amount;
        this.workshop_date = workshop_date;
        this.button = button;
    }
}
