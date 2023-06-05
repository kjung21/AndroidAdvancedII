package com.kryptopass.testingpath.statistics

import com.kryptopass.testingpath.data.Task

/**
 * Function that does some trivial computation. Used to showcase unit tests.
 */
internal fun getActiveAndCompletedStats(tasks: List<Task>?): StatsResult {
    return if (tasks.isNullOrEmpty()) {
        StatsResult(0f, 0f)
    } else {
        val totalTasks = tasks.size
        val numberOfActiveTasks = tasks.count { it.isActive }
        val activeTasksPercent = 100f * numberOfActiveTasks / tasks.size
        val completedTasksPercent = 100f * (totalTasks - numberOfActiveTasks) / tasks.size

        StatsResult(
            activeTasksPercent = activeTasksPercent,
            completedTasksPercent = completedTasksPercent
        )
    }
}

data class StatsResult(val activeTasksPercent: Float, val completedTasksPercent: Float)
