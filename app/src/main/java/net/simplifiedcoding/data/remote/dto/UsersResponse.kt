package net.simplifiedcoding.data.remote.dto


import com.squareup.moshi.Json
import net.simplifiedcoding.data.remote.dto.User


data class UsersResponse(
    @field:Json(name = "data")
    val users: List<User>,
    @field:Json(name = "limit")
    val limit: Int,
    @field:Json(name = "page")
    val page: Int,
    @field:Json(name = "total")
    val total: Int
)