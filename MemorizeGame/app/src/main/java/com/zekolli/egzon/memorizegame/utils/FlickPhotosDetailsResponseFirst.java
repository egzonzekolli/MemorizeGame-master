package com.zekolli.egzon.memorizegame.utils;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Egzoni on 5/27/2018.
 */

public class FlickPhotosDetailsResponseFirst {

    @SerializedName("photos")
    private FlickPhotosDetailsResponse photos;

    @SerializedName("stat")
    private String stat;

    public FlickPhotosDetailsResponse getPhotos() {
        return photos;
    }

    public void setPhotos(FlickPhotosDetailsResponse photos) {
        this.photos = photos;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}
