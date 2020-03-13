package com.example.kotlin.usecases

import org.springframework.stereotype.Service

@Service
class CharactersHP {
    fun getCharacter(name: String): String {
        return "Teste"
    }
}