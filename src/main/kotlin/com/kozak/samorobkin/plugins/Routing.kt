package com.kozak.samorobkin.plugins

import com.kozak.samorobkin.FantasyName
import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        get("/") {
            val result = FantasyName.character()
            println("Generated: $result")
            call.respondText(result, ContentType.Text.Plain)
        }
    }
}
