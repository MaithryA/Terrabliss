package com.application.terrabliss;

import com.application.terrabliss.repository.TerraRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class TerrablissApplicationTests {

	@Autowired
	private TerraRepo repo;

	@Test
	void contextLoads() {
		assertNotNull(repo);
	}

}
