package com.early.autumn.earlyautumn.api.fallbackservice;

import com.early.autumn.common.domain.user.User;
import com.early.autumn.earlyautumn.api.clients.UserClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserClientFallBackFactory implements FallbackFactory<UserClient> {

    @Override
    public UserClient create(Throwable cause) {
        return e -> {
            User user = new User();
            user.setBirthday(new Date());
            return user;
        };
    }
}
