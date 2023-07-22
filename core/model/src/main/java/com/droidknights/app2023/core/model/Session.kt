package com.droidknights.app2023.core.model

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Session(
    val title: String,
    val content: List<String>,
    val speakers: List<Speaker>,
    val level: Level,
    val tags: List<Tag>,
    val room: Room,
    val startTime: LocalDateTime,
    val endTime: LocalDateTime,
)

@Serializable
enum class Level {
    @SerialName("기타")
    ETC,

    @SerialName("초급")
    BASIC,

    @SerialName("중급")
    INTERMEDIATE,

    @SerialName("고급")
    ADVANCED
}

@Serializable
@JvmInline
value class Tag(val name: String)

@Serializable
enum class Room {
    ETC,

    @SerialName("Track1")
    TRACK1,

    @SerialName("Track2")
    TRACK2,

    @SerialName("Track3")
    TRACK3
}