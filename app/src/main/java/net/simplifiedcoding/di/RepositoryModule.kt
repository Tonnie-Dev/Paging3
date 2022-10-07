package net.simplifiedcoding.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.simplifiedcoding.data.repository.UserRepositoryImpl
import net.simplifiedcoding.domain.repository.UserRepository
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)


abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun provideUserRepository(userRepository: UserRepositoryImpl):UserRepository

}