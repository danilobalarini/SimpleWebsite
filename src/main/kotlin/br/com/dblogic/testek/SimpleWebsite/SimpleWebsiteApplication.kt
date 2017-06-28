package br.com.dblogic.testek.SimpleWebsite

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SimpleWebsiteApplication

fun main(args: Array<String>) {
    SpringApplication.run(SimpleWebsiteApplication::class.java, *args)
}
