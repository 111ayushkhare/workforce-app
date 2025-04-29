package com.workforce.userauth.controllers;

import com.workforce.userauth.enums.HealthCheck;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@WebMvcTest(HealthCheckController.class)
class HealthCheckControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new HealthCheckController()).build();
    }

    @Test
    void testSayHelloSuccess() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/health-check"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.TEXT_PLAIN))
                .andExpect(MockMvcResultMatchers.content().string(HealthCheck.SERVER_IS_OK.getValue()));
    }

    @Test
    void testOopsSomeErrorSuccess() throws Exception {
        // TODO: Fix below test case
//        mockMvc.perform(MockMvcRequestBuilders.get("/health-issue"))
//                .andExpect(MockMvcResultMatchers.status().isInternalServerError())
//                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.TEXT_PLAIN))
//                .andExpect(MockMvcResultMatchers.content().string(HealthCheck.SERVER_IS_SICK.getValue()));
    }
}