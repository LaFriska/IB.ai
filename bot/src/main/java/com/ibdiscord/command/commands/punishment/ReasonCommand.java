package com.ibdiscord.command.commands.punishment;

import com.ibdiscord.command.Command;
import com.ibdiscord.command.CommandContext;
import com.ibdiscord.command.permissions.CommandPermission;
import com.ibdiscord.data.db.DContainer;
import com.ibdiscord.data.db.entries.punish.PunishmentData;
import com.ibdiscord.data.db.entries.punish.PunishmentsData;
import com.ibdiscord.utils.UString;
import de.arraying.gravity.Gravity;

import java.util.HashSet;
import java.util.Set;

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
public final class ReasonCommand extends Command {

    /**
     * Creates the command.
     */
    protected ReasonCommand() {
        super("reason", Set.of(), CommandPermission.roleId(230710782038376449L), new HashSet<>());
    }

    /**
     * Sets the reason.
     * @param context The context.
     */
    @Override
    protected void execute(CommandContext context) {
        if(context.getArguments().length == 0) {
            context.reply("Please provide the case number.");
            return;
        }
        String caseNumber = context.getArguments()[0];
        if(context.getArguments().length == 1) {
            context.reply("Please provide the reason for the punishment.");
            return;
        }
        String reason = UString.concat(context.getArguments(), "", 1);
        Gravity gravity = DContainer.INSTANCE.getGravity();
        PunishmentsData punishmentList = gravity.load(new PunishmentsData(context.getGuild().getId()));
        if(!punishmentList.contains(caseNumber)) {
            context.reply("That case does not exist!");
            return;
        }
        PunishmentData caseData = gravity.load(new PunishmentData(context.getGuild().getId(), caseNumber));

    }

}
