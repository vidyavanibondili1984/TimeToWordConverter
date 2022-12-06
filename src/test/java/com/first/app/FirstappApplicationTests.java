package com.first.app;

import java.time.LocalTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstappApplicationTests {
	private HelloService hs=new HelloService();
	LocalTime lt=LocalTime.now();

	@Test
	void contextLoads() {
		String result=hs.convertTimeToString();
		Assertions.assertEquals("Its Sixteen:Forty Three",result);
	}

}
