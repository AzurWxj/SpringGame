package com.azure.coconut.webvalidation;


import com.azure.coconut.aspect.PersonConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class WebValidationTest {

    @Test
    public void shouldRegisterPerson() throws Exception {
        MockMvc mockController= MockMvcBuilders.standaloneSetup(new PersonalRegistryController()).build();
        mockController.perform(
                post("/register")
                .param("name","")
                .param("age","190"))
                .andExpect(view().name("Error"));
    }
}
