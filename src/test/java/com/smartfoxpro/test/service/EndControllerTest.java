package com.smartfoxpro.test.service;

import com.foxsmartpro.service.EndController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EndController.class)
public class EndControllerTest {

    @Autowired
    private EndController endController;

    @Test
    public void contextLoads() throws Exception{
        assertThat(endController).isNotNull();
    }
}
