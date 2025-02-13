package com.tms.an16.simplyplanner.data.repository

import com.tms.an16.simplyplanner.data.DAO
import com.tms.an16.simplyplanner.data.model.Task
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(private val dao: DAO) {

    val getAllTasks: Flow<List<Task>> = dao.getAllTasks()
    val sortByLowPriority: Flow<List<Task>> = dao.sortByLowPriority()
    val sortByHigPriority: Flow<List<Task>> = dao.sortByHighPriority()

    suspend fun getSelectedTask(task: Task) = dao.getSelectedTask(taskId = task.id)

    suspend fun addTask(task: Task) = dao.addTask(task)

    suspend fun updateTask(task: Task) = dao.updateTask(task)

    suspend fun deleteTask(task: Task) = dao.deleteTask(task)

    suspend fun deleteAllTasks() = dao.deleteAllTasks()

    fun search(searchQuery: String): Flow<List<Task>> = dao.search(searchQuery)


}