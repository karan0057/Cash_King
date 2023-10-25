package com.cultofgames.funearn.helper

interface CircularTimerListener {
    fun updateDataOnTick(remainingTimeInMs: Long): String?
    fun onTimerFinished()
}