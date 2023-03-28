package com.example.coincap.data.remote

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiDetails {

    const val BASE_URL = "https://api.coincap.io"
    const val BASE_URL_Assets = "/v2/assets"
    const val BASE_URL_Rates = "/v2/rates"
    const val BASE_URL_Exchanges = "/v2/exchanges"
    const val BASE_URL_Markets = "/v2/markets"

    fun getInstance(baseUrl: String): Retrofit =
        Retrofit.Builder()      //its pattern that helps build an object with different properties
            .baseUrl(baseUrl)  // setting the common BASE url for all
            .addConverterFactory(GsonConverterFactory.create(Gson()))    //Convert your JSON data to Data class
            .build()     // finalize the object/builder

}


   /* fun getRates(): Retrofit =
        Retrofit.Builder()      //its pattern that helps build an object with different properties
            .baseUrl(BASE_URL_Rates)  // setting the common BASE url for all
            .addConverterFactory(GsonConverterFactory.create(Gson()))    //Convert your JSON data to Data class
            .client(client)
            .build()     // finalize the object/builder




    fun getExchanges(): Retrofit =
        Retrofit.Builder()      //its pattern that helps build an object with different properties
            .baseUrl(BASE_URL_Exchanges)  // setting the common BASE url for all
            .addConverterFactory(GsonConverterFactory.create(Gson()))    //Convert your JSON data to Data class
            .client(client)
            .build()     // finalize the object/builder



    fun getMarkets(): Retrofit =
        Retrofit.Builder()      //its pattern that helps build an object with different properties
            .baseUrl(BASE_URL_Markets)  // setting the common BASE url for all
            .addConverterFactory(GsonConverterFactory.create(Gson()))    //Convert your JSON data to Data class
            .client(client)
            .build()     // finalize the object/builder*/
