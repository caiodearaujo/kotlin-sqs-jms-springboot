package br.caiodearaujo.awssqstest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AwsSqsTestApplication

fun main(args: Array<String>) {
    runApplication<AwsSqsTestApplication>(*args)
}
