package com.sha.springbootjwtauthorization.controller;


import com.sha.springbootjwtauthorization.model.Role;
import com.sha.springbootjwtauthorization.security.UserPrinciple;
import com.sha.springbootjwtauthorization.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("change/{role}")
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrinciple userPrinciple, @PathVariable Role role){

    userService.changeRole(userPrinciple.getUsername() , role);

    return ResponseEntity.ok(true);
    }
}
