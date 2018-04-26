package com.gatheringhallstudios.mhworlddatabase.data.views;

import android.arch.persistence.room.Embedded;

import com.gatheringhallstudios.mhworlddatabase.data.embeds.WeaknessSummaryElemental;
import com.gatheringhallstudios.mhworlddatabase.data.embeds.WeaknessSummaryStatus;
import com.gatheringhallstudios.mhworlddatabase.data.types.MonsterSize;

/**
 * Represents basic information for a single monster.
 * This class is not complete. Eventually there will be two versions.
 * 1) A basic version for list display
 * 2) A complete version for the detail page
 * Created by Carlos on 3/4/2018.
 */
public class MonsterView {
    // todo: see if there's a way to make these private/protected + getters only without room complaining

    public int id;
    public String name;
    public String description;
    public MonsterSize size;

    @Embedded(prefix = "weakness_")
    public WeaknessSummaryElemental weaknesses;

    @Embedded(prefix = "weakness_")
    public WeaknessSummaryStatus status_weaknesses;

    public boolean has_alt_weakness;

    @Embedded(prefix = "alt_weakness_")
    public WeaknessSummaryElemental alt_weaknesses;
}