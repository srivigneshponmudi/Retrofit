package com.example.srivigneshponmudi.retrofit;

import com.example.srivigneshponmudi.retrofit.Data.remote.RetrofitClient;
import com.example.srivigneshponmudi.retrofit.Data.remote.SOService;

/**
 * Created by SrivigneshPonmudi on 6/20/17.
 */

public class APIutils {
    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
