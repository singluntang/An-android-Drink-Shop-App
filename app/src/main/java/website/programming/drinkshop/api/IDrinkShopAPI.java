package website.programming.drinkshop.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import website.programming.drinkshop.Model.CheckUserResponse;
import website.programming.drinkshop.Model.Result;
import website.programming.drinkshop.Model.User;
import website.programming.drinkshop.Model.Result;

public interface IDrinkShopAPI {

    @FormUrlEncoded
    @POST("register")
    Call<Result> createUser(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password,
            @Field("gender") String gender);


    @FormUrlEncoded
    @POST("login")
    Call<Result> userLogin(
            @Field("email") String email,
            @Field("password") String password
    );

}
