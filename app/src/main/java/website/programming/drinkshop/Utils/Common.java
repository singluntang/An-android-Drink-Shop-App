package website.programming.drinkshop.Utils;

import website.programming.drinkshop.Model.User;

public class Common {
    //In Emulator, localhost = 10.0.2.2
    public static final String BASE_URL = "http://223.16.1.248/RetrofitExample/public/";
    //public static final String SERVER_URL = "http://wineofthenight.000webhostapp.com/RetrofitExample/public/";

    public static User currentUser;
/*
    public static IDrinkShopAPI getAPI()
    {
        //Retrofit retrofitClient = RetrofitClient.getClient(BASE_URL);
        return retrofitClient.create(IDrinkShopAPI.class);

    }*/
}
