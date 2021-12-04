package com.mockmvc.controller;

import com.mockmvc.service.StudentService;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    StudentService studentService;

    @Test
    void getStudentData() throws Exception {
        System.out.println(MockMvcRequestBuilders.get("/student").accept(MediaType.APPLICATION_JSON).toString());

//        mockMvc.perform(MockMvcRequestBuilders.get("/data").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().json("[\n" +
//                        "{\n" +
//                        "\"id\": 1,\n" +
//                        "\"firstname\": \"Student1\",\n" +
//                        "\"lastname\": \"student1\",\n" +
//                        "\"age\": 35\n" +
//                        "}\n" +
//                        "]"))
//                .andReturn();

    }

    @Test
    void jsonAssert() throws JSONException {
            String actual = "{\"id\": 0,"+ "\"firstName\": \"mike\"," + "\"lastName\": \"smith\"," + "\"age\": 20" + "}";
            String expected = "{\"id\": 0,"+ "\"firstName\": \"mike\"," + "\"lastName\": \"smith\"}";
        JSONAssert.assertEquals(expected, actual, false);
    }

}
