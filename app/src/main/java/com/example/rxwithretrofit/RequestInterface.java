package com.example.rxwithretrofit;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("endPoint")
    Observable<Pojo> getData();
}
