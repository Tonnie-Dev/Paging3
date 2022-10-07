package net.simplifiedcoding.domain.repository

import net.simplifiedcoding.data.remote.UsersResponse

interface UserRepository {

    suspend fun getUsers(page: Int, limit: Int): UsersResponse

}