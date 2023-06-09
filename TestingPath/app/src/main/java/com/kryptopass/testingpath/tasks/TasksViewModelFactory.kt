package com.kryptopass.testingpath.tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kryptopass.testingpath.data.source.TasksRepository

@Suppress("UNCHECKED_CAST")
class TasksViewModelFactory(private val tasksRepository: TasksRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>) =
        (TasksViewModel(tasksRepository) as T)
}