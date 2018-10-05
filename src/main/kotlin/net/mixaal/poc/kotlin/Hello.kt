package net.mixaal.poc.kotlin

import io.javalin.Javalin


fun main(args: Array<String>) {
    println("Hello, World")
    val app : Javalin = Javalin.start(7000)
    app.get("/") {
        ctx -> ctx.result("Hello world!")
    }
}

