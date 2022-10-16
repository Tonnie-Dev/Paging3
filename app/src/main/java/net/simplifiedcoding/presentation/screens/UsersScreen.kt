package net.simplifiedcoding.presentation.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import net.simplifiedcoding.presentation.screens.components.ErrorItem
import net.simplifiedcoding.presentation.screens.components.LoadingItem
import net.simplifiedcoding.presentation.ui.UserCard


@Composable
fun UsersScreen(viewModel: MainViewModel = hiltViewModel()) {

    //LazyPagingItems - class responsible for accessing the data from a Flow of PagingData
    val users = viewModel.pager.collectAsLazyPagingItems()

    LazyColumn(contentPadding = PaddingValues(16.dp),
            content = {

                items(users) {

                    users ->
                    users?.let {

                        UserCard(user = it)
                    }
                }


                when (users.loadState.append) {
                    is LoadState.NotLoading -> Unit
                    LoadState.Loading -> {
                        item { LoadingItem() }
                    }
                    is LoadState.Error -> {
                        item {
                            ErrorItem(message = (users.loadState.append as LoadState.Error).error.message.toString())
                        }
                    }
                }

            })



}