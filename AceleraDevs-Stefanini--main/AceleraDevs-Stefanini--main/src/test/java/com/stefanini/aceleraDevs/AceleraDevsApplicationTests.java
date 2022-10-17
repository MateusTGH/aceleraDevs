package com.stefanini.aceleraDevs;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EntityScan(basePackages="springboot.model")
class AceleraDevsApplicationTests {

	@Test
	void contextLoads() {
	}

}
