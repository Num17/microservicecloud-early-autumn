package com.early.autumn.earlyautumn.clients;

import com.early.autumn.domain.user.User;
import com.early.autumn.earlyautumn.fallbackservice.UserClientFallBackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "EARLY-AUTUMN-USER", fallbackFactory = UserClientFallBackFactory.class)
public interface UserClient {

    @RequestMapping("/getUser/{id}")
    User getUser(@PathVariable("id") Long id);

}
