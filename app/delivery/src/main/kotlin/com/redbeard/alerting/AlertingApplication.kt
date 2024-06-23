package com.redbeard.alerting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AlertingApplication

fun main(args: Array<String>) {
	runApplication<AlertingApplication>(*args)
}
