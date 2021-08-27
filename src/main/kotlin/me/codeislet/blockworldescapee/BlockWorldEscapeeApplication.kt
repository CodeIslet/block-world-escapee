package me.codeislet.blockworldescapee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import reactor.blockhound.BlockHound


/**
 * @author Code Islet
 * @since 0.1.0
 */
@SpringBootApplication
class BlockWorldEscapeeApplication

fun main(args: Array<String>) {

    BlockHound.install({
        it.allowBlockingCallsInside("sun.security.util.DerValue", "init")
            .allowBlockingCallsInside("sun.security.util.IOUtils", "readExactlyNBytes")
    })

    runApplication<BlockWorldEscapeeApplication>(*args)
}