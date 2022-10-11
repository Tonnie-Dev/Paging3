package net.simplifiedcoding.domain.repository

import net.simplifiedcoding.domain.model.UsersResponse


interface UserRepository {

    suspend fun getUsers(page: Int, limit: Int): UsersResponse

}