package net.simplifiedcoding.data.paging_source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import net.simplifiedcoding.data.remote.dto.User
import net.simplifiedcoding.domain.repository.UserRepository

class UsersDataSource (repository: UserRepository): PagingSource<Int, User>() {
    override fun getRefreshKey(state: PagingState<Int, User>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, User> {
        TODO("Not yet implemented")
    }
}