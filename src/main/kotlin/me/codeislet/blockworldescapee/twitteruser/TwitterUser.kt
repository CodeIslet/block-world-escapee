package me.codeislet.blockworldescapee.twitteruser

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Table("twitter_user")
data class TwitterUser(@Id var id: Long?, var name: String?, var screenName: String?, var profileImage: String?,
                       var profileBannerImage: String?, var createdAt: LocalDateTime?, var updatedAt: LocalDateTime?)