package net.simplifiedcoding.data.repository

import net.simplifiedcoding.data.remote.UsersApi
import net.simplifiedcoding.data.remote.dto.UsersResponse
import net.simplifiedcoding.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val api: UsersApi
) : UserRepository {

    override suspend fun getUsers(page: Int, limit: Int): UsersResponse {
        return api.getUsers(page, limit)
    }
}