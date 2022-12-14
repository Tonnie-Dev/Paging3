package net.simplifiedcoding.data.repository

import net.simplifiedcoding.data.mapper.toModel
import net.simplifiedcoding.data.remote.UsersApi

import net.simplifiedcoding.domain.model.UsersResponse
import net.simplifiedcoding.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val api: UsersApi
) : UserRepository {

    override suspend fun getUsers(page: Int, limit: Int): UsersResponse {
        return api.getUsers(page, limit).toModel()
    }
}