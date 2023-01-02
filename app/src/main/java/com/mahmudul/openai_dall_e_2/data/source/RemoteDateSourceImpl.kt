package com.mahmudul.openai_dall_e_2.data.source

import com.mahmudul.openai_dall_e_2.data.model.GeneratedImage
import com.mahmudul.openai_dall_e_2.data.model.RequestBody
import com.mahmudul.openai_dall_e_2.domain.source.RemoteDataSource


class RemoteDateSourceImpl(private val remoteService: DallEService) : RemoteDataSource {
    override suspend fun generateImage(
        requestBody: RequestBody
    ): GeneratedImage {
        return remoteService.generateImage(requestBody)
    }
}