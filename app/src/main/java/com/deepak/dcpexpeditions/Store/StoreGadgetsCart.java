package com.deepak.dcpexpeditions.Store;

public class StoreGadgetsCart {
    int camera;

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getCamera_title() {
        return camera_title;
    }

    public void setCamera_title(String camera_title) {
        this.camera_title = camera_title;
    }

    public String getCamera_features() {
        return camera_features;
    }

    public void setCamera_features(String camera_features) {
        this.camera_features = camera_features;
    }

    public String getCamera_price() {
        return camera_price;
    }

    public void setCamera_price(String camera_price) {
        this.camera_price = camera_price;
    }

    public String getButton_book() {
        return button_book;
    }

    public void setButton_book(String button_book) {
        this.button_book = button_book;
    }

    String camera_title,camera_features,camera_price,button_book;

    public StoreGadgetsCart (int camera, String camera_title, String camera_features, String camera_price, String button_book){
        this.camera = camera;
        this.camera_title = camera_title;
        this.camera_features = camera_features;
        this.camera_price = camera_price;
        this.button_book = button_book;


    }
}
