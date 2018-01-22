package com.example.alienetworx.mayday911.Common;


import com.example.alienetworx.mayday911.Remote.IGoogleAPI;
import com.example.alienetworx.mayday911.Remote.RetrofitClient;

public class Common {

    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }


}
