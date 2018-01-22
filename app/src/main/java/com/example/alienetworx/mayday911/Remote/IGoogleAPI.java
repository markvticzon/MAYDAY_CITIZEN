package com.example.alienetworx.mayday911.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Alienetworx on 1/22/2018.
 */

public interface IGoogleAPI {
    @GET
    Call<String>getPath(@Url String url);

}
