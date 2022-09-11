package com.socialCom.ws.user;

import com.socialCom.ws.shared.GenericMessage;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@AllArgsConstructor
public class UserController {
//    private final static Logger log= LoggerFactory.getLogger(UserController.class);
    UserService userService;

    @PostMapping("/api/1.0/users")
    public GenericMessage createUser(@RequestBody User user){
//        log.info(user.toString());
        userService.saveUser(user);
        return new GenericMessage("veri kaydedildi");


    }
}
