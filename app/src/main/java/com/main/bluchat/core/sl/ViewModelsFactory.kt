package com.main.bluchat.core.sl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.main.bluchat.main.sl.DependencyContainer

@Suppress("UNCHECKED_CAST")
class ViewModelsFactory(
    private val dependencyContainer: DependencyContainer
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return dependencyContainer.module(modelClass).viewModel() as T
    }
}
