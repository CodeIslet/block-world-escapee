package me.codeislet.blockworldescapee

import io.r2dbc.spi.ConnectionFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Configuration
@EnableTransactionManagement
@EnableR2dbcRepositories
class R2DBCConfig(val connectionFactory: ConnectionFactory) {

    @Bean
    fun r2dbcEntityTemplate(connectionFactory: ConnectionFactory) = R2dbcEntityTemplate(connectionFactory)
}