package com.example.kotlin.usecases

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TesteTests {
    @Autowired
    lateinit var teste: Teste

    @Test
    fun execute() {
        val result = teste.execute()
        assert(result.contains("Avocado"))
        assert(result.contains("Apple"))
    }

    @Test
    fun sum() {
        val result = teste.sum(1, 2)
        assert(result == 3)
    }
}