/**
 * Copyright 2018 raynichc
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author raynichc
 * @since 2018.11.29
 */

package com.ibdiscord.data.db.entries;

import de.arraying.gravity.data.types.TypeMap;

public final class TagData extends TypeMap {

    private String guildID;

    public TagData(String guildID) {
        this.guildID = guildID;
    }

    @Override
    protected String getUniqueIdentifier() {
        return "guild_" + this.guildID + "_tags";
    }
}
