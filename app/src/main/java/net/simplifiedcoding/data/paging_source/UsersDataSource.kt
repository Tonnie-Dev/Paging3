package net.simplifiedcoding.data.paging_source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import net.simplifiedcoding.domain.model.User
import net.simplifiedcoding.domain.repository.UserRepository
import net.simplifiedcoding.util.PAGE_ITEMS_LIMIT
import timber.log.Timber


class UsersDataSource(private val repository: UserRepository) : PagingSource<Int, User>() {

    //get the anchor page from anchor position
    override fun getRefreshKey(state: PagingState<Int, User>): Int? {


        //extract non-null anchor position from state
        return state.anchorPosition?.let { anchorPosition ->

            val anchorPage = state.closestPageToPosition(anchorPosition)

            //return anchor page now
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)

        }
    }

    //asynchronously fetch data to be displayed
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, User> {
        return try {
            // Start refresh at page 1 if undefined, to be used by repo fxn
            val nextPage = params.key ?: 1

            //data - to used at returned LoadResult.Page
            val response = repository.getUsers(
                    page = nextPage,
                    limit = PAGE_ITEMS_LIMIT
            )

            //return LoadResult.Page
            LoadResult.Page(
                    data = response.users,
                    prevKey = null, // Only paging forward
                    nextKey = if (response.users.isNotEmpty()) //from response
                        response.page + 1 else null,

                    )
        } catch (e: Exception) {
            Timber.i("Error Caught in load() - $e")
            LoadResult.Error(e)



        }
    }
}


