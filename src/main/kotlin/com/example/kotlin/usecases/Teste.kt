package com.example.kotlin.usecases

import org.springframework.stereotype.Service

@Service
class Teste {
    fun execute(): List<String> {
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        return filter(fruits)
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun filter(list: List<String>): List<String> {
        return list
                .filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it[0].toString().toUpperCase() + it.substring(1) }

    }
}