package net.simplifiedcoding.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.simplifiedcoding.data.remote.UsersApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun provideUsersAPI(okHttpClient: OkHttpClient): UsersApi {

        val moshi =

        return Retrofit.Builder()
                .baseUrl(UsersApi.BASE_URL)
                .addConverterFactory()
                .client(okHttpClient)
                .build()
                .create()
    }


}