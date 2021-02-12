package havelock.gateway

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("havelock.gateway")
		.start()
}

