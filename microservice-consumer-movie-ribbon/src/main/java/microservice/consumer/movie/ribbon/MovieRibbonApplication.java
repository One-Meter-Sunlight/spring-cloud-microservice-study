package microservice.consumer.movie.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author CK
 * @describe：启动负载均衡
 * @date 2017/11/1 17:29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MovieRibbonApplication {

    /**
     * 实例化RestTemplate，通过@LoadBalanced注解开启均衡负载能力.
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MovieRibbonApplication.class, args);
    }
}
