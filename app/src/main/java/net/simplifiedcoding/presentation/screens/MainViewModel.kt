package net.simplifiedcoding.presentation.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import net.simplifiedcoding.data.paging_source.UsersDataSource
import net.simplifiedcoding.domain.repository.UserRepository

import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: UserRepository
) : ViewModel() {
    val pager = Pager(
            config = PagingConfig(pageSize = 20),
            pagingSourceFactory = {
                UsersDataSource(repository = repo)
            }).flow
            .cachedIn(viewModelScope)
}