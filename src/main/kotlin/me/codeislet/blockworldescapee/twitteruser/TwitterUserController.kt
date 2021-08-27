package me.codeislet.blockworldescapee.twitteruser

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


/**
 * @author Code Islet
 * @since 0.1.0
 */
@RestController
@RequestMapping("/user")
class TwitterUserController(val twitterUserService: TwitterUserService) {

    @GetMapping("/{id}")
    suspend fun getTwitterUser(@PathVariable("id") id: Long): ResponseEntity<Any> {
        return ResponseEntity(twitterUserService.getTwitterUser(id), HttpStatus.OK)
    }

    @GetMapping("/raise")
    suspend fun raiseBlock(): ResponseEntity<Any> {
        twitterUserService.raiseBlock()
        return ResponseEntity("BLOCK!", HttpStatus.BAD_GATEWAY)
    }
}