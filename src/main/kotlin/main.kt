package com.example.com

import io.ktor.server.engine.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
    /*embeddedServer(
        factory = io.ktor.server.netty.Netty,
        port = 42069,
        host = "0.0.0.0",
        module = Application::rootModule
    ).start(wait = true)*/
}
