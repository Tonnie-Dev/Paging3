package net.simplifiedcoding.data.remote

import net.simplifiedcoding.data.remote.dto.UsersResponseDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface UsersApi {

    @GET("user")
    suspend fun getUsers(@Query("page") page: Int, @Query("limit") limit: Int): UsersResponseDTO


    companion object {

         const val BASE_URL = "https://dummyapi.io/data/v1/"

       /* operator fun invoke(): UsersApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(getRetrofitClient())
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
                .create(UsersApi::class.java)
        }

        private fun getRetrofitClient(): OkHttpClient {
            return OkHttpClient.Builder()
                .addInterceptor { chain ->
                    chain.proceed(chain.request().newBuilder().also {
                        it.addHeader("Accept", "application/json")
                        it.addHeader("app-id", "62cceaafb592b449c3aad899")
                    }.build())
                }.also { client ->
                    if (BuildConfig.DEBUG) {
                        val logging = HttpLoggingInterceptor()
                        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
                        client.addInterceptor(logging)
                    }
                }.build()
        }*/
    }

}