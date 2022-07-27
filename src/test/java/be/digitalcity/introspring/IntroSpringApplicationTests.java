package be.digitalcity.introspring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IntroSpringApplicationTests {

    public static void main(String[] args) {
        System.out.println(System.getenv());
    }
    @Test
    void contextLoads() {
    }

}
