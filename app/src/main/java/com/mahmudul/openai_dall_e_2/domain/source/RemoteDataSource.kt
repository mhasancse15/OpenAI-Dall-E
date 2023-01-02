package com.mahmudul.openai_dall_e_2.domain.source

import com.mahmudul.openai_dall_e_2.data.model.GeneratedImage
import com.mahmudul.openai_dall_e_2.data.model.RequestBody

interface RemoteDataSource {
    suspend fun generateImage(requestBody: RequestBody): GeneratedImage
}