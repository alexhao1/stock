package edu.utap.stocksleuth.api.stockApi

import android.text.SpannableString
import com.google.gson.*
import com.google.gson.reflect.TypeToken
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONArray
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.lang.reflect.Type


interface StockApi {

    @GET("api/v1/stock/symbol?exchange=US&token=cd3m8ciad3ic2v61etl0cd3m8ciad3ic2v61etlg")
    suspend fun getStocks(): List<Stock>






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
            .build()
        fun create(): StockApi = create(httpurl)
        private fun create(httpUrl: HttpUrl): StockApi {
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
                .create(StockApi::class.java)
        }
    }
}