package br.com.dblogic.testek.SimpleWebsite.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@RestController
class GreetingController {
	
	@GetMapping("/hello/{something}")
	fun hello(@PathVariable something: String) = "Hello, $something"
		
}