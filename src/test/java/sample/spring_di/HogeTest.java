package sample.spring_di;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import sample.spring_di.config.AppConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {AppConfig.class})
@Sql({"/data1.sql", "/data2.sql"})
public class HogeTest {

	@Test
	@Sql("/test-data.sql")
	void method() {

	}

}
