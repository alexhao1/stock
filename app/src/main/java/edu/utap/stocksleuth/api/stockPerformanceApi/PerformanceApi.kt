package edu.utap.stocksleuth.api.stockPerformanceApi

import android.text.SpannableString
import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement

import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.lang.reflect.Type

interface PerformanceApi {
//    @GET("api/v1/stock/candle?symbol={ticker}&resolution={res}&from={fromDate}&to={toDate}&token=cd3m8ciad3ic2v61etl0cd3m8ciad3ic2v61etlg")
//    suspend fun getPerformance(@Path("ticker") stock: String, @Path("res") resolution: String, @Path("fromDate") fromDate: String, @Path("toDate") toDate: String): PerformanceData
    @GET("api/v1/stock/candle")
    suspend fun getPerformance(@Query("symbol", encoded = true) stock: String, @Query("resolution",encoded = true) resolution:String,
    @Query("from",encoded=true) fromDate:String, @Query("to",encoded=true) toDate: String, @Query("token",encoded=true) token:String):PerformanceData







//    class Response(val postArrayJson: JSONArray){
//
//    }

    class SpannableDeserializer : JsonDeserializer<SpannableString> {
        // @Throws(JsonParseException::class)
        override fun deserialize(
            json: JsonElement,
            typeOfT: Type,
            context: JsonDeserializationContext
        ): SpannableString {
            return SpannableString(json.asString)
        }
    }
    companion object {
        // Tell Gson to use our SpannableString deserializer
        private fun buildGsonConverterFactory(): GsonConverterFactory {
            val gsonBuilder = GsonBuilder().registerTypeAdapter(
                SpannableString::class.java, SpannableDeserializer()
            )
            return GsonConverterFactory.create(gsonBuilder.create())
        }
        // Keep the base URL simple
//        private const val BASE_URL = "https://finnhub.io/api/v1/stock/symbol?exchange=US&token=cd3m8ciad3ic2v61etl0cd3m8ciad3ic2v61etlg"
        var httpurl = HttpUrl.Builder()
            .scheme("https")
            .host("www.finnhub.io") //find stock api
//            .host("api.polygon.io")
            .build()
        fun create(): PerformanceApi = create(httpurl)
        private fun create(httpUrl: HttpUrl): PerformanceApi {
            val client = OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().apply {
                    // Enable basic HTTP logging to help with debugging.
                    this.level = HttpLoggingInterceptor.Level.BASIC
                })
                .build()
            return Retrofit.Builder()
                .baseUrl(httpUrl)
                .client(client)
                .addConverterFactory(buildGsonConverterFactory())
                .build()
                .create(PerformanceApi::class.java)
        }
    }
}