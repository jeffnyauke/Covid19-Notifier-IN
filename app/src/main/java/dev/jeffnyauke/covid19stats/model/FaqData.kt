package dev.jeffnyauke.covid19stats.model

import com.squareup.moshi.Json

data class FaqData(
    @Json(name = "question")
    var question: String? = null,
    @Json(name = "answer")
    var answer: String? = null
)