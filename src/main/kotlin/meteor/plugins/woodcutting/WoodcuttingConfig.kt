/*
 * Copyright (c) 2017, Seth <Sethtroll3@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package meteor.plugins.woodcutting

import meteor.config.legacy.*

@ConfigGroup("woodcutting")
interface WoodcuttingConfig : Config {
    @Range(min = 1, max = 60)
    @ConfigItem(
        position = 1,
        keyName = "statTimeout",
        name = "Reset stats",
        description = "Configures the time until statistic is reset. Also configures when tree indicator is hidden"
    )
    @Units(Units.MINUTES)
    fun statTimeout(): Int {
        return 5
    }

    @ConfigItem(
        position = 3,
        keyName = "showWoodcuttingStats",
        name = "Show session stats",
        description = "Configures whether to display woodcutting session stats"
    )
    fun showWoodcuttingStats(): Boolean {
        return true
    }

    @ConfigItem(
        position = 4,
        keyName = "showRedwoods",
        name = "Show Redwood trees",
        description = "Configures whether to show a indicator for redwood trees"
    )
    fun showRedwoodTrees(): Boolean {
        return true
    }

    @ConfigItem(
        position = 5,
        keyName = "showRespawnTimers",
        name = "Show respawn timers",
        description = "Configures whether to display the respawn timer overlay"
    )
    fun showRespawnTimers(): Boolean {
        return true
    }
}