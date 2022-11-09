package edu.utap.stocksleuth.api.congressApi

import android.text.SpannableString
import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import edu.utap.stocksleuth.api.tweetApi.CongressTokenInterceptor
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import java.lang.reflect.Type

interface CongressApi {
    @GET("/beta/historical/congresstrading/{stock}") //idk what to put here to get this to work
    suspend fun getCongress(@Path("stock") stock: String): List<Congress>

//    data class Statuses(val statuses: List<Tweet>)


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
        var httpurl = HttpUrl.Builder()
            .scheme("https")
            .host("api.quiverquant.com") //find congress api
//            .host("api.polygon.io")
            .build()
        fun create(): CongressApi = create(httpurl)
        private fun create(httpUrl: HttpUrl): CongressApi {
            val token = CongressTokenInterceptor()
            val client = OkHttpClient.Builder()
                .addInterceptor(token)
                .build()
            return Retrofit.Builder()
                .baseUrl(httpUrl)
                .client(client)
                .addConverterFactory(buildGsonConverterFactory())
                .build()
                .create(CongressApi::class.java)
        }
    }
}