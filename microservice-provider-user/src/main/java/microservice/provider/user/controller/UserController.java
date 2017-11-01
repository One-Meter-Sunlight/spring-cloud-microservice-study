package microservice.provider.user.controller;

import microservice.provider.user.entity.User;
import microservice.provider.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CK
 * @describe：
 * @date 2017/11/1 15:34
 */
@RestController
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = this.userRepository.findOne(id);
        return user;
    }

    @GetMapping("/instance-info")
    public ServiceInstance showInfo() {
        ServiceInstance serviceInstance = this.discoveryClient.getLocalServiceInstance();
        return serviceInstance;
    }
}
