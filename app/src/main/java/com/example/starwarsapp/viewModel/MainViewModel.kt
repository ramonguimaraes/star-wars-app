package com.example.starwarsapp.viewModel

import androidx.lifecycle.ViewModel
import com.example.starwarsapp.domain.models.People

class MainViewModel: ViewModel() {
    fun getAllPeople() = arrayListOf<People>(
        People(1, "Luke Skywalker", false),
        People(2, "Luke Skywalker", true),
        People(3, "Luke Skywalker", false),
        People(4, "Luke Skywalker", true),
        People(5, "Luke Skywalker", false),
        People(6, "Luke Skywalker", true)
    )
}