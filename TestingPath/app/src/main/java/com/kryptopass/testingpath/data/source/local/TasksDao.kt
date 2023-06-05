package com.kryptopass.testingpath.data.source.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.kryptopass.testingpath.data.Task

/**
 * Data Access Object for the tasks table.
 */
@Dao
interface TasksDao {

    @Query("SELECT * FROM Tasks")
    fun observeTasks(): LiveData<List<Task>>

    @Query("SELECT * FROM Tasks WHERE entryid = :taskId")
    fun observeTaskById(taskId: String): LiveData<Task>

    @Query("SELECT * FROM Tasks")
    fun getTasks(): List<Task>

    @Query("SELECT * FROM Tasks WHERE entryid = :taskId")
    fun getTaskById(taskId: String): Task?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(task: Task)

    @Update
    fun updateTask(task: Task): Int

    @Query("UPDATE tasks SET completed = :completed WHERE entryid = :taskId")
    fun updateCompleted(taskId: String, completed: Boolean)

    @Query("DELETE FROM Tasks WHERE entryid = :taskId")
    fun deleteTaskById(taskId: String): Int

    @Query("DELETE FROM Tasks")
    fun deleteTasks()

    @Query("DELETE FROM Tasks WHERE completed = 1")
    fun deleteCompletedTasks(): Int
}
