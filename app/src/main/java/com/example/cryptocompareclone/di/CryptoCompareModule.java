package com.example.cryptocompareclone.di;

import com.example.cryptocompareclone.network_utils.CryptoCompareApi;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class CryptoCompareModule {

    @Provides
    @Singleton
  public static Retrofit getRetrofitInstance()
    {
         return new Retrofit.Builder().baseUrl(CryptoCompareApi.BASE_URL)
                       .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                         .build();

    }
    @Singleton
    @Provides
    static CryptoCompareApi provideNewsApi(Retrofit retrofit){
        return retrofit.create(CryptoCompareApi.class);
    }
}
