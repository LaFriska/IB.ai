/**
 * Copyright 2018 Arraying
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
 * @author Arraying
 * @since 2018.09.17
 */

package com.ibdiscord.command.permissions;

public enum PermissionType {

    /**
     * A permission provided by Discord.
     */
    DISCORD,

    /**
     * A role ID.
     */
    ROLE_ID,

    /**
     * A role name.
     */
    ROLE_NAME,

    /**
     * A developer command.
     */
    DEVELOPER

}
