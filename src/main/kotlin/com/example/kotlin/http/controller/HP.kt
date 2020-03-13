package com.example.kotlin.http.controller

import com.example.kotlin.usecases.CharactersHP
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api/v1/characters")
class HP {
    @Autowired
    lateinit var characters: CharactersHP

    @GetMapping
    fun getCharacters(@RequestHeader(value = "character") character: String): ResponseEntity<String> {
        val character1 = characters.getCharacter(character)
        return ResponseEntity.ok(character1)

    }

}