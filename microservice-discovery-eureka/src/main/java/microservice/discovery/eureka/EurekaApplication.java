package microservice.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author CK
 * @describe：Eureka注册中心服务端
 * @date 2017/10/31 16:19
 */
@SpringBootApplication
@EnableEurekaServer   // 声明注册中心
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
