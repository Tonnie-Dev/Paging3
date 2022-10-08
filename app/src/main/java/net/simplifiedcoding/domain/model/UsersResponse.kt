package net.simplifiedcoding.domain.model

data class UsersResponse(
    val users: List<User>,
    val limit: Int,
    val page: Int,
    val total: Int
)
