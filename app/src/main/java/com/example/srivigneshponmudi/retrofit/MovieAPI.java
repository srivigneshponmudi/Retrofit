package com.example.srivigneshponmudi.retrofit;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SrivigneshPonmudi on 5/25/17.
 */

public interface MovieAPI {

    @GET("/3/movie/popular?api_key=451f08ef9a397e2de0c88ca0444d730c")
    Call<ArrayList<Movie>> listRepos();

}
