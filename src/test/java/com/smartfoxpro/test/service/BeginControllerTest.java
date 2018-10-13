package com.smartfoxpro.test.service;

import com.foxsmartpro.service.BeginController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BeginController.class)
public class BeginControllerTest {

    @Autowired
    private BeginController beginController;

    @Test
    public void contextLoads() throws Exception{
        assertThat(beginController).isNotNull();
    }


}
