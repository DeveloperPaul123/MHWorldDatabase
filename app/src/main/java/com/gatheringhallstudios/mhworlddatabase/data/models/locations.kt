package com.gatheringhallstudios.mhworlddatabase.data.models

import androidx.room.Embedded
import com.gatheringhallstudios.mhworlddatabase.data.types.DataType
import com.gatheringhallstudios.mhworlddatabase.data.types.Rank


data class Location(
        val id: Int,
        val name: String?
) : MHModel {
    override val entityId get() = id
    override val entityType get() = DataType.LOCATION
}

/**
 * Represents an item at a location.
 * It is expected that the location is already known.
 */
data class LocationItem(
        @Embedded(prefix = "item_") val item: ItemBase,
        val rank: Rank?,
        val area: Int,
        val stack: Int,
        val percentage: Int,
        val nodes: Int
)

/**
 * Represents an item
 */
data class LocationCamp(
        val name: String,
        val area: Int
)