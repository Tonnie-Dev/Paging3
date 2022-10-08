package net.simplifiedcoding.data.mapper

import net.simplifiedcoding.data.remote.dto.UsersResponseDTO
import net.simplifiedcoding.domain.model.UsersResponse

fun UsersResponseDTO.toModel(): UsersResponse {

    return UsersResponse(
            users = this.users,
            limit = this.limit,
            page = this.page,
            total = this.total
    )
}