package net.simplifiedcoding.presentation.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import net.simplifiedcoding.domain.repository.UserRepository

import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: UserRepository
) : ViewModel() {

}