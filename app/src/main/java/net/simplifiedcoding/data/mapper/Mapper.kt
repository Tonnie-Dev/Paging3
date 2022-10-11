package net.simplifiedcoding.data.mapper

import net.simplifiedcoding.data.remote.dto.UserDTO
import net.simplifiedcoding.data.remote.dto.UsersResponseDTO
import net.simplifiedcoding.domain.model.User
import net.simplifiedcoding.domain.model.UsersResponse

fun UsersResponseDTO.toModel(): UsersResponse {

    return UsersResponse(
            users = this.users,
            limit = this.limit,
            page = this.page,
            total = this.total
    )
}

fun UserDTO.toModel(): User {

    return User(
            firstName = this.firstName,
            id = this.id,
            lastName = this.lastName,
            picture = this.picture,
            title = this.title
    )
}