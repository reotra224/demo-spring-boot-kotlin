package gn.traore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoSpringBootKotlinApplication

fun main(args: Array<String>) {
	runApplication<DemoSpringBootKotlinApplication>(*args)
}
