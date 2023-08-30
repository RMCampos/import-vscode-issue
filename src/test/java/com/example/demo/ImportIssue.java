package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class ImportIssue {

    @Autowired
    private MockMvc mockMvc;
    
    @Test
    void sampleTestCase() throws Exception {
        // Uncomment the line below to reproduce the bug
        // mockMvc.perform(post())
    }
}
