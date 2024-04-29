package website.programming.drinkshop.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import website.programming.drinkshop.Utils.Common;

public class RetrofitClient {
    private Retrofit retrofit;
    private IDrinkShopAPI service;


    public RetrofitClient() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(Common.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.service = retrofit.create(IDrinkShopAPI.class);
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public IDrinkShopAPI getService() {
        return service;
    }
}