package com.example.api_one

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CommentViewModel:ViewModel() {
    private val repository = CommentRepo()

    private val _creditCards = MutableLiveData<List<Comments>?>()
    val creditCards: MutableLiveData<List<Comments>?> = _creditCards

    fun fetchCreditCards() {
        viewModelScope.launch {
            try {
                val cards = repository.getComments()
                _creditCards.value = cards
            } catch (e: Exception) {
                // Handle error
            }
        }
    }

}