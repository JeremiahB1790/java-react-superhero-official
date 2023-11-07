package com.martial.law.jeremiah.martiallaw.controller;


import com.martial.law.jeremiah.martiallaw.models.Avatar;
import com.martial.law.jeremiah.martiallaw.service.AvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avatar")
public class AvatarController {

    @Autowired
     private AvatarService avatarService;

    @PostMapping("/add")
    public String add(@RequestBody Avatar avater){
        avatarService.saveAvatar(avater);
        return "New character has been added";
    }
}
