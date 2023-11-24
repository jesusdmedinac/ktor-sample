package ktorsample.jesusdmedinac.com.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ktorsample.jesusdmedinac.com.data.model.Person
import kotlin.random.Random

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/person") {
            call.respond(Person(Random.nextInt().toString()))
        }
    }
}
