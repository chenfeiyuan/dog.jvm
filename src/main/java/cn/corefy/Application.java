package cn.corefy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * @author cfy
 * @Description
 * @date 2020-04-21
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}, scanBasePackages = "cn.corefy")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Hello World!");
    }
}
