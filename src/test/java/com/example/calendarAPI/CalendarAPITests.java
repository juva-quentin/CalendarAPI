package com.example.calendarAPI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class CalendarAPITests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGenerateCalendar() throws Exception {
        int year = 2023;
        int month = 10;

        mockMvc.perform(MockMvcRequestBuilders.get("/generateCalendar")
                        .param("year", String.valueOf(year))
                        .param("month", String.valueOf(month))
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.year").value(year))
                .andExpect(MockMvcResultMatchers.jsonPath("$.month").value(month))
                .andExpect(MockMvcResultMatchers.jsonPath("$.calendar").isArray());
    }
}
