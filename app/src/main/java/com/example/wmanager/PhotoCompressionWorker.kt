package com.example.wmanager

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class PhotoCompressionWorker(
    private val appContext: Context,
    private val params: WorkerParameters) : CoroutineWorker(appContext, params) {
    override suspend fun doWork(): Result {

        val stringUri = params.inputData.getString()

    }
}