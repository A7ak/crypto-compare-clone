package com.example.cryptocompareclone.ui.watchlist;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.cryptocompareclone.R;

import com.squareup.picasso.Picasso;

import com.example.cryptocompareclone.di.application.ViewModelProviderFactory;
import com.example.cryptocompareclone.models.watchlist.CurrencyResponsePage;
import com.example.cryptocompareclone.ui.news.NewsViewModel;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

public class WatchListFragment extends DaggerFragment {

    private WatchlistViewModel watchlistViewModel;

    @Inject
    ViewModelProviderFactory viewModelProviderFactory;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_watchlist, container, false);
          final TextView textView = rootView.findViewById(R.id.text_home);
         // final TextView textView1 = rootView.findViewById(R.id.textView);
        watchlistViewModel = ViewModelProviders.of(this,viewModelProviderFactory).get(WatchlistViewModel.class);
         watchlistViewModel.getCurrencyResponse();
        watchlistViewModel.observeCurrencyResponse().observe(this, new Observer<CurrencyResponsePage>() {

            @Override
            public void onChanged(CurrencyResponsePage currencyResponsePage) {
                textView.setText(currencyResponsePage.getData().get(0).getCoinInfo().getId());
           //     textView1.setText(" "+currencyResponsePage.getData().get(1).getCoinInfo().getAlgorithm());
                Log.d("iam"," "+currencyResponsePage.getData().get(0).getDISPLAY().getUSD().getCHANGEDAY());
            }
        });


        //fetchCoinData();

        final TextView topVolume = rootView.findViewById(R.id.top_volume);
        final TextView following = rootView.findViewById(R.id.following);
        ImageView coin = rootView.findViewById(R.id.coin_image);
        Picasso.get().load("https://www.cryptocompare.com/media/19633/btc.png?width=100").into(coin);
        topVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topVolume.setBackgroundColor(getResources().getColor(R.color
                        .following_onclick_green_color));
                topVolume.setTextColor(getResources().getColor(R.color.default_white_color));
                following.setBackgroundColor(getResources().getColor(R.color.default_white_color));
                following.setTextColor(getResources().getColor(R.color.default_black_color));
            }
        });
        following.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topVolume.setBackgroundColor(getResources().getColor(R.color.default_white_color));
                topVolume.setTextColor(getResources().getColor(R.color.default_black_color));
                following.setBackgroundColor(getResources().getColor(R.color
                        .following_onclick_green_color));
                following.setTextColor(getResources().getColor(R.color.default_white_color));
            }
        });


        return rootView;
    }

    private void fetchCoinData() {
/*        String BASE_URL = "https://min-api.cryptocompare.com/data/top/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CryptoCompareApi cryptoCompareApi = retrofit.create(CryptoCompareApi.class);
        Call<CurrencyResponse> call = cryptoCompareApi.currencyList("USD");
        call.enqueue(new Callback<CurrencyResponse>() {
            @Override
            public void onResponse(Call<CurrencyResponse> call, Response<CurrencyResponse> response) {
                Log.d("tag", "onResponse: "+ response.body().getData().size());
            }

            @Override
            public void onFailure(Call<CurrencyResponse> call, Throwable t) {
                Log.d("tag", "onFailure: ");
            }
        });
  */
        //return rootView;
    }
}