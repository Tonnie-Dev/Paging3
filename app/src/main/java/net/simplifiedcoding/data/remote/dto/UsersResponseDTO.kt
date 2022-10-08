package net.simplifiedcoding.data.remote.dto


import com.squareup.moshi.Json
import net.simplifiedcoding.domain.model.User


data class UsersResponseDTO(
    @field:Json(name = "data")
    val users: List<User>,
    @field:Json(name = "limit")
    val limit: Int,
    @field:Json(name = "page")
    val page: Int,
    @field:Json(name = "total")
    val total: Int
)