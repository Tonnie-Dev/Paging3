package net.simplifiedcoding.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.simplifiedcoding.data.network.UsersApi
import net.repository.UserRepository
import net.repository.UserRepositoryImpl

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideUsersApi(): UsersApi = UsersApi()

    @Provides
    fun provideUserRepository(api: UsersApi): net.repository.UserRepository =
        net.repository.UserRepositoryImpl(api)
}