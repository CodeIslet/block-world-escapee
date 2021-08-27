package me.codeislet.blockworldescapee.twitteruser

import org.springframework.stereotype.Service


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Service
class TwitterUserService(val twitterUserRepository: TwitterUserRepository) {

    suspend fun getTwitterUser(id: Long): TwitterUser {
        return twitterUserRepository.findTopById(id)
    }

    suspend fun raiseBlock() {
        try {
            Thread.sleep(1000)
        } catch (e: InterruptedException) {
            println("e: ${e.message}")
        }
    }
}