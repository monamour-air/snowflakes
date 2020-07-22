package com.sun.stone.freelancer;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
//import org.junit.runner.RunWith; 使用JUnit4将junit-vintage-engine注释掉
//import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
class SnowflakesApplicationTests {
	final static Logger loggerSlf4j = LoggerFactory.getLogger(SnowflakesApplicationTests.class);

	@Test
	void contextLoads() {
		loggerSlf4j.debug("debug...");
		loggerSlf4j.info("info...");
		loggerSlf4j.warn("warn...");
		loggerSlf4j.error("error...");
		loggerSlf4j.trace("trace...");
	}

}
