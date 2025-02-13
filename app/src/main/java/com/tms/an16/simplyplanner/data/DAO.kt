package com.tms.an16.simplyplanner.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.tms.an16.simplyplanner.data.model.Task
import kotlinx.coroutines.flow.Flow

@Dao
interface DAO {

    @Query("SELECT * FROM tasks_table ORDER BY id ASC")
    fun getAllTasks(): Flow<List<Task>>

    @Query("SELECT * FROM tasks_table WHERE id=:taskId")
    fun getSelectedTask(taskId: Int): Flow<Task>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTask(task: Task)

    @Update
    suspend fun updateTask(task: Task)

    @Delete
    suspend fun deleteTask(task: Task)

    @Query("DELETE FROM tasks_table")
    suspend fun deleteAllTasks()

    @Query("SELECT * FROM tasks_table WHERE title LIKE :searchQuery OR description LIKE :searchQuery")
    fun search(searchQuery: String): Flow<List<Task>>

//    @Query(
//        """
//        SELECT * FROM tasks_table ORDER BY
//    CASE
//        WHEN priority LIKE 'L%' THEN 1
//        WHEN priority LIKE 'M%' THEN 2
//        WHEN priority LIKE 'H%' THEN 3
//    END
//    """
//    )
    @Query("SELECT * FROM tasks_table ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 3 END")
    fun sortByLowPriority(): Flow<List<Task>>

    @Query(
        """
        SELECT * FROM tasks_table ORDER BY
    CASE
        WHEN priority LIKE 'H%' THEN 1
        WHEN priority LIKE 'M%' THEN 2
        WHEN priority LIKE 'L%' THEN 3
    END
    """
    )
    fun sortByHighPriority(): Flow<List<Task>>
}