package fr.fee.tekourse.feetekourse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FeetekourseApplicationTests {


    @Value("${spring.application.name}")
    private String applicationName;

    @Test
    void contextLoads() {
        Assertions.assertEquals("feetekourse", this.applicationName);
    }

}
