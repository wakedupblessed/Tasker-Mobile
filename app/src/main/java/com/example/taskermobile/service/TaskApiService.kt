package com.example.taskermobile.service

import com.example.taskermobile.model.task.TaskCreateModel
import com.example.taskermobile.model.task.TaskModel
import com.example.taskermobile.model.task.TaskPreviewModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface TaskApiService {
    @GET("task/backlog/{projectId}")
    suspend fun getAll(@Path("projectId") projectId: String): Response<List<TaskPreviewModel>>
    @POST("Task/")
    suspend fun create(@Body task: TaskCreateModel) : Response<TaskModel>
    @GET("Task/{id}")
    suspend fun get(@Path("id") id: String) : Response<TaskModel>
}