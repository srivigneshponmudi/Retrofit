package com.example.srivigneshponmudi.retrofit.Data.remote;

import com.example.srivigneshponmudi.retrofit.Data.Model.SOAnswersResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by SrivigneshPonmudi on 6/20/17.
 */

public interface SOService {

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Observable<SOAnswersResponse> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Observable<SOAnswersResponse> getAnswers(@Query("tagged") String tags);

}
