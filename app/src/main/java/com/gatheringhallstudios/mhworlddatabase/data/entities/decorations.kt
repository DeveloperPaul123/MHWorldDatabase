package com.gatheringhallstudios.mhworlddatabase.data.entities

import androidx.room.Entity
import androidx.room.ForeignKey


@Entity(tableName = "decoration",
        primaryKeys = ["id"],
        foreignKeys = [
            (ForeignKey(
                    entity = SkillTreeEntity::class,
                    parentColumns = ["id"],
                    childColumns = ["skilltree_id"]))
        ])
data class DecorationEntity(
        val id: Int,

        val rarity: Int,
        val skilltree_id: Int,
        val skilltree_level: Int,
        val skilltree2_id: Int,
        val skilltree2_level: Int,

        val slot: Int,
        val icon_color: String?,

        val mysterious_feystone_percent: Double,
        val glowing_feystone_percent: Double,
        val worn_feystone_percent: Double,
        val warped_feystone_percent: Double,
        val ancient_feystone_percent: Double,
        val carved_feystone_percent: Double,
        val sealed_feystone_percent: Double
)

@Entity(tableName = "decoration_text",
        primaryKeys = ["id", "lang_id"],
        foreignKeys = [
            (ForeignKey(childColumns = ["id"],
                    parentColumns = ["id"],
                    entity = DecorationEntity::class))
        ])
data class DecorationText(
        val id: Int = 0,
        val lang_id: String,
        val name: String? = null
)
