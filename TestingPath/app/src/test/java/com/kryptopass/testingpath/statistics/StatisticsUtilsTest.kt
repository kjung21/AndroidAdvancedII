package com.kryptopass.testingpath.statistics

import com.kryptopass.testingpath.data.Task
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

internal class StatisticsUtilsTest {
    @Test
    fun getActiveAndCompletedStats_noCompletedTasks_returnsZeroHundred() {
        val tasks = listOf(
            Task("title", "desc", isCompleted = false)
        )

        val result = getActiveAndCompletedStats(tasks)

        assertThat(result.activeTasksPercent, `is`(100f))
        assertThat(result.completedTasksPercent, `is`(0f))
    }

    @Test
    fun getActiveAndCompletedStats_allTasks_returnsFortySixty() {
        val tasks = listOf(
            Task("title", "desc", isCompleted = true),
            Task("title", "desc", isCompleted = true),
            Task("title", "desc", isCompleted = false),
            Task("title", "desc", isCompleted = false),
            Task("title", "desc", isCompleted = false)
        )

        val result = getActiveAndCompletedStats(tasks)

        assertThat(result.activeTasksPercent, `is`(60f))
        assertThat(result.completedTasksPercent, `is`(40f))
    }

    @Test
    fun getActiveAndCompletedStats_emptyTasks_returnsZeroes() {
        val tasks = emptyList<Task>()

        val result = getActiveAndCompletedStats(tasks)

        assertThat(result.activeTasksPercent, `is`(0f))
        assertThat(result.completedTasksPercent, `is`(0f))
    }

    @Test
    fun getActiveAndCompletedStats_nullTasks_returnsZeroes() {
        val tasks = null

        val result = getActiveAndCompletedStats(tasks)

        assertThat(result.activeTasksPercent, `is`(0f))
        assertThat(result.completedTasksPercent, `is`(0f))
    }
}