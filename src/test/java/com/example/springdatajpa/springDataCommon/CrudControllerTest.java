package com.example.springdatajpa.springDataCommon;

import com.example.springdatajpa.relationMapping.Member;
import com.example.springdatajpa.springDataCommon.basic.CrudRepository_Member;
import com.example.springdatajpa.springDataCommon.basic.CrudRepository_Team;
import com.example.springdatajpa.springDataCommon.basic.CrudService;
import org.junit.Test;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


@AutoConfigureMockMvc
@SpringBootTest
public class CrudControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    CrudService crudService;

    @Autowired
    CrudRepository_Member crudRepositoryMember;

    @Autowired
    CrudRepository_Team crudRepositoryTeam;

    @Test
    public void memberSave() throws Exception{
        Member member = new Member();
        member.setUsername("test2");
        member.setTeamName("Korea");

        mockMvc.perform(post("/memberSave")
                .content(String.valueOf(member)))
                .andDo(print());
    }

    @Test
    public void getList() throws Exception {
        mockMvc.perform(get("/getList").param("page","0"))
                .andDo(print());
    }
}