package com.frans_riz.movienow.API;

public class Server {

    public static final String BASE_URL_API = "https://api.themoviedb.org/";

    public static MovieApi getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(MovieApi.class);
    }

}
