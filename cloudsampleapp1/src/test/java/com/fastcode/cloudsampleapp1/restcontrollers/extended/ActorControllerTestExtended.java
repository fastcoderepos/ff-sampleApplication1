package com.fastcode.cloudsampleapp1.restcontrollers.extended;

import com.fastcode.cloudsampleapp1.restcontrollers.core.ActorControllerTest;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
				properties = "spring.profiles.active=test")
public class ActorControllerTestExtended extends ActorControllerTest {
	
	//Add your custom code here	
}
