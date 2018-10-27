package io.dotanuki.services.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarketPriceResponse(
    val name: String,
    val description: String,
    val unit: String,
    val values: List<BTCPriceResponse>
)

@Serializable
data class BTCPriceResponse(
    @SerialName("x") val timestamp: Long,
    @SerialName("y") val price: Float
)