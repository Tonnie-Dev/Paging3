package net.simplifiedcoding.data.remote.dto


import com.squareup.moshi.Json
import net.simplifiedcoding.domain.model.User


data class UsersResponseDTO(
    @Json(name = "data")
    val users: List<User>,
    @Json(name = "limit")
    val limit: Int,
    @Json(name = "page")
    val page: Int,
    @Json(name = "total")
    val total: Int
)