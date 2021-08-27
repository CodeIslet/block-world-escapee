package me.codeislet.blockworldescapee.twitteruser

import org.springframework.data.repository.reactive.ReactiveCrudRepository


/**
 * @author Code Islet
 * @since 0.1.0
 */
interface TwitterUserRepository: ReactiveCrudRepository<TwitterUser, Long> {

    suspend fun findTopById(id: Long): TwitterUser
}