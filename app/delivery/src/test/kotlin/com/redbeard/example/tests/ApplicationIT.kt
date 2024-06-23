package com.redbeard.example.tests

import com.redbeard.example.BaseIT
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class ApplicationIT : BaseIT() {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun shouldReturnDefaultMessage() {
        mockMvc.perform(get("/"))
            .andExpect(status().isNotFound)
    }
}
