package com.smartfoxpro.test.service;

import com.foxsmartpro.service.NextController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NextController.class)
public class NextControllerTest {

    @Autowired
    private NextController nextController;

    @Test
    public void contextLoads() throws Exception{
        assertThat(nextController).isNotNull();
    }
}
