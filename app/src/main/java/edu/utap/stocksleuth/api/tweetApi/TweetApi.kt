package edu.utap.stocksleuth.api.tweetApi

import android.text.SpannableString
import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import edu.utap.stocksleuth.api.stockApi.StockApi
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.lang.reflect.Type

interface TweetApi {
    @GET("/1.1/search/tweets.json") //idk what to put here to get this to work
    suspend fun getTweets(@Query(value="q",encoded=true) subreddit: String): Statuses

    data class Statuses(val statuses: List<Tweet>)



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
            .host("api.twitter.com") //find tweet api
//            .host("api.polygon.io")
            .build()
        fun create(): TweetApi = create(httpurl)
        private fun create(httpUrl: HttpUrl): TweetApi {
            val token = TokenInterceptor()
            val client = OkHttpClient.Builder()
                .addInterceptor(token)
                .build()
            return Retrofit.Builder()
                .baseUrl(httpUrl)
                .client(client)
                .addConverterFactory(buildGsonConverterFactory())
                .build()
                .create(TweetApi::class.java)
        }
    }
}