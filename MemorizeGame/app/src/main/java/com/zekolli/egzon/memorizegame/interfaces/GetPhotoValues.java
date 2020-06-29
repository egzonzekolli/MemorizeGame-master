package com.zekolli.egzon.memorizegame.interfaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Egzoni on 5/27/2018.
 */

public interface GetPhotoValues {
    String BASE_URL = "https://api.flickr.com/services/rest/";

    @GET
    Call<com.zekolli.egzon.memorizegame.utils.FlickPhotosDetailsResponseFirst> getFlickPhotosDetails(
            @Url String url
    );
}
